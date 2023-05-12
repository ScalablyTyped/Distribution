package typings.chrome.chrome

import org.scalablytyped.runtime.StringDictionary
import typings.chrome.chrome.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Storage
////////////////////
/**
  * Use the chrome.storage API to store, retrieve, and track changes to user data.
  * Permissions:  "storage"
  * @since Chrome 20.
  */
object storage {
  
  /* keyof chrome.anon.TRUSTEDANDUNTRUSTEDCONTEXTS */ /* Rewritten from type alias, can be one of: 
    - typings.chrome.chromeStrings.TRUSTED_AND_UNTRUSTED_CONTEXTS
    - typings.chrome.chromeStrings.TRUSTED_CONTEXTS
  */
  trait AccessLevel extends StObject
  
  /* Inlined keyof std.Pick<{  AccessLevel :{  TRUSTED_AND_UNTRUSTED_CONTEXTS :'TRUSTED_AND_UNTRUSTED_CONTEXTS',   TRUSTED_CONTEXTS :'TRUSTED_CONTEXTS'},   local :chrome.chrome.storage.LocalStorageArea,   sync :chrome.chrome.storage.SyncStorageArea,   managed :chrome.chrome.storage.StorageArea,   session :chrome.chrome.storage.SessionStorageArea,   onChanged :chrome.chrome.storage.StorageChangedEvent}, 'sync' | 'local' | 'managed' | 'session'> */
  /* Rewritten from type alias, can be one of: 
    - typings.chrome.chromeStrings.sync
    - typings.chrome.chromeStrings.local
    - typings.chrome.chromeStrings.managed
    - typings.chrome.chromeStrings.session
  */
  trait AreaName extends StObject
  object AreaName {
    
    inline def local: typings.chrome.chromeStrings.local = "local".asInstanceOf[typings.chrome.chromeStrings.local]
    
    inline def managed: typings.chrome.chromeStrings.managed = "managed".asInstanceOf[typings.chrome.chromeStrings.managed]
    
    inline def session: typings.chrome.chromeStrings.session = "session".asInstanceOf[typings.chrome.chromeStrings.session]
    
    inline def sync: typings.chrome.chromeStrings.sync = "sync".asInstanceOf[typings.chrome.chromeStrings.sync]
  }
  
  @js.native
  trait LocalStorageArea
    extends StObject
       with StorageArea {
    
    /** The maximum amount (in bytes) of data that can be stored in local storage, as measured by the JSON stringification of every value plus every key's length. This value will be ignored if the extension has the unlimitedStorage permission. Updates that would cause this limit to be exceeded fail immediately and set runtime.lastError. */
    var QUOTA_BYTES: Double = js.native
  }
  
  @js.native
  trait SessionStorageArea
    extends StObject
       with StorageArea {
    
    /** The maximum amount (in bytes) of data that can be stored in memory, as measured by estimating the dynamically allocated memory usage of every value and key. Updates that would cause this limit to be exceeded fail immediately and set runtime.lastError. */
    var QUOTA_BYTES: Double = js.native
  }
  
  @js.native
  trait StorageArea extends StObject {
    
