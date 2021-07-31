package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunConfigurationUpdate extends StObject {
  
  /**
    * Describes updates to the restore behavior of a restarting application.
    */
  var ApplicationRestoreConfiguration: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ApplicationRestoreConfiguration] = js.undefined
  
  /**
    * Describes the starting parameters for a Flink-based Kinesis Data Analytics application.
    */
  var FlinkRunConfiguration: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.FlinkRunConfiguration] = js.undefined
}
object RunConfigurationUpdate {
  
  @scala.inline
  def apply(): RunConfigurationUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunConfigurationUpdate]
  }
  
  @scala.inline
  implicit class RunConfigurationUpdateMutableBuilder[Self <: RunConfigurationUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationRestoreConfiguration(value: ApplicationRestoreConfiguration): Self = StObject.set(x, "ApplicationRestoreConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationRestoreConfigurationUndefined: Self = StObject.set(x, "ApplicationRestoreConfiguration", js.undefined)
    
    @scala.inline
    def setFlinkRunConfiguration(value: FlinkRunConfiguration): Self = StObject.set(x, "FlinkRunConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlinkRunConfigurationUndefined: Self = StObject.set(x, "FlinkRunConfiguration", js.undefined)
  }
}
