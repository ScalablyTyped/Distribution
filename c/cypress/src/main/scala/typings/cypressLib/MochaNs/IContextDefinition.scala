package typings
package cypressLib.MochaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContextDefinition extends js.Object {
  def apply(
    description: java.lang.String,
    callback: js.ThisFunction0[/* this */ ISuiteCallbackContext, scala.Unit]
  ): ISuite = js.native
  def only(
    description: java.lang.String,
    callback: js.ThisFunction0[/* this */ ISuiteCallbackContext, scala.Unit]
  ): ISuite = js.native
  def skip(
    description: java.lang.String,
    callback: js.ThisFunction0[/* this */ ISuiteCallbackContext, scala.Unit]
  ): scala.Unit = js.native
  def timeout(ms: scala.Double): scala.Unit = js.native
}

