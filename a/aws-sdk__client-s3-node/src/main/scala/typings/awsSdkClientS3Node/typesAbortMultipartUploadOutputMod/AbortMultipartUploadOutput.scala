package typings.awsSdkClientS3Node.typesAbortMultipartUploadOutputMod

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.requester_
import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbortMultipartUploadOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * <p>If present, indicates that the requester was successfully charged for the request.</p>
    */
  var RequestCharged: js.UndefOr[requester_ | String] = js.undefined
}

object AbortMultipartUploadOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, RequestCharged: requester_ | String = null): AbortMultipartUploadOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (RequestCharged != null) __obj.updateDynamic("RequestCharged")(RequestCharged.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbortMultipartUploadOutput]
  }
}

