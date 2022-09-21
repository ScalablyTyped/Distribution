package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KubernetesConfigurationResult extends StObject {
  
  /**
    * Describes whether Kubernetes audit logs are enabled as a data source.
    */
  var AuditLogs: KubernetesAuditLogsConfigurationResult
}
object KubernetesConfigurationResult {
  
  inline def apply(AuditLogs: KubernetesAuditLogsConfigurationResult): KubernetesConfigurationResult = {
    val __obj = js.Dynamic.literal(AuditLogs = AuditLogs.asInstanceOf[js.Any])
    __obj.asInstanceOf[KubernetesConfigurationResult]
  }
  
  extension [Self <: KubernetesConfigurationResult](x: Self) {
    
    inline def setAuditLogs(value: KubernetesAuditLogsConfigurationResult): Self = StObject.set(x, "AuditLogs", value.asInstanceOf[js.Any])
  }
}
