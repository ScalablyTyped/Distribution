package typings.dayjs.isBetweenMod

import typings.dayjs.mod.ConfigType
import typings.dayjs.mod.OpUnitType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
@JSImport("dayjs", JSImport.Namespace)
@js.native
object dayjsAugmentingMod extends js.Object {
  @js.native
  trait Dayjs extends js.Object {
    def isBetween(a: ConfigType, b: ConfigType): Boolean = js.native
    def isBetween(a: ConfigType, b: ConfigType, c: js.UndefOr[scala.Nothing], d: String): Boolean = js.native
    def isBetween(a: ConfigType, b: ConfigType, c: Null, d: String): Boolean = js.native
    def isBetween(a: ConfigType, b: ConfigType, c: OpUnitType): Boolean = js.native
    def isBetween(a: ConfigType, b: ConfigType, c: OpUnitType, d: String): Boolean = js.native
  }
  
}

