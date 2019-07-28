package typings.chayns.chaynsNs.dialogNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait dateType extends js.Object

@JSGlobal("chayns.dialog.dateType")
@js.native
object dateType extends js.Object {
  @js.native
  sealed trait DATE extends dateType
  
  @js.native
  sealed trait DATE_TIME extends dateType
  
  @js.native
  sealed trait TIME extends dateType
  
  /* 0 */ val DATE: typings.chayns.chaynsNs.dialogNs.dateType.DATE with Double = js.native
  /* 2 */ val DATE_TIME: typings.chayns.chaynsNs.dialogNs.dateType.DATE_TIME with Double = js.native
  /* 1 */ val TIME: typings.chayns.chaynsNs.dialogNs.dateType.TIME with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[dateType with Double] = js.native
}

