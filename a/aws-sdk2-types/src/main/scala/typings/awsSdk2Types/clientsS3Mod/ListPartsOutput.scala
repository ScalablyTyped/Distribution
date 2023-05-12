package typings.awsSdk2Types.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPartsOutput extends StObject {
  
  /**
    * If the bucket has a lifecycle rule configured with an action to abort incomplete multipart uploads and the prefix in the lifecycle rule matches the object name in the request, then the response includes this header indicating when the initiated multipart upload will become eligible for abort operation. For more information, see Aborting Incomplete Multipart Uploads Using a Bucket Lifecycle Policy. The response will also include the x-amz-abort-rule-id header that will provide the ID of the lifecycle configuration rule that defines this action.
    */
  var AbortDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * This header is returned along with the x-amz-abort-date header. It identifies applicable lifecycle configuration rule that defines the action to abort incomplete multipart uploads.
    */
  var AbortRuleId: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.AbortRuleId] = js.undefined
  
  /**
    * The name of the bucket to which the multipart upload was initiated. Does not return the access point ARN or access point alias if used.
    */
  var Bucket: js.UndefOr[BucketName] = js.undefined
  
  /**
    * The algorithm that was used to create a checksum of the object.
    */
  var ChecksumAlgorithm: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.ChecksumAlgorithm] = js.undefined
  
  /**
    * Container element that identifies who initiated the multipart upload. If the initiator is an Amazon Web Services account, this element provides the same information as the Owner element. If the initiator is an IAM User, this element provides the user ARN and display name.
    */
  var Initiator: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.Initiator] = js.undefined
  
  /**
    *  Indicates whether the returned list of parts is truncated. A true value indicates that the list was truncated. A list can be truncated if the number of parts exceeds the limit returned in the MaxParts element.
    */
  var IsTruncated: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.IsTruncated] = js.undefined
  
  /**
    * Object key for which the multipart upload was initiated.
    */
  var Key: js.UndefOr[ObjectKey] = js.undefined
  
  /**
    * Maximum number of parts that were allowed in the response.
    */
  var MaxParts: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.MaxParts] = js.undefined
  
  /**
    * When a list is truncated, this element specifies the last part in the list, as well as the value to use for the part-number-marker request parameter in a subsequent request.
    */
  var NextPartNumberMarker: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.NextPartNumberMarker] = js.undefined
  
  /**
    *  Container element that identifies the object owner, after the object is created. If multipart upload is initiated by an IAM user, this element provides the parent account ID and display name.
    */
  var Owner: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.Owner] = js.undefined
  
  /**
    * When a list is truncated, this element specifies the last part in the list, as well as the value to use for the part-number-marker request parameter in a subsequent request.
    */
  var PartNumberMarker: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.PartNumberMarker] = js.undefined
  
  /**
    *  Container for elements related to a particular part. A response can contain zero or more Part elements.
    */
  var Parts: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.Parts] = js.undefined
  
  var RequestCharged: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.RequestCharged] = js.undefined
  
  /**
    * Class of storage (STANDARD or REDUCED_REDUNDANCY) used to store the uploaded object.
    */
  var StorageClass: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.StorageClass] = js.undefined
  
  /**
    * Upload ID identifying the multipart upload whose parts are being listed.
    */
  var UploadId: js.UndefOr[MultipartUploadId] = js.undefined
}
object ListPartsOutput {
  
  inline def apply(): ListPartsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPartsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListPartsOutput] (val x: Self) extends AnyVal {
    
    inline def setAbortDate(value: js.Date): Self = StObject.set(x, "AbortDate", value.asInstanceOf[js.Any])
    
    inline def setAbortDateUndefined: Self = StObject.set(x, "AbortDate", js.undefined)
    
    inline def setAbortRuleId(value: AbortRuleId): Self = StObject.set(x, "AbortRuleId", value.asInstanceOf[js.Any])
    
    inline def setAbortRuleIdUndefined: Self = StObject.set(x, "AbortRuleId", js.undefined)
    
    inline def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setBucketUndefined: Self = StObject.set(x, "Bucket", js.undefined)
    
    inline def setChecksumAlgorithm(value: ChecksumAlgorithm): Self = StObject.set(x, "ChecksumAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setChecksumAlgorithmUndefined: Self = StObject.set(x, "ChecksumAlgorithm", js.undefined)
    
    inline def setInitiator(value: Initiator): Self = StObject.set(x, "Initiator", value.asInstanceOf[js.Any])
    
    inline def setInitiatorUndefined: Self = StObject.set(x, "Initiator", js.undefined)
    
    inline def setIsTruncated(value: IsTruncated): Self = StObject.set(x, "IsTruncated", value.asInstanceOf[js.Any])
    
    inline def setIsTruncatedUndefined: Self = StObject.set(x, "IsTruncated", js.undefined)
    
    inline def setKey(value: ObjectKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    inline def setMaxParts(value: MaxParts): Self = StObject.set(x, "MaxParts", value.asInstanceOf[js.Any])
    
    inline def setMaxPartsUndefined: Self = StObject.set(x, "MaxParts", js.undefined)
    
    inline def setNextPartNumberMarker(value: NextPartNumberMarker): Self = StObject.set(x, "NextPartNumberMarker", value.asInstanceOf[js.Any])
    
    inline def setNextPartNumberMarkerUndefined: Self = StObject.set(x, "NextPartNumberMarker", js.undefined)
    
    inline def setOwner(value: Owner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
    
    inline def setPartNumberMarker(value: PartNumberMarker): Self = StObject.set(x, "PartNumberMarker", value.asInstanceOf[js.Any])
    
    inline def setPartNumberMarkerUndefined: Self = StObject.set(x, "PartNumberMarker", js.undefined)
    
    inline def setParts(value: Parts): Self = StObject.set(x, "Parts", value.asInstanceOf[js.Any])
    
    inline def setPartsUndefined: Self = StObject.set(x, "Parts", js.undefined)
    
    inline def setPartsVarargs(value: Part*): Self = StObject.set(x, "Parts", js.Array(value*))
    
    inline def setRequestCharged(value: RequestCharged): Self = StObject.set(x, "RequestCharged", value.asInstanceOf[js.Any])
    
    inline def setRequestChargedUndefined: Self = StObject.set(x, "RequestCharged", js.undefined)
    
    inline def setStorageClass(value: StorageClass): Self = StObject.set(x, "StorageClass", value.asInstanceOf[js.Any])
    
    inline def setStorageClassUndefined: Self = StObject.set(x, "StorageClass", js.undefined)
    
    inline def setUploadId(value: MultipartUploadId): Self = StObject.set(x, "UploadId", value.asInstanceOf[js.Any])
    
    inline def setUploadIdUndefined: Self = StObject.set(x, "UploadId", js.undefined)
  }
}
