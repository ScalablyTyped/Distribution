package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForecastResult extends StObject {
  
  /**
    * The mean value of the forecast.
    */
  var MeanValue: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The lower limit for the prediction interval. 
    */
  var PredictionIntervalLowerBound: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The upper limit for the prediction interval. 
    */
  var PredictionIntervalUpperBound: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The period of time that the forecast covers.
    */
  var TimePeriod: js.UndefOr[DateInterval] = js.undefined
}
object ForecastResult {
  
  @scala.inline
  def apply(): ForecastResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForecastResult]
  }
  
  @scala.inline
  implicit class ForecastResultMutableBuilder[Self <: ForecastResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMeanValue(value: GenericString): Self = StObject.set(x, "MeanValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeanValueUndefined: Self = StObject.set(x, "MeanValue", js.undefined)
    
    @scala.inline
    def setPredictionIntervalLowerBound(value: GenericString): Self = StObject.set(x, "PredictionIntervalLowerBound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredictionIntervalLowerBoundUndefined: Self = StObject.set(x, "PredictionIntervalLowerBound", js.undefined)
    
    @scala.inline
    def setPredictionIntervalUpperBound(value: GenericString): Self = StObject.set(x, "PredictionIntervalUpperBound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredictionIntervalUpperBoundUndefined: Self = StObject.set(x, "PredictionIntervalUpperBound", js.undefined)
    
    @scala.inline
    def setTimePeriod(value: DateInterval): Self = StObject.set(x, "TimePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimePeriodUndefined: Self = StObject.set(x, "TimePeriod", js.undefined)
  }
}
