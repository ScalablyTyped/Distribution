package typings.awsSdkClientKmsNode

import typings.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGenerateDataKeyOutputMod {
  
  trait GenerateDataKeyOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>The encrypted data encryption key. When you use the HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is not encoded.</p>
      */
    var CiphertextBlob: js.UndefOr[Uint8Array] = js.undefined
    
    /**
      * <p>The identifier of the CMK under which the data encryption key was generated and encrypted.</p>
      */
    var KeyId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The data encryption key. When you use the HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is not encoded. Use this data key for local encryption and decryption, then remove it from memory as soon as possible.</p>
      */
    var Plaintext: js.UndefOr[Uint8Array] = js.undefined
  }
  object GenerateDataKeyOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): GenerateDataKeyOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenerateDataKeyOutput]
    }
    
    @scala.inline
    implicit class GenerateDataKeyOutputMutableBuilder[Self <: GenerateDataKeyOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCiphertextBlob(value: Uint8Array): Self = StObject.set(x, "CiphertextBlob", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCiphertextBlobUndefined: Self = StObject.set(x, "CiphertextBlob", js.undefined)
      
      @scala.inline
      def setKeyId(value: String): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
      
      @scala.inline
      def setPlaintext(value: Uint8Array): Self = StObject.set(x, "Plaintext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaintextUndefined: Self = StObject.set(x, "Plaintext", js.undefined)
    }
  }
}
