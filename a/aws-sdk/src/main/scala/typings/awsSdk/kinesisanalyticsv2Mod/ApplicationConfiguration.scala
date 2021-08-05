package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationConfiguration extends StObject {
  
  /**
    * The code location and type parameters for a Flink-based Kinesis Data Analytics application.
    */
  var ApplicationCodeConfiguration: typings.awsSdk.kinesisanalyticsv2Mod.ApplicationCodeConfiguration
  
  /**
    * Describes whether snapshots are enabled for a Flink-based Kinesis Data Analytics application.
    */
  var ApplicationSnapshotConfiguration: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ApplicationSnapshotConfiguration] = js.undefined
  
  /**
    * Describes execution properties for a Flink-based Kinesis Data Analytics application.
    */
  var EnvironmentProperties: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.EnvironmentProperties] = js.undefined
  
  /**
    * The creation and update parameters for a Flink-based Kinesis Data Analytics application.
    */
  var FlinkApplicationConfiguration: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.FlinkApplicationConfiguration] = js.undefined
  
  /**
    * The creation and update parameters for a SQL-based Kinesis Data Analytics application.
    */
  var SqlApplicationConfiguration: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.SqlApplicationConfiguration] = js.undefined
  
  /**
    * The array of descriptions of VPC configurations available to the application.
    */
  var VpcConfigurations: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.VpcConfigurations] = js.undefined
}
object ApplicationConfiguration {
  
  inline def apply(ApplicationCodeConfiguration: ApplicationCodeConfiguration): ApplicationConfiguration = {
    val __obj = js.Dynamic.literal(ApplicationCodeConfiguration = ApplicationCodeConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationConfiguration]
  }
  
  extension [Self <: ApplicationConfiguration](x: Self) {
    
    inline def setApplicationCodeConfiguration(value: ApplicationCodeConfiguration): Self = StObject.set(x, "ApplicationCodeConfiguration", value.asInstanceOf[js.Any])
    
    inline def setApplicationSnapshotConfiguration(value: ApplicationSnapshotConfiguration): Self = StObject.set(x, "ApplicationSnapshotConfiguration", value.asInstanceOf[js.Any])
    
    inline def setApplicationSnapshotConfigurationUndefined: Self = StObject.set(x, "ApplicationSnapshotConfiguration", js.undefined)
    
    inline def setEnvironmentProperties(value: EnvironmentProperties): Self = StObject.set(x, "EnvironmentProperties", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentPropertiesUndefined: Self = StObject.set(x, "EnvironmentProperties", js.undefined)
    
    inline def setFlinkApplicationConfiguration(value: FlinkApplicationConfiguration): Self = StObject.set(x, "FlinkApplicationConfiguration", value.asInstanceOf[js.Any])
    
    inline def setFlinkApplicationConfigurationUndefined: Self = StObject.set(x, "FlinkApplicationConfiguration", js.undefined)
    
    inline def setSqlApplicationConfiguration(value: SqlApplicationConfiguration): Self = StObject.set(x, "SqlApplicationConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSqlApplicationConfigurationUndefined: Self = StObject.set(x, "SqlApplicationConfiguration", js.undefined)
    
    inline def setVpcConfigurations(value: VpcConfigurations): Self = StObject.set(x, "VpcConfigurations", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigurationsUndefined: Self = StObject.set(x, "VpcConfigurations", js.undefined)
    
    inline def setVpcConfigurationsVarargs(value: VpcConfiguration*): Self = StObject.set(x, "VpcConfigurations", js.Array(value :_*))
  }
}
