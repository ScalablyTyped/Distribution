package typings.dayjs

import org.scalablytyped.runtime.Shortcut
import typings.dayjs.esmMod.ConfigType
import typings.dayjs.esmMod.PluginFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timezoneMod extends Shortcut {
  
  @JSImport("dayjs/esm/plugin/timezone", JSImport.Namespace)
  @js.native
  val ^ : PluginFunc[js.Any] = js.native
  
  type _To = PluginFunc[js.Any]
  
  /* This means you don't have to write `^`, but can instead just say `timezoneMod.foo` */
  override def _to: PluginFunc[js.Any] = ^
  
  /* augmented module */
  object dayjsEsmAugmentingMod {
    
    @js.native
    trait Dayjs extends StObject {
      
      def tz(): Dayjs = js.native
      def tz(timezone: js.UndefOr[scala.Nothing], keepLocalTime: Boolean): Dayjs = js.native
      def tz(timezone: String): Dayjs = js.native
      def tz(timezone: String, keepLocalTime: Boolean): Dayjs = js.native
    }
    
    @js.native
    trait DayjsTimezone extends StObject {
      
      def apply(date: ConfigType): Dayjs = js.native
      def apply(date: ConfigType, format: String, timezone: String): Dayjs = js.native
      def apply(date: ConfigType, timezone: String): Dayjs = js.native
      
      def guess(): String = js.native
      
      def setDefault(): Unit = js.native
      def setDefault(timezone: String): Unit = js.native
    }
  }
}
