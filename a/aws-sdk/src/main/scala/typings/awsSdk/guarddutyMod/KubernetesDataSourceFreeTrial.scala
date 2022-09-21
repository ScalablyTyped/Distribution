package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KubernetesDataSourceFreeTrial extends StObject {
  
  /**
    * Describes whether Kubernetes audit logs are enabled as a data source.
    */
  var AuditLogs: js.UndefOr[DataSourceFreeTrial] = js.undefined
}
object KubernetesDataSourceFreeTrial {
  
  inline def apply(): KubernetesDataSourceFreeTrial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KubernetesDataSourceFreeTrial]
  }
  
  extension [Self <: KubernetesDataSourceFreeTrial](x: Self) {
    
    inline def setAuditLogs(value: DataSourceFreeTrial): Self = StObject.set(x, "AuditLogs", value.asInstanceOf[js.Any])
    
    inline def setAuditLogsUndefined: Self = StObject.set(x, "AuditLogs", js.undefined)
  }
}
