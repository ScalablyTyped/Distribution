package typings.chayns.chaynsNs.dialogNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait buttonType extends js.Object

@JSGlobal("chayns.dialog.buttonType")
@js.native
object buttonType extends js.Object {
  @js.native
  sealed trait CANCEL extends buttonType
  
  @js.native
  sealed trait NEGATIVE extends buttonType
  
  @js.native
  sealed trait POSITIVE extends buttonType
  
  /* -1 */ val CANCEL: typings.chayns.chaynsNs.dialogNs.buttonType.CANCEL with Double = js.native
  /* 0 */ val NEGATIVE: typings.chayns.chaynsNs.dialogNs.buttonType.NEGATIVE with Double = js.native
  /* 1 */ val POSITIVE: typings.chayns.chaynsNs.dialogNs.buttonType.POSITIVE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[buttonType with Double] = js.native
}

