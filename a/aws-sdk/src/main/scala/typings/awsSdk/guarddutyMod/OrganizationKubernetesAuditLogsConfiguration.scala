package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizationKubernetesAuditLogsConfiguration extends StObject {
  
  /**
    * A value that contains information on whether Kubernetes audit logs should be enabled automatically as a data source for the organization.
    */
  var AutoEnable: Boolean
}
object OrganizationKubernetesAuditLogsConfiguration {
  
  inline def apply(AutoEnable: Boolean): OrganizationKubernetesAuditLogsConfiguration = {
    val __obj = js.Dynamic.literal(AutoEnable = AutoEnable.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationKubernetesAuditLogsConfiguration]
  }
  
  extension [Self <: OrganizationKubernetesAuditLogsConfiguration](x: Self) {
    
    inline def setAutoEnable(value: Boolean): Self = StObject.set(x, "AutoEnable", value.asInstanceOf[js.Any])
  }
}
