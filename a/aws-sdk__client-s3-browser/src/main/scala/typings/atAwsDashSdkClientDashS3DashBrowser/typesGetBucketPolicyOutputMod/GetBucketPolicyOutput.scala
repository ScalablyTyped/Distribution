package typings.atAwsDashSdkClientDashS3DashBrowser.typesGetBucketPolicyOutputMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketPolicyOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * <p>The bucket policy as a JSON document.</p>
    */
  var Policy: js.UndefOr[String] = js.undefined
}

object GetBucketPolicyOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, Policy: String = null): GetBucketPolicyOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
    if (Policy != null) __obj.updateDynamic("Policy")(Policy)
    __obj.asInstanceOf[GetBucketPolicyOutput]
  }
}

