package typings.cached

import typings.cached.anon.Expire
import typings.cached.cachedStrings.memcached
import typings.cached.cachedStrings.memory
import typings.cached.cachedStrings.noop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Function creates new cache store or returns existing - if same "name" is provided.
    * @param name - Name of the cache - should be unique per-cache. If you create two instances with the same name, you'll get the same instance.
    * @param options - CacheOptions
    */
  inline def apply[T](name: String, options: CacheOptions): Cache[T] = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Cache[T]]
  
  @JSImport("cached", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * This allows you to circumvent the global named caches. The options are the same as above, just name is also part of the options object when using this function.
    * @param options
    */
  inline def createCache[T](options: NewCacheOptions): Cache[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createCache")(options.asInstanceOf[js.Any]).asInstanceOf[Cache[T]]
  
  /**
    * Convert a node-style function that takes a callback as its first parameter into a parameterless function that generates a promise.
    * In other words: this is what you'd want to wrap your node-style functions in when using them as value arguments to set or getOrElse.
    */
  inline def deferred[T](
    func: js.Function1[/* callback */ js.Function2[/* err */ Any, /* result */ js.UndefOr[T], Unit], Unit]
  ): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("deferred")(func.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  
  /**
    * Drop the given named cache.
    * @param name - name of the cache store to drop
    */
  inline def dropNamedCache(name: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("dropNamedCache")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /**
    * Drop all named caches.
    */
  inline def dropNamedCaches(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("dropNamedCaches")().asInstanceOf[Any]
  
  inline def knownCaches(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("knownCaches")().asInstanceOf[js.Array[String]]
  
  trait BackendOptions extends StObject {
    
    var client: js.UndefOr[typings.memcached.mod.^] = js.undefined
    
    var hosts: js.UndefOr[String] = js.undefined
    
    var poolSize: js.UndefOr[Double] = js.undefined
    
    var `type`: memcached | memory | noop
  }
  object BackendOptions {
    
    inline def apply(`type`: memcached | memory | noop): BackendOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BackendOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BackendOptions] (val x: Self) extends AnyVal {
      
      inline def setClient(value: typings.memcached.mod.^): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      inline def setHosts(value: String): Self = StObject.set(x, "hosts", value.asInstanceOf[js.Any])
      
      inline def setHostsUndefined: Self = StObject.set(x, "hosts", js.undefined)
      
      inline def setPoolSize(value: Double): Self = StObject.set(x, "poolSize", value.asInstanceOf[js.Any])
      
      inline def setPoolSizeUndefined: Self = StObject.set(x, "poolSize", js.undefined)
      
      inline def setType(value: memcached | memory | noop): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Cache[T] extends StObject {
    
    /**
      * Cache retrieve operation. key has to be a string.
      * Cache misses are generally treated the same as retrieving null, errors should only be caused by transport errors and connection problems.
      * If you want to cache null/undefined (e.g. 404 responses), you may want to wrap it or choose a different value, like false, to represent this condition.
      */
    def get(key: String): js.Promise[T | Null] = js.native
    
    /**
      * This is the function you'd want to use most of the time.
      * It takes the same arguments as set but it will check the cache first.
      * If a value is already cached, it will return it directly (respond as fast as possible).
      * If the value is marked as stale (generated n seconds ago with n > freshFor), it will replace the value in the cache.
      * When multiple getOrElse calls concurrently encounter the same stale value, it will only replace the value once.
      * This is done on a per-instance level, so if you create many cache instances reading and writing the same keys, you are asking for trouble.
      * If you don't, the worst case is every process in your system fetching the value at once. Which should be a smaller number than the number of concurrent requests in most cases.
      */
    def getOrElse(key: String, value: T): js.Promise[T] = js.native
    def getOrElse(key: String, value: T, options: CacheDefaults): js.Promise[T] = js.native
    def getOrElse(key: String, value: js.Function0[js.Promise[T] | T]): js.Promise[T] = js.native
    def getOrElse(key: String, value: js.Function0[js.Promise[T] | T], options: CacheDefaults): js.Promise[T] = js.native
    def getOrElse(key: String, value: js.Promise[T]): js.Promise[T] = js.native
    def getOrElse(key: String, value: js.Promise[T], options: CacheDefaults): js.Promise[T] = js.native
    
    /**
      * Cache store operation.
      * @param key - has to be a string
      * @param value - value can be any of the following:
      * a. Anything that can be converted to JSON
      * b. A Promise of (a)
      * c. A function returning (a) or (b)
      * @param options - optional cache options for this key only
      */
    def set(key: String, value: T): js.Promise[Unit] = js.native
    def set(key: String, value: T, options: CacheDefaults): js.Promise[Unit] = js.native
    def set(key: String, value: js.Function0[js.Promise[T] | T]): js.Promise[Unit] = js.native
    def set(key: String, value: js.Function0[js.Promise[T] | T], options: CacheDefaults): js.Promise[Unit] = js.native
    def set(key: String, value: js.Promise[T]): js.Promise[Unit] = js.native
    def set(key: String, value: js.Promise[T], options: CacheDefaults): js.Promise[Unit] = js.native
    
    def setDefaults(defaults: CacheDefaults): Expire = js.native
    
    /**
      * Cache delete operation. key has to be a string.
      */
    def unset(key: String): js.Promise[Unit] = js.native
  }
  
  trait CacheDefaults extends StObject {
    
    /**
      * expire is the time in seconds after which a value should be deleted from the cache (or whatever expiring natively means for the backend).
      * Usually you'd want this to be 0 (never expire).
      */
    var expire: js.UndefOr[Double] = js.undefined
    
    /**
      * freshFor is the time in seconds after which a value should be replaced.
      * Replacing the value is done in the background and while the new value is generated (e.g. data is fetched from some service) the stale value is returned.
      * Think of freshFor as a smarter expire.
      */
    var freshFor: js.UndefOr[Double] = js.undefined
    
    /**
      * timeout is the maximum time in milliseconds to wait for cache operations to complete.
      * Configuring a timeout ensures that all get, set, and unset operations fail fast.
      * Otherwise there will be situations where one of the cache hosts goes down and reads hang for minutes while the memcached client retries to establish a connection.
      * It's highly recommended to set a timeout. If timeout is left undefined, no timeout will be set and the operations will only fail once the underlying client, e.g. memcached, gave up.
      */
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object CacheDefaults {
    
    inline def apply(): CacheDefaults = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CacheDefaults]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CacheDefaults] (val x: Self) extends AnyVal {
      
      inline def setExpire(value: Double): Self = StObject.set(x, "expire", value.asInstanceOf[js.Any])
      
      inline def setExpireUndefined: Self = StObject.set(x, "expire", js.undefined)
      
      inline def setFreshFor(value: Double): Self = StObject.set(x, "freshFor", value.asInstanceOf[js.Any])
      
      inline def setFreshForUndefined: Self = StObject.set(x, "freshFor", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait CacheOptions extends StObject {
    
    var backend: BackendOptions
    
    var defaults: js.UndefOr[CacheDefaults] = js.undefined
  }
  object CacheOptions {
    
    inline def apply(backend: BackendOptions): CacheOptions = {
      val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any])
      __obj.asInstanceOf[CacheOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CacheOptions] (val x: Self) extends AnyVal {
      
      inline def setBackend(value: BackendOptions): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
      
      inline def setDefaults(value: CacheDefaults): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      inline def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
    }
  }
  
  trait NewCacheOptions
    extends StObject
       with CacheOptions {
    
    var name: js.UndefOr[String] = js.undefined
  }
  object NewCacheOptions {
    
    inline def apply(backend: BackendOptions): NewCacheOptions = {
      val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewCacheOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NewCacheOptions] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
