package typings.dayjs

import org.scalablytyped.runtime.Shortcut
import typings.dayjs.esmMod.PluginFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluralGetSetMod extends Shortcut {
  
  @JSImport("dayjs/esm/plugin/pluralGetSet", JSImport.Namespace)
  @js.native
  val ^ : PluginFunc[Any] = js.native
  
  type _To = PluginFunc[Any]
  
  /* This means you don't have to write `^`, but can instead just say `pluralGetSetMod.foo` */
  override def _to: PluginFunc[Any] = ^
  
  /* augmented module */
  object dayjsEsmAugmentingMod {
    
    @js.native
    trait Dayjs extends StObject {
      
      def dates(): Double = js.native
      def dates(value: Double): Dayjs = js.native
      
      def days(): Double = js.native
      def days(value: Double): Dayjs = js.native
      
      def hours(): Double = js.native
      def hours(value: Double): Dayjs = js.native
      
      def milliseconds(): Double = js.native
      def milliseconds(value: Double): Dayjs = js.native
      
      def minutes(): Double = js.native
      def minutes(value: Double): Dayjs = js.native
      
      def months(): Double = js.native
      def months(value: Double): Dayjs = js.native
      
      def seconds(): Double = js.native
      def seconds(value: Double): Dayjs = js.native
      
      def weeks(): Double = js.native
      def weeks(value: Double): Dayjs = js.native
      
      def years(): Double = js.native
      def years(value: Double): Dayjs = js.native
    }
  }
}
