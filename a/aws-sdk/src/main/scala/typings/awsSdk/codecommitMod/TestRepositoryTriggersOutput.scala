package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestRepositoryTriggersOutput extends js.Object {
  
  /**
    * The list of triggers that were not tested. This list provides the names of the triggers that could not be tested, separated by commas.
    */
  var failedExecutions: js.UndefOr[RepositoryTriggerExecutionFailureList] = js.native
  
  /**
    * The list of triggers that were successfully tested. This list provides the names of the triggers that were successfully tested, separated by commas.
    */
  var successfulExecutions: js.UndefOr[RepositoryTriggerNameList] = js.native
}
object TestRepositoryTriggersOutput {
  
  @scala.inline
  def apply(): TestRepositoryTriggersOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestRepositoryTriggersOutput]
  }
  
  @scala.inline
  implicit class TestRepositoryTriggersOutputOps[Self <: TestRepositoryTriggersOutput] (val x: Self) extends AnyVal {
    
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
    def setFailedExecutionsVarargs(value: RepositoryTriggerExecutionFailure*): Self = this.set("failedExecutions", js.Array(value :_*))
    
    @scala.inline
    def setFailedExecutions(value: RepositoryTriggerExecutionFailureList): Self = this.set("failedExecutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailedExecutions: Self = this.set("failedExecutions", js.undefined)
    
    @scala.inline
    def setSuccessfulExecutionsVarargs(value: RepositoryTriggerName*): Self = this.set("successfulExecutions", js.Array(value :_*))
    
    @scala.inline
    def setSuccessfulExecutions(value: RepositoryTriggerNameList): Self = this.set("successfulExecutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccessfulExecutions: Self = this.set("successfulExecutions", js.undefined)
  }
}
