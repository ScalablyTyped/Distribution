package typings.awsSdkClientCognitoIdentityBrowser

import typings.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesIdentityPoolShortDescriptionMod.UnmarshalledIdentityPoolShortDescription
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListIdentityPoolsOutputMod {
  
  @js.native
  trait ListIdentityPoolsOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>The identity pools returned by the ListIdentityPools action.</p>
      */
    var IdentityPools: js.UndefOr[js.Array[UnmarshalledIdentityPoolShortDescription]] = js.native
    
    /**
      * <p>A pagination token.</p>
      */
    var NextToken: js.UndefOr[String] = js.native
  }
  object ListIdentityPoolsOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): ListIdentityPoolsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListIdentityPoolsOutput]
    }
    
    @scala.inline
    implicit class ListIdentityPoolsOutputMutableBuilder[Self <: ListIdentityPoolsOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentityPools(value: js.Array[UnmarshalledIdentityPoolShortDescription]): Self = StObject.set(x, "IdentityPools", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentityPoolsUndefined: Self = StObject.set(x, "IdentityPools", js.undefined)
      
      @scala.inline
      def setIdentityPoolsVarargs(value: UnmarshalledIdentityPoolShortDescription*): Self = StObject.set(x, "IdentityPools", js.Array(value :_*))
      
      @scala.inline
      def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    }
  }
}
