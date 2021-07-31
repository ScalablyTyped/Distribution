package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesDataRetrievalPolicyMod.UnmarshalledDataRetrievalPolicy
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetDataRetrievalPolicyOutputMod {
  
  trait GetDataRetrievalPolicyOutput
    extends StObject
       with _OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>Contains the returned data retrieval policy in JSON format.</p>
      */
    var Policy: js.UndefOr[UnmarshalledDataRetrievalPolicy] = js.undefined
  }
  object GetDataRetrievalPolicyOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): GetDataRetrievalPolicyOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetDataRetrievalPolicyOutput]
    }
    
    @scala.inline
    implicit class GetDataRetrievalPolicyOutputMutableBuilder[Self <: GetDataRetrievalPolicyOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicy(value: UnmarshalledDataRetrievalPolicy): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
    }
  }
}
