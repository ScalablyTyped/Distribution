package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IExplorerExtensibilityGroup extends js.Object {
  /**
    * Gets the list of options added to a type
    */
  var entries: js.Array[IExplorerExtensibilityOption]
  /**
    * Defines a predicate to test if a given type mut be extended
    */
  def predicate(entity: js.Any): Boolean
}

object IExplorerExtensibilityGroup {
  @scala.inline
  def apply(entries: js.Array[IExplorerExtensibilityOption], predicate: js.Any => Boolean): IExplorerExtensibilityGroup = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], predicate = js.Any.fromFunction1(predicate))
  
    __obj.asInstanceOf[IExplorerExtensibilityGroup]
  }
}

