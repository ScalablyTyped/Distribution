package typings.awsSdkClientS3Browser

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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/types/GetBucketLocationOutput", JSImport.Namespace)
@js.native
object typesGetBucketLocationOutputMod extends js.Object {
  @js.native
  trait GetBucketLocationOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    /**
      * _BucketLocationConstraint shape
      */
    var LocationConstraint: js.UndefOr[
        EU | `eu-west-1` | `us-west-1` | `us-west-2` | `ap-south-1` | `ap-southeast-1` | `ap-southeast-2` | `ap-northeast-1` | `sa-east-1` | `cn-north-1` | `eu-central-1` | String
      ] = js.native
  }
  
}

