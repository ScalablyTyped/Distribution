package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistoricalMetric extends StObject {
  
  /**
    * The name of the metric.
    */
  var Name: js.UndefOr[HistoricalMetricName] = js.native
  
  /**
    * The statistic for the metric.
    */
  var Statistic: js.UndefOr[typings.awsSdk.connectMod.Statistic] = js.native
  
  /**
    * The threshold for the metric, used with service level metrics.
    */
  var Threshold: js.UndefOr[typings.awsSdk.connectMod.Threshold] = js.native
  
  /**
    * The unit for the metric.
    */
  var Unit: js.UndefOr[typings.awsSdk.connectMod.Unit] = js.native
}
object HistoricalMetric {
  
  @scala.inline
  def apply(): HistoricalMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistoricalMetric]
  }
  
  @scala.inline
  implicit class HistoricalMetricMutableBuilder[Self <: HistoricalMetric] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: HistoricalMetricName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setStatistic(value: Statistic): Self = StObject.set(x, "Statistic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatisticUndefined: Self = StObject.set(x, "Statistic", js.undefined)
    
    @scala.inline
    def setThreshold(value: Threshold): Self = StObject.set(x, "Threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThresholdUndefined: Self = StObject.set(x, "Threshold", js.undefined)
    
    @scala.inline
    def setUnit(value: Unit): Self = StObject.set(x, "Unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "Unit", js.undefined)
  }
}
