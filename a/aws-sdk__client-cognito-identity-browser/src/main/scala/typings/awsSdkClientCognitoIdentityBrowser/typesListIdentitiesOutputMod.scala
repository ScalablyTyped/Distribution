package typings.awsSdkClientCognitoIdentityBrowser

import typings.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesIdentityDescriptionMod.UnmarshalledIdentityDescription
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListIdentitiesOutputMod {
  
  @js.native
  trait ListIdentitiesOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>An object containing a set of identities and associated mappings.</p>
      */
    var Identities: js.UndefOr[js.Array[UnmarshalledIdentityDescription]] = js.native
    
    /**
      * <p>An identity pool ID in the format REGION:GUID.</p>
      */
    var IdentityPoolId: js.UndefOr[String] = js.native
    
    /**
      * <p>A pagination token.</p>
      */
    var NextToken: js.UndefOr[String] = js.native
  }
  object ListIdentitiesOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): ListIdentitiesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListIdentitiesOutput]
    }
    
    @scala.inline
    implicit class ListIdentitiesOutputMutableBuilder[Self <: ListIdentitiesOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentities(value: js.Array[UnmarshalledIdentityDescription]): Self = StObject.set(x, "Identities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentitiesUndefined: Self = StObject.set(x, "Identities", js.undefined)
      
      @scala.inline
      def setIdentitiesVarargs(value: UnmarshalledIdentityDescription*): Self = StObject.set(x, "Identities", js.Array(value :_*))
      
      @scala.inline
      def setIdentityPoolId(value: String): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentityPoolIdUndefined: Self = StObject.set(x, "IdentityPoolId", js.undefined)
      
      @scala.inline
      def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    }
  }
}
