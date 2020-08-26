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
  def apply(): RelationalDatabaseEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelationalDatabaseEndpoint]
  }
  @scala.inline
  implicit class RelationalDatabaseEndpointOps[Self <: RelationalDatabaseEndpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddress(value: NonEmptyString): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    @scala.inline
    def setPort(value: integer): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
  }
  
}

