package typings.atAwsDashSdkClientDashS3DashNode

import org.scalablytyped.runtime.StringDictionary
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.AES256
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.COMPLETE
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.FAILED
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.ONEZONE_IA
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.PENDING
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.REDUCED_REDUNDANCY
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.REPLICA
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.STANDARD
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.STANDARD_IA
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.`aws:kms`
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.requester_
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/types/GetObjectOutput", JSImport.Namespace)
@js.native
object typesGetObjectOutputMod extends js.Object {
  @js.native
  trait GetObjectOutput[StreamType] extends MetadataBearer {
    /**
      * _AcceptRanges shape
      */
    var AcceptRanges: js.UndefOr[String] = js.native
    /**
      * <p>Object data.</p>
      */
    var Body: js.UndefOr[StreamType] = js.native
    /**
      * <p>Specifies caching behavior along the request/reply chain.</p>
      */
    var CacheControl: js.UndefOr[String] = js.native
    /**
      * <p>Specifies presentational information for the object.</p>
      */
    var ContentDisposition: js.UndefOr[String] = js.native
    /**
      * <p>Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field.</p>
      */
    var ContentEncoding: js.UndefOr[String] = js.native
    /**
      * <p>The language the content is in.</p>
      */
    var ContentLanguage: js.UndefOr[String] = js.native
    /**
      * <p>Size of the body in bytes.</p>
      */
    var ContentLength: js.UndefOr[Double] = js.native
    /**
      * <p>The portion of the object returned in the response.</p>
      */
    var ContentRange: js.UndefOr[String] = js.native
    /**
      * <p>A standard MIME type describing the format of the object data.</p>
      */
    var ContentType: js.UndefOr[String] = js.native
    /**
      * <p>Specifies whether the object retrieved was (true) or was not (false) a Delete Marker. If false, this response header does not appear in the response.</p>
      */
    var DeleteMarker: js.UndefOr[Boolean] = js.native
    /**
      * <p>An ETag is an opaque identifier assigned by a web server to a specific version of a resource found at a URL</p>
      */
    var ETag: js.UndefOr[String] = js.native
    /**
      * <p>If the object expiration is configured (see PUT Bucket lifecycle), the response includes this header. It includes the expiry-date and rule-id key value pairs providing object expiration information. The value of the rule-id is URL encoded.</p>
      */
    var Expiration: js.UndefOr[String] = js.native
    /**
      * <p>The date and time at which the object is no longer cacheable.</p>
      */
    var Expires: js.UndefOr[Date] = js.native
    /**
      * <p>Last modified date of the object</p>
      */
    var LastModified: js.UndefOr[Date] = js.native
    /**
      * <p>A map of metadata to store with the object in S3.</p>
      */
    var Metadata: js.UndefOr[StringDictionary[String]] = js.native
    /**
      * <p>This is set to the number of metadata entries not returned in x-amz-meta headers. This can happen if you create metadata using an API like SOAP that supports more flexible metadata than the REST API. For example, using SOAP, you can create metadata whose values are not legal HTTP headers.</p>
      */
    var MissingMeta: js.UndefOr[Double] = js.native
    /**
      * <p>The count of parts this object has.</p>
      */
    var PartsCount: js.UndefOr[Double] = js.native
    /**
      * _ReplicationStatus shape
      */
    var ReplicationStatus: js.UndefOr[COMPLETE | PENDING | FAILED | REPLICA | String] = js.native
    /**
      * <p>If present, indicates that the requester was successfully charged for the request.</p>
      */
    var RequestCharged: js.UndefOr[requester_ | String] = js.native
    /**
      * <p>Provides information about object restoration operation and expiration time of the restored object copy.</p>
      */
    var Restore: js.UndefOr[String] = js.native
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
    var ServerSideEncryption: js.UndefOr[AES256 | `aws:kms` | String] = js.native
    /**
      * _StorageClass shape
      */
    var StorageClass: js.UndefOr[STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | ONEZONE_IA | String] = js.native
    /**
      * <p>The number of tags, if any, on the object.</p>
      */
    var TagCount: js.UndefOr[Double] = js.native
    /**
      * <p>Version of the object.</p>
      */
    var VersionId: js.UndefOr[String] = js.native
    /**
      * <p>If the bucket is configured as a website, redirects requests for this object to another object in the same bucket or to an external URL. Amazon S3 stores the value of this header in the object metadata.</p>
      */
    var WebsiteRedirectLocation: js.UndefOr[String] = js.native
  }
  
}

