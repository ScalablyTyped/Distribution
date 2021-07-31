package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepositoryTriggerExecutionFailure extends StObject {
  
  /**
    * Message information about the trigger that did not run.
    */
  var failureMessage: js.UndefOr[RepositoryTriggerExecutionFailureMessage] = js.undefined
  
  /**
    * The name of the trigger that did not run.
    */
  var trigger: js.UndefOr[RepositoryTriggerName] = js.undefined
}
object RepositoryTriggerExecutionFailure {
  
  @scala.inline
  def apply(): RepositoryTriggerExecutionFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepositoryTriggerExecutionFailure]
  }
  
  @scala.inline
  implicit class RepositoryTriggerExecutionFailureMutableBuilder[Self <: RepositoryTriggerExecutionFailure] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailureMessage(value: RepositoryTriggerExecutionFailureMessage): Self = StObject.set(x, "failureMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureMessageUndefined: Self = StObject.set(x, "failureMessage", js.undefined)
    
    @scala.inline
    def setTrigger(value: RepositoryTriggerName): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
  }
}
