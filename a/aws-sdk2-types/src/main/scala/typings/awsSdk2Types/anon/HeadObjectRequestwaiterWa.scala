package typings.awsSdk2Types.anon

import typings.awsSdk2Types.clientsS3Mod.AccountId
import typings.awsSdk2Types.clientsS3Mod.BucketName
import typings.awsSdk2Types.clientsS3Mod.ChecksumMode
import typings.awsSdk2Types.clientsS3Mod.IfMatch
import typings.awsSdk2Types.clientsS3Mod.IfNoneMatch
import typings.awsSdk2Types.clientsS3Mod.ObjectKey
import typings.awsSdk2Types.clientsS3Mod.ObjectVersionId
import typings.awsSdk2Types.clientsS3Mod.PartNumber
import typings.awsSdk2Types.clientsS3Mod.Range
import typings.awsSdk2Types.clientsS3Mod.RequestPayer
import typings.awsSdk2Types.clientsS3Mod.SSECustomerAlgorithm
import typings.awsSdk2Types.clientsS3Mod.SSECustomerKey
import typings.awsSdk2Types.clientsS3Mod.SSECustomerKeyMD5
import typings.awsSdk2Types.libServiceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk2-types.aws-sdk2-types/clients/s3.HeadObjectRequest & {  $waiter :aws-sdk2-types.aws-sdk2-types/lib/service.WaiterConfiguration | undefined} */
trait HeadObjectRequestwaiterWa extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * The name of the bucket containing the object. When using this action with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this action with an access point through the Amazon Web Services SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see Using access points in the Amazon S3 User Guide. When using this action with Amazon S3 on Outposts, you must direct requests to the S3 on Outposts hostname. The S3 on Outposts hostname takes the form  AccessPointName-AccountId.outpostID.s3-outposts.Region.amazonaws.com. When using this action with S3 on Outposts through the Amazon Web Services SDKs, you provide the Outposts bucket ARN in place of the bucket name. For more information about S3 on Outposts ARNs, see Using Amazon S3 on Outposts in the Amazon S3 User Guide.
    */
  var Bucket: BucketName
  
  /**
    * To retrieve the checksum, this parameter must be enabled. In addition, if you enable ChecksumMode and the object is encrypted with Amazon Web Services Key Management Service (Amazon Web Services KMS), you must have permission to use the kms:Decrypt action for the request to succeed.
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
    * The object key.
    */
  var Key: ObjectKey
  
  /**
    * Part number of the object being read. This is a positive integer between 1 and 10,000. Effectively performs a 'ranged' HEAD request for the part specified. Useful querying about the size of the part and the number of parts in this object.
    */
  var PartNumber: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.PartNumber] = js.undefined
  
  /**
    * Because HeadObject returns only the metadata for an object, this parameter has no effect.
    */
  var Range: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.Range] = js.undefined
  
  var RequestPayer: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.RequestPayer] = js.undefined
  
  /**
    * Specifies the algorithm to use to when encrypting the object (for example, AES256).
    */
  var SSECustomerAlgorithm: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.SSECustomerAlgorithm] = js.undefined
  
  /**
    * Specifies the customer-provided encryption key for Amazon S3 to use in encrypting data. This value is used to store the object and then it is discarded; Amazon S3 does not store the encryption key. The key must be appropriate for use with the algorithm specified in the x-amz-server-side-encryption-customer-algorithm header.
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
object HeadObjectRequestwaiterWa {
  
  inline def apply(Bucket: BucketName, Key: ObjectKey): HeadObjectRequestwaiterWa = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadObjectRequestwaiterWa]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HeadObjectRequestwaiterWa] (val x: Self) extends AnyVal {
    
    inline def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    inline def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
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
