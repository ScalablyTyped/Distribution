package typings.dayjs

import org.scalablytyped.runtime.Shortcut
import typings.dayjs.dayjsStrings.long
import typings.dayjs.dayjsStrings.short
import typings.dayjs.esmMod.ConfigType
import typings.dayjs.esmMod.PluginFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmPluginTimezoneMod extends Shortcut {
  
  @JSImport("dayjs/esm/plugin/timezone", JSImport.Namespace)
  @js.native
  val ^ : PluginFunc[Any] = js.native
  
  type _To = PluginFunc[Any]
  
  /* This means you don't have to write `^`, but can instead just say `esmPluginTimezoneMod.foo` */
  override def _to: PluginFunc[Any] = ^
  
  /* augmented module */
  object dayjsEsmAugmentingMod {
    
    @js.native
    trait Dayjs extends StObject {
      
      def offsetName(): js.UndefOr[String] = js.native
      def offsetName(`type`: short | long): js.UndefOr[String] = js.native
      
      def tz(): Dayjs = js.native
      def tz(timezone: String): Dayjs = js.native
      def tz(timezone: String, keepLocalTime: Boolean): Dayjs = js.native
      def tz(timezone: Unit, keepLocalTime: Boolean): Dayjs = js.native
    }
    
    @js.native
    trait DayjsTimezone extends StObject {
      
      def apply(): Dayjs = js.native
      def apply(date: Unit, timezone: String): Dayjs = js.native
      def apply(date: ConfigType): Dayjs = js.native
      def apply(date: ConfigType, format: String, timezone: String): Dayjs = js.native
      def apply(date: ConfigType, timezone: String): Dayjs = js.native
      
      def guess(): String = js.native
      
      def setDefault(): Unit = js.native
      def setDefault(timezone: String): Unit = js.native
    }
  }
}
