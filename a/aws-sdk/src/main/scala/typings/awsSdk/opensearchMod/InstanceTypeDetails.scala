package typings.awsSdk.opensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceTypeDetails extends StObject {
  
  var AdvancedSecurityEnabled: js.UndefOr[Boolean] = js.undefined
  
  var AppLogsEnabled: js.UndefOr[Boolean] = js.undefined
  
  var CognitoEnabled: js.UndefOr[Boolean] = js.undefined
  
  var EncryptionEnabled: js.UndefOr[Boolean] = js.undefined
  
  var InstanceRole: js.UndefOr[InstanceRoleList] = js.undefined
  
  var InstanceType: js.UndefOr[OpenSearchPartitionInstanceType] = js.undefined
  
  var WarmEnabled: js.UndefOr[Boolean] = js.undefined
}
object InstanceTypeDetails {
  
  inline def apply(): InstanceTypeDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceTypeDetails]
  }
  
  extension [Self <: InstanceTypeDetails](x: Self) {
    
    inline def setAdvancedSecurityEnabled(value: Boolean): Self = StObject.set(x, "AdvancedSecurityEnabled", value.asInstanceOf[js.Any])
    
    inline def setAdvancedSecurityEnabledUndefined: Self = StObject.set(x, "AdvancedSecurityEnabled", js.undefined)
    
    inline def setAppLogsEnabled(value: Boolean): Self = StObject.set(x, "AppLogsEnabled", value.asInstanceOf[js.Any])
    
    inline def setAppLogsEnabledUndefined: Self = StObject.set(x, "AppLogsEnabled", js.undefined)
    
    inline def setCognitoEnabled(value: Boolean): Self = StObject.set(x, "CognitoEnabled", value.asInstanceOf[js.Any])
    
    inline def setCognitoEnabledUndefined: Self = StObject.set(x, "CognitoEnabled", js.undefined)
    
    inline def setEncryptionEnabled(value: Boolean): Self = StObject.set(x, "EncryptionEnabled", value.asInstanceOf[js.Any])
    
    inline def setEncryptionEnabledUndefined: Self = StObject.set(x, "EncryptionEnabled", js.undefined)
    
    inline def setInstanceRole(value: InstanceRoleList): Self = StObject.set(x, "InstanceRole", value.asInstanceOf[js.Any])
    
    inline def setInstanceRoleUndefined: Self = StObject.set(x, "InstanceRole", js.undefined)
    
    inline def setInstanceRoleVarargs(value: InstanceRole*): Self = StObject.set(x, "InstanceRole", js.Array(value*))
    
    inline def setInstanceType(value: OpenSearchPartitionInstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    inline def setWarmEnabled(value: Boolean): Self = StObject.set(x, "WarmEnabled", value.asInstanceOf[js.Any])
    
    inline def setWarmEnabledUndefined: Self = StObject.set(x, "WarmEnabled", js.undefined)
  }
}
