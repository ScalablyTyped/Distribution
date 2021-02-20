package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import typings.std.Date
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetParametersForImportOutputMod {
  
  @js.native
  trait GetParametersForImportOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>The import token to send in a subsequent <a>ImportKeyMaterial</a> request.</p>
      */
    var ImportToken: js.UndefOr[Uint8Array] = js.native
    
    /**
      * <p>The identifier of the CMK to use in a subsequent <a>ImportKeyMaterial</a> request. This is the same CMK specified in the <code>GetParametersForImport</code> request.</p>
      */
    var KeyId: js.UndefOr[String] = js.native
    
    /**
      * <p>The time at which the import token and public key are no longer valid. After this time, you cannot use them to make an <a>ImportKeyMaterial</a> request and you must send another <code>GetParametersForImport</code> request to get new ones.</p>
      */
    var ParametersValidTo: js.UndefOr[Date] = js.native
    
    /**
      * <p>The public key to use to encrypt the key material before importing it with <a>ImportKeyMaterial</a>.</p>
      */
    var PublicKey: js.UndefOr[Uint8Array] = js.native
  }
  object GetParametersForImportOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): GetParametersForImportOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetParametersForImportOutput]
    }
    
    @scala.inline
    implicit class GetParametersForImportOutputMutableBuilder[Self <: GetParametersForImportOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImportToken(value: Uint8Array): Self = StObject.set(x, "ImportToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImportTokenUndefined: Self = StObject.set(x, "ImportToken", js.undefined)
      
      @scala.inline
      def setKeyId(value: String): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
      
      @scala.inline
      def setParametersValidTo(value: Date): Self = StObject.set(x, "ParametersValidTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParametersValidToUndefined: Self = StObject.set(x, "ParametersValidTo", js.undefined)
      
      @scala.inline
      def setPublicKey(value: Uint8Array): Self = StObject.set(x, "PublicKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicKeyUndefined: Self = StObject.set(x, "PublicKey", js.undefined)
    }
  }
}
