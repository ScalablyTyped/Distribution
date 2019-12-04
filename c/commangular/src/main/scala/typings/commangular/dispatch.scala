package typings.commangular

import typings.commangular.commangular.ICommandCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dispatch")
@js.native
object dispatch extends js.Object {
  /**
  * Mock dispatch function for testing commands.
  * @param ec an ICommandCall object
  * @param callback The function that will be called upon the completion of the command
  * 		function should expecte an ICommandInfo parameter.
  */
  def apply(ec: ICommandCall, callback: js.Function): Unit = js.native
}

