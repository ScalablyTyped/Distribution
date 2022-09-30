package typings.chromeApps.chrome

import org.scalablytyped.runtime.StringDictionary
import typings.chromeApps.chromeAppsInts.`102400`
import typings.chromeApps.chromeAppsInts.`120`
import typings.chromeApps.chromeAppsInts.`1800`
import typings.chromeApps.chromeAppsInts.`512`
import typings.chromeApps.chromeAppsInts.`5242880`
import typings.chromeApps.chromeAppsInts.`8192`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion chrome.sockets.*
// #region chrome.storage
/////////////
// Storage //
/////////////
/**
  * Use the chrome.storage API to store, retrieve, and track changes to user data.
  * Permissions:  'storage'
  * @since Chrome 20.
  */
object storage {
  
  @js.native
  trait LocalStorageArea
    extends StObject
       with StorageArea {
    
    /**
      * The maximum amount (in bytes) of data that can be stored in local storage,
      * as measured by the JSON stringification of every value plus every key's length.
      * This value will be ignored if the extension has the unlimitedStorage permission.
      * Updates that would cause this limit to be exceeded fail immediately and set runtime.lastError.
      * @see Permissions: 'unlimitedStorage'
      * @default 5242880
      */
    val QUOTA_BYTES: `5242880` = js.native
  }
  
  type ManagedStorageArea = StorageAreaRead
  
  @js.native
  trait StorageArea
    extends StObject
       with StorageAreaRead
       with StorageAreaWrite
  
  @js.native
  trait StorageAreaRead extends StObject {
    
    /**
      * Gets one or more items from storage.
      * @param callback Callback with storage items, or on failure (in which case runtime.lastError will be set).
      * Parameter items: Object with items in their key-value mappings.
      */
    def get(callback: js.Function1[/* items */ StringDictionary[Any], Unit]): Unit = js.native
    /**
      * Gets one or more items from storage.
      * @param keys A single key to get, list of keys to get, or a interface specifying default values.
      * An empty list or object will return an empty result object. Pass in null to get the entire contents of storage.
      * @param callback Callback with storage items, or on failure (in which case runtime.lastError will be set).
      * Parameter items: Object with items in their key-value mappings.
      */
    def get(keys: String, callback: js.Function1[/* items */ StringDictionary[Any], Unit]): Unit = js.native
    def get(keys: js.Array[String], callback: js.Function1[/* items */ StringDictionary[Any], Unit]): Unit = js.native
    def get(keys: js.Object, callback: js.Function1[/* items */ StringDictionary[Any], Unit]): Unit = js.native
    def get(keys: Null, callback: js.Function1[/* items */ StringDictionary[Any], Unit]): Unit = js.native
    
    /**
      * Gets the amount of space (in bytes) being used by one or more items.
      * @param callback Callback with the amount of space being used by storage, or on failure (in which case runtime.lastError will be set).
      * Parameter bytesInUse: Amount of space being used in storage, in bytes.
      */
    def getBytesInUse(callback: js.Function1[/* bytesInUse */ integer, Unit]): Unit = js.native
    /**
      * Gets the amount of space (in bytes) being used by one or more items.
      * @param keys A single key or list of keys to get the total usage for. An empty list will return 0. Pass in null to get the total usage of all of storage.
      * @param callback Callback with the amount of space being used by storage, or on failure (in which case runtime.lastError will be set).
      * Parameter bytesInUse: Amount of space being used in storage, in bytes.
      */
    def getBytesInUse(keys: String, callback: js.Function1[/* bytesInUse */ integer, Unit]): Unit = js.native
    def getBytesInUse(keys: js.Array[String], callback: js.Function1[/* bytesInUse */ integer, Unit]): Unit = js.native
    def getBytesInUse(keys: Null, callback: js.Function1[/* bytesInUse */ integer, Unit]): Unit = js.native
  }
  
  @js.native
  trait StorageAreaWrite extends StObject {
    
