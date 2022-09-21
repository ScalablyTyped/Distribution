package typings.awsSdk.drsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecoveryInstanceDataReplicationInfoReplicatedDisk extends StObject {
  
  /**
    * The size of the replication backlog in bytes.
    */
  var backloggedStorageBytes: js.UndefOr[PositiveInteger] = js.undefined
  
  /**
    * The name of the device.
    */
  var deviceName: js.UndefOr[BoundedString] = js.undefined
  
  /**
    * The amount of data replicated so far in bytes.
    */
  var replicatedStorageBytes: js.UndefOr[PositiveInteger] = js.undefined
  
  /**
    * The amount of data to be rescanned in bytes.
    */
  var rescannedStorageBytes: js.UndefOr[PositiveInteger] = js.undefined
  
  /**
    * The total amount of data to be replicated in bytes.
    */
  var totalStorageBytes: js.UndefOr[PositiveInteger] = js.undefined
}
object RecoveryInstanceDataReplicationInfoReplicatedDisk {
  
  inline def apply(): RecoveryInstanceDataReplicationInfoReplicatedDisk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecoveryInstanceDataReplicationInfoReplicatedDisk]
  }
  
  extension [Self <: RecoveryInstanceDataReplicationInfoReplicatedDisk](x: Self) {
    
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
