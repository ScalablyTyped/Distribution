package typings
package chromeLib.chromeNs.permissionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionsAddedEvent extends js.Object {
  /**
    * @param callback The callback parameter should be a function that looks like this:
    * function( Permissions permissions) {...};
    * Parameter permissions: The newly acquired permissions.
    */
  def addListener(callback: js.Function1[/* permissions */ Permissions, scala.Unit]): scala.Unit
}

