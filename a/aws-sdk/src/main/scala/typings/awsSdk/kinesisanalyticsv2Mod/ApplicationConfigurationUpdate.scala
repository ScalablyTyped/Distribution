package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationConfigurationUpdate extends StObject {
  
  /**
    * Describes updates to a Flink-based Kinesis Data Analytics application's code configuration.
    */
  var ApplicationCodeConfigurationUpdate: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ApplicationCodeConfigurationUpdate] = js.undefined
  
  /**
    * Describes whether snapshots are enabled for a Flink-based Kinesis Data Analytics application.
    */
  var ApplicationSnapshotConfigurationUpdate: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ApplicationSnapshotConfigurationUpdate] = js.undefined
  
  /**
    * Describes updates to the environment properties for a Flink-based Kinesis Data Analytics application.
    */
  var EnvironmentPropertyUpdates: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.EnvironmentPropertyUpdates] = js.undefined
  
  /**
    * Describes updates to a Flink-based Kinesis Data Analytics application's configuration.
    */
  var FlinkApplicationConfigurationUpdate: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.FlinkApplicationConfigurationUpdate] = js.undefined
  
  /**
    * Describes updates to a SQL-based Kinesis Data Analytics application's configuration.
    */
  var SqlApplicationConfigurationUpdate: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.SqlApplicationConfigurationUpdate] = js.undefined
  
  /**
    * Updates to the array of descriptions of VPC configurations available to the application.
    */
  var VpcConfigurationUpdates: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.VpcConfigurationUpdates] = js.undefined
}
object ApplicationConfigurationUpdate {
  
  inline def apply(): ApplicationConfigurationUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationConfigurationUpdate]
  }
  
  extension [Self <: ApplicationConfigurationUpdate](x: Self) {
    
    inline def setApplicationCodeConfigurationUpdate(value: ApplicationCodeConfigurationUpdate): Self = StObject.set(x, "ApplicationCodeConfigurationUpdate", value.asInstanceOf[js.Any])
    
    inline def setApplicationCodeConfigurationUpdateUndefined: Self = StObject.set(x, "ApplicationCodeConfigurationUpdate", js.undefined)
    
    inline def setApplicationSnapshotConfigurationUpdate(value: ApplicationSnapshotConfigurationUpdate): Self = StObject.set(x, "ApplicationSnapshotConfigurationUpdate", value.asInstanceOf[js.Any])
    
    inline def setApplicationSnapshotConfigurationUpdateUndefined: Self = StObject.set(x, "ApplicationSnapshotConfigurationUpdate", js.undefined)
    
    inline def setEnvironmentPropertyUpdates(value: EnvironmentPropertyUpdates): Self = StObject.set(x, "EnvironmentPropertyUpdates", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentPropertyUpdatesUndefined: Self = StObject.set(x, "EnvironmentPropertyUpdates", js.undefined)
    
    inline def setFlinkApplicationConfigurationUpdate(value: FlinkApplicationConfigurationUpdate): Self = StObject.set(x, "FlinkApplicationConfigurationUpdate", value.asInstanceOf[js.Any])
    
    inline def setFlinkApplicationConfigurationUpdateUndefined: Self = StObject.set(x, "FlinkApplicationConfigurationUpdate", js.undefined)
    
    inline def setSqlApplicationConfigurationUpdate(value: SqlApplicationConfigurationUpdate): Self = StObject.set(x, "SqlApplicationConfigurationUpdate", value.asInstanceOf[js.Any])
    
    inline def setSqlApplicationConfigurationUpdateUndefined: Self = StObject.set(x, "SqlApplicationConfigurationUpdate", js.undefined)
    
    inline def setVpcConfigurationUpdates(value: VpcConfigurationUpdates): Self = StObject.set(x, "VpcConfigurationUpdates", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigurationUpdatesUndefined: Self = StObject.set(x, "VpcConfigurationUpdates", js.undefined)
    
    inline def setVpcConfigurationUpdatesVarargs(value: VpcConfigurationUpdate*): Self = StObject.set(x, "VpcConfigurationUpdates", js.Array(value :_*))
  }
}
