package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListContributorInsightsOutput extends StObject {
  
  /**
    * <p>A list of ContributorInsightsSummary.</p>
    */
  var ContributorInsightsSummaries: js.UndefOr[js.Array[ContributorInsightsSummary]] = js.undefined
  
  /**
    * <p>A token to go to the next page if there is one.</p>
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListContributorInsightsOutput {
  
  inline def apply(): ListContributorInsightsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListContributorInsightsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListContributorInsightsOutput] (val x: Self) extends AnyVal {
    
    inline def setContributorInsightsSummaries(value: js.Array[ContributorInsightsSummary]): Self = StObject.set(x, "ContributorInsightsSummaries", value.asInstanceOf[js.Any])
    
    inline def setContributorInsightsSummariesUndefined: Self = StObject.set(x, "ContributorInsightsSummaries", js.undefined)
    
    inline def setContributorInsightsSummariesVarargs(value: ContributorInsightsSummary*): Self = StObject.set(x, "ContributorInsightsSummaries", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
