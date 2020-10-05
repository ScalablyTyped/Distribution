package typings.dayjs.isSameOrBeforeMod

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
    def isSameOrBefore(date: ConfigType): Boolean = js.native
    def isSameOrBefore(date: ConfigType, unit: OpUnitType): Boolean = js.native
  }
  
}

