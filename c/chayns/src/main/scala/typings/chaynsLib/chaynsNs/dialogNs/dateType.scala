package typings
package chaynsLib.chaynsNs.dialogNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait dateType extends js.Object

@JSGlobal("chayns.dialog.dateType")
@js.native
object dateType extends js.Object {
  @js.native
  sealed trait DATE
    extends chaynsLib.chaynsNs.dialogNs.dateType
  
  @js.native
  sealed trait DATE_TIME
    extends chaynsLib.chaynsNs.dialogNs.dateType
  
  @js.native
  sealed trait TIME
    extends chaynsLib.chaynsNs.dialogNs.dateType
  
  /* 0 */ val DATE: DATE with scala.Double = js.native
  /* 2 */ val DATE_TIME: DATE_TIME with scala.Double = js.native
  /* 1 */ val TIME: TIME with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[chaynsLib.chaynsNs.dialogNs.dateType with scala.Double] = js.native
}

