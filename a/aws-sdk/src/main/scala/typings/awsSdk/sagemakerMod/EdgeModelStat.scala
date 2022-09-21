package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EdgeModelStat extends StObject {
  
  /**
    * The number of devices that have this model version, a heart beat, and are currently running.
    */
  var ActiveDeviceCount: Long
  
  /**
    * The number of devices that have this model version and have a heart beat. 
    */
  var ConnectedDeviceCount: Long
  
  /**
    * The name of the model.
    */
  var ModelName: EntityName
  
  /**
    * The model version.
    */
  var ModelVersion: EdgeVersion
  
  /**
    * The number of devices that have this model version and do not have a heart beat.
    */
  var OfflineDeviceCount: Long
  
  /**
    * The number of devices with this model version and are producing sample data.
    */
  var SamplingDeviceCount: Long
}
object EdgeModelStat {
  
  inline def apply(
    ActiveDeviceCount: Long,
    ConnectedDeviceCount: Long,
    ModelName: EntityName,
    ModelVersion: EdgeVersion,
    OfflineDeviceCount: Long,
    SamplingDeviceCount: Long
  ): EdgeModelStat = {
    val __obj = js.Dynamic.literal(ActiveDeviceCount = ActiveDeviceCount.asInstanceOf[js.Any], ConnectedDeviceCount = ConnectedDeviceCount.asInstanceOf[js.Any], ModelName = ModelName.asInstanceOf[js.Any], ModelVersion = ModelVersion.asInstanceOf[js.Any], OfflineDeviceCount = OfflineDeviceCount.asInstanceOf[js.Any], SamplingDeviceCount = SamplingDeviceCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdgeModelStat]
  }
  
  extension [Self <: EdgeModelStat](x: Self) {
    
    inline def setActiveDeviceCount(value: Long): Self = StObject.set(x, "ActiveDeviceCount", value.asInstanceOf[js.Any])
    
    inline def setConnectedDeviceCount(value: Long): Self = StObject.set(x, "ConnectedDeviceCount", value.asInstanceOf[js.Any])
    
    inline def setModelName(value: EntityName): Self = StObject.set(x, "ModelName", value.asInstanceOf[js.Any])
    
    inline def setModelVersion(value: EdgeVersion): Self = StObject.set(x, "ModelVersion", value.asInstanceOf[js.Any])
    
    inline def setOfflineDeviceCount(value: Long): Self = StObject.set(x, "OfflineDeviceCount", value.asInstanceOf[js.Any])
    
    inline def setSamplingDeviceCount(value: Long): Self = StObject.set(x, "SamplingDeviceCount", value.asInstanceOf[js.Any])
  }
}
