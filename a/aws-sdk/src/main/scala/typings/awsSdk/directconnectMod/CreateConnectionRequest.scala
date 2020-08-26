package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateConnectionRequest extends js.Object {
  /**
    * The bandwidth of the connection.
    */
  var bandwidth: Bandwidth = js.native
  /**
    * The name of the connection.
    */
  var connectionName: ConnectionName = js.native
  /**
    * The ID of the LAG.
    */
  var lagId: js.UndefOr[LagId] = js.native
  /**
    * The location of the connection.
    */
  var location: LocationCode = js.native
  /**
    * The name of the service provider associated with the requested connection.
    */
  var providerName: js.UndefOr[ProviderName] = js.native
  /**
    * The tags to associate with the lag.
    */
  var tags: js.UndefOr[TagList] = js.native
}

object CreateConnectionRequest {
  @scala.inline
  def apply(bandwidth: Bandwidth, connectionName: ConnectionName, location: LocationCode): CreateConnectionRequest = {
    val __obj = js.Dynamic.literal(bandwidth = bandwidth.asInstanceOf[js.Any], connectionName = connectionName.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConnectionRequest]
  }
  @scala.inline
  implicit class CreateConnectionRequestOps[Self <: CreateConnectionRequest] (val x: Self) extends AnyVal {
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
    def setBandwidth(value: Bandwidth): Self = this.set("bandwidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionName(value: ConnectionName): Self = this.set("connectionName", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: LocationCode): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setLagId(value: LagId): Self = this.set("lagId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLagId: Self = this.set("lagId", js.undefined)
    @scala.inline
    def setProviderName(value: ProviderName): Self = this.set("providerName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProviderName: Self = this.set("providerName", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

