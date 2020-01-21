package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConnectionResponse extends js.Object {
  /**
    * The requested connection definition.
    */
  var Connection: js.UndefOr[typings.awsSdk.glueMod.Connection] = js.native
}

object GetConnectionResponse {
  @scala.inline
  def apply(Connection: Connection = null): GetConnectionResponse = {
    val __obj = js.Dynamic.literal()
    if (Connection != null) __obj.updateDynamic("Connection")(Connection.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConnectionResponse]
  }
}

