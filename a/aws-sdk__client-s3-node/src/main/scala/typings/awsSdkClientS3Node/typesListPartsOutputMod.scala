package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.ONEZONE_IA
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.REDUCED_REDUNDANCY
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.STANDARD
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.STANDARD_IA
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.requester_
import typings.awsSdkClientS3Node.typesInitiatorMod.UnmarshalledInitiator
import typings.awsSdkClientS3Node.typesOutputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Node.typesOwnerMod.UnmarshalledOwner
import typings.awsSdkClientS3Node.typesPartMod.UnmarshalledPart
import typings.awsSdkTypes.distTypesResponseMod.MetadataBearer
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListPartsOutputMod {
  
  trait ListPartsOutput
    extends StObject
       with MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * <p>Date when multipart upload will become eligible for abort operation by lifecycle.</p>
      */
    var AbortDate: js.UndefOr[js.Date] = js.undefined
    
    /**
      * <p>Id of the lifecycle rule that makes a multipart upload eligible for abort operation.</p>
      */
    var AbortRuleId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Name of the bucket to which the multipart upload was initiated.</p>
      */
    var Bucket: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Identifies who initiated the multipart upload.</p>
      */
    var Initiator: js.UndefOr[UnmarshalledInitiator] = js.undefined
    
    /**
      * <p>Indicates whether the returned list of parts is truncated.</p>
      */
    var IsTruncated: js.UndefOr[Boolean] = js.undefined
    
    /**
      * <p>Object key for which the multipart upload was initiated.</p>
      */
    var Key: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Maximum number of parts that were allowed in the response.</p>
      */
    var MaxParts: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>When a list is truncated, this element specifies the last part in the list, as well as the value to use for the part-number-marker request parameter in a subsequent request.</p>
      */
    var NextPartNumberMarker: js.UndefOr[Double] = js.undefined
    
    /**
      * _Owner shape
      */
    var Owner: js.UndefOr[UnmarshalledOwner] = js.undefined
    
    /**
      * <p>Part number after which listing begins.</p>
      */
    var PartNumberMarker: js.UndefOr[Double] = js.undefined
    
    /**
      * _Parts shape
      */
    var Parts: js.UndefOr[js.Array[UnmarshalledPart]] = js.undefined
    
    /**
      * <p>If present, indicates that the requester was successfully charged for the request.</p>
      */
    var RequestCharged: js.UndefOr[requester_ | String] = js.undefined
    
    /**
      * <p>The class of storage used to store the object.</p>
      */
    var StorageClass: js.UndefOr[STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | ONEZONE_IA | String] = js.undefined
    
    /**
      * <p>Upload ID identifying the multipart upload whose parts are being listed.</p>
      */
    var UploadId: js.UndefOr[String] = js.undefined
  }
  object ListPartsOutput {
    
    inline def apply($metadata: ResponseMetadata): ListPartsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListPartsOutput]
    }
    
    extension [Self <: ListPartsOutput](x: Self) {
      
      inline def setAbortDate(value: js.Date): Self = StObject.set(x, "AbortDate", value.asInstanceOf[js.Any])
      
      inline def setAbortDateUndefined: Self = StObject.set(x, "AbortDate", js.undefined)
      
      inline def setAbortRuleId(value: String): Self = StObject.set(x, "AbortRuleId", value.asInstanceOf[js.Any])
      
      inline def setAbortRuleIdUndefined: Self = StObject.set(x, "AbortRuleId", js.undefined)
      
      inline def setBucket(value: String): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
      
      inline def setBucketUndefined: Self = StObject.set(x, "Bucket", js.undefined)
      
      inline def setInitiator(value: UnmarshalledInitiator): Self = StObject.set(x, "Initiator", value.asInstanceOf[js.Any])
      
      inline def setInitiatorUndefined: Self = StObject.set(x, "Initiator", js.undefined)
      
      inline def setIsTruncated(value: Boolean): Self = StObject.set(x, "IsTruncated", value.asInstanceOf[js.Any])
      
      inline def setIsTruncatedUndefined: Self = StObject.set(x, "IsTruncated", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
      
      inline def setMaxParts(value: Double): Self = StObject.set(x, "MaxParts", value.asInstanceOf[js.Any])
      
      inline def setMaxPartsUndefined: Self = StObject.set(x, "MaxParts", js.undefined)
      
      inline def setNextPartNumberMarker(value: Double): Self = StObject.set(x, "NextPartNumberMarker", value.asInstanceOf[js.Any])
      
      inline def setNextPartNumberMarkerUndefined: Self = StObject.set(x, "NextPartNumberMarker", js.undefined)
      
      inline def setOwner(value: UnmarshalledOwner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
      
      inline def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
      
      inline def setPartNumberMarker(value: Double): Self = StObject.set(x, "PartNumberMarker", value.asInstanceOf[js.Any])
      
      inline def setPartNumberMarkerUndefined: Self = StObject.set(x, "PartNumberMarker", js.undefined)
      
      inline def setParts(value: js.Array[UnmarshalledPart]): Self = StObject.set(x, "Parts", value.asInstanceOf[js.Any])
      
      inline def setPartsUndefined: Self = StObject.set(x, "Parts", js.undefined)
      
      inline def setPartsVarargs(value: UnmarshalledPart*): Self = StObject.set(x, "Parts", js.Array(value*))
      
      inline def setRequestCharged(value: requester_ | String): Self = StObject.set(x, "RequestCharged", value.asInstanceOf[js.Any])
      
      inline def setRequestChargedUndefined: Self = StObject.set(x, "RequestCharged", js.undefined)
      
      inline def setStorageClass(value: STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | ONEZONE_IA | String): Self = StObject.set(x, "StorageClass", value.asInstanceOf[js.Any])
      
      inline def setStorageClassUndefined: Self = StObject.set(x, "StorageClass", js.undefined)
      
      inline def setUploadId(value: String): Self = StObject.set(x, "UploadId", value.asInstanceOf[js.Any])
      
      inline def setUploadIdUndefined: Self = StObject.set(x, "UploadId", js.undefined)
    }
  }
}
