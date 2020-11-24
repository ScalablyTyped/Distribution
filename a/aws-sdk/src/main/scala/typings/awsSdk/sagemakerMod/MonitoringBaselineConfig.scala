package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MonitoringBaselineConfig extends js.Object {
  
  /**
    * The baseline constraint file in Amazon S3 that the current monitoring job should validated against.
    */
  var ConstraintsResource: js.UndefOr[MonitoringConstraintsResource] = js.native
  
  /**
    * The baseline statistics file in Amazon S3 that the current monitoring job should be validated against.
    */
  var StatisticsResource: js.UndefOr[MonitoringStatisticsResource] = js.native
}
object MonitoringBaselineConfig {
  
  @scala.inline
  def apply(): MonitoringBaselineConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonitoringBaselineConfig]
  }
  
  @scala.inline
  implicit class MonitoringBaselineConfigOps[Self <: MonitoringBaselineConfig] (val x: Self) extends AnyVal {
    
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
    def setConstraintsResource(value: MonitoringConstraintsResource): Self = this.set("ConstraintsResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConstraintsResource: Self = this.set("ConstraintsResource", js.undefined)
    
    @scala.inline
    def setStatisticsResource(value: MonitoringStatisticsResource): Self = this.set("StatisticsResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatisticsResource: Self = this.set("StatisticsResource", js.undefined)
  }
}
