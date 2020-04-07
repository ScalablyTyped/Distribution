package typings.awsSdkClientS3Browser.typesRestoreObjectOutputMod

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.requester_
import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestoreObjectOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * <p>If present, indicates that the requester was successfully charged for the request.</p>
    */
  var RequestCharged: js.UndefOr[requester_ | String] = js.undefined
  /**
    * <p>Indicates the path in the provided S3 output location where Select results will be restored to.</p>
    */
  var RestoreOutputPath: js.UndefOr[String] = js.undefined
}

object RestoreObjectOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    RequestCharged: requester_ | String = null,
    RestoreOutputPath: String = null
  ): RestoreObjectOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (RequestCharged != null) __obj.updateDynamic("RequestCharged")(RequestCharged.asInstanceOf[js.Any])
    if (RestoreOutputPath != null) __obj.updateDynamic("RestoreOutputPath")(RestoreOutputPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreObjectOutput]
  }
}

