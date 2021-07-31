package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderableReplicationInstance extends StObject {
  
  /**
    * List of Availability Zones for this replication instance.
    */
  var AvailabilityZones: js.UndefOr[AvailabilityZonesList] = js.undefined
  
  /**
    * The default amount of storage (in gigabytes) that is allocated for the replication instance.
    */
  var DefaultAllocatedStorage: js.UndefOr[Integer] = js.undefined
  
  /**
    * The version of the replication engine.
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The amount of storage (in gigabytes) that is allocated for the replication instance.
    */
  var IncludedAllocatedStorage: js.UndefOr[Integer] = js.undefined
  
  /**
    * The minimum amount of storage (in gigabytes) that can be allocated for the replication instance.
    */
  var MaxAllocatedStorage: js.UndefOr[Integer] = js.undefined
  
  /**
    * The minimum amount of storage (in gigabytes) that can be allocated for the replication instance.
    */
  var MinAllocatedStorage: js.UndefOr[Integer] = js.undefined
  
  /**
    * The value returned when the specified EngineVersion of the replication instance is in Beta or test mode. This indicates some features might not work as expected.  AWS DMS supports the ReleaseStatus parameter in versions 3.1.4 and later. 
    */
  var ReleaseStatus: js.UndefOr[ReleaseStatusValues] = js.undefined
  
  /**
    * The compute and memory capacity of the replication instance as defined for the specified replication instance class. For example to specify the instance class dms.c4.large, set this parameter to "dms.c4.large". For more information on the settings and capacities for the available replication instance classes, see  Selecting the right AWS DMS replication instance for your migration. 
    */
  var ReplicationInstanceClass: js.UndefOr[String] = js.undefined
  
  /**
    * The type of storage used by the replication instance.
    */
  var StorageType: js.UndefOr[String] = js.undefined
}
object OrderableReplicationInstance {
  
  @scala.inline
  def apply(): OrderableReplicationInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderableReplicationInstance]
  }
  
  @scala.inline
  implicit class OrderableReplicationInstanceMutableBuilder[Self <: OrderableReplicationInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityZones(value: AvailabilityZonesList): Self = StObject.set(x, "AvailabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZonesUndefined: Self = StObject.set(x, "AvailabilityZones", js.undefined)
    
    @scala.inline
    def setAvailabilityZonesVarargs(value: String*): Self = StObject.set(x, "AvailabilityZones", js.Array(value :_*))
    
    @scala.inline
    def setDefaultAllocatedStorage(value: Integer): Self = StObject.set(x, "DefaultAllocatedStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultAllocatedStorageUndefined: Self = StObject.set(x, "DefaultAllocatedStorage", js.undefined)
    
    @scala.inline
    def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    @scala.inline
    def setIncludedAllocatedStorage(value: Integer): Self = StObject.set(x, "IncludedAllocatedStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludedAllocatedStorageUndefined: Self = StObject.set(x, "IncludedAllocatedStorage", js.undefined)
    
    @scala.inline
    def setMaxAllocatedStorage(value: Integer): Self = StObject.set(x, "MaxAllocatedStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAllocatedStorageUndefined: Self = StObject.set(x, "MaxAllocatedStorage", js.undefined)
    
    @scala.inline
    def setMinAllocatedStorage(value: Integer): Self = StObject.set(x, "MinAllocatedStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinAllocatedStorageUndefined: Self = StObject.set(x, "MinAllocatedStorage", js.undefined)
    
    @scala.inline
    def setReleaseStatus(value: ReleaseStatusValues): Self = StObject.set(x, "ReleaseStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseStatusUndefined: Self = StObject.set(x, "ReleaseStatus", js.undefined)
    
    @scala.inline
    def setReplicationInstanceClass(value: String): Self = StObject.set(x, "ReplicationInstanceClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationInstanceClassUndefined: Self = StObject.set(x, "ReplicationInstanceClass", js.undefined)
    
    @scala.inline
    def setStorageType(value: String): Self = StObject.set(x, "StorageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageTypeUndefined: Self = StObject.set(x, "StorageType", js.undefined)
  }
}
