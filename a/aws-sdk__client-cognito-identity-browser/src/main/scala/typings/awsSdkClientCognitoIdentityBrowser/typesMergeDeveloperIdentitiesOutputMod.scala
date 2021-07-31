package typings.awsSdkClientCognitoIdentityBrowser

import typings.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMergeDeveloperIdentitiesOutputMod {
  
  trait MergeDeveloperIdentitiesOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>A unique identifier in the format REGION:GUID.</p>
      */
    var IdentityId: js.UndefOr[String] = js.undefined
  }
  object MergeDeveloperIdentitiesOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): MergeDeveloperIdentitiesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[MergeDeveloperIdentitiesOutput]
    }
    
    @scala.inline
    implicit class MergeDeveloperIdentitiesOutputMutableBuilder[Self <: MergeDeveloperIdentitiesOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentityId(value: String): Self = StObject.set(x, "IdentityId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentityIdUndefined: Self = StObject.set(x, "IdentityId", js.undefined)
    }
  }
}
