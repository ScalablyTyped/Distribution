package typings.commangular.commangularNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * The result object expected in the promise returned by the dispatch function
	 * This must be extended to add custom result keys
	 * see http://commangular.org/docs/#returning-result-from-commands
	 */
trait ICommandResult extends js.Object {
  /**
  		 * By defualt the result of the command will be found in this property
  		 */
  var lastResult: js.Any
}

object ICommandResult {
  @scala.inline
  def apply(lastResult: js.Any): ICommandResult = {
    val __obj = js.Dynamic.literal(lastResult = lastResult)
  
    __obj.asInstanceOf[ICommandResult]
  }
}

