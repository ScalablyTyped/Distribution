package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConsolidatedReportOutput extends StObject {
  
  var Base64String: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.Base64String] = js.undefined
  
  /**
    * The metrics that make up the consolidated report. Only returned when JSON format is requested.
    */
  var Metrics: js.UndefOr[ConsolidatedReportMetrics] = js.undefined
  
  var NextToken: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.NextToken] = js.undefined
}
object GetConsolidatedReportOutput {
  
  inline def apply(): GetConsolidatedReportOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConsolidatedReportOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetConsolidatedReportOutput] (val x: Self) extends AnyVal {
    
    inline def setBase64String(value: Base64String): Self = StObject.set(x, "Base64String", value.asInstanceOf[js.Any])
    
    inline def setBase64StringUndefined: Self = StObject.set(x, "Base64String", js.undefined)
    
    inline def setMetrics(value: ConsolidatedReportMetrics): Self = StObject.set(x, "Metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "Metrics", js.undefined)
    
    inline def setMetricsVarargs(value: ConsolidatedReportMetric*): Self = StObject.set(x, "Metrics", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
