package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionExecutionResult extends js.Object {
  
  /**
    * The action provider's external ID for the action execution.
    */
  var externalExecutionId: js.UndefOr[ExternalExecutionId] = js.native
  
  /**
    * The action provider's summary for the action execution.
    */
  var externalExecutionSummary: js.UndefOr[ExternalExecutionSummary] = js.native
  
  /**
    * The deepest external link to the external resource (for example, a repository URL or deployment endpoint) that is used when running the action.
    */
  var externalExecutionUrl: js.UndefOr[Url] = js.native
}
object ActionExecutionResult {
  
  @scala.inline
  def apply(): ActionExecutionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionExecutionResult]
  }
  
  @scala.inline
  implicit class ActionExecutionResultOps[Self <: ActionExecutionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExternalExecutionId(value: ExternalExecutionId): Self = this.set("externalExecutionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalExecutionId: Self = this.set("externalExecutionId", js.undefined)
    
    @scala.inline
    def setExternalExecutionSummary(value: ExternalExecutionSummary): Self = this.set("externalExecutionSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalExecutionSummary: Self = this.set("externalExecutionSummary", js.undefined)
    
    @scala.inline
    def setExternalExecutionUrl(value: Url): Self = this.set("externalExecutionUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalExecutionUrl: Self = this.set("externalExecutionUrl", js.undefined)
  }
}
