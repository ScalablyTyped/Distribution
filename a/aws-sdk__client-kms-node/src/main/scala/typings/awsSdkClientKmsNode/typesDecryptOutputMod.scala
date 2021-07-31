package typings.awsSdkClientKmsNode

import typings.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecryptOutputMod {
  
  trait DecryptOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>ARN of the key used to perform the decryption. This value is returned if no errors are encountered during the operation.</p>
      */
    var KeyId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Decrypted plaintext data. When you use the HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is not encoded.</p>
      */
    var Plaintext: js.UndefOr[Uint8Array] = js.undefined
  }
  object DecryptOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): DecryptOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecryptOutput]
    }
    
    @scala.inline
    implicit class DecryptOutputMutableBuilder[Self <: DecryptOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
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
