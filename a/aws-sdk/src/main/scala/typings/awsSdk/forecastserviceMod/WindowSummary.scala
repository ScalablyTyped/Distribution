package typings.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowSummary extends StObject {
  
  /**
    * The type of evaluation.    SUMMARY - The average metrics across all windows.    COMPUTED - The metrics for the specified window.  
    */
  var EvaluationType: js.UndefOr[typings.awsSdk.forecastserviceMod.EvaluationType] = js.native
  
  /**
    * The number of data points within the window.
    */
  var ItemCount: js.UndefOr[Integer] = js.native
  
  /**
    * Provides metrics used to evaluate the performance of a predictor.
    */
  var Metrics: js.UndefOr[typings.awsSdk.forecastserviceMod.Metrics] = js.native
  
  /**
    * The timestamp that defines the end of the window.
    */
  var TestWindowEnd: js.UndefOr[Timestamp] = js.native
  
  /**
    * The timestamp that defines the start of the window.
    */
  var TestWindowStart: js.UndefOr[Timestamp] = js.native
}
object WindowSummary {
  
  @scala.inline
  def apply(): WindowSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowSummary]
  }
  
  @scala.inline
  implicit class WindowSummaryMutableBuilder[Self <: WindowSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvaluationType(value: EvaluationType): Self = StObject.set(x, "EvaluationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvaluationTypeUndefined: Self = StObject.set(x, "EvaluationType", js.undefined)
    
    @scala.inline
    def setItemCount(value: Integer): Self = StObject.set(x, "ItemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemCountUndefined: Self = StObject.set(x, "ItemCount", js.undefined)
    
    @scala.inline
    def setMetrics(value: Metrics): Self = StObject.set(x, "Metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsUndefined: Self = StObject.set(x, "Metrics", js.undefined)
    
    @scala.inline
    def setTestWindowEnd(value: Timestamp): Self = StObject.set(x, "TestWindowEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestWindowEndUndefined: Self = StObject.set(x, "TestWindowEnd", js.undefined)
    
    @scala.inline
    def setTestWindowStart(value: Timestamp): Self = StObject.set(x, "TestWindowStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestWindowStartUndefined: Self = StObject.set(x, "TestWindowStart", js.undefined)
  }
}
