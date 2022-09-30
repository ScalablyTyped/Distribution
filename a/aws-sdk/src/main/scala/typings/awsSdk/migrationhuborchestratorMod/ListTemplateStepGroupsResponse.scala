package typings.awsSdk.migrationhuborchestratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTemplateStepGroupsResponse extends StObject {
  
  /**
    * The pagination token.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The summary of the step group in the template.
    */
  var templateStepGroupSummary: TemplateStepGroupSummaryList
}
object ListTemplateStepGroupsResponse {
  
  inline def apply(templateStepGroupSummary: TemplateStepGroupSummaryList): ListTemplateStepGroupsResponse = {
    val __obj = js.Dynamic.literal(templateStepGroupSummary = templateStepGroupSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTemplateStepGroupsResponse]
  }
  
  extension [Self <: ListTemplateStepGroupsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setTemplateStepGroupSummary(value: TemplateStepGroupSummaryList): Self = StObject.set(x, "templateStepGroupSummary", value.asInstanceOf[js.Any])
    
    inline def setTemplateStepGroupSummaryVarargs(value: TemplateStepGroupSummary*): Self = StObject.set(x, "templateStepGroupSummary", js.Array(value*))
  }
}
