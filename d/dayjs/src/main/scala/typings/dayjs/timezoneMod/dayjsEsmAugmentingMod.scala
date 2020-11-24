package typings.dayjs.timezoneMod

import typings.dayjs.esmMod.ConfigType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
@JSImport("dayjs/esm", JSImport.Namespace)
@js.native
object dayjsEsmAugmentingMod extends js.Object {
  
  @js.native
  trait Dayjs extends js.Object {
    
    def tz(): Dayjs = js.native
    def tz(timezone: js.UndefOr[scala.Nothing], keepLocalTime: Boolean): Dayjs = js.native
    def tz(timezone: String): Dayjs = js.native
    def tz(timezone: String, keepLocalTime: Boolean): Dayjs = js.native
  }
  
  @js.native
  trait DayjsTimezone extends js.Object {
    
    def apply(date: ConfigType): Dayjs = js.native
    def apply(date: ConfigType, format: String, timezone: String): Dayjs = js.native
    def apply(date: ConfigType, timezone: String): Dayjs = js.native
    
    def guess(): String = js.native
    
    def setDefault(): Unit = js.native
    def setDefault(timezone: String): Unit = js.native
  }
}