    /**
      * Removes all items from storage.
      * @param callback Optional.
      * Callback on success, or on failure (in which case runtime.lastError will be set).
      */
    def clear(): Unit = js.native
    def clear(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Removes one or more items from storage.
      * @param A single key or a list of keys for items to remove.
      * @param callback Optional.
      * Callback on success, or on failure (in which case runtime.lastError will be set).
      */
    def remove(keys: String): Unit = js.native
    def remove(keys: String, callback: js.Function0[Unit]): Unit = js.native
    def remove(keys: js.Array[String]): Unit = js.native
    def remove(keys: js.Array[String], callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Sets multiple items.
      * @param items An object which gives each key/value pair to update storage with. Any other key/value pairs in storage will not be affected.
      * Primitive values such as numbers will serialize as expected. Values with a typeof 'object' and 'function' will typically serialize to {}, with the exception of Array (serializes as expected), Date, and Regex (serialize using their String representation).
      * @param callback Optional.
      * Callback on success, or on failure (in which case runtime.lastError will be set).
      */
    def set(items: js.Object): Unit = js.native
    def set(items: js.Object, callback: js.Function0[Unit]): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.chromeApps.chromeAppsStrings.local
    - typings.chromeApps.chromeAppsStrings.sync
    - typings.chromeApps.chromeAppsStrings.managed
  */
  trait StorageAreas extends StObject
  object StorageAreas {
    
    inline def local: typings.chromeApps.chromeAppsStrings.local = "local".asInstanceOf[typings.chromeApps.chromeAppsStrings.local]
    
    inline def managed: typings.chromeApps.chromeAppsStrings.managed = "managed".asInstanceOf[typings.chromeApps.chromeAppsStrings.managed]
    
    inline def sync: typings.chromeApps.chromeAppsStrings.sync = "sync".asInstanceOf[typings.chromeApps.chromeAppsStrings.sync]
  }
  
  trait StorageChange extends StObject {
    
    /** The new value of the item, if there is a new value. */
    var newValue: js.UndefOr[Any] = js.undefined
    
    /** The old value of the item, if there was an old value. */
    var oldValue: js.UndefOr[Any] = js.undefined
  }
  object StorageChange {
    
    inline def apply(): StorageChange = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StorageChange]
    }
    
    extension [Self <: StorageChange](x: Self) {
      
      inline def setNewValue(value: Any): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
      
      inline def setNewValueUndefined: Self = StObject.set(x, "newValue", js.undefined)
      
      inline def setOldValue(value: Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
      
      inline def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
    }
  }
  
  @js.native
  trait SyncStorageArea
    extends StObject
       with StorageArea {
    
    /**
      * The maximum number of items that can be stored in sync storage.
      * Updates that would cause this limit to be exceeded will fail immediately
      * and set runtime.lastError.
      */
    val MAX_ITEMS: `512` = js.native
    
    /**
      * @deprecated since Chrome 40.
      * The storage.sync API no longer has a sustained write operation quota.
      */
    val MAX_SUSTAINED_WRITE_OPERATIONS_PER_MINUTE: deprecated = js.native
    
    /**
      * The maximum number of set, remove, or clear operations that can be performed each hour.
      * This is 1 every 2 seconds, a lower ceiling than the short term higher writes-per-minute limit.
      * Updates that would cause this limit to be exceeded fail immediately and set runtime.lastError.
      */
    val MAX_WRITE_OPERATIONS_PER_HOUR: `1800` = js.native
    
    /**
      * The maximum number of set, remove, or clear operations that can be performed each minute.
      * This is 2 per second, providing higher throughput than writes-per-hour over a shorter period of time.
      * Updates that would cause this limit to be exceeded fail immediately and set runtime.lastError.
      * @since Chrome 40.
      */
    val MAX_WRITE_OPERATIONS_PER_MINUTE: `120` = js.native
    
    /** The maximum total amount (in bytes) of data that can be stored in
      * sync storage, as measured by the JSON stringification of every value
      * plus every key's length. Updates that would cause this limit to be
      * exceeded fail immediately and set runtime.lastError.
      */
    val QUOTA_BYTES: `102400` = js.native
    
    /**
      * The maximum size (in bytes) of each individual item in sync storage,
      * as measured by the JSON stringification of its value plus its key length.
      * Updates containing items larger than this limit will fail immediately and
      * set runtime.lastError.
      */
    val QUOTA_BYTES_PER_ITEM: `8192` = js.native
  }
}