    /**
      * Removes all items from storage.
      * @return A void Promise
      * @since MV3
      */
    def clear(): js.Promise[Unit] = js.native
    /**
      * Removes all items from storage.
      * @param callback Optional.
      * Callback on success, or on failure (in which case runtime.lastError will be set).
      */
    def clear(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Gets one or more items from storage.
      * @param keys A single key to get, list of keys to get, or a dictionary specifying default values.
      * An empty list or object will return an empty result object. Pass in null to get the entire contents of storage.
      * @return A Promise that resolves with an object containing items
      * @since MV3
      */
    def get(): js.Promise[StringDictionary[Any]] = js.native
    /**
      * Gets the entire contents of storage.
      * @param callback Callback with storage items, or on failure (in which case runtime.lastError will be set).
      * Parameter items: Object with items in their key-value mappings.
      */
    def get(callback: js.Function1[/* items */ StringDictionary[Any], Unit]): Unit = js.native
    def get(keys: String): js.Promise[StringDictionary[Any]] = js.native
    /**
      * Gets one or more items from storage.
      * @param keys A single key to get, list of keys to get, or a dictionary specifying default values.
      * An empty list or object will return an empty result object. Pass in null to get the entire contents of storage.
      * @param callback Callback with storage items, or on failure (in which case runtime.lastError will be set).
      * Parameter items: Object with items in their key-value mappings.
      */
    def get(keys: String, callback: js.Function1[/* items */ StringDictionary[Any], Unit]): Unit = js.native
    def get(keys: js.Array[String]): js.Promise[StringDictionary[Any]] = js.native
    def get(keys: js.Array[String], callback: js.Function1[/* items */ StringDictionary[Any], Unit]): Unit = js.native
    def get(keys: StringDictionary[Any]): js.Promise[StringDictionary[Any]] = js.native
    def get(keys: StringDictionary[Any], callback: js.Function1[/* items */ StringDictionary[Any], Unit]): Unit = js.native
    def get(keys: Null, callback: js.Function1[/* items */ StringDictionary[Any], Unit]): Unit = js.native
    
    /**
      * Gets the amount of space (in bytes) being used by one or more items.
      * @param keys Optional. A single key or list of keys to get the total usage for. An empty list will return 0. Pass in null to get the total usage of all of storage.
      * @return A Promise that resolves with a number
      * @since MV3
      */
    def getBytesInUse(): js.Promise[Double] = js.native
    /**
      * Gets the amount of space (in bytes) being used by one or more items.
      * @param callback Callback with the amount of space being used by storage, or on failure (in which case runtime.lastError will be set).
      * Parameter bytesInUse: Amount of space being used in storage, in bytes.
      */
    def getBytesInUse(callback: js.Function1[/* bytesInUse */ Double, Unit]): Unit = js.native
    def getBytesInUse(keys: String): js.Promise[Double] = js.native
    /**
      * Gets the amount of space (in bytes) being used by one or more items.
      * @param keys Optional. A single key or list of keys to get the total usage for. An empty list will return 0. Pass in null to get the total usage of all of storage.
      * @param callback Callback with the amount of space being used by storage, or on failure (in which case runtime.lastError will be set).
      * Parameter bytesInUse: Amount of space being used in storage, in bytes.
      */
    def getBytesInUse(keys: String, callback: js.Function1[/* bytesInUse */ Double, Unit]): Unit = js.native
    def getBytesInUse(keys: js.Array[String]): js.Promise[Double] = js.native
    def getBytesInUse(keys: js.Array[String], callback: js.Function1[/* bytesInUse */ Double, Unit]): Unit = js.native
    def getBytesInUse(keys: Null, callback: js.Function1[/* bytesInUse */ Double, Unit]): Unit = js.native
    
    /**
      * Fired when one or more items change within this storage area.
      * @param keys A single key to get, list of keys to get, or a dictionary specifying default values.
      * An empty list or object will return an empty result object. Pass in null to get the entire contents of storage.
      * @param callback Callback with storage items, or on failure (in which case runtime.lastError will be set).
      * Parameter items: Object with items in their key-value mappings.
      */
    var onChanged: StorageAreaChangedEvent = js.native
    
    /**
      * Removes one or more items from storage.
      * @param keys A single key or a list of keys for items to remove.
      * @param callback Optional.
      * @return A void Promise
      * @since MV3
      */
    def remove(keys: String): js.Promise[Unit] = js.native
    /**
      * Removes one or more items from storage.
      * @param keys A single key or a list of keys for items to remove.
      * @param callback Optional.
      * Callback on success, or on failure (in which case runtime.lastError will be set).
      */
    def remove(keys: String, callback: js.Function0[Unit]): Unit = js.native
    def remove(keys: js.Array[String]): js.Promise[Unit] = js.native
    def remove(keys: js.Array[String], callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Sets multiple items.
      * @param items An object which gives each key/value pair to update storage with. Any other key/value pairs in storage will not be affected.
      * Primitive values such as numbers will serialize as expected. Values with a typeof "object" and "function" will typically serialize to {}, with the exception of Array (serializes as expected), Date, and Regex (serialize using their String representation).
      * @return A void Promise
      * @since MV3
      */
    def set(items: StringDictionary[Any]): js.Promise[Unit] = js.native
    /**
      * Sets multiple items.
      * @param items An object which gives each key/value pair to update storage with. Any other key/value pairs in storage will not be affected.
      * Primitive values such as numbers will serialize as expected. Values with a typeof "object" and "function" will typically serialize to {}, with the exception of Array (serializes as expected), Date, and Regex (serialize using their String representation).
      * @param callback Optional.
      * Callback on success, or on failure (in which case runtime.lastError will be set).
      */
    def set(items: StringDictionary[Any], callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Sets the desired access level for the storage area. The default will be only trusted contexts.
      * @param accessOptions An object containing an accessLevel key which contains the access level of the storage area.
      * @return A void Promise.
      * @since Chrome 102
      */
    def setAccessLevel(accessOptions: typings.chrome.anon.AccessLevel): js.Promise[Unit] = js.native
    /**
      * Sets the desired access level for the storage area. The default will be only trusted contexts.
      * @param accessOptions An object containing an accessLevel key which contains the access level of the storage area.
      * @param callback Optional.
      * @since Chrome 102
      */
    def setAccessLevel(accessOptions: typings.chrome.anon.AccessLevel, callback: js.Function0[Unit]): Unit = js.native
  }
  
  type StorageAreaChangedEvent = Event[js.Function1[/* changes */ StringDictionary[StorageChange], Unit]]
  
  trait StorageChange extends StObject {
    
    /** Optional. The new value of the item, if there is a new value. */
    var newValue: js.UndefOr[Any] = js.undefined
    
    /** Optional. The old value of the item, if there was an old value. */
    var oldValue: js.UndefOr[Any] = js.undefined
  }
  object StorageChange {
    
    inline def apply(): StorageChange = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StorageChange]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StorageChange] (val x: Self) extends AnyVal {
      
      inline def setNewValue(value: Any): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
      
      inline def setNewValueUndefined: Self = StObject.set(x, "newValue", js.undefined)
      
      inline def setOldValue(value: Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
      
      inline def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
    }
  }
  
  type StorageChangedEvent = Event[
    js.Function2[/* changes */ StringDictionary[StorageChange], /* areaName */ AreaName, Unit]
  ]
  
  @js.native
  trait SyncStorageArea
    extends StObject
       with StorageArea {
    
    /** The maximum number of items that can be stored in sync storage. Updates that would cause this limit to be exceeded will fail immediately and set runtime.lastError. */
    var MAX_ITEMS: Double = js.native
    
    /** @deprecated since Chrome 40. The storage.sync API no longer has a sustained write operation quota. */
    var MAX_SUSTAINED_WRITE_OPERATIONS_PER_MINUTE: Double = js.native
    
    /**
      * The maximum number of set, remove, or clear operations that can be performed each hour. This is 1 every 2 seconds, a lower ceiling than the short term higher writes-per-minute limit.
      * Updates that would cause this limit to be exceeded fail immediately and set runtime.lastError.
      */
    var MAX_WRITE_OPERATIONS_PER_HOUR: Double = js.native
    
    /**
      * The maximum number of set, remove, or clear operations that can be performed each minute. This is 2 per second, providing higher throughput than writes-per-hour over a shorter period of time.
      * Updates that would cause this limit to be exceeded fail immediately and set runtime.lastError.
      * @since Chrome 40.
      */
    var MAX_WRITE_OPERATIONS_PER_MINUTE: Double = js.native
    
    /** The maximum total amount (in bytes) of data that can be stored in sync storage, as measured by the JSON stringification of every value plus every key's length. Updates that would cause this limit to be exceeded fail immediately and set runtime.lastError. */
    var QUOTA_BYTES: Double = js.native
    
    /** The maximum size (in bytes) of each individual item in sync storage, as measured by the JSON stringification of its value plus its key length. Updates containing items larger than this limit will fail immediately and set runtime.lastError. */
    var QUOTA_BYTES_PER_ITEM: Double = js.native
  }
}
