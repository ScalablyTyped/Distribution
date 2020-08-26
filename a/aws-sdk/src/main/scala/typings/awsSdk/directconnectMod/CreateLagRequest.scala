package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLagRequest extends js.Object {
  /**
    * The tags to associate with the automtically created LAGs.
    */
  var childConnectionTags: js.UndefOr[TagList] = js.native
  /**
    * The ID of an existing connection to migrate to the LAG.
    */
  var connectionId: js.UndefOr[ConnectionId] = js.native
  /**
    * The bandwidth of the individual physical connections bundled by the LAG. The possible values are 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps, and 10Gbps. 
    */
  var connectionsBandwidth: Bandwidth = js.native
  /**
    * The name of the LAG.
    */
  var lagName: LagName = js.native
  /**
    * The location for the LAG.
    */
  var location: LocationCode = js.native
  /**
    * The number of physical connections initially provisioned and bundled by the LAG.
    */
  var numberOfConnections: Count = js.native
  /**
    * The name of the service provider associated with the LAG.
    */
  var providerName: js.UndefOr[ProviderName] = js.native
  /**
    * The tags to associate with the LAG.
    */
  var tags: js.UndefOr[TagList] = js.native
}

object CreateLagRequest {
  @scala.inline
  def apply(
    connectionsBandwidth: Bandwidth,
    lagName: LagName,
    location: LocationCode,
    numberOfConnections: Count
  ): CreateLagRequest = {
    val __obj = js.Dynamic.literal(connectionsBandwidth = connectionsBandwidth.asInstanceOf[js.Any], lagName = lagName.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], numberOfConnections = numberOfConnections.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLagRequest]
  }
  @scala.inline
  implicit class CreateLagRequestOps[Self <: CreateLagRequest] (val x: Self) extends AnyVal {
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
    def setConnectionsBandwidth(value: Bandwidth): Self = this.set("connectionsBandwidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setLagName(value: LagName): Self = this.set("lagName", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: LocationCode): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberOfConnections(value: Count): Self = this.set("numberOfConnections", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildConnectionTagsVarargs(value: Tag*): Self = this.set("childConnectionTags", js.Array(value :_*))
    @scala.inline
    def setChildConnectionTags(value: TagList): Self = this.set("childConnectionTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildConnectionTags: Self = this.set("childConnectionTags", js.undefined)
    @scala.inline
    def setConnectionId(value: ConnectionId): Self = this.set("connectionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionId: Self = this.set("connectionId", js.undefined)
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

