package typings.awsSdkClientCognitoIdentityBrowser

import typings.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetOpenIdTokenOutputMod {
  
  trait GetOpenIdTokenOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>A unique identifier in the format REGION:GUID. Note that the IdentityId returned may not match the one passed on input.</p>
      */
    var IdentityId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>An OpenID token, valid for 15 minutes.</p>
      */
    var Token: js.UndefOr[String] = js.undefined
  }
  object GetOpenIdTokenOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): GetOpenIdTokenOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetOpenIdTokenOutput]
    }
    
    @scala.inline
    implicit class GetOpenIdTokenOutputMutableBuilder[Self <: GetOpenIdTokenOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentityId(value: String): Self = StObject.set(x, "IdentityId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentityIdUndefined: Self = StObject.set(x, "IdentityId", js.undefined)
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "Token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenUndefined: Self = StObject.set(x, "Token", js.undefined)
    }
  }
}
