package typings.cachefactory

import org.scalablytyped.runtime.StringDictionary
import typings.std.PromiseConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cachefactory", "BinaryHeap")
  @js.native
  class BinaryHeap () extends StObject {
    def this(weightFunc: js.Function) = this()
    def this(weightFunc: js.Function, compareFunc: js.Function) = this()
    def this(weightFunc: Unit, compareFunc: js.Function) = this()
    
    def peek(): js.Any = js.native
    
    def pop(): js.Any = js.native
    
    def push(node: js.Any): Unit = js.native
    
    def remove(node: js.Any): Unit = js.native
    
    def removeAll(): Unit = js.native
    
    def size(): Double = js.native
  }
  
  @JSImport("cachefactory", "Cache")
  @js.native
  class Cache () extends StObject {
    
    def destroy(): Unit = js.native
    
    def disable(): Unit = js.native
    
    def enable(): Unit = js.native
    
    def get(key: String): js.Any = js.native
    def get(key: String, options: GetPutOptions): js.Any = js.native
    def get(key: Double): js.Any = js.native
    def get(key: Double, options: GetPutOptions): js.Any = js.native
    
    var id: String = js.native
    
    def info(key: String): CacheInfo | ItemInfo = js.native
    def info(key: Double): CacheInfo | ItemInfo = js.native
    
    def keySet(): StringDictionary[String | Double] = js.native
    
    def keys(): js.Array[String | Double] = js.native
    
    def put(key: String, value: js.Any): js.Any = js.native
    def put(key: String, value: js.Any, options: GetPutOptions): js.Any = js.native
    def put(key: Double, value: js.Any): js.Any = js.native
    def put(key: Double, value: js.Any, options: GetPutOptions): js.Any = js.native
    
    def remove(key: String): js.Any = js.native
    def remove(key: Double): js.Any = js.native
    
    def removeAll(): Unit = js.native
    
    def removeExpired(): StringDictionary[js.Any] = js.native
    
    def setCacheFlushInterval(cacheFlushInterval: Double): Unit = js.native
    
    def setCapacity(capacity: Double): Unit = js.native
    
    def setDeleteOnExpire(deleteOnExpire: DeleteOnExpire): Unit = js.native
    def setDeleteOnExpire(deleteOnExpire: DeleteOnExpire, setRecycleFreq: Boolean): Unit = js.native
    
    def setMaxAge(maxAge: Double): Unit = js.native
    
    def setOnExpire(onExpire: js.Function): js.Any = js.native
    
    def setOptions(cacheOptions: CacheOptions): Unit = js.native
    def setOptions(cacheOptions: CacheOptions, strict: Boolean): Unit = js.native
    
    def setRecycleFreq(recycleFreq: Boolean): Unit = js.native
    
    def setStorageMode(storageMode: StorageMode): Unit = js.native
    def setStorageMode(storageMode: StorageMode, storageImpl: StorageImpl): Unit = js.native
    
    def touch(key: String): Unit = js.native
    def touch(key: Double): Unit = js.native
    
    def values(): js.Array[js.Any] = js.native
  }
  
  @JSImport("cachefactory", "CacheFactory")
  @js.native
  class CacheFactory () extends StObject {
    
    def clearAll(): Unit = js.native
    
    def createCache(id: String): Cache = js.native
    def createCache(id: String, options: CacheOptions): Cache = js.native
    
    def destroy(id: String): Unit = js.native
    
    def destroyAll(): Unit = js.native
    
    def disableAll(): Unit = js.native
    
    def enabledAll(): Unit = js.native
    
    def exists(id: String): Boolean = js.native
    
    def get(id: String): Cache = js.native
    
    def info(): CacheFactoryInfo = js.native
    
    def keySet(): StringDictionary[String] = js.native
    
    def keys(): js.Array[String] = js.native
    
    def removeExpiredFromAll(): StringDictionary[StringDictionary[js.Any]] = js.native
    
    def touchAll(): Unit = js.native
  }
  
  @JSImport("cachefactory", "defaults")
  @js.native
  val defaults: CacheOptions = js.native
  
  @JSImport("cachefactory", "utils")
  @js.native
  val utils: Utils_ = js.native
  
  trait CacheFactoryInfo
    extends StObject
       with CacheOptions {
    
    var caches: StringDictionary[CacheInfo]
    
    var size: Double
  }
  object CacheFactoryInfo {
    
    inline def apply(caches: StringDictionary[CacheInfo], size: Double): CacheFactoryInfo = {
      val __obj = js.Dynamic.literal(caches = caches.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[CacheFactoryInfo]
    }
    
    extension [Self <: CacheFactoryInfo](x: Self) {
      
      inline def setCaches(value: StringDictionary[CacheInfo]): Self = StObject.set(x, "caches", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  trait CacheInfo
    extends StObject
       with CacheOptions {
    
    var id: String
    
    var size: Double
  }
  object CacheInfo {
    
    inline def apply(id: String, size: Double): CacheInfo = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[CacheInfo]
    }
    
    extension [Self <: CacheInfo](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  trait CacheOptions extends StObject {
    
    var cacheFlushInterval: js.UndefOr[Double] = js.undefined
    
    var capacity: js.UndefOr[Double] = js.undefined
    
    var deleteOnExpire: js.UndefOr[DeleteOnExpire] = js.undefined
    
    var enable: js.UndefOr[Boolean] = js.undefined
    
    var maxAge: js.UndefOr[Double] = js.undefined
    
    var onExpire: js.UndefOr[OnExpireCallback] = js.undefined
    
    var recycleFreq: js.UndefOr[Double] = js.undefined
    
    var storageImpl: js.UndefOr[StorageImpl] = js.undefined
    
    var storageMode: js.UndefOr[StorageMode] = js.undefined
    
    var storagePrefix: js.UndefOr[String] = js.undefined
    
    var storeOnReject: js.UndefOr[Boolean] = js.undefined
    
    var storeOnResolve: js.UndefOr[Boolean] = js.undefined
  }
  object CacheOptions {
    
    inline def apply(): CacheOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CacheOptions]
    }
    
    extension [Self <: CacheOptions](x: Self) {
      
      inline def setCacheFlushInterval(value: Double): Self = StObject.set(x, "cacheFlushInterval", value.asInstanceOf[js.Any])
      
      inline def setCacheFlushIntervalUndefined: Self = StObject.set(x, "cacheFlushInterval", js.undefined)
      
      inline def setCapacity(value: Double): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
      
      inline def setCapacityUndefined: Self = StObject.set(x, "capacity", js.undefined)
      
      inline def setDeleteOnExpire(value: DeleteOnExpire): Self = StObject.set(x, "deleteOnExpire", value.asInstanceOf[js.Any])
      
      inline def setDeleteOnExpireUndefined: Self = StObject.set(x, "deleteOnExpire", js.undefined)
      
      inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setOnExpire(value: (/* key */ String, /* value */ js.Any, /* done */ js.UndefOr[js.Function]) => Unit): Self = StObject.set(x, "onExpire", js.Any.fromFunction3(value))
      
      inline def setOnExpireUndefined: Self = StObject.set(x, "onExpire", js.undefined)
      
      inline def setRecycleFreq(value: Double): Self = StObject.set(x, "recycleFreq", value.asInstanceOf[js.Any])
      
      inline def setRecycleFreqUndefined: Self = StObject.set(x, "recycleFreq", js.undefined)
      
      inline def setStorageImpl(value: StorageImpl): Self = StObject.set(x, "storageImpl", value.asInstanceOf[js.Any])
      
      inline def setStorageImplUndefined: Self = StObject.set(x, "storageImpl", js.undefined)
      
      inline def setStorageMode(value: StorageMode): Self = StObject.set(x, "storageMode", value.asInstanceOf[js.Any])
      
      inline def setStorageModeUndefined: Self = StObject.set(x, "storageMode", js.undefined)
      
      inline def setStoragePrefix(value: String): Self = StObject.set(x, "storagePrefix", value.asInstanceOf[js.Any])
      
      inline def setStoragePrefixUndefined: Self = StObject.set(x, "storagePrefix", js.undefined)
      
      inline def setStoreOnReject(value: Boolean): Self = StObject.set(x, "storeOnReject", value.asInstanceOf[js.Any])
      
      inline def setStoreOnRejectUndefined: Self = StObject.set(x, "storeOnReject", js.undefined)
      
      inline def setStoreOnResolve(value: Boolean): Self = StObject.set(x, "storeOnResolve", value.asInstanceOf[js.Any])
      
      inline def setStoreOnResolveUndefined: Self = StObject.set(x, "storeOnResolve", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.cachefactory.cachefactoryStrings.none
    - typings.cachefactory.cachefactoryStrings.passive
    - typings.cachefactory.cachefactoryStrings.aggressive
  */
  trait DeleteOnExpire extends StObject
  object DeleteOnExpire {
    
    inline def aggressive: typings.cachefactory.cachefactoryStrings.aggressive = "aggressive".asInstanceOf[typings.cachefactory.cachefactoryStrings.aggressive]
    
    inline def none: typings.cachefactory.cachefactoryStrings.none = "none".asInstanceOf[typings.cachefactory.cachefactoryStrings.none]
    
    inline def passive: typings.cachefactory.cachefactoryStrings.passive = "passive".asInstanceOf[typings.cachefactory.cachefactoryStrings.passive]
  }
  
  trait GetPutOptions
    extends StObject
       with ItemInfo {
    
    var maxAge: js.UndefOr[Double] = js.undefined
    
    var onExpire: js.UndefOr[OnExpireCallback] = js.undefined
    
    var storeOnReject: js.UndefOr[Boolean] = js.undefined
    
    var storeOnResolve: js.UndefOr[Boolean] = js.undefined
  }
  object GetPutOptions {
    
    inline def apply(): GetPutOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetPutOptions]
    }
    
    extension [Self <: GetPutOptions](x: Self) {
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setOnExpire(value: (/* key */ String, /* value */ js.Any, /* done */ js.UndefOr[js.Function]) => Unit): Self = StObject.set(x, "onExpire", js.Any.fromFunction3(value))
      
      inline def setOnExpireUndefined: Self = StObject.set(x, "onExpire", js.undefined)
      
      inline def setStoreOnReject(value: Boolean): Self = StObject.set(x, "storeOnReject", value.asInstanceOf[js.Any])
      
      inline def setStoreOnRejectUndefined: Self = StObject.set(x, "storeOnReject", js.undefined)
      
      inline def setStoreOnResolve(value: Boolean): Self = StObject.set(x, "storeOnResolve", value.asInstanceOf[js.Any])
      
      inline def setStoreOnResolveUndefined: Self = StObject.set(x, "storeOnResolve", js.undefined)
    }
  }
  
  trait ItemInfo extends StObject {
    
    var accessed: js.UndefOr[Double] = js.undefined
    
    var created: js.UndefOr[Double] = js.undefined
    
    var expires: js.UndefOr[Double] = js.undefined
    
    var isExpired: js.UndefOr[Boolean] = js.undefined
  }
  object ItemInfo {
    
    inline def apply(): ItemInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemInfo]
    }
    
    extension [Self <: ItemInfo](x: Self) {
      
      inline def setAccessed(value: Double): Self = StObject.set(x, "accessed", value.asInstanceOf[js.Any])
      
      inline def setAccessedUndefined: Self = StObject.set(x, "accessed", js.undefined)
      
      inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
      
      inline def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      inline def setIsExpired(value: Boolean): Self = StObject.set(x, "isExpired", value.asInstanceOf[js.Any])
      
      inline def setIsExpiredUndefined: Self = StObject.set(x, "isExpired", js.undefined)
    }
  }
  
  type OnExpireCallback = js.Function3[/* key */ String, /* value */ js.Any, /* done */ js.UndefOr[js.Function], Unit]
  
  @js.native
  trait StorageImpl extends StObject {
    
    def getItem(key: String): js.Any = js.native
    def getItem(key: Double): js.Any = js.native
    
    def removeItem(key: String): Unit = js.native
    def removeItem(key: Double): Unit = js.native
    
    def setItem(key: String, value: js.Any): Unit = js.native
    def setItem(key: Double, value: js.Any): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.cachefactory.cachefactoryStrings.memory
    - typings.cachefactory.cachefactoryStrings.localStorage
    - typings.cachefactory.cachefactoryStrings.sessionStorage
  */
  trait StorageMode extends StObject
  object StorageMode {
    
    inline def localStorage: typings.cachefactory.cachefactoryStrings.localStorage = "localStorage".asInstanceOf[typings.cachefactory.cachefactoryStrings.localStorage]
    
    inline def memory: typings.cachefactory.cachefactoryStrings.memory = "memory".asInstanceOf[typings.cachefactory.cachefactoryStrings.memory]
    
    inline def sessionStorage: typings.cachefactory.cachefactoryStrings.sessionStorage = "sessionStorage".asInstanceOf[typings.cachefactory.cachefactoryStrings.sessionStorage]
  }
  
  trait Utils_ extends StObject {
    
    var Promise: js.UndefOr[PromiseConstructor] = js.undefined
    
    def equals(a: js.Any, b: js.Any): Boolean
    
    def fromJson(value: String): js.Any
    
    def isFunction(value: js.Any): Boolean
    
    def isNumber(value: js.Any): Boolean
    
    def isObject(value: js.Any): Boolean
    
    def isString(value: js.Any): Boolean
  }
  object Utils_ {
    
    inline def apply(
      equals_ : (js.Any, js.Any) => Boolean,
      fromJson: String => js.Any,
      isFunction: js.Any => Boolean,
      isNumber: js.Any => Boolean,
      isObject: js.Any => Boolean,
      isString: js.Any => Boolean
    ): Utils_ = {
      val __obj = js.Dynamic.literal(fromJson = js.Any.fromFunction1(fromJson), isFunction = js.Any.fromFunction1(isFunction), isNumber = js.Any.fromFunction1(isNumber), isObject = js.Any.fromFunction1(isObject), isString = js.Any.fromFunction1(isString))
      __obj.updateDynamic("equals")(js.Any.fromFunction2(equals_))
      __obj.asInstanceOf[Utils_]
    }
    
    extension [Self <: Utils_](x: Self) {
      
      inline def setEquals_(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction2(value))
      
      inline def setFromJson(value: String => js.Any): Self = StObject.set(x, "fromJson", js.Any.fromFunction1(value))
      
      inline def setIsFunction(value: js.Any => Boolean): Self = StObject.set(x, "isFunction", js.Any.fromFunction1(value))
      
      inline def setIsNumber(value: js.Any => Boolean): Self = StObject.set(x, "isNumber", js.Any.fromFunction1(value))
      
      inline def setIsObject(value: js.Any => Boolean): Self = StObject.set(x, "isObject", js.Any.fromFunction1(value))
      
      inline def setIsString(value: js.Any => Boolean): Self = StObject.set(x, "isString", js.Any.fromFunction1(value))
      
      inline def setPromise(value: PromiseConstructor): Self = StObject.set(x, "Promise", value.asInstanceOf[js.Any])
      
      inline def setPromiseUndefined: Self = StObject.set(x, "Promise", js.undefined)
    }
  }
}
