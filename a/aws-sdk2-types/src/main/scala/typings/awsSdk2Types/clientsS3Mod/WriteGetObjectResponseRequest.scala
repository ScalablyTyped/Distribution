package typings.awsSdk2Types.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WriteGetObjectResponseRequest extends StObject {
  
  /**
    * Indicates that a range of bytes was specified.
    */
  var AcceptRanges: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.AcceptRanges] = js.undefined
  
  /**
    * The object data.
    */
  var Body: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.Body] = js.undefined
  
  /**
    *  Indicates whether the object stored in Amazon S3 uses an S3 bucket key for server-side encryption with Amazon Web Services KMS (SSE-KMS).
    */
  var BucketKeyEnabled: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.BucketKeyEnabled] = js.undefined
  
  /**
    * Specifies caching behavior along the request/reply chain.
    */
  var CacheControl: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.CacheControl] = js.undefined
  
  /**
    * This header can be used as a data integrity check to verify that the data received is the same data that was originally sent. This specifies the base64-encoded, 32-bit CRC32 checksum of the object returned by the Object Lambda function. This may not match the checksum for the object stored in Amazon S3. Amazon S3 will perform validation of the checksum values only when the original GetObject request required checksum validation. For more information about checksums, see Checking object integrity in the Amazon S3 User Guide. Only one checksum header can be specified at a time. If you supply multiple checksum headers, this request will fail. 
    */
  var ChecksumCRC32: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.ChecksumCRC32] = js.undefined
  
  /**
    * This header can be used as a data integrity check to verify that the data received is the same data that was originally sent. This specifies the base64-encoded, 32-bit CRC32C checksum of the object returned by the Object Lambda function. This may not match the checksum for the object stored in Amazon S3. Amazon S3 will perform validation of the checksum values only when the original GetObject request required checksum validation. For more information about checksums, see Checking object integrity in the Amazon S3 User Guide. Only one checksum header can be specified at a time. If you supply multiple checksum headers, this request will fail.
    */
  var ChecksumCRC32C: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.ChecksumCRC32C] = js.undefined
  
  /**
    * This header can be used as a data integrity check to verify that the data received is the same data that was originally sent. This specifies the base64-encoded, 160-bit SHA-1 digest of the object returned by the Object Lambda function. This may not match the checksum for the object stored in Amazon S3. Amazon S3 will perform validation of the checksum values only when the original GetObject request required checksum validation. For more information about checksums, see Checking object integrity in the Amazon S3 User Guide. Only one checksum header can be specified at a time. If you supply multiple checksum headers, this request will fail.
    */
  var ChecksumSHA1: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.ChecksumSHA1] = js.undefined
  
  /**
    * This header can be used as a data integrity check to verify that the data received is the same data that was originally sent. This specifies the base64-encoded, 256-bit SHA-256 digest of the object returned by the Object Lambda function. This may not match the checksum for the object stored in Amazon S3. Amazon S3 will perform validation of the checksum values only when the original GetObject request required checksum validation. For more information about checksums, see Checking object integrity in the Amazon S3 User Guide. Only one checksum header can be specified at a time. If you supply multiple checksum headers, this request will fail.
    */
  var ChecksumSHA256: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.ChecksumSHA256] = js.undefined
  
  /**
    * Specifies presentational information for the object.
    */
  var ContentDisposition: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.ContentDisposition] = js.undefined
  
  /**
    * Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field.
    */
  var ContentEncoding: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.ContentEncoding] = js.undefined
  
  /**
    * The language the content is in.
    */
  var ContentLanguage: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.ContentLanguage] = js.undefined
  
  /**
    * The size of the content body in bytes.
    */
  var ContentLength: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.ContentLength] = js.undefined
  
  /**
    * The portion of the object returned in the response.
    */
  var ContentRange: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.ContentRange] = js.undefined
  
  /**
    * A standard MIME type describing the format of the object data.
    */
  var ContentType: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.ContentType] = js.undefined
  
  /**
    * Specifies whether an object stored in Amazon S3 is (true) or is not (false) a delete marker. 
    */
  var DeleteMarker: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.DeleteMarker] = js.undefined
  
  /**
    * An opaque identifier assigned by a web server to a specific version of a resource found at a URL. 
    */
  var ETag: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.ETag] = js.undefined
  
  /**
    * A string that uniquely identifies an error condition. Returned in the &lt;Code&gt; tag of the error XML response for a corresponding GetObject call. Cannot be used with a successful StatusCode header or when the transformed object is provided in the body. All error codes from S3 are sentence-cased. The regular expression (regex) value is "^[A-Z][a-zA-Z]+$".
    */
  var ErrorCode: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.ErrorCode] = js.undefined
  
  /**
    * Contains a generic description of the error condition. Returned in the &lt;Message&gt; tag of the error XML response for a corresponding GetObject call. Cannot be used with a successful StatusCode header or when the transformed object is provided in body.
    */
  var ErrorMessage: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.ErrorMessage] = js.undefined
  
  /**
    * If the object expiration is configured (see PUT Bucket lifecycle), the response includes this header. It includes the expiry-date and rule-id key-value pairs that provide the object expiration information. The value of the rule-id is URL-encoded. 
    */
  var Expiration: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.Expiration] = js.undefined
  
  /**
    * The date and time at which the object is no longer cacheable.
    */
  var Expires: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date and time that the object was last modified.
    */
  var LastModified: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A map of metadata to store with the object in S3.
    */
  var Metadata: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.Metadata] = js.undefined
  
  /**
    * Set to the number of metadata entries not returned in x-amz-meta headers. This can happen if you create metadata using an API like SOAP that supports more flexible metadata than the REST API. For example, using SOAP, you can create metadata whose values are not legal HTTP headers.
    */
  var MissingMeta: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.MissingMeta] = js.undefined
  
  /**
    * Indicates whether an object stored in Amazon S3 has an active legal hold.
    */
  var ObjectLockLegalHoldStatus: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.ObjectLockLegalHoldStatus] = js.undefined
  
  /**
    * Indicates whether an object stored in Amazon S3 has Object Lock enabled. For more information about S3 Object Lock, see Object Lock.
    */
  var ObjectLockMode: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.ObjectLockMode] = js.undefined
  
  /**
    * The date and time when Object Lock is configured to expire.
    */
  var ObjectLockRetainUntilDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The count of parts this object has.
    */
  var PartsCount: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.PartsCount] = js.undefined
  
  /**
    * Indicates if request involves bucket that is either a source or destination in a Replication rule. For more information about S3 Replication, see Replication.
    */
  var ReplicationStatus: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.ReplicationStatus] = js.undefined
  
  var RequestCharged: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.RequestCharged] = js.undefined
  
  /**
    * Route prefix to the HTTP URL generated.
    */
  var RequestRoute: typings.awsSdk2Types.clientsS3Mod.RequestRoute
  
  /**
    * A single use encrypted token that maps WriteGetObjectResponse to the end user GetObject request.
    */
  var RequestToken: typings.awsSdk2Types.clientsS3Mod.RequestToken
  
  /**
    * Provides information about object restoration operation and expiration time of the restored object copy.
    */
  var Restore: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.Restore] = js.undefined
  
  /**
    * Encryption algorithm used if server-side encryption with a customer-provided encryption key was specified for object stored in Amazon S3.
    */
  var SSECustomerAlgorithm: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.SSECustomerAlgorithm] = js.undefined
  
  /**
    *  128-bit MD5 digest of customer-provided encryption key used in Amazon S3 to encrypt data stored in S3. For more information, see Protecting data using server-side encryption with customer-provided encryption keys (SSE-C).
    */
  var SSECustomerKeyMD5: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.SSECustomerKeyMD5] = js.undefined
  
  /**
    *  If present, specifies the ID of the Amazon Web Services Key Management Service (Amazon Web Services KMS) symmetric customer managed key that was used for stored in Amazon S3 object. 
    */
  var SSEKMSKeyId: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.SSEKMSKeyId] = js.undefined
  
  /**
    *  The server-side encryption algorithm used when storing requested object in Amazon S3 (for example, AES256, aws:kms).
    */
  var ServerSideEncryption: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.ServerSideEncryption] = js.undefined
  
  /**
    * The integer status code for an HTTP response of a corresponding GetObject request.  Status Codes     200 - OK     206 - Partial Content     304 - Not Modified     400 - Bad Request     401 - Unauthorized     403 - Forbidden     404 - Not Found     405 - Method Not Allowed     409 - Conflict     411 - Length Required     412 - Precondition Failed     416 - Range Not Satisfiable     500 - Internal Server Error     503 - Service Unavailable   
    */
  var StatusCode: js.UndefOr[GetObjectResponseStatusCode] = js.undefined
  
  /**
    * Provides storage class information of the object. Amazon S3 returns this header for all objects except for S3 Standard storage class objects. For more information, see Storage Classes.
    */
  var StorageClass: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.StorageClass] = js.undefined
  
  /**
    * The number of tags, if any, on the object.
    */
  var TagCount: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.TagCount] = js.undefined
  
  /**
    * An ID used to reference a specific version of the object.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
}
object WriteGetObjectResponseRequest {
  
  inline def apply(RequestRoute: RequestRoute, RequestToken: RequestToken): WriteGetObjectResponseRequest = {
    val __obj = js.Dynamic.literal(RequestRoute = RequestRoute.asInstanceOf[js.Any], RequestToken = RequestToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteGetObjectResponseRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WriteGetObjectResponseRequest] (val x: Self) extends AnyVal {
    
    inline def setAcceptRanges(value: AcceptRanges): Self = StObject.set(x, "AcceptRanges", value.asInstanceOf[js.Any])
    
    inline def setAcceptRangesUndefined: Self = StObject.set(x, "AcceptRanges", js.undefined)
    
    inline def setBody(value: Body): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "Body", js.undefined)
    
    inline def setBucketKeyEnabled(value: BucketKeyEnabled): Self = StObject.set(x, "BucketKeyEnabled", value.asInstanceOf[js.Any])
    
    inline def setBucketKeyEnabledUndefined: Self = StObject.set(x, "BucketKeyEnabled", js.undefined)
    
    inline def setCacheControl(value: CacheControl): Self = StObject.set(x, "CacheControl", value.asInstanceOf[js.Any])
    
    inline def setCacheControlUndefined: Self = StObject.set(x, "CacheControl", js.undefined)
    
    inline def setChecksumCRC32(value: ChecksumCRC32): Self = StObject.set(x, "ChecksumCRC32", value.asInstanceOf[js.Any])
    
    inline def setChecksumCRC32C(value: ChecksumCRC32C): Self = StObject.set(x, "ChecksumCRC32C", value.asInstanceOf[js.Any])
    
    inline def setChecksumCRC32CUndefined: Self = StObject.set(x, "ChecksumCRC32C", js.undefined)
    
    inline def setChecksumCRC32Undefined: Self = StObject.set(x, "ChecksumCRC32", js.undefined)
    
    inline def setChecksumSHA1(value: ChecksumSHA1): Self = StObject.set(x, "ChecksumSHA1", value.asInstanceOf[js.Any])
    
    inline def setChecksumSHA1Undefined: Self = StObject.set(x, "ChecksumSHA1", js.undefined)
    
    inline def setChecksumSHA256(value: ChecksumSHA256): Self = StObject.set(x, "ChecksumSHA256", value.asInstanceOf[js.Any])
    
    inline def setChecksumSHA256Undefined: Self = StObject.set(x, "ChecksumSHA256", js.undefined)
    
    inline def setContentDisposition(value: ContentDisposition): Self = StObject.set(x, "ContentDisposition", value.asInstanceOf[js.Any])
    
    inline def setContentDispositionUndefined: Self = StObject.set(x, "ContentDisposition", js.undefined)
    
    inline def setContentEncoding(value: ContentEncoding): Self = StObject.set(x, "ContentEncoding", value.asInstanceOf[js.Any])
    
    inline def setContentEncodingUndefined: Self = StObject.set(x, "ContentEncoding", js.undefined)
    
    inline def setContentLanguage(value: ContentLanguage): Self = StObject.set(x, "ContentLanguage", value.asInstanceOf[js.Any])
    
    inline def setContentLanguageUndefined: Self = StObject.set(x, "ContentLanguage", js.undefined)
    
    inline def setContentLength(value: ContentLength): Self = StObject.set(x, "ContentLength", value.asInstanceOf[js.Any])
    
    inline def setContentLengthUndefined: Self = StObject.set(x, "ContentLength", js.undefined)
    
    inline def setContentRange(value: ContentRange): Self = StObject.set(x, "ContentRange", value.asInstanceOf[js.Any])
    
    inline def setContentRangeUndefined: Self = StObject.set(x, "ContentRange", js.undefined)
    
    inline def setContentType(value: ContentType): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
    
    inline def setDeleteMarker(value: DeleteMarker): Self = StObject.set(x, "DeleteMarker", value.asInstanceOf[js.Any])
    
    inline def setDeleteMarkerUndefined: Self = StObject.set(x, "DeleteMarker", js.undefined)
    
    inline def setETag(value: ETag): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    inline def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    inline def setErrorCode(value: ErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    inline def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setExpiration(value: Expiration): Self = StObject.set(x, "Expiration", value.asInstanceOf[js.Any])
    
    inline def setExpirationUndefined: Self = StObject.set(x, "Expiration", js.undefined)
    
    inline def setExpires(value: js.Date): Self = StObject.set(x, "Expires", value.asInstanceOf[js.Any])
    
    inline def setExpiresUndefined: Self = StObject.set(x, "Expires", js.undefined)
    
    inline def setLastModified(value: js.Date): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
    
    inline def setMissingMeta(value: MissingMeta): Self = StObject.set(x, "MissingMeta", value.asInstanceOf[js.Any])
    
    inline def setMissingMetaUndefined: Self = StObject.set(x, "MissingMeta", js.undefined)
    
    inline def setObjectLockLegalHoldStatus(value: ObjectLockLegalHoldStatus): Self = StObject.set(x, "ObjectLockLegalHoldStatus", value.asInstanceOf[js.Any])
    
    inline def setObjectLockLegalHoldStatusUndefined: Self = StObject.set(x, "ObjectLockLegalHoldStatus", js.undefined)
    
    inline def setObjectLockMode(value: ObjectLockMode): Self = StObject.set(x, "ObjectLockMode", value.asInstanceOf[js.Any])
    
    inline def setObjectLockModeUndefined: Self = StObject.set(x, "ObjectLockMode", js.undefined)
    
    inline def setObjectLockRetainUntilDate(value: js.Date): Self = StObject.set(x, "ObjectLockRetainUntilDate", value.asInstanceOf[js.Any])
    
    inline def setObjectLockRetainUntilDateUndefined: Self = StObject.set(x, "ObjectLockRetainUntilDate", js.undefined)
    
    inline def setPartsCount(value: PartsCount): Self = StObject.set(x, "PartsCount", value.asInstanceOf[js.Any])
    
    inline def setPartsCountUndefined: Self = StObject.set(x, "PartsCount", js.undefined)
    
    inline def setReplicationStatus(value: ReplicationStatus): Self = StObject.set(x, "ReplicationStatus", value.asInstanceOf[js.Any])
    
    inline def setReplicationStatusUndefined: Self = StObject.set(x, "ReplicationStatus", js.undefined)
    
    inline def setRequestCharged(value: RequestCharged): Self = StObject.set(x, "RequestCharged", value.asInstanceOf[js.Any])
    
    inline def setRequestChargedUndefined: Self = StObject.set(x, "RequestCharged", js.undefined)
    
    inline def setRequestRoute(value: RequestRoute): Self = StObject.set(x, "RequestRoute", value.asInstanceOf[js.Any])
    
    inline def setRequestToken(value: RequestToken): Self = StObject.set(x, "RequestToken", value.asInstanceOf[js.Any])
    
    inline def setRestore(value: Restore): Self = StObject.set(x, "Restore", value.asInstanceOf[js.Any])
    
    inline def setRestoreUndefined: Self = StObject.set(x, "Restore", js.undefined)
    
    inline def setSSECustomerAlgorithm(value: SSECustomerAlgorithm): Self = StObject.set(x, "SSECustomerAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSSECustomerAlgorithmUndefined: Self = StObject.set(x, "SSECustomerAlgorithm", js.undefined)
    
    inline def setSSECustomerKeyMD5(value: SSECustomerKeyMD5): Self = StObject.set(x, "SSECustomerKeyMD5", value.asInstanceOf[js.Any])
    
    inline def setSSECustomerKeyMD5Undefined: Self = StObject.set(x, "SSECustomerKeyMD5", js.undefined)
    
    inline def setSSEKMSKeyId(value: SSEKMSKeyId): Self = StObject.set(x, "SSEKMSKeyId", value.asInstanceOf[js.Any])
    
    inline def setSSEKMSKeyIdUndefined: Self = StObject.set(x, "SSEKMSKeyId", js.undefined)
    
    inline def setServerSideEncryption(value: ServerSideEncryption): Self = StObject.set(x, "ServerSideEncryption", value.asInstanceOf[js.Any])
    
    inline def setServerSideEncryptionUndefined: Self = StObject.set(x, "ServerSideEncryption", js.undefined)
    
    inline def setStatusCode(value: GetObjectResponseStatusCode): Self = StObject.set(x, "StatusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCodeUndefined: Self = StObject.set(x, "StatusCode", js.undefined)
    
    inline def setStorageClass(value: StorageClass): Self = StObject.set(x, "StorageClass", value.asInstanceOf[js.Any])
    
    inline def setStorageClassUndefined: Self = StObject.set(x, "StorageClass", js.undefined)
    
    inline def setTagCount(value: TagCount): Self = StObject.set(x, "TagCount", value.asInstanceOf[js.Any])
    
    inline def setTagCountUndefined: Self = StObject.set(x, "TagCount", js.undefined)
    
    inline def setVersionId(value: ObjectVersionId): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
    
    inline def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
  }
}
