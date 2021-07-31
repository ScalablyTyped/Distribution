package typings.chrome.chrome.system

import typings.chrome.chrome.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// System Storage
////////////////////
/**
  * Use the chrome.system.storage API to query storage device information and be notified when a removable storage device is attached and detached.
  * Permissions:  "system.storage"
  * @since Chrome 30.
  */
object storage {
  
  trait StorageCapacityInfo extends StObject {
    
    /** The available capacity of the storage device, in bytes. */
    var availableCapacity: Double
    
    /** A copied |id| of getAvailableCapacity function parameter |id|. */
    var id: String
  }
  object StorageCapacityInfo {
    
    @scala.inline
    def apply(availableCapacity: Double, id: String): StorageCapacityInfo = {
      val __obj = js.Dynamic.literal(availableCapacity = availableCapacity.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[StorageCapacityInfo]
    }
    
    @scala.inline
    implicit class StorageCapacityInfoMutableBuilder[Self <: StorageCapacityInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvailableCapacity(value: Double): Self = StObject.set(x, "availableCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait StorageUnitInfo extends StObject {
    
    /** The total amount of the storage space, in bytes. */
    var capacity: Double
    
    /** The transient ID that uniquely identifies the storage device. This ID will be persistent within the same run of a single application. It will not be a persistent identifier between different runs of an application, or between different applications. */
    var id: String
    
    /** The name of the storage unit. */
    var name: String
    
    /**
      * The media type of the storage unit.
      * fixed: The storage has fixed media, e.g. hard disk or SSD.
      * removable: The storage is removable, e.g. USB flash drive.
      * unknown: The storage type is unknown.
      */
    var `type`: String
  }
  object StorageUnitInfo {
    
    @scala.inline
    def apply(capacity: Double, id: String, name: String, `type`: String): StorageUnitInfo = {
      val __obj = js.Dynamic.literal(capacity = capacity.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[StorageUnitInfo]
    }
    
    @scala.inline
    implicit class StorageUnitInfoMutableBuilder[Self <: StorageUnitInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCapacity(value: Double): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type SystemStorageAttachedEvent = Event[js.Function1[/* info */ StorageUnitInfo, Unit]]
  
  type SystemStorageDetachedEvent = Event[js.Function1[/* id */ String, Unit]]
}
