package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.ONEZONE_IA
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.REDUCED_REDUNDANCY
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.STANDARD
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.STANDARD_IA
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.requester_
import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Browser.typesInitiatorMod.UnmarshalledInitiator
import typings.awsSdkClientS3Browser.typesOwnerMod.UnmarshalledOwner
import typings.awsSdkClientS3Browser.typesPartMod.UnmarshalledPart
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListPartsOutputMod {
  
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
    implicit class ListPartsOutputMutableBuilder[Self <: ListPartsOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbortDate(value: Date): Self = StObject.set(x, "AbortDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbortDateUndefined: Self = StObject.set(x, "AbortDate", js.undefined)
      
      @scala.inline
      def setAbortRuleId(value: String): Self = StObject.set(x, "AbortRuleId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbortRuleIdUndefined: Self = StObject.set(x, "AbortRuleId", js.undefined)
      
      @scala.inline
      def setBucket(value: String): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBucketUndefined: Self = StObject.set(x, "Bucket", js.undefined)
      
      @scala.inline
      def setInitiator(value: UnmarshalledInitiator): Self = StObject.set(x, "Initiator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitiatorUndefined: Self = StObject.set(x, "Initiator", js.undefined)
      
      @scala.inline
      def setIsTruncated(value: Boolean): Self = StObject.set(x, "IsTruncated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsTruncatedUndefined: Self = StObject.set(x, "IsTruncated", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
      
      @scala.inline
      def setMaxParts(value: Double): Self = StObject.set(x, "MaxParts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxPartsUndefined: Self = StObject.set(x, "MaxParts", js.undefined)
      
      @scala.inline
      def setNextPartNumberMarker(value: Double): Self = StObject.set(x, "NextPartNumberMarker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextPartNumberMarkerUndefined: Self = StObject.set(x, "NextPartNumberMarker", js.undefined)
      
      @scala.inline
      def setOwner(value: UnmarshalledOwner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
      
      @scala.inline
      def setPartNumberMarker(value: Double): Self = StObject.set(x, "PartNumberMarker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartNumberMarkerUndefined: Self = StObject.set(x, "PartNumberMarker", js.undefined)
      
      @scala.inline
      def setParts(value: js.Array[UnmarshalledPart]): Self = StObject.set(x, "Parts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartsUndefined: Self = StObject.set(x, "Parts", js.undefined)
      
      @scala.inline
      def setPartsVarargs(value: UnmarshalledPart*): Self = StObject.set(x, "Parts", js.Array(value :_*))
      
      @scala.inline
      def setRequestCharged(value: requester_ | String): Self = StObject.set(x, "RequestCharged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestChargedUndefined: Self = StObject.set(x, "RequestCharged", js.undefined)
      
      @scala.inline
      def setStorageClass(value: STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | ONEZONE_IA | String): Self = StObject.set(x, "StorageClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageClassUndefined: Self = StObject.set(x, "StorageClass", js.undefined)
      
      @scala.inline
      def setUploadId(value: String): Self = StObject.set(x, "UploadId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadIdUndefined: Self = StObject.set(x, "UploadId", js.undefined)
    }
  }
}
