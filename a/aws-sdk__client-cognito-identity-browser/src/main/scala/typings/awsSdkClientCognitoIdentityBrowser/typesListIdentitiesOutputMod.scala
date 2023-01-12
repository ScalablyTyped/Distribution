package typings.awsSdkClientCognitoIdentityBrowser

import typings.awsSdkClientCognitoIdentityBrowser.typesIdentityDescriptionMod.UnmarshalledIdentityDescription
import typings.awsSdkClientCognitoIdentityBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListIdentitiesOutputMod {
  
  trait ListIdentitiesOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>An object containing a set of identities and associated mappings.</p>
      */
    var Identities: js.UndefOr[js.Array[UnmarshalledIdentityDescription]] = js.undefined
    
    /**
      * <p>An identity pool ID in the format REGION:GUID.</p>
      */
    var IdentityPoolId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>A pagination token.</p>
      */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  object ListIdentitiesOutput {
    
    inline def apply($metadata: ResponseMetadata): ListIdentitiesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListIdentitiesOutput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListIdentitiesOutput] (val x: Self) extends AnyVal {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setIdentities(value: js.Array[UnmarshalledIdentityDescription]): Self = StObject.set(x, "Identities", value.asInstanceOf[js.Any])
      
      inline def setIdentitiesUndefined: Self = StObject.set(x, "Identities", js.undefined)
      
      inline def setIdentitiesVarargs(value: UnmarshalledIdentityDescription*): Self = StObject.set(x, "Identities", js.Array(value*))
      
      inline def setIdentityPoolId(value: String): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
      
      inline def setIdentityPoolIdUndefined: Self = StObject.set(x, "IdentityPoolId", js.undefined)
      
      inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    }
  }
}
