package typings.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSystemTemplateRevisionsResponse extends StObject {
  
  /**
    * The string to specify as nextToken when you request the next page of results. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * An array of objects that contain summary data about the system template revisions.
    */
  var summaries: js.UndefOr[SystemTemplateSummaries] = js.native
}
object GetSystemTemplateRevisionsResponse {
  
  @scala.inline
  def apply(): GetSystemTemplateRevisionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSystemTemplateRevisionsResponse]
  }
  
  @scala.inline
  implicit class GetSystemTemplateRevisionsResponseMutableBuilder[Self <: GetSystemTemplateRevisionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setSummaries(value: SystemTemplateSummaries): Self = StObject.set(x, "summaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummariesUndefined: Self = StObject.set(x, "summaries", js.undefined)
    
    @scala.inline
    def setSummariesVarargs(value: SystemTemplateSummary*): Self = StObject.set(x, "summaries", js.Array(value :_*))
  }
}
