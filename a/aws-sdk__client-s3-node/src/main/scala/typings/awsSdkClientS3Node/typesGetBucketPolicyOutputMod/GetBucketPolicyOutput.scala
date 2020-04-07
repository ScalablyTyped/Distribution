package typings.awsSdkClientS3Node.typesGetBucketPolicyOutputMod

import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
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
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (Policy != null) __obj.updateDynamic("Policy")(Policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketPolicyOutput]
  }
}

