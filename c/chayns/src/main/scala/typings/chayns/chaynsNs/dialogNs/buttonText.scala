package typings.chayns.chaynsNs.dialogNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait buttonText extends js.Object

@JSGlobal("chayns.dialog.buttonText")
@js.native
object buttonText extends js.Object {
  @js.native
  sealed trait CANCEL extends buttonText
  
  @js.native
  sealed trait NO extends buttonText
  
  @js.native
  sealed trait OK extends buttonText
  
  @js.native
  sealed trait YES extends buttonText
  
  /* "Abbrechen" */ val CANCEL: typings.chayns.chaynsNs.dialogNs.buttonText.CANCEL with String = js.native
  /* "Nein" */ val NO: typings.chayns.chaynsNs.dialogNs.buttonText.NO with String = js.native
  /* "OK" */ val OK: typings.chayns.chaynsNs.dialogNs.buttonText.OK with String = js.native
  /* "Ja" */ val YES: typings.chayns.chaynsNs.dialogNs.buttonText.YES with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[buttonText with String] = js.native
}

