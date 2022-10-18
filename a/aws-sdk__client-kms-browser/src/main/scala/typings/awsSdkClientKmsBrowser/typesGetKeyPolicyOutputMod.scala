package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetKeyPolicyOutputMod {
  
  trait GetKeyPolicyOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>A key policy document in JSON format.</p>
      */
    var Policy: js.UndefOr[String] = js.undefined
  }
  object GetKeyPolicyOutput {
    
    inline def apply($metadata: ResponseMetadata): GetKeyPolicyOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetKeyPolicyOutput]
    }
    
    extension [Self <: GetKeyPolicyOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setPolicy(value: String): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
      
      inline def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
    }
  }
}
