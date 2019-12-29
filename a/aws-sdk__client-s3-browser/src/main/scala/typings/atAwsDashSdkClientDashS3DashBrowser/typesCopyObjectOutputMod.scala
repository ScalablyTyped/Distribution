package typings.atAwsDashSdkClientDashS3DashBrowser

import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.AES256
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.awsColonkms
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.requester_
import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreCopyObjectResultMod._UnmarshalledCopyObjectResult
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/types/CopyObjectOutput", JSImport.Namespace)
@js.native
object typesCopyObjectOutputMod extends js.Object {
  @js.native
  trait CopyObjectOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    /**
      * _CopyObjectResult shape
      */
    var CopyObjectResult: js.UndefOr[_UnmarshalledCopyObjectResult] = js.native
    /**
      * _CopySourceVersionId shape
      */
    var CopySourceVersionId: js.UndefOr[String] = js.native
    /**
      * <p>If the object expiration is configured, the response includes this header.</p>
      */
    var Expiration: js.UndefOr[String] = js.native
    /**
      * <p>If present, indicates that the requester was successfully charged for the request.</p>
      */
    var RequestCharged: js.UndefOr[requester_ | String] = js.native
    /**
      * <p>If server-side encryption with a customer-provided encryption key was requested, the response will include this header confirming the encryption algorithm used.</p>
      */
    var SSECustomerAlgorithm: js.UndefOr[String] = js.native
    /**
      * <p>If server-side encryption with a customer-provided encryption key was requested, the response will include this header to provide round trip message integrity verification of the customer-provided encryption key.</p>
      */
    var SSECustomerKeyMD5: js.UndefOr[String] = js.native
    /**
      * <p>If present, specifies the ID of the AWS Key Management Service (KMS) master encryption key that was used for the object.</p>
      */
    var SSEKMSKeyId: js.UndefOr[String] = js.native
    /**
      * <p>The Server-side encryption algorithm used when storing this object in S3 (e.g., AES256, aws:kms).</p>
      */
    var ServerSideEncryption: js.UndefOr[AES256 | awsColonkms | String] = js.native
    /**
      * <p>Version ID of the newly created copy.</p>
      */
    var VersionId: js.UndefOr[String] = js.native
  }
  
}

