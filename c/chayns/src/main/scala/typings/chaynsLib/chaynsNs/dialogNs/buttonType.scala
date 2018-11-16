package typings
package chaynsLib.chaynsNs.dialogNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait buttonType extends js.Object

@JSGlobal("chayns.dialog.buttonType")
@js.native
object buttonType extends js.Object {
  @js.native
  sealed trait CANCEL
    extends chaynsLib.chaynsNs.dialogNs.buttonType
  
  @js.native
  sealed trait NEGATIVE
    extends chaynsLib.chaynsNs.dialogNs.buttonType
  
  @js.native
  sealed trait POSITIVE
    extends chaynsLib.chaynsNs.dialogNs.buttonType
  
  /* -1 */ val CANCEL: CANCEL with scala.Double = js.native
  /* 0 */ val NEGATIVE: NEGATIVE with scala.Double = js.native
  /* 1 */ val POSITIVE: POSITIVE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[chaynsLib.chaynsNs.dialogNs.buttonType with scala.Double] = js.native
}

