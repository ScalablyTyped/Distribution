package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEncryptOutputMod {
  
  trait EncryptOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>The encrypted plaintext. When you use the HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is not encoded.</p>
      */
    var CiphertextBlob: js.UndefOr[Uint8Array] = js.undefined
    
    /**
      * <p>The ID of the key used during encryption.</p>
      */
    var KeyId: js.UndefOr[String] = js.undefined
  }
  object EncryptOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): EncryptOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[EncryptOutput]
    }
    
    @scala.inline
    implicit class EncryptOutputMutableBuilder[Self <: EncryptOutput] (val x: Self) extends AnyVal {
      
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
    }
  }
}
