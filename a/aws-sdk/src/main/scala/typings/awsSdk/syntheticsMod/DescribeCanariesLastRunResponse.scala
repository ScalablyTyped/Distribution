package typings.awsSdk.syntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCanariesLastRunResponse extends StObject {
  
  /**
    * An array that contains the information from the most recent run of each canary.
    */
  var CanariesLastRun: js.UndefOr[typings.awsSdk.syntheticsMod.CanariesLastRun] = js.undefined
  
  /**
    * A token that indicates that there is more data available. You can use this token in a subsequent DescribeCanariesLastRun operation to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object DescribeCanariesLastRunResponse {
  
  inline def apply(): DescribeCanariesLastRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCanariesLastRunResponse]
  }
  
  extension [Self <: DescribeCanariesLastRunResponse](x: Self) {
    
    inline def setCanariesLastRun(value: CanariesLastRun): Self = StObject.set(x, "CanariesLastRun", value.asInstanceOf[js.Any])
    
    inline def setCanariesLastRunUndefined: Self = StObject.set(x, "CanariesLastRun", js.undefined)
    
    inline def setCanariesLastRunVarargs(value: CanaryLastRun*): Self = StObject.set(x, "CanariesLastRun", js.Array(value*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
