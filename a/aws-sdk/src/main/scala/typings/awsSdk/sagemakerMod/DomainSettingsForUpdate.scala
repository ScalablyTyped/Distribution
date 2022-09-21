package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainSettingsForUpdate extends StObject {
  
  /**
    * The configuration for attaching a SageMaker user profile name to the execution role as a sts:SourceIdentity key. This configuration can only be modified if there are no apps in the InService or Pending state.
    */
  var ExecutionRoleIdentityConfig: js.UndefOr[typings.awsSdk.sagemakerMod.ExecutionRoleIdentityConfig] = js.undefined
  
  /**
    * A collection of RStudioServerPro Domain-level app settings to update.
    */
  var RStudioServerProDomainSettingsForUpdate: js.UndefOr[typings.awsSdk.sagemakerMod.RStudioServerProDomainSettingsForUpdate] = js.undefined
}
object DomainSettingsForUpdate {
  
  inline def apply(): DomainSettingsForUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainSettingsForUpdate]
  }
  
  extension [Self <: DomainSettingsForUpdate](x: Self) {
    
    inline def setExecutionRoleIdentityConfig(value: ExecutionRoleIdentityConfig): Self = StObject.set(x, "ExecutionRoleIdentityConfig", value.asInstanceOf[js.Any])
    
    inline def setExecutionRoleIdentityConfigUndefined: Self = StObject.set(x, "ExecutionRoleIdentityConfig", js.undefined)
    
    inline def setRStudioServerProDomainSettingsForUpdate(value: RStudioServerProDomainSettingsForUpdate): Self = StObject.set(x, "RStudioServerProDomainSettingsForUpdate", value.asInstanceOf[js.Any])
    
    inline def setRStudioServerProDomainSettingsForUpdateUndefined: Self = StObject.set(x, "RStudioServerProDomainSettingsForUpdate", js.undefined)
  }
}
