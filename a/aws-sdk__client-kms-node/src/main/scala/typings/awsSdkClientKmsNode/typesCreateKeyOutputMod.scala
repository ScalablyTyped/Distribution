package typings.awsSdkClientKmsNode

import typings.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsNode.typesKeyMetadataMod.UnmarshalledKeyMetadata
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCreateKeyOutputMod {
  
  @js.native
  trait CreateKeyOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>Metadata associated with the CMK.</p>
      */
    var KeyMetadata: js.UndefOr[UnmarshalledKeyMetadata] = js.native
  }
  object CreateKeyOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): CreateKeyOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateKeyOutput]
    }
    
    @scala.inline
    implicit class CreateKeyOutputMutableBuilder[Self <: CreateKeyOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyMetadata(value: UnmarshalledKeyMetadata): Self = StObject.set(x, "KeyMetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyMetadataUndefined: Self = StObject.set(x, "KeyMetadata", js.undefined)
    }
  }
}
