package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteConnectionResponse extends js.Object {
  /**
    * The connection that is being deleted.
    */
  var Connection: js.UndefOr[typings.awsSdk.dmsMod.Connection] = js.native
}

object DeleteConnectionResponse {
  @scala.inline
  def apply(Connection: Connection = null): DeleteConnectionResponse = {
    val __obj = js.Dynamic.literal()
    if (Connection != null) __obj.updateDynamic("Connection")(Connection.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteConnectionResponse]
  }
}

