package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZeppelinApplicationConfigurationDescription extends StObject {
  
  /**
    * The Amazon Glue Data Catalog that is associated with the Kinesis Data Analytics Studio notebook.
    */
  var CatalogConfigurationDescription: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.CatalogConfigurationDescription] = js.undefined
  
  /**
    * Custom artifacts are dependency JARs and user-defined functions (UDF).
    */
  var CustomArtifactsConfigurationDescription: js.UndefOr[CustomArtifactsConfigurationDescriptionList] = js.undefined
  
  /**
    * The parameters required to deploy a Kinesis Data Analytics Studio notebook as an application with durable state.
    */
  var DeployAsApplicationConfigurationDescription: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.DeployAsApplicationConfigurationDescription] = js.undefined
  
  /**
    * The monitoring configuration of a Kinesis Data Analytics Studio notebook.
    */
  var MonitoringConfigurationDescription: ZeppelinMonitoringConfigurationDescription
}
object ZeppelinApplicationConfigurationDescription {
  
  inline def apply(MonitoringConfigurationDescription: ZeppelinMonitoringConfigurationDescription): ZeppelinApplicationConfigurationDescription = {
    val __obj = js.Dynamic.literal(MonitoringConfigurationDescription = MonitoringConfigurationDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZeppelinApplicationConfigurationDescription]
  }
  
  extension [Self <: ZeppelinApplicationConfigurationDescription](x: Self) {
    
    inline def setCatalogConfigurationDescription(value: CatalogConfigurationDescription): Self = StObject.set(x, "CatalogConfigurationDescription", value.asInstanceOf[js.Any])
    
    inline def setCatalogConfigurationDescriptionUndefined: Self = StObject.set(x, "CatalogConfigurationDescription", js.undefined)
    
    inline def setCustomArtifactsConfigurationDescription(value: CustomArtifactsConfigurationDescriptionList): Self = StObject.set(x, "CustomArtifactsConfigurationDescription", value.asInstanceOf[js.Any])
    
    inline def setCustomArtifactsConfigurationDescriptionUndefined: Self = StObject.set(x, "CustomArtifactsConfigurationDescription", js.undefined)
    
    inline def setCustomArtifactsConfigurationDescriptionVarargs(value: CustomArtifactConfigurationDescription*): Self = StObject.set(x, "CustomArtifactsConfigurationDescription", js.Array(value*))
    
    inline def setDeployAsApplicationConfigurationDescription(value: DeployAsApplicationConfigurationDescription): Self = StObject.set(x, "DeployAsApplicationConfigurationDescription", value.asInstanceOf[js.Any])
    
    inline def setDeployAsApplicationConfigurationDescriptionUndefined: Self = StObject.set(x, "DeployAsApplicationConfigurationDescription", js.undefined)
    
    inline def setMonitoringConfigurationDescription(value: ZeppelinMonitoringConfigurationDescription): Self = StObject.set(x, "MonitoringConfigurationDescription", value.asInstanceOf[js.Any])
  }
}
