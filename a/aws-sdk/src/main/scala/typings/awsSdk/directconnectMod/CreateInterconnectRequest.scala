package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateInterconnectRequest extends js.Object {
  /**
    * The port bandwidth, in Gbps. The possible values are 1 and 10.
    */
  var bandwidth: Bandwidth = js.native
  /**
    * The name of the interconnect.
    */
  var interconnectName: InterconnectName = js.native
  /**
    * The ID of the LAG.
    */
  var lagId: js.UndefOr[LagId] = js.native
  /**
    * The location of the interconnect.
    */
  var location: LocationCode = js.native
  /**
    * The name of the service provider associated with the interconnect.
    */
  var providerName: js.UndefOr[ProviderName] = js.native
  /**
    * The tags to associate with the interconnect.
    */
  var tags: js.UndefOr[TagList] = js.native
}

object CreateInterconnectRequest {
  @scala.inline
  def apply(bandwidth: Bandwidth, interconnectName: InterconnectName, location: LocationCode): CreateInterconnectRequest = {
    val __obj = js.Dynamic.literal(bandwidth = bandwidth.asInstanceOf[js.Any], interconnectName = interconnectName.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInterconnectRequest]
  }
  @scala.inline
  implicit class CreateInterconnectRequestOps[Self <: CreateInterconnectRequest] (val x: Self) extends AnyVal {
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
    def setInterconnectName(value: InterconnectName): Self = this.set("interconnectName", value.asInstanceOf[js.Any])
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

