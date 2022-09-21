package typings.awsSdk.mgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataReplicationInfoReplicatedDisk extends StObject {
  
  /**
    * Request to query data replication backlog size in bytes.
    */
  var backloggedStorageBytes: js.UndefOr[PositiveInteger] = js.undefined
  
  /**
    * Request to query device name.
    */
  var deviceName: js.UndefOr[BoundedString] = js.undefined
  
  /**
    * Request to query amount of data replicated in bytes.
    */
  var replicatedStorageBytes: js.UndefOr[PositiveInteger] = js.undefined
  
  /**
    * Request to query amount of data rescanned in bytes.
    */
  var rescannedStorageBytes: js.UndefOr[PositiveInteger] = js.undefined
  
  /**
    * Request to query total amount of data replicated in bytes.
    */
  var totalStorageBytes: js.UndefOr[PositiveInteger] = js.undefined
}
object DataReplicationInfoReplicatedDisk {
  
  inline def apply(): DataReplicationInfoReplicatedDisk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataReplicationInfoReplicatedDisk]
  }
  
  extension [Self <: DataReplicationInfoReplicatedDisk](x: Self) {
    
    inline def setBackloggedStorageBytes(value: PositiveInteger): Self = StObject.set(x, "backloggedStorageBytes", value.asInstanceOf[js.Any])
    
    inline def setBackloggedStorageBytesUndefined: Self = StObject.set(x, "backloggedStorageBytes", js.undefined)
    
    inline def setDeviceName(value: BoundedString): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    inline def setDeviceNameUndefined: Self = StObject.set(x, "deviceName", js.undefined)
    
    inline def setReplicatedStorageBytes(value: PositiveInteger): Self = StObject.set(x, "replicatedStorageBytes", value.asInstanceOf[js.Any])
    
    inline def setReplicatedStorageBytesUndefined: Self = StObject.set(x, "replicatedStorageBytes", js.undefined)
    
    inline def setRescannedStorageBytes(value: PositiveInteger): Self = StObject.set(x, "rescannedStorageBytes", value.asInstanceOf[js.Any])
    
    inline def setRescannedStorageBytesUndefined: Self = StObject.set(x, "rescannedStorageBytes", js.undefined)
    
    inline def setTotalStorageBytes(value: PositiveInteger): Self = StObject.set(x, "totalStorageBytes", value.asInstanceOf[js.Any])
    
    inline def setTotalStorageBytesUndefined: Self = StObject.set(x, "totalStorageBytes", js.undefined)
  }
}
