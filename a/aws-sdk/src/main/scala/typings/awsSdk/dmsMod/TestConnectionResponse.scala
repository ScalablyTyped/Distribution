package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestConnectionResponse extends js.Object {
  /**
    * The connection tested.
    */
  var Connection: js.UndefOr[typings.awsSdk.dmsMod.Connection] = js.native
}

object TestConnectionResponse {
  @scala.inline
  def apply(Connection: Connection = null): TestConnectionResponse = {
    val __obj = js.Dynamic.literal()
    if (Connection != null) __obj.updateDynamic("Connection")(Connection.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestConnectionResponse]
  }
}

