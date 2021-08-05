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
  
  inline def apply(): RunConfigurationUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunConfigurationUpdate]
  }
  
  extension [Self <: RunConfigurationUpdate](x: Self) {
    
    inline def setApplicationRestoreConfiguration(value: ApplicationRestoreConfiguration): Self = StObject.set(x, "ApplicationRestoreConfiguration", value.asInstanceOf[js.Any])
    
    inline def setApplicationRestoreConfigurationUndefined: Self = StObject.set(x, "ApplicationRestoreConfiguration", js.undefined)
    
    inline def setFlinkRunConfiguration(value: FlinkRunConfiguration): Self = StObject.set(x, "FlinkRunConfiguration", value.asInstanceOf[js.Any])
    
    inline def setFlinkRunConfigurationUndefined: Self = StObject.set(x, "FlinkRunConfiguration", js.undefined)
  }
}
