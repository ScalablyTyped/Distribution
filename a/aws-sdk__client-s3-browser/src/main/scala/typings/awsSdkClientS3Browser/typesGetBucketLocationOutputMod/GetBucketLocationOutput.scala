package typings.awsSdkClientS3Browser.typesGetBucketLocationOutputMod

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.EU
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`ap-northeast-1`
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`ap-south-1`
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`ap-southeast-1`
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`ap-southeast-2`
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`cn-north-1`
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`eu-central-1`
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`eu-west-1`
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`sa-east-1`
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`us-west-1`
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`us-west-2`
import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
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

