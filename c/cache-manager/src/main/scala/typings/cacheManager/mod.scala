package typings.cacheManager

import org.scalablytyped.runtime.StringDictionary
import typings.cacheManager.anon.Create
import typings.cacheManager.cacheManagerStrings.memory
import typings.cacheManager.cacheManagerStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cache-manager", "caching")
  @js.native
  def caching(IConfig: StoreConfig with CacheOptions): Cache = js.native
  
  @JSImport("cache-manager", "multiCaching")
  @js.native
  def multiCaching(Caches: js.Array[Cache]): MultiCache = js.native
  @JSImport("cache-manager", "multiCaching")
  @js.native
  def multiCaching(Caches: js.Array[Cache], options: CacheOptions): MultiCache = js.native
  
  @js.native
  trait Cache extends StObject {
    
    def del(key: String): js.Promise[_] = js.native
    def del(key: String, callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
    
    def get[T](key: String): js.Promise[_] = js.native
    def get[T](key: String, callback: js.Function2[/* error */ js.Any, /* result */ T, Unit]): Unit = js.native
    
    def reset(): js.Promise[Unit] = js.native
    def reset(cb: js.Function0[Unit]): Unit = js.native
    
    def set[T](key: String, value: T, options: CachingConfig): js.Promise[_] = js.native
    def set[T](key: String, value: T, options: CachingConfig, callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
    def set[T](key: String, value: T, ttl: Double): js.Promise[_] = js.native
    def set[T](key: String, value: T, ttl: Double, callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
    
    var store: Store = js.native
    
    // Because the library accepts multiple keys as arguments but not as an array and rather as individual parameters
    // of the function, the type definition had to be changed to this rather than specific ones
    // actual definitions would looks like this (impossible in typescript):
    // wrap<T>(...keys: string[], work: (callback: (error: any, result: T) => void) => void, options: CachingConfig, callback: (error: any, result: T) => void): void
    // wrap<T>(...keys: string[], work: (callback: (error: any, result: T) => void) => void, callback: (error: any, result: T) => void): void
    // wrap<T>(...keys: string[], work: (callback: (error: any, result: T) => void) => void, options: CachingConfig): void
    // wrap<T>(...keys: string[], work: (callback: (error: any, result: T) => void) => void): Promise<any>;
    def wrap[T](args: WrapArgsType[T]*): js.Promise[_] = js.native
  }
  
  @js.native
  trait CacheOptions extends StObject {
    
    var isCacheableValue: js.UndefOr[js.Function1[/* value */ js.Any, Boolean]] = js.native
    
    /**
      * Promise library to replace global.Promise
      */
    var promiseDependency: js.UndefOr[js.Any] = js.native
  }
  object CacheOptions {
    
    @scala.inline
    def apply(): CacheOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CacheOptions]
    }
    
    @scala.inline
    implicit class CacheOptionsMutableBuilder[Self <: CacheOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsCacheableValue(value: /* value */ js.Any => Boolean): Self = StObject.set(x, "isCacheableValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsCacheableValueUndefined: Self = StObject.set(x, "isCacheableValue", js.undefined)
      
      @scala.inline
      def setPromiseDependency(value: js.Any): Self = StObject.set(x, "promiseDependency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromiseDependencyUndefined: Self = StObject.set(x, "promiseDependency", js.undefined)
    }
  }
  
  @js.native
  trait CachingConfig extends StObject {
    
    var ttl: Double | TtlFunction = js.native
  }
  object CachingConfig {
    
    @scala.inline
    def apply(ttl: Double | TtlFunction): CachingConfig = {
      val __obj = js.Dynamic.literal(ttl = ttl.asInstanceOf[js.Any])
      __obj.asInstanceOf[CachingConfig]
    }
    
    @scala.inline
    implicit class CachingConfigMutableBuilder[Self <: CachingConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTtl(value: Double | TtlFunction): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTtlFunction1(value: /* result */ js.Any => Double): Self = StObject.set(x, "ttl", js.Any.fromFunction1(value))
    }
  }
  
  type CallbackFunc[T] = js.Function2[/* error */ js.Any, /* result */ T, Unit]
  
  @js.native
  trait MultiCache extends StObject {
    
    def del(key: String): js.Promise[_] = js.native
    def del(key: String, callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
    
    def get[T](key: String): js.Promise[_] = js.native
    def get[T](key: String, callback: js.Function2[/* error */ js.Any, /* result */ T, Unit]): Unit = js.native
    
    def reset(cb: js.Function0[Unit]): Unit = js.native
    
    def set[T](key: String, value: T, options: CachingConfig): js.Promise[_] = js.native
    def set[T](key: String, value: T, options: CachingConfig, callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
    def set[T](key: String, value: T, ttl: Double): js.Promise[_] = js.native
    def set[T](key: String, value: T, ttl: Double, callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
    
    // Because the library accepts multiple keys as arguments but not as an array and rather as individual parameters
    // of the function, the type definition had to be changed to this rather than specific ones
    // actual definitions would looks like this (impossible in typescript):
    // wrap<T>(...keys: string[], work: (callback: (error: any, result: T) => void) => void, options: CachingConfig, callback: (error: any, result: T) => void): void
    // wrap<T>(...keys: string[], work: (callback: (error: any, result: T) => void) => void, callback: (error: any, result: T) => void): void
    // wrap<T>(...keys: string[], work: (callback: (error: any, result: T) => void) => void, options: CachingConfig): void
    // wrap<T>(...keys: string[], work: (callback: (error: any, result: T) => void) => void): Promise<any>;
    def wrap[T](args: WrapArgsType[T]*): js.Promise[_] = js.native
  }
  
  @js.native
  trait Store extends StObject {
    
    var del: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Promise[_]]] = js.native
    
    // These functions will just be bound to the Cache object if they exist so args can be anything
    def get[T](args: js.Any*): js.Promise[_] = js.native
    
    var keys: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Promise[_]]] = js.native
    
    var mget: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Promise[_]]] = js.native
    
    var mset: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Promise[_]]] = js.native
    
    var reset: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Promise[_]]] = js.native
    
    def set[T](args: js.Any*): js.Promise[_] = js.native
    
    var setex: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Promise[_]]] = js.native
    
    var ttl: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Promise[_]]] = js.native
  }
  object Store {
    
    @scala.inline
    def apply(get: /* repeated */ js.Any => js.Promise[_], set: /* repeated */ js.Any => js.Promise[_]): Store = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), set = js.Any.fromFunction1(set))
      __obj.asInstanceOf[Store]
    }
    
    @scala.inline
    implicit class StoreMutableBuilder[Self <: Store] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDel(value: /* repeated */ js.Any => js.Promise[_]): Self = StObject.set(x, "del", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDelUndefined: Self = StObject.set(x, "del", js.undefined)
      
      @scala.inline
      def setGet(value: /* repeated */ js.Any => js.Promise[_]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setKeys(value: /* repeated */ js.Any => js.Promise[_]): Self = StObject.set(x, "keys", js.Any.fromFunction1(value))
      
      @scala.inline
      def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
      
      @scala.inline
      def setMget(value: /* repeated */ js.Any => js.Promise[_]): Self = StObject.set(x, "mget", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMgetUndefined: Self = StObject.set(x, "mget", js.undefined)
      
      @scala.inline
      def setMset(value: /* repeated */ js.Any => js.Promise[_]): Self = StObject.set(x, "mset", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMsetUndefined: Self = StObject.set(x, "mset", js.undefined)
      
      @scala.inline
      def setReset(value: /* repeated */ js.Any => js.Promise[_]): Self = StObject.set(x, "reset", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
      
      @scala.inline
      def setSet(value: /* repeated */ js.Any => js.Promise[_]): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetex(value: /* repeated */ js.Any => js.Promise[_]): Self = StObject.set(x, "setex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetexUndefined: Self = StObject.set(x, "setex", js.undefined)
      
      @scala.inline
      def setTtl(value: /* repeated */ js.Any => js.Promise[_]): Self = StObject.set(x, "ttl", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
  
  @js.native
  trait StoreConfig
    extends CachingConfig
       with /**
    * You may pass in any other arguments these will be passed on to the `create` method of your store,
    * otherwise they will be ignored.
    */
  /* key */ StringDictionary[js.Any] {
    
    var max: js.UndefOr[Double] = js.native
    
    var store: memory | none | Store | Create = js.native
  }
  object StoreConfig {
    
    @scala.inline
    def apply(store: memory | none | Store | Create, ttl: Double | TtlFunction): StoreConfig = {
      val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoreConfig]
    }
    
    @scala.inline
    implicit class StoreConfigMutableBuilder[Self <: StoreConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setStore(value: memory | none | Store | Create): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    }
  }
  
  type TtlFunction = js.Function1[/* result */ js.Any, Double]
  
  type WrapArgsType[T] = String | (js.Function1[/* callback */ CallbackFunc[T], Unit]) | CachingConfig | CallbackFunc[T]
}
