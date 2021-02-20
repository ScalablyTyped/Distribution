package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MonitoringBaselineConfig extends StObject {
  
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
  implicit class MonitoringBaselineConfigMutableBuilder[Self <: MonitoringBaselineConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConstraintsResource(value: MonitoringConstraintsResource): Self = StObject.set(x, "ConstraintsResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstraintsResourceUndefined: Self = StObject.set(x, "ConstraintsResource", js.undefined)
    
    @scala.inline
    def setStatisticsResource(value: MonitoringStatisticsResource): Self = StObject.set(x, "StatisticsResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatisticsResourceUndefined: Self = StObject.set(x, "StatisticsResource", js.undefined)
  }
}
