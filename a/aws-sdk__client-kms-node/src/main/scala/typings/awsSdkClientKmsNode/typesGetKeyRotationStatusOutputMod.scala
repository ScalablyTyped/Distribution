package typings.awsSdkClientKmsNode

import typings.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetKeyRotationStatusOutputMod {
  
  trait GetKeyRotationStatusOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>A Boolean value that specifies whether key rotation is enabled.</p>
      */
    var KeyRotationEnabled: js.UndefOr[Boolean] = js.undefined
  }
  object GetKeyRotationStatusOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): GetKeyRotationStatusOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetKeyRotationStatusOutput]
    }
    
    @scala.inline
    implicit class GetKeyRotationStatusOutputMutableBuilder[Self <: GetKeyRotationStatusOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyRotationEnabled(value: Boolean): Self = StObject.set(x, "KeyRotationEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyRotationEnabledUndefined: Self = StObject.set(x, "KeyRotationEnabled", js.undefined)
    }
  }
}
