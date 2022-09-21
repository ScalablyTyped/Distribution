package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResetServiceSettingRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the service setting to reset. The setting ID can be one of the following.    /ssm/automation/customer-script-log-destination     /ssm/automation/customer-script-log-group-name     /ssm/documents/console/public-sharing-permission     /ssm/managed-instance/activation-tier     /ssm/opsinsights/opscenter     /ssm/parameter-store/default-parameter-tier     /ssm/parameter-store/high-throughput-enabled   
    */
  var SettingId: ServiceSettingId
}
object ResetServiceSettingRequest {
  
  inline def apply(SettingId: ServiceSettingId): ResetServiceSettingRequest = {
    val __obj = js.Dynamic.literal(SettingId = SettingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetServiceSettingRequest]
  }
  
  extension [Self <: ResetServiceSettingRequest](x: Self) {
    
    inline def setSettingId(value: ServiceSettingId): Self = StObject.set(x, "SettingId", value.asInstanceOf[js.Any])
  }
}
