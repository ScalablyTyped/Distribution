package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListExperimentsResponse extends StObject {
  
  /**
    * A list of the summaries of your experiments.
    */
  var ExperimentSummaries: js.UndefOr[typings.awsSdk.sagemakerMod.ExperimentSummaries] = js.native
  
  /**
    * A token for getting the next set of experiments, if there are any.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
}
object ListExperimentsResponse {
  
  @scala.inline
  def apply(): ListExperimentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListExperimentsResponse]
  }
  
  @scala.inline
  implicit class ListExperimentsResponseMutableBuilder[Self <: ListExperimentsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExperimentSummaries(value: ExperimentSummaries): Self = StObject.set(x, "ExperimentSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExperimentSummariesUndefined: Self = StObject.set(x, "ExperimentSummaries", js.undefined)
    
    @scala.inline
    def setExperimentSummariesVarargs(value: ExperimentSummary*): Self = StObject.set(x, "ExperimentSummaries", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
