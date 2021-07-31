package typings.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFlowTemplateRevisionsResponse extends StObject {
  
  /**
    * The string to specify as nextToken when you request the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * An array of objects that provide summary data about each revision.
    */
  var summaries: js.UndefOr[FlowTemplateSummaries] = js.undefined
}
object GetFlowTemplateRevisionsResponse {
  
  @scala.inline
  def apply(): GetFlowTemplateRevisionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFlowTemplateRevisionsResponse]
  }
  
  @scala.inline
  implicit class GetFlowTemplateRevisionsResponseMutableBuilder[Self <: GetFlowTemplateRevisionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setSummaries(value: FlowTemplateSummaries): Self = StObject.set(x, "summaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummariesUndefined: Self = StObject.set(x, "summaries", js.undefined)
    
    @scala.inline
    def setSummariesVarargs(value: FlowTemplateSummary*): Self = StObject.set(x, "summaries", js.Array(value :_*))
  }
}
