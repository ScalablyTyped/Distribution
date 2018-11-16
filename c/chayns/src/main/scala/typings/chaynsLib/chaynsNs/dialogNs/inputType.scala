package typings
package chaynsLib.chaynsNs.dialogNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait inputType extends js.Object

@JSGlobal("chayns.dialog.inputType")
@js.native
object inputType extends js.Object {
  @js.native
  sealed trait DEFAULT
    extends chaynsLib.chaynsNs.dialogNs.inputType
  
  @js.native
  sealed trait PASSWORD
    extends chaynsLib.chaynsNs.dialogNs.inputType
  
  /* 0 */ val DEFAULT: DEFAULT with scala.Double = js.native
  /* 1 */ val PASSWORD: PASSWORD with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[chaynsLib.chaynsNs.dialogNs.inputType with scala.Double] = js.native
}

