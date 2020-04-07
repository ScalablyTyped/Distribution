package typings.awsSdkClientS3Node.typesGetObjectOutputMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.AES256
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.COMPLETE
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.FAILED
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.ONEZONE_IA
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.PENDING
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.REDUCED_REDUNDANCY
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.REPLICA
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.STANDARD
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.STANDARD_IA
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.awsColonkms
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.requester_
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetObjectOutput[StreamType] extends MetadataBearer {
  /**
    * _AcceptRanges shape
    */
  var AcceptRanges: js.UndefOr[String] = js.undefined
  /**
    * <p>Object data.</p>
    */
  var Body: js.UndefOr[StreamType] = js.undefined
  /**
    * <p>Specifies caching behavior along the request/reply chain.</p>
    */
  var CacheControl: js.UndefOr[String] = js.undefined
  /**
    * <p>Specifies presentational information for the object.</p>
    */
  var ContentDisposition: js.UndefOr[String] = js.undefined
  /**
    * <p>Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field.</p>
    */
  var ContentEncoding: js.UndefOr[String] = js.undefined
  /**
    * <p>The language the content is in.</p>
    */
  var ContentLanguage: js.UndefOr[String] = js.undefined
  /**
    * <p>Size of the body in bytes.</p>
    */
  var ContentLength: js.UndefOr[Double] = js.undefined
  /**
    * <p>The portion of the object returned in the response.</p>
    */
  var ContentRange: js.UndefOr[String] = js.undefined
  /**
    * <p>A standard MIME type describing the format of the object data.</p>
    */
  var ContentType: js.UndefOr[String] = js.undefined
  /**
    * <p>Specifies whether the object retrieved was (true) or was not (false) a Delete Marker. If false, this response header does not appear in the response.</p>
    */
  var DeleteMarker: js.UndefOr[Boolean] = js.undefined
  /**
    * <p>An ETag is an opaque identifier assigned by a web server to a specific version of a resource found at a URL</p>
    */
  var ETag: js.UndefOr[String] = js.undefined
  /**
    * <p>If the object expiration is configured (see PUT Bucket lifecycle), the response includes this header. It includes the expiry-date and rule-id key value pairs providing object expiration information. The value of the rule-id is URL encoded.</p>
    */
  var Expiration: js.UndefOr[String] = js.undefined
  /**
    * <p>The date and time at which the object is no longer cacheable.</p>
    */
  var Expires: js.UndefOr[Date] = js.undefined
  /**
    * <p>Last modified date of the object</p>
    */
  var LastModified: js.UndefOr[Date] = js.undefined
  /**
    * <p>A map of metadata to store with the object in S3.</p>
    */
  var Metadata: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * <p>This is set to the number of metadata entries not returned in x-amz-meta headers. This can happen if you create metadata using an API like SOAP that supports more flexible metadata than the REST API. For example, using SOAP, you can create metadata whose values are not legal HTTP headers.</p>
    */
  var MissingMeta: js.UndefOr[Double] = js.undefined
  /**
    * <p>The count of parts this object has.</p>
    */
  var PartsCount: js.UndefOr[Double] = js.undefined
  /**
    * _ReplicationStatus shape
    */
  var ReplicationStatus: js.UndefOr[COMPLETE | PENDING | FAILED | REPLICA | String] = js.undefined
  /**
    * <p>If present, indicates that the requester was successfully charged for the request.</p>
    */
  var RequestCharged: js.UndefOr[requester_ | String] = js.undefined
  /**
    * <p>Provides information about object restoration operation and expiration time of the restored object copy.</p>
    */
  var Restore: js.UndefOr[String] = js.undefined
  /**
    * <p>If server-side encryption with a customer-provided encryption key was requested, the response will include this header confirming the encryption algorithm used.</p>
    */
  var SSECustomerAlgorithm: js.UndefOr[String] = js.undefined
  /**
    * <p>If server-side encryption with a customer-provided encryption key was requested, the response will include this header to provide round trip message integrity verification of the customer-provided encryption key.</p>
    */
  var SSECustomerKeyMD5: js.UndefOr[String] = js.undefined
  /**
    * <p>If present, specifies the ID of the AWS Key Management Service (KMS) master encryption key that was used for the object.</p>
    */
  var SSEKMSKeyId: js.UndefOr[String] = js.undefined
  /**
    * <p>The Server-side encryption algorithm used when storing this object in S3 (e.g., AES256, aws:kms).</p>
    */
  var ServerSideEncryption: js.UndefOr[AES256 | awsColonkms | String] = js.undefined
  /**
    * _StorageClass shape
    */
  var StorageClass: js.UndefOr[STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | ONEZONE_IA | String] = js.undefined
  /**
    * <p>The number of tags, if any, on the object.</p>
    */
  var TagCount: js.UndefOr[Double] = js.undefined
  /**
    * <p>Version of the object.</p>
    */
  var VersionId: js.UndefOr[String] = js.undefined
  /**
    * <p>If the bucket is configured as a website, redirects requests for this object to another object in the same bucket or to an external URL. Amazon S3 stores the value of this header in the object metadata.</p>
    */
  var WebsiteRedirectLocation: js.UndefOr[String] = js.undefined
}

