package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCandidatesForAutoMLJobResponse extends StObject {
  
  /**
    * Summaries about the Candidates.
    */
  var Candidates: AutoMLCandidates
  
  /**
    * If the previous response was truncated, you receive this token. Use it in your next request to receive the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.undefined
}
object ListCandidatesForAutoMLJobResponse {
  
  inline def apply(Candidates: AutoMLCandidates): ListCandidatesForAutoMLJobResponse = {
    val __obj = js.Dynamic.literal(Candidates = Candidates.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCandidatesForAutoMLJobResponse]
  }
  
  extension [Self <: ListCandidatesForAutoMLJobResponse](x: Self) {
    
    inline def setCandidates(value: AutoMLCandidates): Self = StObject.set(x, "Candidates", value.asInstanceOf[js.Any])
    
    inline def setCandidatesVarargs(value: AutoMLCandidate*): Self = StObject.set(x, "Candidates", js.Array(value :_*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
