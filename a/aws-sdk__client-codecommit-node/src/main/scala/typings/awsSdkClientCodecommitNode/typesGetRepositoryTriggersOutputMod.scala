package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesRepositoryTriggerMod.UnmarshalledRepositoryTrigger
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetRepositoryTriggersOutputMod {
  
  trait GetRepositoryTriggersOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>The system-generated unique ID for the trigger.</p>
      */
    var configurationId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The JSON block of configuration information for each trigger.</p>
      */
    var triggers: js.UndefOr[js.Array[UnmarshalledRepositoryTrigger]] = js.undefined
  }
  object GetRepositoryTriggersOutput {
    
    inline def apply($metadata: ResponseMetadata): GetRepositoryTriggersOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetRepositoryTriggersOutput]
    }
    
    extension [Self <: GetRepositoryTriggersOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setConfigurationId(value: String): Self = StObject.set(x, "configurationId", value.asInstanceOf[js.Any])
      
      inline def setConfigurationIdUndefined: Self = StObject.set(x, "configurationId", js.undefined)
      
      inline def setTriggers(value: js.Array[UnmarshalledRepositoryTrigger]): Self = StObject.set(x, "triggers", value.asInstanceOf[js.Any])
      
      inline def setTriggersUndefined: Self = StObject.set(x, "triggers", js.undefined)
      
      inline def setTriggersVarargs(value: UnmarshalledRepositoryTrigger*): Self = StObject.set(x, "triggers", js.Array(value*))
    }
  }
}
