package typings
package commangularLib.commangularNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResultCommand extends ICommand {
  /**
  		 * Is executed when the executed method ends with an error. Can receive the error throw by the execute method.
  		 * @param error The error that occured during execution
  		 */
  def onError(error: stdLib.Error): scala.Unit
  /**
  		 * Is executed after the execute method and the interception chain and can receive
  		 * the result from the execute method of the same command.
  		 *
  		 * @param result Value/object returned by the execution.
  		 */
  def onResult(result: js.Any): scala.Unit
}

