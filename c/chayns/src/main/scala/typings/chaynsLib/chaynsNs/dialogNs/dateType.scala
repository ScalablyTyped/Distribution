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
  
  val DATE: DATE with java.lang.String = js.native
  val DATE_TIME: DATE_TIME with java.lang.String = js.native
  val TIME: TIME with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[chaynsLib.chaynsNs.dialogNs.dateType with java.lang.String] = js.native
}

