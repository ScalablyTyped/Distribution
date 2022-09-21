package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceConfigurations extends StObject {
  
  /**
    * Describes whether any Kubernetes logs are enabled as data sources.
    */
  var Kubernetes: js.UndefOr[KubernetesConfiguration] = js.undefined
  
  /**
    * Describes whether Malware Protection is enabled as a data source.
    */
  var MalwareProtection: js.UndefOr[MalwareProtectionConfiguration] = js.undefined
  
  /**
    * Describes whether S3 data event logs are enabled as a data source.
    */
  var S3Logs: js.UndefOr[S3LogsConfiguration] = js.undefined
}
object DataSourceConfigurations {
  
  inline def apply(): DataSourceConfigurations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceConfigurations]
  }
  
  extension [Self <: DataSourceConfigurations](x: Self) {
    
    inline def setKubernetes(value: KubernetesConfiguration): Self = StObject.set(x, "Kubernetes", value.asInstanceOf[js.Any])
    
    inline def setKubernetesUndefined: Self = StObject.set(x, "Kubernetes", js.undefined)
    
    inline def setMalwareProtection(value: MalwareProtectionConfiguration): Self = StObject.set(x, "MalwareProtection", value.asInstanceOf[js.Any])
    
    inline def setMalwareProtectionUndefined: Self = StObject.set(x, "MalwareProtection", js.undefined)
    
    inline def setS3Logs(value: S3LogsConfiguration): Self = StObject.set(x, "S3Logs", value.asInstanceOf[js.Any])
    
    inline def setS3LogsUndefined: Self = StObject.set(x, "S3Logs", js.undefined)
  }
}
