package typings.cacheManager

import org.scalablytyped.runtime.StringDictionary
import typings.cacheManager.anon.Create
import typings.cacheManager.cacheManagerStrings.memory
import typings.cacheManager.cacheManagerStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cache-manager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def caching(IConfig: StoreConfig & CacheOptions): Cache = ^.asInstanceOf[js.Dynamic].applyDynamic("caching")(IConfig.asInstanceOf[js.Any]).asInstanceOf[Cache]
  
  inline def multiCaching(Caches: js.Array[Cache]): MultiCache = ^.asInstanceOf[js.Dynamic].applyDynamic("multiCaching")(Caches.asInstanceOf[js.Any]).asInstanceOf[MultiCache]
  inline def multiCaching(Caches: js.Array[Cache], options: CacheOptions): MultiCache = (^.asInstanceOf[js.Dynamic].applyDynamic("multiCaching")(Caches.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MultiCache]
  
  @js.native
  trait Cache extends StObject {
    
    def del(key: String): js.Promise[Any] = js.native
    def del(key: String, callback: js.Function1[/* error */ Any, Unit]): Unit = js.native
    
    def get[T](key: String): js.Promise[js.UndefOr[T]] = js.native
    def get[T](key: String, callback: js.Function2[/* error */ Any, /* result */ js.UndefOr[T], Unit]): Unit = js.native
    
    def reset(): js.Promise[Unit] = js.native
    def reset(cb: js.Function0[Unit]): Unit = js.native
    
    def set[T](key: String, value: T): js.Promise[T] = js.native
    def set[T](key: String, value: T, options: CachingConfig): js.Promise[T] = js.native
    def set[T](key: String, value: T, options: CachingConfig, callback: js.Function1[/* error */ Any, Unit]): Unit = js.native
    def set[T](key: String, value: T, ttl: Double): js.Promise[T] = js.native
    def set[T](key: String, value: T, ttl: Double, callback: js.Function1[/* error */ Any, Unit]): Unit = js.native
    
    var store: Store = js.native
    
    // 2021-01-14: This could be updated with TypeScript 4.2 https://devblogs.microsoft.com/typescript/announcing-typescript-4-2-beta/#leading-middle-rest-elements-in-tuple-types
    // Because the library accepts multiple keys as arguments but not as an array and rather as individual parameters
    // of the function, the type definition had to be changed to this rather than specific ones
    // actual definitions would looks like this (impossible in typescript):
    // wrap<T>(...keys: string[], work: (callback: (error: any, result: T) => void) => void, options: CachingConfig, callback: (error: any, result: T) => void): void
    // wrap<T>(...keys: string[], work: (callback: (error: any, result: T) => void) => void, callback: (error: any, result: T) => void): void
    // wrap<T>(...keys: string[], work: (callback: (error: any, result: T) => void) => void, options: CachingConfig): void
    // wrap<T>(...keys: string[], work: (callback: (error: any, result: T) => void) => void): Promise<any>;
    def wrap[T](args: WrapArgsType[T]*): js.Promise[T] = js.native
  }
  
  trait CacheOptions extends StObject {
    
    var isCacheableValue: js.UndefOr[js.Function1[/* value */ Any, Boolean]] = js.undefined
    
    /**
      * Promise library to replace global.Promise
      */
    var promiseDependency: js.UndefOr[Any] = js.undefined
  }
  object CacheOptions {
    
    inline def apply(): CacheOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CacheOptions]
    }
    
    extension [Self <: CacheOptions](x: Self) {
      
      inline def setIsCacheableValue(value: /* value */ Any => Boolean): Self = StObject.set(x, "isCacheableValue", js.Any.fromFunction1(value))
      
      inline def setIsCacheableValueUndefined: Self = StObject.set(x, "isCacheableValue", js.undefined)
      
      inline def setPromiseDependency(value: Any): Self = StObject.set(x, "promiseDependency", value.asInstanceOf[js.Any])
      
      inline def setPromiseDependencyUndefined: Self = StObject.set(x, "promiseDependency", js.undefined)
    }
  }
  
  trait CachingConfig extends StObject {
    
    var ttl: js.UndefOr[Double | TtlFunction] = js.undefined
  }
  object CachingConfig {
    
    inline def apply(): CachingConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CachingConfig]
    }
    
    extension [Self <: CachingConfig](x: Self) {
      
      inline def setTtl(value: Double | TtlFunction): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlFunction1(value: /* result */ Any => Double): Self = StObject.set(x, "ttl", js.Any.fromFunction1(value))
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
  
  type CallbackFunc[T] = js.Function2[/* error */ Any, /* result */ T, Unit]
  
  @js.native
  trait MultiCache extends StObject {
    
    def del(key: String): js.Promise[Any] = js.native
    def del(key: String, callback: js.Function1[/* error */ Any, Unit]): Unit = js.native
    
    def get[T](key: String): js.Promise[js.UndefOr[T]] = js.native
    def get[T](key: String, callback: js.Function2[/* error */ Any, /* result */ js.UndefOr[T], Unit]): Unit = js.native
    
    def reset(cb: js.Function0[Unit]): Unit = js.native
    
    def set[T](key: String, value: T): js.Promise[T] = js.native
    def set[T](key: String, value: T, options: CachingConfig): js.Promise[T] = js.native
    def set[T](key: String, value: T, options: CachingConfig, callback: js.Function1[/* error */ Any, Unit]): Unit = js.native
    def set[T](key: String, value: T, ttl: Double): js.Promise[T] = js.native
    def set[T](key: String, value: T, ttl: Double, callback: js.Function1[/* error */ Any, Unit]): Unit = js.native
    
    // 2021-01-14: This could be updated with TypeScript 4.2 https://devblogs.microsoft.com/typescript/announcing-typescript-4-2-beta/#leading-middle-rest-elements-in-tuple-types
    // Because the library accepts multiple keys as arguments but not as an array and rather as individual parameters
    // of the function, the type definition had to be changed to this rather than specific ones
    // actual definitions would looks like this (impossible in typescript):
    // wrap<T>(...keys: string[], work: (callback: (error: any, result: T) => void) => void, options: CachingConfig, callback: (error: any, result: T) => void): void
    // wrap<T>(...keys: string[], work: (callback: (error: any, result: T) => void) => void, callback: (error: any, result: T) => void): void
    // wrap<T>(...keys: string[], work: (callback: (error: any, result: T) => void) => void, options: CachingConfig): void
    // wrap<T>(...keys: string[], work: (callback: (error: any, result: T) => void) => void): Promise<any>;
    def wrap[T](args: WrapArgsType[T]*): js.Promise[T] = js.native
  }
  
  trait Store extends StObject {
    
    var del: js.UndefOr[js.Function1[/* repeated */ Any, js.Promise[Any]]] = js.undefined
    
    // These functions will just be bound to the Cache object if they exist so args can be anything
    def get[T](args: Any*): js.Promise[Any]
    
    var keys: js.UndefOr[js.Function1[/* repeated */ Any, js.Promise[Any]]] = js.undefined
    
    var mget: js.UndefOr[js.Function1[/* repeated */ Any, js.Promise[Any]]] = js.undefined
    
    var mset: js.UndefOr[js.Function1[/* repeated */ Any, js.Promise[Any]]] = js.undefined
    
    var reset: js.UndefOr[js.Function1[/* repeated */ Any, js.Promise[Any]]] = js.undefined
    
    def set[T](args: Any*): js.Promise[Any]
    
    var setex: js.UndefOr[js.Function1[/* repeated */ Any, js.Promise[Any]]] = js.undefined
    
    var ttl: js.UndefOr[js.Function1[/* repeated */ Any, js.Promise[Any]]] = js.undefined
  }
  object Store {
    
    inline def apply(get: /* repeated */ Any => js.Promise[Any], set: /* repeated */ Any => js.Promise[Any]): Store = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), set = js.Any.fromFunction1(set))
      __obj.asInstanceOf[Store]
    }
    
    extension [Self <: Store](x: Self) {
      
      inline def setDel(value: /* repeated */ Any => js.Promise[Any]): Self = StObject.set(x, "del", js.Any.fromFunction1(value))
      
      inline def setDelUndefined: Self = StObject.set(x, "del", js.undefined)
      
      inline def setGet(value: /* repeated */ Any => js.Promise[Any]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setKeys(value: /* repeated */ Any => js.Promise[Any]): Self = StObject.set(x, "keys", js.Any.fromFunction1(value))
      
      inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
      
      inline def setMget(value: /* repeated */ Any => js.Promise[Any]): Self = StObject.set(x, "mget", js.Any.fromFunction1(value))
      
      inline def setMgetUndefined: Self = StObject.set(x, "mget", js.undefined)
      
      inline def setMset(value: /* repeated */ Any => js.Promise[Any]): Self = StObject.set(x, "mset", js.Any.fromFunction1(value))
      
      inline def setMsetUndefined: Self = StObject.set(x, "mset", js.undefined)
      
      inline def setReset(value: /* repeated */ Any => js.Promise[Any]): Self = StObject.set(x, "reset", js.Any.fromFunction1(value))
      
      inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
      
      inline def setSet(value: /* repeated */ Any => js.Promise[Any]): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
      
      inline def setSetex(value: /* repeated */ Any => js.Promise[Any]): Self = StObject.set(x, "setex", js.Any.fromFunction1(value))
      
      inline def setSetexUndefined: Self = StObject.set(x, "setex", js.undefined)
      
      inline def setTtl(value: /* repeated */ Any => js.Promise[Any]): Self = StObject.set(x, "ttl", js.Any.fromFunction1(value))
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
  
  trait StoreConfig
    extends StObject
       with CachingConfig
       with /**
    * You may pass in any other arguments these will be passed on to the `create` method of your store,
    * otherwise they will be ignored.
    */
  /* key */ StringDictionary[Any] {
    
    var max: js.UndefOr[Double] = js.undefined
    
    var maxSize: js.UndefOr[Double] = js.undefined
    
    var sizeCalculation: js.UndefOr[js.Function2[/* value */ Any, /* key */ Any, Double]] = js.undefined
    
    var store: memory | none | Store | Create
  }
  object StoreConfig {
    
    inline def apply(store: memory | none | Store | Create): StoreConfig = {
      val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoreConfig]
    }
    
    extension [Self <: StoreConfig](x: Self) {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      inline def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setSizeCalculation(value: (/* value */ Any, /* key */ Any) => Double): Self = StObject.set(x, "sizeCalculation", js.Any.fromFunction2(value))
      
      inline def setSizeCalculationUndefined: Self = StObject.set(x, "sizeCalculation", js.undefined)
      
      inline def setStore(value: memory | none | Store | Create): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    }
  }
  
  type TtlFunction = js.Function1[/* result */ Any, Double]
  
  type WrapArgsType[T] = String | (js.Function1[/* callback */ CallbackFunc[T], Unit]) | CachingConfig | CallbackFunc[T] | (js.Function0[js.Thenable[T] | T])
}
