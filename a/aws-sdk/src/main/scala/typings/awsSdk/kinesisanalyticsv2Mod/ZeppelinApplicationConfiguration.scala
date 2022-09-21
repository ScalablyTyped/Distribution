package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZeppelinApplicationConfiguration extends StObject {
  
  /**
    * The Amazon Glue Data Catalog that you use in queries in a Kinesis Data Analytics Studio notebook.
    */
  var CatalogConfiguration: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.CatalogConfiguration] = js.undefined
  
  /**
    * Custom artifacts are dependency JARs and user-defined functions (UDF).
    */
  var CustomArtifactsConfiguration: js.UndefOr[CustomArtifactsConfigurationList] = js.undefined
  
  /**
    * The information required to deploy a Kinesis Data Analytics Studio notebook as an application with durable state.
    */
  var DeployAsApplicationConfiguration: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.DeployAsApplicationConfiguration] = js.undefined
  
  /**
    * The monitoring configuration of a Kinesis Data Analytics Studio notebook.
    */
  var MonitoringConfiguration: js.UndefOr[ZeppelinMonitoringConfiguration] = js.undefined
}
object ZeppelinApplicationConfiguration {
  
  inline def apply(): ZeppelinApplicationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZeppelinApplicationConfiguration]
  }
  
  extension [Self <: ZeppelinApplicationConfiguration](x: Self) {
    
    inline def setCatalogConfiguration(value: CatalogConfiguration): Self = StObject.set(x, "CatalogConfiguration", value.asInstanceOf[js.Any])
    
    inline def setCatalogConfigurationUndefined: Self = StObject.set(x, "CatalogConfiguration", js.undefined)
    
    inline def setCustomArtifactsConfiguration(value: CustomArtifactsConfigurationList): Self = StObject.set(x, "CustomArtifactsConfiguration", value.asInstanceOf[js.Any])
    
    inline def setCustomArtifactsConfigurationUndefined: Self = StObject.set(x, "CustomArtifactsConfiguration", js.undefined)
    
    inline def setCustomArtifactsConfigurationVarargs(value: CustomArtifactConfiguration*): Self = StObject.set(x, "CustomArtifactsConfiguration", js.Array(value*))
    
    inline def setDeployAsApplicationConfiguration(value: DeployAsApplicationConfiguration): Self = StObject.set(x, "DeployAsApplicationConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDeployAsApplicationConfigurationUndefined: Self = StObject.set(x, "DeployAsApplicationConfiguration", js.undefined)
    
    inline def setMonitoringConfiguration(value: ZeppelinMonitoringConfiguration): Self = StObject.set(x, "MonitoringConfiguration", value.asInstanceOf[js.Any])
    
    inline def setMonitoringConfigurationUndefined: Self = StObject.set(x, "MonitoringConfiguration", js.undefined)
  }
}
