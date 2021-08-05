package typings.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricsConfiguration extends StObject {
  
  /**
    * A Boolean that specifies whether cloud metrics are collected.
    */
  var cloudMetricEnabled: js.UndefOr[Enabled] = js.undefined
  
  /**
    * The ARN of the role that is used to collect cloud metrics.
    */
  var metricRuleRoleArn: js.UndefOr[RoleArn] = js.undefined
}
object MetricsConfiguration {
  
  inline def apply(): MetricsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricsConfiguration]
  }
  
  extension [Self <: MetricsConfiguration](x: Self) {
    
    inline def setCloudMetricEnabled(value: Enabled): Self = StObject.set(x, "cloudMetricEnabled", value.asInstanceOf[js.Any])
    
    inline def setCloudMetricEnabledUndefined: Self = StObject.set(x, "cloudMetricEnabled", js.undefined)
    
    inline def setMetricRuleRoleArn(value: RoleArn): Self = StObject.set(x, "metricRuleRoleArn", value.asInstanceOf[js.Any])
    
    inline def setMetricRuleRoleArnUndefined: Self = StObject.set(x, "metricRuleRoleArn", js.undefined)
  }
}
