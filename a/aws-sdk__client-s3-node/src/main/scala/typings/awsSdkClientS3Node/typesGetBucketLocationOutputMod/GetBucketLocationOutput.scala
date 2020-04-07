package typings.awsSdkClientS3Node.typesGetBucketLocationOutputMod

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.EU
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`ap-northeast-1`
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`ap-south-1`
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`ap-southeast-1`
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`ap-southeast-2`
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`cn-north-1`
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`eu-central-1`
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`eu-west-1`
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`sa-east-1`
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`us-west-1`
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`us-west-2`
import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketLocationOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * _BucketLocationConstraint shape
    */
  var LocationConstraint: js.UndefOr[
    EU | `eu-west-1` | `us-west-1` | `us-west-2` | `ap-south-1` | `ap-southeast-1` | `ap-southeast-2` | `ap-northeast-1` | `sa-east-1` | `cn-north-1` | `eu-central-1` | String
  ] = js.undefined
}

object GetBucketLocationOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    LocationConstraint: EU | `eu-west-1` | `us-west-1` | `us-west-2` | `ap-south-1` | `ap-southeast-1` | `ap-southeast-2` | `ap-northeast-1` | `sa-east-1` | `cn-north-1` | `eu-central-1` | String = null
  ): GetBucketLocationOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (LocationConstraint != null) __obj.updateDynamic("LocationConstraint")(LocationConstraint.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketLocationOutput]
  }
}

