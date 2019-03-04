package typings
package chromeLib.chromeNs.permissionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionsRemovedEvent extends js.Object {
  /**
    * @param callback The callback parameter should be a function that looks like this:
    * function( Permissions permissions) {...};
    * Parameter permissions: The permissions that have been removed.
    */
  def addListener(callback: js.Function1[/* permissions */ Permissions, scala.Unit]): scala.Unit
}

object PermissionsRemovedEvent {
  @scala.inline
  def apply(addListener: js.Function1[js.Function1[/* permissions */ Permissions, scala.Unit], scala.Unit]): PermissionsRemovedEvent = {
    val __obj = js.Dynamic.literal(addListener = addListener)
  
    __obj.asInstanceOf[PermissionsRemovedEvent]
  }
}

