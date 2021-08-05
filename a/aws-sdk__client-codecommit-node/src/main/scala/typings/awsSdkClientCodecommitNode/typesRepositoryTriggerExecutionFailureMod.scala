package typings.awsSdkClientCodecommitNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRepositoryTriggerExecutionFailureMod {
  
  trait RepositoryTriggerExecutionFailure extends StObject {
    
    /**
      * <p>Additional message information about the trigger that did not run.</p>
      */
    var failureMessage: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The name of the trigger that did not run.</p>
      */
    var trigger: js.UndefOr[String] = js.undefined
  }
  object RepositoryTriggerExecutionFailure {
    
    inline def apply(): RepositoryTriggerExecutionFailure = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RepositoryTriggerExecutionFailure]
    }
    
    extension [Self <: RepositoryTriggerExecutionFailure](x: Self) {
      
      inline def setFailureMessage(value: String): Self = StObject.set(x, "failureMessage", value.asInstanceOf[js.Any])
      
      inline def setFailureMessageUndefined: Self = StObject.set(x, "failureMessage", js.undefined)
      
      inline def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
    }
  }
  
  type UnmarshalledRepositoryTriggerExecutionFailure = RepositoryTriggerExecutionFailure
}
