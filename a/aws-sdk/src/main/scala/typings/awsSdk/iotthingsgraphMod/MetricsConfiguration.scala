package typings.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetricsConfiguration extends js.Object {
  
  /**
    * A Boolean that specifies whether cloud metrics are collected.
    */
  var cloudMetricEnabled: js.UndefOr[Enabled] = js.native
  
  /**
    * The ARN of the role that is used to collect cloud metrics.
    */
  var metricRuleRoleArn: js.UndefOr[RoleArn] = js.native
}
object MetricsConfiguration {
  
  @scala.inline
  def apply(): MetricsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricsConfiguration]
  }
  
  @scala.inline
  implicit class MetricsConfigurationOps[Self <: MetricsConfiguration] (val x: Self) extends AnyVal {
    
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
    def setCloudMetricEnabled(value: Enabled): Self = this.set("cloudMetricEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudMetricEnabled: Self = this.set("cloudMetricEnabled", js.undefined)
    
    @scala.inline
    def setMetricRuleRoleArn(value: RoleArn): Self = this.set("metricRuleRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetricRuleRoleArn: Self = this.set("metricRuleRoleArn", js.undefined)
  }
}
