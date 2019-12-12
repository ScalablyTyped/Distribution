package typings.atAwsDashSdkClientDashS3DashBrowser

import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.AES256
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.`aws:kms`
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.requester_
import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/types/CompleteMultipartUploadOutput", JSImport.Namespace)
@js.native
object typesCompleteMultipartUploadOutputMod extends js.Object {
  @js.native
  trait CompleteMultipartUploadOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    /**
      * _BucketName shape
      */
    var Bucket: js.UndefOr[String] = js.native
    /**
      * <p>Entity tag of the object.</p>
      */
    var ETag: js.UndefOr[String] = js.native
    /**
      * <p>If the object expiration is configured, this will contain the expiration date (expiry-date) and rule ID (rule-id). The value of rule-id is URL encoded.</p>
      */
    var Expiration: js.UndefOr[String] = js.native
    /**
      * _ObjectKey shape
      */
    var Key: js.UndefOr[String] = js.native
    /**
      * _Location shape
      */
    var Location: js.UndefOr[String] = js.native
    /**
      * <p>If present, indicates that the requester was successfully charged for the request.</p>
      */
    var RequestCharged: js.UndefOr[requester_ | String] = js.native
    /**
      * <p>If present, specifies the ID of the AWS Key Management Service (KMS) master encryption key that was used for the object.</p>
      */
    var SSEKMSKeyId: js.UndefOr[String] = js.native
    /**
      * <p>The Server-side encryption algorithm used when storing this object in S3 (e.g., AES256, aws:kms).</p>
      */
    var ServerSideEncryption: js.UndefOr[AES256 | `aws:kms` | String] = js.native
    /**
      * <p>Version of the object.</p>
      */
    var VersionId: js.UndefOr[String] = js.native
  }
  
}

