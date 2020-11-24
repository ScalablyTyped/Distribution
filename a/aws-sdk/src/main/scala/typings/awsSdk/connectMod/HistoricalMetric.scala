package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistoricalMetric extends js.Object {
  
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
  implicit class HistoricalMetricOps[Self <: HistoricalMetric] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: HistoricalMetricName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setStatistic(value: Statistic): Self = this.set("Statistic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatistic: Self = this.set("Statistic", js.undefined)
    
    @scala.inline
    def setThreshold(value: Threshold): Self = this.set("Threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreshold: Self = this.set("Threshold", js.undefined)
    
    @scala.inline
    def setUnit(value: Unit): Self = this.set("Unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnit: Self = this.set("Unit", js.undefined)
  }
}
