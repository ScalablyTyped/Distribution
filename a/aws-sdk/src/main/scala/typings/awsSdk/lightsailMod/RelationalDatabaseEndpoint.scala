package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelationalDatabaseEndpoint extends js.Object {
  /**
    * Specifies the DNS address of the database.
    */
  var address: js.UndefOr[NonEmptyString] = js.native
  /**
    * Specifies the port that the database is listening on.
    */
  var port: js.UndefOr[integer] = js.native
}

object RelationalDatabaseEndpoint {
  @scala.inline
  def apply(address: NonEmptyString = null, port: js.UndefOr[integer] = js.undefined): RelationalDatabaseEndpoint = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationalDatabaseEndpoint]
  }
}

