package typings.dayjs.pluginRelativeTimeMod

import typings.dayjs.dayjsMod.ConfigType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("dayjs", JSImport.Namespace)
@js.native
object dayjsMod extends js.Object {
  @js.native
  trait Dayjs extends js.Object {
    def from(compared: ConfigType): String = js.native
    def from(compared: ConfigType, withoutSuffix: Boolean): String = js.native
    def fromNow(): String = js.native
    def fromNow(withoutSuffix: Boolean): String = js.native
    def to(compared: ConfigType): String = js.native
    def to(compared: ConfigType, withoutSuffix: Boolean): String = js.native
    def toNow(): String = js.native
    def toNow(withoutSuffix: Boolean): String = js.native
  }
  
}

