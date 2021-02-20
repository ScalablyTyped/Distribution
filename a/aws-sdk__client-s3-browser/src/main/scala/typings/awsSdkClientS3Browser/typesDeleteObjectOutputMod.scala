package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.requester_
import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDeleteObjectOutputMod {
  
  @js.native
  trait DeleteObjectOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * <p>Specifies whether the versioned object that was permanently deleted was (true) or was not (false) a delete marker.</p>
      */
    var DeleteMarker: js.UndefOr[Boolean] = js.native
    
    /**
      * <p>If present, indicates that the requester was successfully charged for the request.</p>
      */
    var RequestCharged: js.UndefOr[requester_ | String] = js.native
    
    /**
      * <p>Returns the version ID of the delete marker created as a result of the DELETE operation.</p>
      */
    var VersionId: js.UndefOr[String] = js.native
  }
  object DeleteObjectOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): DeleteObjectOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteObjectOutput]
    }
    
    @scala.inline
    implicit class DeleteObjectOutputMutableBuilder[Self <: DeleteObjectOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeleteMarker(value: Boolean): Self = StObject.set(x, "DeleteMarker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeleteMarkerUndefined: Self = StObject.set(x, "DeleteMarker", js.undefined)
      
      @scala.inline
      def setRequestCharged(value: requester_ | String): Self = StObject.set(x, "RequestCharged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestChargedUndefined: Self = StObject.set(x, "RequestCharged", js.undefined)
      
      @scala.inline
      def setVersionId(value: String): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
    }
  }
}
