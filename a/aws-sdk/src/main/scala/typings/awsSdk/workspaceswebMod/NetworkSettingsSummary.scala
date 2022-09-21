package typings.awsSdk.workspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkSettingsSummary extends StObject {
  
  /**
    * The ARN of the network settings.
    */
  var networkSettingsArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The VPC ID of the network settings.
    */
  var vpcId: js.UndefOr[VpcId] = js.undefined
}
object NetworkSettingsSummary {
  
  inline def apply(): NetworkSettingsSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkSettingsSummary]
  }
  
  extension [Self <: NetworkSettingsSummary](x: Self) {
    
    inline def setNetworkSettingsArn(value: ARN): Self = StObject.set(x, "networkSettingsArn", value.asInstanceOf[js.Any])
    
    inline def setNetworkSettingsArnUndefined: Self = StObject.set(x, "networkSettingsArn", js.undefined)
    
    inline def setVpcId(value: VpcId): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
  }
}
