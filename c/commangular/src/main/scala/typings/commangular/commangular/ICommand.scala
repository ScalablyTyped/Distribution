package typings.commangular.commangular

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * The command function/object
	 * see http://commangular.org/docs/#commangular-namespace
	 */
trait ICommand extends js.Object {
  /**
  		 * This function is what gets called when the command executes.
  		 * It can take parameters in as injected by angular
  		 */
  def execute(): js.Any
}

object ICommand {
  @scala.inline
  def apply(execute: () => js.Any): ICommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute))
  
    __obj.asInstanceOf[ICommand]
  }
}

