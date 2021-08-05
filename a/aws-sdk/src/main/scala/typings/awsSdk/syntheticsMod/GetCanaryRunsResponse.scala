package typings.awsSdk.syntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCanaryRunsResponse extends StObject {
  
  /**
    * An array of structures. Each structure contains the details of one of the retrieved canary runs.
    */
  var CanaryRuns: js.UndefOr[typings.awsSdk.syntheticsMod.CanaryRuns] = js.undefined
  
  /**
    * A token that indicates that there is more data available. You can use this token in a subsequent GetCanaryRuns operation to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object GetCanaryRunsResponse {
  
  inline def apply(): GetCanaryRunsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCanaryRunsResponse]
  }
  
  extension [Self <: GetCanaryRunsResponse](x: Self) {
    
    inline def setCanaryRuns(value: CanaryRuns): Self = StObject.set(x, "CanaryRuns", value.asInstanceOf[js.Any])
    
    inline def setCanaryRunsUndefined: Self = StObject.set(x, "CanaryRuns", js.undefined)
    
    inline def setCanaryRunsVarargs(value: CanaryRun*): Self = StObject.set(x, "CanaryRuns", js.Array(value :_*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
