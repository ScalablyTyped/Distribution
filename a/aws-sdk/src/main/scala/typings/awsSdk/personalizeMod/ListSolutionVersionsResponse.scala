package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSolutionVersionsResponse extends StObject {
  
  /**
    * A token for getting the next set of solution versions (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * A list of solution versions describing the version properties.
    */
  var solutionVersions: js.UndefOr[SolutionVersions] = js.undefined
}
object ListSolutionVersionsResponse {
  
  inline def apply(): ListSolutionVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSolutionVersionsResponse]
  }
  
  extension [Self <: ListSolutionVersionsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSolutionVersions(value: SolutionVersions): Self = StObject.set(x, "solutionVersions", value.asInstanceOf[js.Any])
    
    inline def setSolutionVersionsUndefined: Self = StObject.set(x, "solutionVersions", js.undefined)
    
    inline def setSolutionVersionsVarargs(value: SolutionVersionSummary*): Self = StObject.set(x, "solutionVersions", js.Array(value*))
  }
}
