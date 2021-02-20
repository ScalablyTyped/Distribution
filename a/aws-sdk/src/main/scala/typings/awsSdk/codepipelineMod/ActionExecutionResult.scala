package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionExecutionResult extends StObject {
  
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
  implicit class ActionExecutionResultMutableBuilder[Self <: ActionExecutionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExternalExecutionId(value: ExternalExecutionId): Self = StObject.set(x, "externalExecutionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalExecutionIdUndefined: Self = StObject.set(x, "externalExecutionId", js.undefined)
    
    @scala.inline
    def setExternalExecutionSummary(value: ExternalExecutionSummary): Self = StObject.set(x, "externalExecutionSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalExecutionSummaryUndefined: Self = StObject.set(x, "externalExecutionSummary", js.undefined)
    
    @scala.inline
    def setExternalExecutionUrl(value: Url): Self = StObject.set(x, "externalExecutionUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalExecutionUrlUndefined: Self = StObject.set(x, "externalExecutionUrl", js.undefined)
  }
}
