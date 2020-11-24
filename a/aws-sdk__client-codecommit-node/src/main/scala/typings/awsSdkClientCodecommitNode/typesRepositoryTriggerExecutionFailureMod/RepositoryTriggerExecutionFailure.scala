package typings.awsSdkClientCodecommitNode.typesRepositoryTriggerExecutionFailureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RepositoryTriggerExecutionFailure extends js.Object {
  
  /**
    * <p>Additional message information about the trigger that did not run.</p>
    */
  var failureMessage: js.UndefOr[String] = js.native
  
  /**
    * <p>The name of the trigger that did not run.</p>
    */
  var trigger: js.UndefOr[String] = js.native
}
object RepositoryTriggerExecutionFailure {
  
  @scala.inline
  def apply(): RepositoryTriggerExecutionFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepositoryTriggerExecutionFailure]
  }
  
  @scala.inline
  implicit class RepositoryTriggerExecutionFailureOps[Self <: RepositoryTriggerExecutionFailure] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFailureMessage(value: String): Self = this.set("failureMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureMessage: Self = this.set("failureMessage", js.undefined)
    
    @scala.inline
    def setTrigger(value: String): Self = this.set("trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrigger: Self = this.set("trigger", js.undefined)
  }
}
