package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateConfigurationSetReputationMetricsEnabledRequest extends StObject {
  
  /**
    * The name of the configuration set that you want to update.
    */
  var ConfigurationSetName: typings.awsSdk.sesMod.ConfigurationSetName
  
  /**
    * Describes whether or not Amazon SES will publish reputation metrics for the configuration set, such as bounce and complaint rates, to Amazon CloudWatch.
    */
  var Enabled: typings.awsSdk.sesMod.Enabled
}
object UpdateConfigurationSetReputationMetricsEnabledRequest {
  
  inline def apply(ConfigurationSetName: ConfigurationSetName, Enabled: Enabled): UpdateConfigurationSetReputationMetricsEnabledRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConfigurationSetReputationMetricsEnabledRequest]
  }
  
  extension [Self <: UpdateConfigurationSetReputationMetricsEnabledRequest](x: Self) {
    
    inline def setConfigurationSetName(value: ConfigurationSetName): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Enabled): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
  }
}
