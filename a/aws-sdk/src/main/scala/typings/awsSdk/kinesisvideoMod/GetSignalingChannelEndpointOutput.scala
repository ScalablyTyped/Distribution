package typings.awsSdk.kinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSignalingChannelEndpointOutput extends js.Object {
  /**
    * A list of endpoints for the specified signaling channel.
    */
  var ResourceEndpointList: js.UndefOr[typings.awsSdk.kinesisvideoMod.ResourceEndpointList] = js.native
}

object GetSignalingChannelEndpointOutput {
  @scala.inline
  def apply(): GetSignalingChannelEndpointOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSignalingChannelEndpointOutput]
  }
  @scala.inline
  implicit class GetSignalingChannelEndpointOutputOps[Self <: GetSignalingChannelEndpointOutput] (val x: Self) extends AnyVal {
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
    def setResourceEndpointListVarargs(value: ResourceEndpointListItem*): Self = this.set("ResourceEndpointList", js.Array(value :_*))
    @scala.inline
    def setResourceEndpointList(value: ResourceEndpointList): Self = this.set("ResourceEndpointList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceEndpointList: Self = this.set("ResourceEndpointList", js.undefined)
  }
  
}

