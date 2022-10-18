package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetPolicyOutputMod {
  
  trait GetPolicyOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>The resource policy associated with the specified function. The response returns the same as a string using a backslash ("\") as an escape character in the JSON.</p>
      */
    var Policy: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Represents the latest updated revision of the function or alias.</p>
      */
    var RevisionId: js.UndefOr[String] = js.undefined
  }
  object GetPolicyOutput {
    
    inline def apply($metadata: ResponseMetadata): GetPolicyOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetPolicyOutput]
    }
    
    extension [Self <: GetPolicyOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setPolicy(value: String): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
      
      inline def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
      
      inline def setRevisionId(value: String): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
      
      inline def setRevisionIdUndefined: Self = StObject.set(x, "RevisionId", js.undefined)
    }
  }
}
