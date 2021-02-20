package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationConfigurationUpdate extends StObject {
  
  /**
    * Describes updates to a Flink-based Kinesis Data Analytics application's code configuration.
    */
  var ApplicationCodeConfigurationUpdate: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ApplicationCodeConfigurationUpdate] = js.native
  
  /**
    * Describes whether snapshots are enabled for a Flink-based Kinesis Data Analytics application.
    */
  var ApplicationSnapshotConfigurationUpdate: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ApplicationSnapshotConfigurationUpdate] = js.native
  
  /**
    * Describes updates to the environment properties for a Flink-based Kinesis Data Analytics application.
    */
  var EnvironmentPropertyUpdates: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.EnvironmentPropertyUpdates] = js.native
  
  /**
    * Describes updates to a Flink-based Kinesis Data Analytics application's configuration.
    */
  var FlinkApplicationConfigurationUpdate: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.FlinkApplicationConfigurationUpdate] = js.native
  
  /**
    * Describes updates to a SQL-based Kinesis Data Analytics application's configuration.
    */
  var SqlApplicationConfigurationUpdate: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.SqlApplicationConfigurationUpdate] = js.native
  
  /**
    * Updates to the array of descriptions of VPC configurations available to the application.
    */
  var VpcConfigurationUpdates: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.VpcConfigurationUpdates] = js.native
}
object ApplicationConfigurationUpdate {
  
  @scala.inline
  def apply(): ApplicationConfigurationUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationConfigurationUpdate]
  }
  
  @scala.inline
  implicit class ApplicationConfigurationUpdateMutableBuilder[Self <: ApplicationConfigurationUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationCodeConfigurationUpdate(value: ApplicationCodeConfigurationUpdate): Self = StObject.set(x, "ApplicationCodeConfigurationUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationCodeConfigurationUpdateUndefined: Self = StObject.set(x, "ApplicationCodeConfigurationUpdate", js.undefined)
    
    @scala.inline
    def setApplicationSnapshotConfigurationUpdate(value: ApplicationSnapshotConfigurationUpdate): Self = StObject.set(x, "ApplicationSnapshotConfigurationUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationSnapshotConfigurationUpdateUndefined: Self = StObject.set(x, "ApplicationSnapshotConfigurationUpdate", js.undefined)
    
    @scala.inline
    def setEnvironmentPropertyUpdates(value: EnvironmentPropertyUpdates): Self = StObject.set(x, "EnvironmentPropertyUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentPropertyUpdatesUndefined: Self = StObject.set(x, "EnvironmentPropertyUpdates", js.undefined)
    
    @scala.inline
    def setFlinkApplicationConfigurationUpdate(value: FlinkApplicationConfigurationUpdate): Self = StObject.set(x, "FlinkApplicationConfigurationUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlinkApplicationConfigurationUpdateUndefined: Self = StObject.set(x, "FlinkApplicationConfigurationUpdate", js.undefined)
    
    @scala.inline
    def setSqlApplicationConfigurationUpdate(value: SqlApplicationConfigurationUpdate): Self = StObject.set(x, "SqlApplicationConfigurationUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqlApplicationConfigurationUpdateUndefined: Self = StObject.set(x, "SqlApplicationConfigurationUpdate", js.undefined)
    
    @scala.inline
    def setVpcConfigurationUpdates(value: VpcConfigurationUpdates): Self = StObject.set(x, "VpcConfigurationUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcConfigurationUpdatesUndefined: Self = StObject.set(x, "VpcConfigurationUpdates", js.undefined)
    
    @scala.inline
    def setVpcConfigurationUpdatesVarargs(value: VpcConfigurationUpdate*): Self = StObject.set(x, "VpcConfigurationUpdates", js.Array(value :_*))
  }
}
