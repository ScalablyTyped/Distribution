package typings.chromeApps.chrome.system

import typings.chromeApps.anon.FIXED
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chrome.integer
import typings.chromeApps.chromeAppsStrings.REMOVABLE
import typings.chromeApps.chromeAppsStrings.UNKNOWN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// System Storage //
////////////////////
/**
  * Use the chrome.system.storage API to query storage device information and be notified when a removable storage device is attached and detached.
  * @requires Permissions: 'system.storage'
  * @since Chrome 30.
  */
object storage {
  
  trait StorageCapacityInfo extends StObject {
    
    /** The available capacity of the storage device, in bytes. */
    var availableCapacity: integer
    
    /** A copied **id** of getAvailableCapacity function parameter **id**. */
    var id: String
  }
  object StorageCapacityInfo {
    
    inline def apply(availableCapacity: integer, id: String): StorageCapacityInfo = {
      val __obj = js.Dynamic.literal(availableCapacity = availableCapacity.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[StorageCapacityInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StorageCapacityInfo] (val x: Self) extends AnyVal {
      
      inline def setAvailableCapacity(value: integer): Self = StObject.set(x, "availableCapacity", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait StorageUnitInfo extends StObject {
    
    /** The total amount of the storage space, in bytes. */
    var capacity: integer
    
    /**
      * The transient ID that uniquely identifies the storage device.
      * This ID will be persistent within the same run of a single application.
      * It will not be a persistent identifier between different runs of an application, or between different applications.
      */
    var id: String
    
    /** The name of the storage unit. */
    var name: String
    
    /**
      * The media type of the storage unit.
      * fixed: The storage has fixed media, e.g. hard disk or SSD.
      * removable: The storage is removable, e.g. USB flash drive.
      * unknown: The storage type is unknown.
      * @see enum StorageUnitType
      */
    var `type`: ToStringLiteral[
        FIXED, 
        /* keyof chrome-apps.anon.FIXED */ typings.chromeApps.chromeAppsStrings.FIXED | REMOVABLE | UNKNOWN, 
        /* import warning: importer.ImportType#apply Failed type conversion: keyof {  FIXED :'fixed',   REMOVABLE :'removable',   UNKNOWN :'unknown'} extends keyof {  FIXED :'fixed',   REMOVABLE :'removable',   UNKNOWN :'unknown'} ? std.Exclude<keyof {  FIXED :'fixed',   REMOVABLE :'removable',   UNKNOWN :'unknown'}, 'fixed' | 'removable' | 'unknown'> : never */ js.Any
      ]
  }
  object StorageUnitInfo {
    
    inline def apply(
      capacity: integer,
      id: String,
      name: String,
      `type`: ToStringLiteral[
          FIXED, 
          /* keyof chrome-apps.anon.FIXED */ typings.chromeApps.chromeAppsStrings.FIXED | REMOVABLE | UNKNOWN, 
          /* import warning: importer.ImportType#apply Failed type conversion: keyof {  FIXED :'fixed',   REMOVABLE :'removable',   UNKNOWN :'unknown'} extends keyof {  FIXED :'fixed',   REMOVABLE :'removable',   UNKNOWN :'unknown'} ? std.Exclude<keyof {  FIXED :'fixed',   REMOVABLE :'removable',   UNKNOWN :'unknown'}, 'fixed' | 'removable' | 'unknown'> : never */ js.Any
        ]
    ): StorageUnitInfo = {
      val __obj = js.Dynamic.literal(capacity = capacity.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[StorageUnitInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StorageUnitInfo] (val x: Self) extends AnyVal {
      
      inline def setCapacity(value: integer): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(
        value: ToStringLiteral[
              FIXED, 
              /* keyof chrome-apps.anon.FIXED */ typings.chromeApps.chromeAppsStrings.FIXED | REMOVABLE | UNKNOWN, 
              /* import warning: importer.ImportType#apply Failed type conversion: keyof {  FIXED :'fixed',   REMOVABLE :'removable',   UNKNOWN :'unknown'} extends keyof {  FIXED :'fixed',   REMOVABLE :'removable',   UNKNOWN :'unknown'} ? std.Exclude<keyof {  FIXED :'fixed',   REMOVABLE :'removable',   UNKNOWN :'unknown'}, 'fixed' | 'removable' | 'unknown'> : never */ js.Any
            ]
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
