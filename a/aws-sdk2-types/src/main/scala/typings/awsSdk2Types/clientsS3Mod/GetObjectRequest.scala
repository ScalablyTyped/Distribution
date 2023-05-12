package typings.awsSdk2Types.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetObjectRequest extends StObject {
  
  /**
    * The bucket name containing the object.  When using this action with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this action with an access point through the Amazon Web Services SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see Using access points in the Amazon S3 User Guide. When using an Object Lambda access point the hostname takes the form AccessPointName-AccountId.s3-object-lambda.Region.amazonaws.com. When using this action with Amazon S3 on Outposts, you must direct requests to the S3 on Outposts hostname. The S3 on Outposts hostname takes the form  AccessPointName-AccountId.outpostID.s3-outposts.Region.amazonaws.com. When using this action with S3 on Outposts through the Amazon Web Services SDKs, you provide the Outposts bucket ARN in place of the bucket name. For more information about S3 on Outposts ARNs, see Using Amazon S3 on Outposts in the Amazon S3 User Guide.
    */
  var Bucket: BucketName
  
  /**
    * To retrieve the checksum, this mode must be enabled.
    */
  var ChecksumMode: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.ChecksumMode] = js.undefined
  
  /**
    * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request fails with the HTTP status code 403 Forbidden (access denied).
    */
  var ExpectedBucketOwner: js.UndefOr[AccountId] = js.undefined
  
  /**
    * Return the object only if its entity tag (ETag) is the same as the one specified; otherwise, return a 412 (precondition failed) error.
    */
  var IfMatch: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.IfMatch] = js.undefined
  
  /**
    * Return the object only if it has been modified since the specified time; otherwise, return a 304 (not modified) error.
    */
  var IfModifiedSince: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Return the object only if its entity tag (ETag) is different from the one specified; otherwise, return a 304 (not modified) error.
    */
  var IfNoneMatch: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.IfNoneMatch] = js.undefined
  
  /**
    * Return the object only if it has not been modified since the specified time; otherwise, return a 412 (precondition failed) error.
    */
  var IfUnmodifiedSince: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Key of the object to get.
    */
  var Key: ObjectKey
  
  /**
    * Part number of the object being read. This is a positive integer between 1 and 10,000. Effectively performs a 'ranged' GET request for the part specified. Useful for downloading just a part of an object.
    */
  var PartNumber: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.PartNumber] = js.undefined
  
  /**
    * Downloads the specified range bytes of an object. For more information about the HTTP Range header, see https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.35.  Amazon S3 doesn't support retrieving multiple ranges of data per GET request. 
    */
  var Range: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.Range] = js.undefined
  
  var RequestPayer: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.RequestPayer] = js.undefined
  
  /**
    * Sets the Cache-Control header of the response.
    */
  var ResponseCacheControl: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.ResponseCacheControl] = js.undefined
  
  /**
    * Sets the Content-Disposition header of the response
    */
  var ResponseContentDisposition: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.ResponseContentDisposition] = js.undefined
  
  /**
    * Sets the Content-Encoding header of the response.
    */
  var ResponseContentEncoding: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.ResponseContentEncoding] = js.undefined
  
  /**
    * Sets the Content-Language header of the response.
    */
  var ResponseContentLanguage: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.ResponseContentLanguage] = js.undefined
  
  /**
    * Sets the Content-Type header of the response.
    */
  var ResponseContentType: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.ResponseContentType] = js.undefined
  
  /**
    * Sets the Expires header of the response.
    */
  var ResponseExpires: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Specifies the algorithm to use to when decrypting the object (for example, AES256).
    */
  var SSECustomerAlgorithm: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.SSECustomerAlgorithm] = js.undefined
  
  /**
    * Specifies the customer-provided encryption key for Amazon S3 used to encrypt the data. This value is used to decrypt the object when recovering it and must match the one used when storing the data. The key must be appropriate for use with the algorithm specified in the x-amz-server-side-encryption-customer-algorithm header.
    */
  var SSECustomerKey: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.SSECustomerKey] = js.undefined
  
  /**
    * Specifies the 128-bit MD5 digest of the encryption key according to RFC 1321. Amazon S3 uses this header for a message integrity check to ensure that the encryption key was transmitted without error.
    */
  var SSECustomerKeyMD5: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.SSECustomerKeyMD5] = js.undefined
  
  /**
    * VersionId used to reference a specific version of the object.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
}
object GetObjectRequest {
  
  inline def apply(Bucket: BucketName, Key: ObjectKey): GetObjectRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetObjectRequest] (val x: Self) extends AnyVal {
    
    inline def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setChecksumMode(value: ChecksumMode): Self = StObject.set(x, "ChecksumMode", value.asInstanceOf[js.Any])
    
    inline def setChecksumModeUndefined: Self = StObject.set(x, "ChecksumMode", js.undefined)
    
    inline def setExpectedBucketOwner(value: AccountId): Self = StObject.set(x, "ExpectedBucketOwner", value.asInstanceOf[js.Any])
    
    inline def setExpectedBucketOwnerUndefined: Self = StObject.set(x, "ExpectedBucketOwner", js.undefined)
    
    inline def setIfMatch(value: IfMatch): Self = StObject.set(x, "IfMatch", value.asInstanceOf[js.Any])
    
    inline def setIfMatchUndefined: Self = StObject.set(x, "IfMatch", js.undefined)
    
    inline def setIfModifiedSince(value: js.Date): Self = StObject.set(x, "IfModifiedSince", value.asInstanceOf[js.Any])
    
    inline def setIfModifiedSinceUndefined: Self = StObject.set(x, "IfModifiedSince", js.undefined)
    
    inline def setIfNoneMatch(value: IfNoneMatch): Self = StObject.set(x, "IfNoneMatch", value.asInstanceOf[js.Any])
    
    inline def setIfNoneMatchUndefined: Self = StObject.set(x, "IfNoneMatch", js.undefined)
    
    inline def setIfUnmodifiedSince(value: js.Date): Self = StObject.set(x, "IfUnmodifiedSince", value.asInstanceOf[js.Any])
    
    inline def setIfUnmodifiedSinceUndefined: Self = StObject.set(x, "IfUnmodifiedSince", js.undefined)
    
    inline def setKey(value: ObjectKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setPartNumber(value: PartNumber): Self = StObject.set(x, "PartNumber", value.asInstanceOf[js.Any])
    
    inline def setPartNumberUndefined: Self = StObject.set(x, "PartNumber", js.undefined)
    
    inline def setRange(value: Range): Self = StObject.set(x, "Range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "Range", js.undefined)
    
    inline def setRequestPayer(value: RequestPayer): Self = StObject.set(x, "RequestPayer", value.asInstanceOf[js.Any])
    
    inline def setRequestPayerUndefined: Self = StObject.set(x, "RequestPayer", js.undefined)
    
    inline def setResponseCacheControl(value: ResponseCacheControl): Self = StObject.set(x, "ResponseCacheControl", value.asInstanceOf[js.Any])
    
    inline def setResponseCacheControlUndefined: Self = StObject.set(x, "ResponseCacheControl", js.undefined)
    
    inline def setResponseContentDisposition(value: ResponseContentDisposition): Self = StObject.set(x, "ResponseContentDisposition", value.asInstanceOf[js.Any])
    
    inline def setResponseContentDispositionUndefined: Self = StObject.set(x, "ResponseContentDisposition", js.undefined)
    
    inline def setResponseContentEncoding(value: ResponseContentEncoding): Self = StObject.set(x, "ResponseContentEncoding", value.asInstanceOf[js.Any])
    
    inline def setResponseContentEncodingUndefined: Self = StObject.set(x, "ResponseContentEncoding", js.undefined)
    
    inline def setResponseContentLanguage(value: ResponseContentLanguage): Self = StObject.set(x, "ResponseContentLanguage", value.asInstanceOf[js.Any])
    
    inline def setResponseContentLanguageUndefined: Self = StObject.set(x, "ResponseContentLanguage", js.undefined)
    
    inline def setResponseContentType(value: ResponseContentType): Self = StObject.set(x, "ResponseContentType", value.asInstanceOf[js.Any])
    
    inline def setResponseContentTypeUndefined: Self = StObject.set(x, "ResponseContentType", js.undefined)
    
    inline def setResponseExpires(value: js.Date): Self = StObject.set(x, "ResponseExpires", value.asInstanceOf[js.Any])
    
    inline def setResponseExpiresUndefined: Self = StObject.set(x, "ResponseExpires", js.undefined)
    
    inline def setSSECustomerAlgorithm(value: SSECustomerAlgorithm): Self = StObject.set(x, "SSECustomerAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSSECustomerAlgorithmUndefined: Self = StObject.set(x, "SSECustomerAlgorithm", js.undefined)
    
    inline def setSSECustomerKey(value: SSECustomerKey): Self = StObject.set(x, "SSECustomerKey", value.asInstanceOf[js.Any])
    
    inline def setSSECustomerKeyMD5(value: SSECustomerKeyMD5): Self = StObject.set(x, "SSECustomerKeyMD5", value.asInstanceOf[js.Any])
    
    inline def setSSECustomerKeyMD5Undefined: Self = StObject.set(x, "SSECustomerKeyMD5", js.undefined)
    
    inline def setSSECustomerKeyUndefined: Self = StObject.set(x, "SSECustomerKey", js.undefined)
    
    inline def setVersionId(value: ObjectVersionId): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
    
    inline def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
  }
}