object GetObjectOutput {
  @scala.inline
  def apply[StreamType](
    $metadata: ResponseMetadata,
    AcceptRanges: String = null,
    Body: StreamType = null,
    CacheControl: String = null,
    ContentDisposition: String = null,
    ContentEncoding: String = null,
    ContentLanguage: String = null,
    ContentLength: Int | Double = null,
    ContentRange: String = null,
    ContentType: String = null,
    DeleteMarker: js.UndefOr[Boolean] = js.undefined,
    ETag: String = null,
    Expiration: String = null,
    Expires: Date = null,
    LastModified: Date = null,
    Metadata: StringDictionary[String] = null,
    MissingMeta: Int | Double = null,
    PartsCount: Int | Double = null,
    ReplicationStatus: COMPLETE | PENDING | FAILED | REPLICA | String = null,
    RequestCharged: requester_ | String = null,
    Restore: String = null,
    SSECustomerAlgorithm: String = null,
    SSECustomerKeyMD5: String = null,
    SSEKMSKeyId: String = null,
    ServerSideEncryption: AES256 | awsColonkms | String = null,
    StorageClass: STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | ONEZONE_IA | String = null,
    TagCount: Int | Double = null,
    VersionId: String = null,
    WebsiteRedirectLocation: String = null
  ): GetObjectOutput[StreamType] = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (AcceptRanges != null) __obj.updateDynamic("AcceptRanges")(AcceptRanges.asInstanceOf[js.Any])
    if (Body != null) __obj.updateDynamic("Body")(Body.asInstanceOf[js.Any])
    if (CacheControl != null) __obj.updateDynamic("CacheControl")(CacheControl.asInstanceOf[js.Any])
    if (ContentDisposition != null) __obj.updateDynamic("ContentDisposition")(ContentDisposition.asInstanceOf[js.Any])
    if (ContentEncoding != null) __obj.updateDynamic("ContentEncoding")(ContentEncoding.asInstanceOf[js.Any])
    if (ContentLanguage != null) __obj.updateDynamic("ContentLanguage")(ContentLanguage.asInstanceOf[js.Any])
    if (ContentLength != null) __obj.updateDynamic("ContentLength")(ContentLength.asInstanceOf[js.Any])
    if (ContentRange != null) __obj.updateDynamic("ContentRange")(ContentRange.asInstanceOf[js.Any])
    if (ContentType != null) __obj.updateDynamic("ContentType")(ContentType.asInstanceOf[js.Any])
    if (!js.isUndefined(DeleteMarker)) __obj.updateDynamic("DeleteMarker")(DeleteMarker.asInstanceOf[js.Any])
    if (ETag != null) __obj.updateDynamic("ETag")(ETag.asInstanceOf[js.Any])
    if (Expiration != null) __obj.updateDynamic("Expiration")(Expiration.asInstanceOf[js.Any])
    if (Expires != null) __obj.updateDynamic("Expires")(Expires.asInstanceOf[js.Any])
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified.asInstanceOf[js.Any])
    if (Metadata != null) __obj.updateDynamic("Metadata")(Metadata.asInstanceOf[js.Any])
    if (MissingMeta != null) __obj.updateDynamic("MissingMeta")(MissingMeta.asInstanceOf[js.Any])
    if (PartsCount != null) __obj.updateDynamic("PartsCount")(PartsCount.asInstanceOf[js.Any])
    if (ReplicationStatus != null) __obj.updateDynamic("ReplicationStatus")(ReplicationStatus.asInstanceOf[js.Any])
    if (RequestCharged != null) __obj.updateDynamic("RequestCharged")(RequestCharged.asInstanceOf[js.Any])
    if (Restore != null) __obj.updateDynamic("Restore")(Restore.asInstanceOf[js.Any])
    if (SSECustomerAlgorithm != null) __obj.updateDynamic("SSECustomerAlgorithm")(SSECustomerAlgorithm.asInstanceOf[js.Any])
    if (SSECustomerKeyMD5 != null) __obj.updateDynamic("SSECustomerKeyMD5")(SSECustomerKeyMD5.asInstanceOf[js.Any])
    if (SSEKMSKeyId != null) __obj.updateDynamic("SSEKMSKeyId")(SSEKMSKeyId.asInstanceOf[js.Any])
    if (ServerSideEncryption != null) __obj.updateDynamic("ServerSideEncryption")(ServerSideEncryption.asInstanceOf[js.Any])
    if (StorageClass != null) __obj.updateDynamic("StorageClass")(StorageClass.asInstanceOf[js.Any])
    if (TagCount != null) __obj.updateDynamic("TagCount")(TagCount.asInstanceOf[js.Any])
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId.asInstanceOf[js.Any])
    if (WebsiteRedirectLocation != null) __obj.updateDynamic("WebsiteRedirectLocation")(WebsiteRedirectLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectOutput[StreamType]]
  }
}

