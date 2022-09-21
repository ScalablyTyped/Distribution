package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RStudioServerProDomainSettingsForUpdate extends StObject {
  
  var DefaultResourceSpec: js.UndefOr[ResourceSpec] = js.undefined
  
  /**
    * The execution role for the RStudioServerPro Domain-level app.
    */
  var DomainExecutionRoleArn: RoleArn
}
object RStudioServerProDomainSettingsForUpdate {
  
  inline def apply(DomainExecutionRoleArn: RoleArn): RStudioServerProDomainSettingsForUpdate = {
    val __obj = js.Dynamic.literal(DomainExecutionRoleArn = DomainExecutionRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RStudioServerProDomainSettingsForUpdate]
  }
  
  extension [Self <: RStudioServerProDomainSettingsForUpdate](x: Self) {
    
    inline def setDefaultResourceSpec(value: ResourceSpec): Self = StObject.set(x, "DefaultResourceSpec", value.asInstanceOf[js.Any])
    
    inline def setDefaultResourceSpecUndefined: Self = StObject.set(x, "DefaultResourceSpec", js.undefined)
    
    inline def setDomainExecutionRoleArn(value: RoleArn): Self = StObject.set(x, "DomainExecutionRoleArn", value.asInstanceOf[js.Any])
  }
}
