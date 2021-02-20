package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesRepositoryTriggerMod.UnmarshalledRepositoryTrigger
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetRepositoryTriggersOutputMod {
  
  @js.native
  trait GetRepositoryTriggersOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>The system-generated unique ID for the trigger.</p>
      */
    var configurationId: js.UndefOr[String] = js.native
    
    /**
      * <p>The JSON block of configuration information for each trigger.</p>
      */
    var triggers: js.UndefOr[js.Array[UnmarshalledRepositoryTrigger]] = js.native
  }
  object GetRepositoryTriggersOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): GetRepositoryTriggersOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetRepositoryTriggersOutput]
    }
    
    @scala.inline
    implicit class GetRepositoryTriggersOutputMutableBuilder[Self <: GetRepositoryTriggersOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigurationId(value: String): Self = StObject.set(x, "configurationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigurationIdUndefined: Self = StObject.set(x, "configurationId", js.undefined)
      
      @scala.inline
      def setTriggers(value: js.Array[UnmarshalledRepositoryTrigger]): Self = StObject.set(x, "triggers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggersUndefined: Self = StObject.set(x, "triggers", js.undefined)
      
      @scala.inline
      def setTriggersVarargs(value: UnmarshalledRepositoryTrigger*): Self = StObject.set(x, "triggers", js.Array(value :_*))
    }
  }
}
