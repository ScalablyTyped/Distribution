package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPutRepositoryTriggersOutputMod {
  
  @js.native
  trait PutRepositoryTriggersOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>The system-generated unique ID for the create or update operation.</p>
      */
    var configurationId: js.UndefOr[String] = js.native
  }
  object PutRepositoryTriggersOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): PutRepositoryTriggersOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutRepositoryTriggersOutput]
    }
    
    @scala.inline
    implicit class PutRepositoryTriggersOutputMutableBuilder[Self <: PutRepositoryTriggersOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigurationId(value: String): Self = StObject.set(x, "configurationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigurationIdUndefined: Self = StObject.set(x, "configurationId", js.undefined)
    }
  }
}
