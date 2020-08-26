package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeadObjectOutput extends js.Object {
  /**
    * Indicates that a range of bytes was specified.
    */
  var AcceptRanges: js.UndefOr[typings.awsSdk.s3Mod.AcceptRanges] = js.native
  /**
    * Specifies caching behavior along the request/reply chain.
    */
  var CacheControl: js.UndefOr[typings.awsSdk.s3Mod.CacheControl] = js.native
  /**
    * Specifies presentational information for the object.
    */
  var ContentDisposition: js.UndefOr[typings.awsSdk.s3Mod.ContentDisposition] = js.native
  /**
    * Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field.
    */
  var ContentEncoding: js.UndefOr[typings.awsSdk.s3Mod.ContentEncoding] = js.native
  /**
    * The language the content is in.
    */
  var ContentLanguage: js.UndefOr[typings.awsSdk.s3Mod.ContentLanguage] = js.native
  /**
    * Size of the body in bytes.
    */
  var ContentLength: js.UndefOr[typings.awsSdk.s3Mod.ContentLength] = js.native
  /**
    * A standard MIME type describing the format of the object data.
    */
  var ContentType: js.UndefOr[typings.awsSdk.s3Mod.ContentType] = js.native
  /**
    * Specifies whether the object retrieved was (true) or was not (false) a Delete Marker. If false, this response header does not appear in the response.
    */
  var DeleteMarker: js.UndefOr[typings.awsSdk.s3Mod.DeleteMarker] = js.native
  /**
    * An ETag is an opaque identifier assigned by a web server to a specific version of a resource found at a URL.
    */
  var ETag: js.UndefOr[typings.awsSdk.s3Mod.ETag] = js.native
  /**
    * If the object expiration is configured (see PUT Bucket lifecycle), the response includes this header. It includes the expiry-date and rule-id key-value pairs providing object expiration information. The value of the rule-id is URL encoded.
    */
  var Expiration: js.UndefOr[typings.awsSdk.s3Mod.Expiration] = js.native
  /**
    * The date and time at which the object is no longer cacheable.
    */
  var Expires: js.UndefOr[typings.awsSdk.s3Mod.Expires] = js.native
  /**
    * Last modified date of the object
    */
  var LastModified: js.UndefOr[typings.awsSdk.s3Mod.LastModified] = js.native
  /**
    * A map of metadata to store with the object in S3.
    */
  var Metadata: js.UndefOr[typings.awsSdk.s3Mod.Metadata] = js.native
  /**
    * This is set to the number of metadata entries not returned in x-amz-meta headers. This can happen if you create metadata using an API like SOAP that supports more flexible metadata than the REST API. For example, using SOAP, you can create metadata whose values are not legal HTTP headers.
    */
  var MissingMeta: js.UndefOr[typings.awsSdk.s3Mod.MissingMeta] = js.native
  /**
    * Specifies whether a legal hold is in effect for this object. This header is only returned if the requester has the s3:GetObjectLegalHold permission. This header is not returned if the specified version of this object has never had a legal hold applied. For more information about S3 Object Lock, see Object Lock.
    */
  var ObjectLockLegalHoldStatus: js.UndefOr[typings.awsSdk.s3Mod.ObjectLockLegalHoldStatus] = js.native
  /**
    * The Object Lock mode, if any, that's in effect for this object. This header is only returned if the requester has the s3:GetObjectRetention permission. For more information about S3 Object Lock, see Object Lock. 
    */
  var ObjectLockMode: js.UndefOr[typings.awsSdk.s3Mod.ObjectLockMode] = js.native
  /**
    * The date and time when the Object Lock retention period expires. This header is only returned if the requester has the s3:GetObjectRetention permission.
    */
  var ObjectLockRetainUntilDate: js.UndefOr[typings.awsSdk.s3Mod.ObjectLockRetainUntilDate] = js.native
  /**
    * The count of parts this object has.
    */
  var PartsCount: js.UndefOr[typings.awsSdk.s3Mod.PartsCount] = js.native
  /**
    * Amazon S3 can return this header if your request involves a bucket that is either a source or destination in a replication rule. In replication, you have a source bucket on which you configure replication and destination bucket where Amazon S3 stores object replicas. When you request an object (GetObject) or object metadata (HeadObject) from these buckets, Amazon S3 will return the x-amz-replication-status header in the response as follows:   If requesting an object from the source bucket — Amazon S3 will return the x-amz-replication-status header if the object in your request is eligible for replication.  For example, suppose that in your replication configuration, you specify object prefix TaxDocs requesting Amazon S3 to replicate objects with key prefix TaxDocs. Any objects you upload with this key name prefix, for example TaxDocs/document1.pdf, are eligible for replication. For any object request with this key name prefix, Amazon S3 will return the x-amz-replication-status header with value PENDING, COMPLETED or FAILED indicating object replication status.   If requesting an object from the destination bucket — Amazon S3 will return the x-amz-replication-status header with value REPLICA if the object in your request is a replica that Amazon S3 created.   For more information, see Replication.
    */
  var ReplicationStatus: js.UndefOr[typings.awsSdk.s3Mod.ReplicationStatus] = js.native
  var RequestCharged: js.UndefOr[typings.awsSdk.s3Mod.RequestCharged] = js.native
  /**
    * If the object is an archived object (an object whose storage class is GLACIER), the response includes this header if either the archive restoration is in progress (see RestoreObject or an archive copy is already restored.  If an archive copy is already restored, the header value indicates when Amazon S3 is scheduled to delete the object copy. For example:  x-amz-restore: ongoing-request="false", expiry-date="Fri, 23 Dec 2012 00:00:00 GMT"  If the object restoration is in progress, the header returns the value ongoing-request="true". For more information about archiving objects, see Transitioning Objects: General Considerations.
    */
  var Restore: js.UndefOr[typings.awsSdk.s3Mod.Restore] = js.native
  /**
    * If server-side encryption with a customer-provided encryption key was requested, the response will include this header confirming the encryption algorithm used.
    */
  var SSECustomerAlgorithm: js.UndefOr[typings.awsSdk.s3Mod.SSECustomerAlgorithm] = js.native
  /**
    * If server-side encryption with a customer-provided encryption key was requested, the response will include this header to provide round-trip message integrity verification of the customer-provided encryption key.
    */
  var SSECustomerKeyMD5: js.UndefOr[typings.awsSdk.s3Mod.SSECustomerKeyMD5] = js.native
  /**
    * If present, specifies the ID of the AWS Key Management Service (AWS KMS) symmetric customer managed customer master key (CMK) that was used for the object.
    */
  var SSEKMSKeyId: js.UndefOr[typings.awsSdk.s3Mod.SSEKMSKeyId] = js.native
  /**
    * If the object is stored using server-side encryption either with an AWS KMS customer master key (CMK) or an Amazon S3-managed encryption key, the response includes this header with the value of the server-side encryption algorithm used when storing this object in Amazon S3 (for example, AES256, aws:kms).
    */
  var ServerSideEncryption: js.UndefOr[typings.awsSdk.s3Mod.ServerSideEncryption] = js.native
  /**
    * Provides storage class information of the object. Amazon S3 returns this header for all objects except for S3 Standard storage class objects. For more information, see Storage Classes.
    */
  var StorageClass: js.UndefOr[typings.awsSdk.s3Mod.StorageClass] = js.native
  /**
    * Version of the object.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.native
  /**
    * If the bucket is configured as a website, redirects requests for this object to another object in the same bucket or to an external URL. Amazon S3 stores the value of this header in the object metadata.
    */
  var WebsiteRedirectLocation: js.UndefOr[typings.awsSdk.s3Mod.WebsiteRedirectLocation] = js.native
}

