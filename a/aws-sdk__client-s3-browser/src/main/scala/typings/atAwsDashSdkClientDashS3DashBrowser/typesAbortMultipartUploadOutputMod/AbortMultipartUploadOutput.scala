package typings.atAwsDashSdkClientDashS3DashBrowser.typesAbortMultipartUploadOutputMod

import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.requester
import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbortMultipartUploadOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * <p>If present, indicates that the requester was successfully charged for the request.</p>
    */
  var RequestCharged: js.UndefOr[requester | String] = js.undefined
}

object AbortMultipartUploadOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, RequestCharged: requester | String = null): AbortMultipartUploadOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
    if (RequestCharged != null) __obj.updateDynamic("RequestCharged")(RequestCharged.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbortMultipartUploadOutput]
  }
}

