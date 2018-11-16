package typings
package commangularLib.commangularNs

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

