package typings.commangular

import typings.commangular.commangularNs.ICommAngularStatic
import typings.commangular.commangularNs.ICommandCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  var commangular: ICommAngularStatic = js.native
  /**
  * Mock dispatch function for testing commands.
  * @param ec an ICommandCall object
  * @param callback The function that will be called upon the completion of the command
  * 		function should expecte an ICommandInfo parameter.
  */
  def dispatch(ec: ICommandCall, callback: js.Function): Unit = js.native
}

