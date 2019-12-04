package typings.dayjs.pluginIsBetweenMod

import typings.dayjs.dayjsMod.ConfigType
import typings.dayjs.dayjsMod.OpUnitType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("dayjs", JSImport.Namespace)
@js.native
object dayjsMod extends js.Object {
  @js.native
  trait Dayjs extends js.Object {
    def isBetween(a: ConfigType, b: ConfigType): Boolean = js.native
    def isBetween(a: ConfigType, b: ConfigType, c: Null, d: String): Boolean = js.native
    def isBetween(a: ConfigType, b: ConfigType, c: OpUnitType): Boolean = js.native
    def isBetween(a: ConfigType, b: ConfigType, c: OpUnitType, d: String): Boolean = js.native
  }
  
}