object HeadObjectOutput {
  @scala.inline
  def apply(): HeadObjectOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeadObjectOutput]
  }
  @scala.inline
  implicit class HeadObjectOutputOps[Self <: HeadObjectOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAcceptRanges(value: AcceptRanges): Self = this.set("AcceptRanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceptRanges: Self = this.set("AcceptRanges", js.undefined)
    @scala.inline
    def setCacheControl(value: CacheControl): Self = this.set("CacheControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheControl: Self = this.set("CacheControl", js.undefined)
    @scala.inline
    def setContentDisposition(value: ContentDisposition): Self = this.set("ContentDisposition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentDisposition: Self = this.set("ContentDisposition", js.undefined)
    @scala.inline
    def setContentEncoding(value: ContentEncoding): Self = this.set("ContentEncoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentEncoding: Self = this.set("ContentEncoding", js.undefined)
    @scala.inline
    def setContentLanguage(value: ContentLanguage): Self = this.set("ContentLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentLanguage: Self = this.set("ContentLanguage", js.undefined)
    @scala.inline
    def setContentLength(value: ContentLength): Self = this.set("ContentLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentLength: Self = this.set("ContentLength", js.undefined)
    @scala.inline
    def setContentType(value: ContentType): Self = this.set("ContentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("ContentType", js.undefined)
    @scala.inline
    def setDeleteMarker(value: DeleteMarker): Self = this.set("DeleteMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteMarker: Self = this.set("DeleteMarker", js.undefined)
    @scala.inline
    def setETag(value: ETag): Self = this.set("ETag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteETag: Self = this.set("ETag", js.undefined)
    @scala.inline
    def setExpiration(value: Expiration): Self = this.set("Expiration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpiration: Self = this.set("Expiration", js.undefined)
    @scala.inline
    def setExpires(value: Expires): Self = this.set("Expires", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpires: Self = this.set("Expires", js.undefined)
    @scala.inline
    def setLastModified(value: LastModified): Self = this.set("LastModified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModified: Self = this.set("LastModified", js.undefined)
    @scala.inline
    def setMetadata(value: Metadata): Self = this.set("Metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("Metadata", js.undefined)
    @scala.inline
    def setMissingMeta(value: MissingMeta): Self = this.set("MissingMeta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMissingMeta: Self = this.set("MissingMeta", js.undefined)
    @scala.inline
    def setObjectLockLegalHoldStatus(value: ObjectLockLegalHoldStatus): Self = this.set("ObjectLockLegalHoldStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectLockLegalHoldStatus: Self = this.set("ObjectLockLegalHoldStatus", js.undefined)
    @scala.inline
    def setObjectLockMode(value: ObjectLockMode): Self = this.set("ObjectLockMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectLockMode: Self = this.set("ObjectLockMode", js.undefined)
    @scala.inline
    def setObjectLockRetainUntilDate(value: ObjectLockRetainUntilDate): Self = this.set("ObjectLockRetainUntilDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectLockRetainUntilDate: Self = this.set("ObjectLockRetainUntilDate", js.undefined)
    @scala.inline
    def setPartsCount(value: PartsCount): Self = this.set("PartsCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartsCount: Self = this.set("PartsCount", js.undefined)
    @scala.inline
    def setReplicationStatus(value: ReplicationStatus): Self = this.set("ReplicationStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicationStatus: Self = this.set("ReplicationStatus", js.undefined)
    @scala.inline
    def setRequestCharged(value: RequestCharged): Self = this.set("RequestCharged", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestCharged: Self = this.set("RequestCharged", js.undefined)
    @scala.inline
    def setRestore(value: Restore): Self = this.set("Restore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestore: Self = this.set("Restore", js.undefined)
    @scala.inline
    def setSSECustomerAlgorithm(value: SSECustomerAlgorithm): Self = this.set("SSECustomerAlgorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSSECustomerAlgorithm: Self = this.set("SSECustomerAlgorithm", js.undefined)
    @scala.inline
    def setSSECustomerKeyMD5(value: SSECustomerKeyMD5): Self = this.set("SSECustomerKeyMD5", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSSECustomerKeyMD5: Self = this.set("SSECustomerKeyMD5", js.undefined)
    @scala.inline
    def setSSEKMSKeyId(value: SSEKMSKeyId): Self = this.set("SSEKMSKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSSEKMSKeyId: Self = this.set("SSEKMSKeyId", js.undefined)
    @scala.inline
    def setServerSideEncryption(value: ServerSideEncryption): Self = this.set("ServerSideEncryption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerSideEncryption: Self = this.set("ServerSideEncryption", js.undefined)
    @scala.inline
    def setStorageClass(value: StorageClass): Self = this.set("StorageClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageClass: Self = this.set("StorageClass", js.undefined)
    @scala.inline
    def setVersionId(value: ObjectVersionId): Self = this.set("VersionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionId: Self = this.set("VersionId", js.undefined)
    @scala.inline
    def setWebsiteRedirectLocation(value: WebsiteRedirectLocation): Self = this.set("WebsiteRedirectLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebsiteRedirectLocation: Self = this.set("WebsiteRedirectLocation", js.undefined)
  }
  
}

