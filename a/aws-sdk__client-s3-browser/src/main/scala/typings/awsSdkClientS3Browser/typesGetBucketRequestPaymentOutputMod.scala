package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.BucketOwner
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Requester
import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/types/GetBucketRequestPaymentOutput", JSImport.Namespace)
@js.native
object typesGetBucketRequestPaymentOutputMod extends js.Object {
  @js.native
  trait GetBucketRequestPaymentOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    /**
      * <p>Specifies who pays for the download and request fees.</p>
      */
    var Payer: js.UndefOr[Requester | BucketOwner | String] = js.native
  }
  
}

