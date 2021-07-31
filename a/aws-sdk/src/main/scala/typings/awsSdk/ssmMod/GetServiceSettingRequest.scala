package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetServiceSettingRequest extends StObject {
  
  /**
    * The ID of the service setting to get. The setting ID can be /ssm/parameter-store/default-parameter-tier, /ssm/parameter-store/high-throughput-enabled, or /ssm/managed-instance/activation-tier.
    */
  var SettingId: ServiceSettingId
}
object GetServiceSettingRequest {
  
  @scala.inline
  def apply(SettingId: ServiceSettingId): GetServiceSettingRequest = {
    val __obj = js.Dynamic.literal(SettingId = SettingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceSettingRequest]
  }
  
  @scala.inline
  implicit class GetServiceSettingRequestMutableBuilder[Self <: GetServiceSettingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSettingId(value: ServiceSettingId): Self = StObject.set(x, "SettingId", value.asInstanceOf[js.Any])
  }
}
