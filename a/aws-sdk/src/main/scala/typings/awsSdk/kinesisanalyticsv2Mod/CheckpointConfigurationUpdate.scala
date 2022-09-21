package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckpointConfigurationUpdate extends StObject {
  
  /**
    * Describes updates to the interval in milliseconds between checkpoint operations.  If CheckpointConfiguration.ConfigurationType is DEFAULT, the application will use a CheckpointInterval value of 60000, even if this value is set to another value using this API or in application code. 
    */
  var CheckpointIntervalUpdate: js.UndefOr[CheckpointInterval] = js.undefined
  
  /**
    * Describes updates to whether checkpointing is enabled for an application.  If CheckpointConfiguration.ConfigurationType is DEFAULT, the application will use a CheckpointingEnabled value of true, even if this value is set to another value using this API or in application code. 
    */
  var CheckpointingEnabledUpdate: js.UndefOr[BooleanObject] = js.undefined
  
  /**
    * Describes updates to whether the application uses the default checkpointing behavior of Kinesis Data Analytics. You must set this property to CUSTOM in order to set the CheckpointingEnabled, CheckpointInterval, or MinPauseBetweenCheckpoints parameters.   If this value is set to DEFAULT, the application will use the following values, even if they are set to other values using APIs or application code:    CheckpointingEnabled: true    CheckpointInterval: 60000    MinPauseBetweenCheckpoints: 5000   
    */
  var ConfigurationTypeUpdate: js.UndefOr[ConfigurationType] = js.undefined
  
  /**
    * Describes updates to the minimum time in milliseconds after a checkpoint operation completes that a new checkpoint operation can start.  If CheckpointConfiguration.ConfigurationType is DEFAULT, the application will use a MinPauseBetweenCheckpoints value of 5000, even if this value is set using this API or in application code. 
    */
  var MinPauseBetweenCheckpointsUpdate: js.UndefOr[MinPauseBetweenCheckpoints] = js.undefined
}
object CheckpointConfigurationUpdate {
  
  inline def apply(): CheckpointConfigurationUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckpointConfigurationUpdate]
  }
  
  extension [Self <: CheckpointConfigurationUpdate](x: Self) {
    
    inline def setCheckpointIntervalUpdate(value: CheckpointInterval): Self = StObject.set(x, "CheckpointIntervalUpdate", value.asInstanceOf[js.Any])
    
    inline def setCheckpointIntervalUpdateUndefined: Self = StObject.set(x, "CheckpointIntervalUpdate", js.undefined)
    
    inline def setCheckpointingEnabledUpdate(value: BooleanObject): Self = StObject.set(x, "CheckpointingEnabledUpdate", value.asInstanceOf[js.Any])
    
    inline def setCheckpointingEnabledUpdateUndefined: Self = StObject.set(x, "CheckpointingEnabledUpdate", js.undefined)
    
    inline def setConfigurationTypeUpdate(value: ConfigurationType): Self = StObject.set(x, "ConfigurationTypeUpdate", value.asInstanceOf[js.Any])
    
    inline def setConfigurationTypeUpdateUndefined: Self = StObject.set(x, "ConfigurationTypeUpdate", js.undefined)
    
    inline def setMinPauseBetweenCheckpointsUpdate(value: MinPauseBetweenCheckpoints): Self = StObject.set(x, "MinPauseBetweenCheckpointsUpdate", value.asInstanceOf[js.Any])
    
    inline def setMinPauseBetweenCheckpointsUpdateUndefined: Self = StObject.set(x, "MinPauseBetweenCheckpointsUpdate", js.undefined)
  }
}
