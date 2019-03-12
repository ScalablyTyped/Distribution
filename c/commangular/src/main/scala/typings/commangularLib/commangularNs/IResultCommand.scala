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

object IResultCommand {
  @scala.inline
  def apply(execute: () => js.Any, onError: stdLib.Error => scala.Unit, onResult: js.Any => scala.Unit): IResultCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), onError = js.Any.fromFunction1(onError), onResult = js.Any.fromFunction1(onResult))
  
    __obj.asInstanceOf[IResultCommand]
  }
}

