package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectedContext extends js.Object {
  /**
  		 * The connection information for the selected object.
  		 * Note that the connection is not guaranteed to be in a connected
  		 * state on click.
  		 */
  var connectionProfile: IConnectionProfile
}

object ConnectedContext {
  @scala.inline
  def apply(connectionProfile: IConnectionProfile): ConnectedContext = {
    val __obj = js.Dynamic.literal(connectionProfile = connectionProfile.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectedContext]
  }
}

