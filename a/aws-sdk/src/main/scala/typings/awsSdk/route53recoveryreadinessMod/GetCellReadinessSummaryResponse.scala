package typings.awsSdk.route53recoveryreadinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCellReadinessSummaryResponse extends StObject {
  
  /**
    * The token that identifies which batch of results you want to see.
    */
  var NextToken: js.UndefOr[string] = js.undefined
  
  /**
    * The readiness at a cell level.
    */
  var Readiness: js.UndefOr[typings.awsSdk.route53recoveryreadinessMod.Readiness] = js.undefined
  
  /**
    * Summaries for the readiness checks that make up the cell.
    */
  var ReadinessChecks: js.UndefOr[listOfReadinessCheckSummary] = js.undefined
}
object GetCellReadinessSummaryResponse {
  
  inline def apply(): GetCellReadinessSummaryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCellReadinessSummaryResponse]
  }
  
  extension [Self <: GetCellReadinessSummaryResponse](x: Self) {
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setReadiness(value: Readiness): Self = StObject.set(x, "Readiness", value.asInstanceOf[js.Any])
    
    inline def setReadinessChecks(value: listOfReadinessCheckSummary): Self = StObject.set(x, "ReadinessChecks", value.asInstanceOf[js.Any])
    
    inline def setReadinessChecksUndefined: Self = StObject.set(x, "ReadinessChecks", js.undefined)
    
    inline def setReadinessChecksVarargs(value: ReadinessCheckSummary*): Self = StObject.set(x, "ReadinessChecks", js.Array(value*))
    
    inline def setReadinessUndefined: Self = StObject.set(x, "Readiness", js.undefined)
  }
}
