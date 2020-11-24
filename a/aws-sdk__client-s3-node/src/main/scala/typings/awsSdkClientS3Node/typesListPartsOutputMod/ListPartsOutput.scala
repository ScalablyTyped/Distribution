package typings.awsSdkClientS3Node.typesListPartsOutputMod

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.ONEZONE_IA
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.REDUCED_REDUNDANCY
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.STANDARD
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.STANDARD_IA
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.requester_
import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Node.typesInitiatorMod.UnmarshalledInitiator
import typings.awsSdkClientS3Node.typesOwnerMod.UnmarshalledOwner
import typings.awsSdkClientS3Node.typesPartMod.UnmarshalledPart
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPartsOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  
  /**
    * <p>Date when multipart upload will become eligible for abort operation by lifecycle.</p>
    */
  var AbortDate: js.UndefOr[Date] = js.native
  
  /**
    * <p>Id of the lifecycle rule that makes a multipart upload eligible for abort operation.</p>
    */
  var AbortRuleId: js.UndefOr[String] = js.native
  
  /**
    * <p>Name of the bucket to which the multipart upload was initiated.</p>
    */
  var Bucket: js.UndefOr[String] = js.native
  
  /**
    * <p>Identifies who initiated the multipart upload.</p>
    */
  var Initiator: js.UndefOr[UnmarshalledInitiator] = js.native
  
  /**
    * <p>Indicates whether the returned list of parts is truncated.</p>
    */
  var IsTruncated: js.UndefOr[Boolean] = js.native
  
  /**
    * <p>Object key for which the multipart upload was initiated.</p>
    */
  var Key: js.UndefOr[String] = js.native
  
  /**
    * <p>Maximum number of parts that were allowed in the response.</p>
    */
  var MaxParts: js.UndefOr[Double] = js.native
  
  /**
    * <p>When a list is truncated, this element specifies the last part in the list, as well as the value to use for the part-number-marker request parameter in a subsequent request.</p>
    */
  var NextPartNumberMarker: js.UndefOr[Double] = js.native
  
  /**
    * _Owner shape
    */
  var Owner: js.UndefOr[UnmarshalledOwner] = js.native
  
  /**
    * <p>Part number after which listing begins.</p>
    */
  var PartNumberMarker: js.UndefOr[Double] = js.native
  
  /**
    * _Parts shape
    */
  var Parts: js.UndefOr[js.Array[UnmarshalledPart]] = js.native
  
  /**
    * <p>If present, indicates that the requester was successfully charged for the request.</p>
    */
  var RequestCharged: js.UndefOr[requester_ | String] = js.native
  
  /**
    * <p>The class of storage used to store the object.</p>
    */
  var StorageClass: js.UndefOr[STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | ONEZONE_IA | String] = js.native
  
  /**
    * <p>Upload ID identifying the multipart upload whose parts are being listed.</p>
    */
  var UploadId: js.UndefOr[String] = js.native
}
object ListPartsOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata): ListPartsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPartsOutput]
  }
  
  @scala.inline
  implicit class ListPartsOutputOps[Self <: ListPartsOutput] (val x: Self) extends AnyVal {
    
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
    def setAbortDate(value: Date): Self = this.set("AbortDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbortDate: Self = this.set("AbortDate", js.undefined)
    
    @scala.inline
    def setAbortRuleId(value: String): Self = this.set("AbortRuleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbortRuleId: Self = this.set("AbortRuleId", js.undefined)
    
    @scala.inline
    def setBucket(value: String): Self = this.set("Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucket: Self = this.set("Bucket", js.undefined)
    
    @scala.inline
    def setInitiator(value: UnmarshalledInitiator): Self = this.set("Initiator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitiator: Self = this.set("Initiator", js.undefined)
    
    @scala.inline
    def setIsTruncated(value: Boolean): Self = this.set("IsTruncated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsTruncated: Self = this.set("IsTruncated", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("Key", js.undefined)
    
    @scala.inline
    def setMaxParts(value: Double): Self = this.set("MaxParts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxParts: Self = this.set("MaxParts", js.undefined)
    
    @scala.inline
    def setNextPartNumberMarker(value: Double): Self = this.set("NextPartNumberMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPartNumberMarker: Self = this.set("NextPartNumberMarker", js.undefined)
    
    @scala.inline
    def setOwner(value: UnmarshalledOwner): Self = this.set("Owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("Owner", js.undefined)
    
    @scala.inline
    def setPartNumberMarker(value: Double): Self = this.set("PartNumberMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartNumberMarker: Self = this.set("PartNumberMarker", js.undefined)
    
    @scala.inline
    def setPartsVarargs(value: UnmarshalledPart*): Self = this.set("Parts", js.Array(value :_*))
    
    @scala.inline
    def setParts(value: js.Array[UnmarshalledPart]): Self = this.set("Parts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParts: Self = this.set("Parts", js.undefined)
    
    @scala.inline
    def setRequestCharged(value: requester_ | String): Self = this.set("RequestCharged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestCharged: Self = this.set("RequestCharged", js.undefined)
    
    @scala.inline
    def setStorageClass(value: STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | ONEZONE_IA | String): Self = this.set("StorageClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageClass: Self = this.set("StorageClass", js.undefined)
    
    @scala.inline
    def setUploadId(value: String): Self = this.set("UploadId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadId: Self = this.set("UploadId", js.undefined)
  }
}
