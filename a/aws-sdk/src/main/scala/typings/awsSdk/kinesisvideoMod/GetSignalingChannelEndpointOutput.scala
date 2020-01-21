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
  def apply(ResourceEndpointList: ResourceEndpointList = null): GetSignalingChannelEndpointOutput = {
    val __obj = js.Dynamic.literal()
    if (ResourceEndpointList != null) __obj.updateDynamic("ResourceEndpointList")(ResourceEndpointList.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSignalingChannelEndpointOutput]
  }
}

