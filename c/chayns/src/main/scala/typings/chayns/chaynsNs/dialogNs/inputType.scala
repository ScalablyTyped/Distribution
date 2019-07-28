package typings.chayns.chaynsNs.dialogNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait inputType extends js.Object

@JSGlobal("chayns.dialog.inputType")
@js.native
object inputType extends js.Object {
  @js.native
  sealed trait DEFAULT extends inputType
  
  @js.native
  sealed trait PASSWORD extends inputType
  
  /* 0 */ val DEFAULT: typings.chayns.chaynsNs.dialogNs.inputType.DEFAULT with Double = js.native
  /* 1 */ val PASSWORD: typings.chayns.chaynsNs.dialogNs.inputType.PASSWORD with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[inputType with Double] = js.native
}

