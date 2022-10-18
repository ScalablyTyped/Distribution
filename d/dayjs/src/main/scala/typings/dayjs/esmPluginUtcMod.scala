package typings.dayjs

import org.scalablytyped.runtime.Shortcut
import typings.dayjs.esmMod.PluginFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmPluginUtcMod extends Shortcut {
  
  @JSImport("dayjs/esm/plugin/utc", JSImport.Namespace)
  @js.native
  val ^ : PluginFunc[Any] = js.native
  
  type _To = PluginFunc[Any]
  
  /* This means you don't have to write `^`, but can instead just say `esmPluginUtcMod.foo` */
  override def _to: PluginFunc[Any] = ^
  
  /* augmented module */
  object dayjsEsmAugmentingMod {
    
    @js.native
    trait Dayjs extends StObject {
      
      def isUTC(): Boolean = js.native
      
      def local(): Dayjs = js.native
      
      def utc(): Dayjs = js.native
      def utc(keepLocalTime: Boolean): Dayjs = js.native
      
      def utcOffset(offset: String): Dayjs = js.native
      def utcOffset(offset: String, keepLocalTime: Boolean): Dayjs = js.native
      def utcOffset(offset: Double): Dayjs = js.native
      def utcOffset(offset: Double, keepLocalTime: Boolean): Dayjs = js.native
    }
  }
}
