package typings.dayjs

import org.scalablytyped.runtime.Shortcut
import typings.dayjs.esmMod.PluginFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utcMod extends Shortcut {
  
  @JSImport("dayjs/esm/plugin/utc", JSImport.Namespace)
  @js.native
  val ^ : PluginFunc[js.Any] = js.native
  
  type _To = PluginFunc[js.Any]
  
  /* This means you don't have to write `^`, but can instead just say `utcMod.foo` */
  override def _to: PluginFunc[js.Any] = ^
  
  /* augmented module */
  object dayjsEsmAugmentingMod {
    
    @js.native
    trait Dayjs extends StObject {
      
      def isUTC(): Boolean = js.native
      
      def local(): Dayjs = js.native
      
      def utc(): Dayjs = js.native
      def utc(keepLocalTime: Boolean): Dayjs = js.native
      
      def utcOffset(offset: Double): Dayjs = js.native
      def utcOffset(offset: Double, keepLocalTime: Boolean): Dayjs = js.native
    }
  }
}
