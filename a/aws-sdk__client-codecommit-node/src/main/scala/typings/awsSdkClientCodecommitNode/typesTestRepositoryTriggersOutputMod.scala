package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesRepositoryTriggerExecutionFailureMod.UnmarshalledRepositoryTriggerExecutionFailure
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTestRepositoryTriggersOutputMod {
  
  trait TestRepositoryTriggersOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>The list of triggers that were not able to be tested. This list provides the names of the triggers that could not be tested, separated by commas.</p>
      */
    var failedExecutions: js.UndefOr[js.Array[UnmarshalledRepositoryTriggerExecutionFailure]] = js.undefined
    
    /**
      * <p>The list of triggers that were successfully tested. This list provides the names of the triggers that were successfully tested, separated by commas.</p>
      */
    var successfulExecutions: js.UndefOr[js.Array[String]] = js.undefined
  }
  object TestRepositoryTriggersOutput {
    
    inline def apply($metadata: ResponseMetadata): TestRepositoryTriggersOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestRepositoryTriggersOutput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TestRepositoryTriggersOutput] (val x: Self) extends AnyVal {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setFailedExecutions(value: js.Array[UnmarshalledRepositoryTriggerExecutionFailure]): Self = StObject.set(x, "failedExecutions", value.asInstanceOf[js.Any])
      
      inline def setFailedExecutionsUndefined: Self = StObject.set(x, "failedExecutions", js.undefined)
      
      inline def setFailedExecutionsVarargs(value: UnmarshalledRepositoryTriggerExecutionFailure*): Self = StObject.set(x, "failedExecutions", js.Array(value*))
      
      inline def setSuccessfulExecutions(value: js.Array[String]): Self = StObject.set(x, "successfulExecutions", value.asInstanceOf[js.Any])
      
      inline def setSuccessfulExecutionsUndefined: Self = StObject.set(x, "successfulExecutions", js.undefined)
      
      inline def setSuccessfulExecutionsVarargs(value: String*): Self = StObject.set(x, "successfulExecutions", js.Array(value*))
    }
  }
}
