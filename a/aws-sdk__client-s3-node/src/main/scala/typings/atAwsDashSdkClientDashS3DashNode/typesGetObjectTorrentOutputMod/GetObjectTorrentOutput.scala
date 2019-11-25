package typings.atAwsDashSdkClientDashS3DashNode.typesGetObjectTorrentOutputMod

import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.requester_
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetObjectTorrentOutput[StreamType] extends MetadataBearer {
  /**
    * _Body shape
    */
  var Body: js.UndefOr[StreamType] = js.undefined
  /**
    * <p>If present, indicates that the requester was successfully charged for the request.</p>
    */
  var RequestCharged: js.UndefOr[requester_ | String] = js.undefined
}

object GetObjectTorrentOutput {
  @scala.inline
  def apply[StreamType]($metadata: ResponseMetadata, Body: StreamType = null, RequestCharged: requester_ | String = null): GetObjectTorrentOutput[StreamType] = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (Body != null) __obj.updateDynamic("Body")(Body.asInstanceOf[js.Any])
    if (RequestCharged != null) __obj.updateDynamic("RequestCharged")(RequestCharged.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectTorrentOutput[StreamType]]
  }
}

