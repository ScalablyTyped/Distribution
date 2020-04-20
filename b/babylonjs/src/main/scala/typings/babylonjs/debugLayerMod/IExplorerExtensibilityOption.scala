package typings.babylonjs.debugLayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IExplorerExtensibilityOption extends js.Object {
  /**
    * Define the option label
    */
  var label: String
  /**
    * Defines the action to execute on click
    */
  def action(entity: js.Any): Unit
}

object IExplorerExtensibilityOption {
  @scala.inline
  def apply(action: js.Any => Unit, label: String): IExplorerExtensibilityOption = {
    val __obj = js.Dynamic.literal(action = js.Any.fromFunction1(action), label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExplorerExtensibilityOption]
  }
}

