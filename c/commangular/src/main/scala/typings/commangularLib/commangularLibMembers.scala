package typings
package commangularLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object commangularLibMembers extends js.Object {
  var commangular: commangularLib.commangularNs.ICommAngularStatic = js.native
  /**
  * Mock dispatch function for testing commands.
  * @param ec an ICommandCall object
  * @param callback The function that will be called upon the completion of the command
  * 		function should expecte an ICommandInfo parameter.
  */
  def dispatch(ec: commangularLib.commangularNs.ICommandCall, callback: js.Function): scala.Unit = js.native
}

