package typings
package chaynsLib.chaynsNs.dialogNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait buttonText extends js.Object

@JSGlobal("chayns.dialog.buttonText")
@js.native
object buttonText extends js.Object {
  @js.native
  sealed trait CANCEL
    extends chaynsLib.chaynsNs.dialogNs.buttonText
  
  @js.native
  sealed trait NO
    extends chaynsLib.chaynsNs.dialogNs.buttonText
  
  @js.native
  sealed trait OK
    extends chaynsLib.chaynsNs.dialogNs.buttonText
  
  @js.native
  sealed trait YES
    extends chaynsLib.chaynsNs.dialogNs.buttonText
  
  /* "Abbrechen" */ val CANCEL: CANCEL with java.lang.String = js.native
  /* "Nein" */ val NO: NO with java.lang.String = js.native
  /* "OK" */ val OK: OK with java.lang.String = js.native
  /* "Ja" */ val YES: YES with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[chaynsLib.chaynsNs.dialogNs.buttonText with java.lang.String] = js.native
}

