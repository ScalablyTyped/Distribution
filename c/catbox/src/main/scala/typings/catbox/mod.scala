package typings.catbox

import org.scalablytyped.runtime.Instantiable1
import typings.catbox.catboxBooleans.`false`
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("catbox", "Client")
  @js.native
  class Client[T] protected () extends ClientApi[T] {
    def this(engine: EnginePrototypeOrObject, options: ClientOptions) = this()
  }
  
  @JSImport("catbox", "Policy")
  @js.native
  class Policy[T, O /* <: PolicyOptionVariants[T] */] protected () extends StObject {
    def this(options: O, cache: Client[T], segment: String) = this()
    
    /**
      * remove the item from cache where:
      * @param id the unique item identifier (within the policy segment).
      */
    def drop(id: Id): js.Promise[Unit] = js.native
    
    /**
      *  retrieve an item from the cache. If the item is not
      * found and the generateFunc method was provided,
      * a new value is generated, stored in the cache, and returned.
      * Multiple concurrent requests are queued and processed once. The method arguments are:
      * @param id the unique item identifier (within the policy segment).
      * Can be a string or an object with the required 'id' key.
      */
    def get(id: Id): js.Promise[T | Null | DecoratedResult[T]] = js.native
    
    /**
      * returns true if cache engine determines itself as ready, false if it is not ready or if
      * here is no cache engine set.
      */
    def isReady(): Boolean = js.native
    
    /** changes the policy rules after construction (note that items already stored will not be affected) */
    def rules(options: PolicyOptions[T]): Unit = js.native
    
    /**
      * store an item in the cache where:
      * @param id - the unique item identifier (within the policy segment).
      * @param value - the string or object value to be stored.
      * @param ttl - a time-to-live override value in milliseconds after which the item is automatically
      * removed from the cache (or is marked invalid).
      *    This should be set to 0 in order to use the caching rules configured when creating the Policy object.
      */
    def set(id: Id, value: T): js.Promise[Unit] = js.native
    def set(id: Id, value: T, ttl: Double): js.Promise[Unit] = js.native
    
    /** an object with cache statistics */
    def stats(): CacheStatisticsObject = js.native
    
    /**
      * given a created timestamp in milliseconds, returns the time-to-live left
      * based on the configured rules.
      */
    def ttl(created: Double): Double = js.native
  }
  
  @js.native
  trait CacheKey extends StObject {
    
    /** id - a unique item identifier string (per segment). Can be an empty string. */
    var id: String = js.native
    
    /** segment - a caching segment name string. Enables using a single cache server for storing different sets of items with overlapping ids. */
    var segment: String = js.native
  }
  object CacheKey {
    
    @scala.inline
    def apply(id: String, segment: String): CacheKey = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], segment = segment.asInstanceOf[js.Any])
      __obj.asInstanceOf[CacheKey]
    }
    
    @scala.inline
    implicit class CacheKeyMutableBuilder[Self <: CacheKey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegment(value: String): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CacheStatisticsObject extends StObject {
    
    /** errors - cache operations errors. TODO check this */
    var errors: Double = js.native
    
    /** generates - number of calls to the generate function. */
    var generates: Double = js.native
    
    /** gets - number of cache get() requests. */
    var gets: Double = js.native
    
    /** hits - number of cache get() requests in which the requested id was found in the cache (can be stale). */
    var hits: Double = js.native
    
    /** sets - number of cache writes. */
    var sets: Double = js.native
    
    /** stales - number of cache reads with stale requests (only counts the first request in a queued get() operation). */
    var stales: Double = js.native
  }
  object CacheStatisticsObject {
    
    @scala.inline
    def apply(errors: Double, generates: Double, gets: Double, hits: Double, sets: Double, stales: Double): CacheStatisticsObject = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], generates = generates.asInstanceOf[js.Any], gets = gets.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], sets = sets.asInstanceOf[js.Any], stales = stales.asInstanceOf[js.Any])
      __obj.asInstanceOf[CacheStatisticsObject]
    }
    
    @scala.inline
    implicit class CacheStatisticsObjectMutableBuilder[Self <: CacheStatisticsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrors(value: Double): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGenerates(value: Double): Self = StObject.set(x, "generates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGets(value: Double): Self = StObject.set(x, "gets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHits(value: Double): Self = StObject.set(x, "hits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSets(value: Double): Self = StObject.set(x, "sets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStales(value: Double): Self = StObject.set(x, "stales", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CachedObject[T] extends StObject {
    
    /** item - the value stored in the cache using set(). */
    var item: T = js.native
    
    /** stored - the timestamp when the item was stored in the cache (in milliseconds). */
    var stored: Double = js.native
    
    /** ttl - the remaining time-to-live (not the original value used when storing the object). */
    var ttl: Double = js.native
  }
  object CachedObject {
    
    @scala.inline
    def apply[T](item: T, stored: Double, ttl: Double): CachedObject[T] = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], stored = stored.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
      __obj.asInstanceOf[CachedObject[T]]
    }
    
    @scala.inline
    implicit class CachedObjectMutableBuilder[Self <: CachedObject[_], T] (val x: Self with CachedObject[T]) extends AnyVal {
      
      @scala.inline
      def setItem(value: T): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStored(value: Double): Self = StObject.set(x, "stored", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ClientApi[T] extends StObject {
    
    /**
      * drop(key) - remove an item from cache where:
      *  * key - a cache key object (see [ICacheKey]).
      */
    def drop(key: CacheKey): js.Promise[Unit] = js.native
    
    /**
      * get(key, callback) - retrieve an item from the cache engine if found where:
      *  * key - a cache key object (see [ICacheKey]).
      */
    def get(key: CacheKey): js.Promise[Null | CachedObject[T]] = js.native
    
    /** isReady() - returns true if cache engine determines itself as ready, false if it is not ready. */
    def isReady(): Boolean = js.native
    
    /**
      * set(key, value, ttl) - store an item in the cache for a specified length of time, where:
      *  * key - a cache key object (see [ICacheKey]).
      *  * value - the string or object value to be stored.
      *  * ttl - a time-to-live value in milliseconds after which the item is automatically removed from the cache (or is marked invalid).
      */
    def set(key: CacheKey, value: T, ttl: Double): js.Promise[Unit] = js.native
    
    /** start() - creates a connection to the cache server. Must be called before any other method is available. */
    def start(): js.Promise[Unit] = js.native
    
    /** stop() - terminates the connection to the cache server. */
    def stop(): Unit = js.native
    
    /** validateSegmentName(segment) - returns null if the segment name is valid (see below), otherwise should return an instance of Error with an appropriate message. */
    def validateSegmentName(segment: String): Null | Error = js.native
  }
  object ClientApi {
    
    @scala.inline
    def apply[T](
      drop: CacheKey => js.Promise[Unit],
      get: CacheKey => js.Promise[Null | CachedObject[T]],
      isReady: () => Boolean,
      set: (CacheKey, T, Double) => js.Promise[Unit],
      start: () => js.Promise[Unit],
      stop: () => Unit,
      validateSegmentName: String => Null | Error
    ): ClientApi[T] = {
      val __obj = js.Dynamic.literal(drop = js.Any.fromFunction1(drop), get = js.Any.fromFunction1(get), isReady = js.Any.fromFunction0(isReady), set = js.Any.fromFunction3(set), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop), validateSegmentName = js.Any.fromFunction1(validateSegmentName))
      __obj.asInstanceOf[ClientApi[T]]
    }
    
    @scala.inline
    implicit class ClientApiMutableBuilder[Self <: ClientApi[_], T] (val x: Self with ClientApi[T]) extends AnyVal {
      
      @scala.inline
      def setDrop(value: CacheKey => js.Promise[Unit]): Self = StObject.set(x, "drop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGet(value: CacheKey => js.Promise[Null | CachedObject[T]]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsReady(value: () => Boolean): Self = StObject.set(x, "isReady", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSet(value: (CacheKey, T, Double) => js.Promise[Unit]): Self = StObject.set(x, "set", js.Any.fromFunction3(value))
      
      @scala.inline
      def setStart(value: () => js.Promise[Unit]): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
      
      @scala.inline
      def setValidateSegmentName(value: String => Null | Error): Self = StObject.set(x, "validateSegmentName", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait ClientOptions extends StObject {
    
    /**
      * this will store items under keys that start with this value.
      */
    var partition: String = js.native
  }
  object ClientOptions {
    
    @scala.inline
    def apply(partition: String): ClientOptions = {
      val __obj = js.Dynamic.literal(partition = partition.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientOptions]
    }
    
    @scala.inline
    implicit class ClientOptionsMutableBuilder[Self <: ClientOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPartition(value: String): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.catbox.mod.PolicyOptionVariants because Already inherited */ @js.native
  trait DecoratedPolicyOptions[T] extends PolicyOptions[T] {
    
    /**
      * @default false
      */
    var getDecoratedValue: js.UndefOr[Boolean] = js.native
  }
  object DecoratedPolicyOptions {
    
    @scala.inline
    def apply[T](): DecoratedPolicyOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DecoratedPolicyOptions[T]]
    }
    
    @scala.inline
    implicit class DecoratedPolicyOptionsMutableBuilder[Self <: DecoratedPolicyOptions[_], T] (val x: Self with DecoratedPolicyOptions[T]) extends AnyVal {
      
      @scala.inline
      def setGetDecoratedValue(value: Boolean): Self = StObject.set(x, "getDecoratedValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetDecoratedValueUndefined: Self = StObject.set(x, "getDecoratedValue", js.undefined)
    }
  }
  
  @js.native
  trait DecoratedResult[T] extends StObject {
    
    var cached: PolicyGetCachedOptions[T] = js.native
    
    var report: PolicyGetReportLog = js.native
    
    var value: T = js.native
  }
  object DecoratedResult {
    
    @scala.inline
    def apply[T](cached: PolicyGetCachedOptions[T], report: PolicyGetReportLog, value: T): DecoratedResult[T] = {
      val __obj = js.Dynamic.literal(cached = cached.asInstanceOf[js.Any], report = report.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecoratedResult[T]]
    }
    
    @scala.inline
    implicit class DecoratedResultMutableBuilder[Self <: DecoratedResult[_], T] (val x: Self with DecoratedResult[T]) extends AnyVal {
      
      @scala.inline
      def setCached(value: PolicyGetCachedOptions[T]): Self = StObject.set(x, "cached", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReport(value: PolicyGetReportLog): Self = StObject.set(x, "report", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EnginePrototype[T] extends Instantiable1[/* settings */ ClientOptions, ClientApi[T]]
  
  type EnginePrototypeOrObject = EnginePrototype[js.Any] | ClientApi[js.Any]
  
  type GenerateFunc[T] = js.Function2[/* id */ Id, /* flags */ GenerateFuncFlags, js.Promise[T]]
  
  @js.native
  trait GenerateFuncFlags extends StObject {
    
    var ttl: Double = js.native
  }
  object GenerateFuncFlags {
    
    @scala.inline
    def apply(ttl: Double): GenerateFuncFlags = {
      val __obj = js.Dynamic.literal(ttl = ttl.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenerateFuncFlags]
    }
    
    @scala.inline
    implicit class GenerateFuncFlagsMutableBuilder[Self <: GenerateFuncFlags] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    }
  }
  
  type Id = String | typings.catbox.anon.Id
  
  @js.native
  trait PolicyGetCachedOptions[T] extends StObject {
    
    /** isStale - true if the item is stale. */
    var isStale: Boolean = js.native
    
    /** item - the cached value. */
    var item: T = js.native
    
    /** stored - the timestamp when the item was stored in the cache. */
    var stored: Double = js.native
    
    /** ttl - the cache ttl value for the record. */
    var ttl: Double = js.native
  }
  object PolicyGetCachedOptions {
    
    @scala.inline
    def apply[T](isStale: Boolean, item: T, stored: Double, ttl: Double): PolicyGetCachedOptions[T] = {
      val __obj = js.Dynamic.literal(isStale = isStale.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], stored = stored.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolicyGetCachedOptions[T]]
    }
    
    @scala.inline
    implicit class PolicyGetCachedOptionsMutableBuilder[Self <: PolicyGetCachedOptions[_], T] (val x: Self with PolicyGetCachedOptions[T]) extends AnyVal {
      
      @scala.inline
      def setIsStale(value: Boolean): Self = StObject.set(x, "isStale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItem(value: T): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStored(value: Double): Self = StObject.set(x, "stored", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PolicyGetReportLog extends StObject {
    
    /** error - lookup error. */
    var error: js.UndefOr[Error] = js.native
    
    /** isStale - true if the item is stale. */
    var isStale: Boolean = js.native
    
    /** msec - the cache lookup time in milliseconds. */
    var msec: Double = js.native
    
    /** stored - the timestamp when the item was stored in the cache. */
    var stored: Double = js.native
    
    /** ttl - the cache ttl value for the record. */
    var ttl: Double = js.native
  }
  object PolicyGetReportLog {
    
    @scala.inline
    def apply(isStale: Boolean, msec: Double, stored: Double, ttl: Double): PolicyGetReportLog = {
      val __obj = js.Dynamic.literal(isStale = isStale.asInstanceOf[js.Any], msec = msec.asInstanceOf[js.Any], stored = stored.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolicyGetReportLog]
    }
    
    @scala.inline
    implicit class PolicyGetReportLogMutableBuilder[Self <: PolicyGetReportLog] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setIsStale(value: Boolean): Self = StObject.set(x, "isStale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsec(value: Double): Self = StObject.set(x, "msec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStored(value: Double): Self = StObject.set(x, "stored", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.catbox.mod.PolicyOptions[T]
    - typings.catbox.mod.DecoratedPolicyOptions[T]
  */
  trait PolicyOptionVariants[T] extends StObject
  object PolicyOptionVariants {
    
    @scala.inline
    def DecoratedPolicyOptions[T](): typings.catbox.mod.DecoratedPolicyOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.catbox.mod.DecoratedPolicyOptions[T]]
    }
    
    @scala.inline
    def PolicyOptions[T](): typings.catbox.mod.PolicyOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.catbox.mod.PolicyOptions[T]]
    }
  }
  
  @js.native
  trait PolicyOptions[T] extends PolicyOptionVariants[T] {
    
    /** dropOnError - if true, an error or timeout in the generateFunc causes the stale value to be evicted from the cache. Defaults to true. */
    var dropOnError: js.UndefOr[Boolean] = js.native
    
    /** expiresAt - time of day expressed in 24h notation using the 'HH:MM' format, at which point all cache records for the route expire. Uses local time. Cannot be used together with expiresIn. */
    var expiresAt: js.UndefOr[String] = js.native
    
    /** expiresIn - relative expiration expressed in the number of milliseconds since the item was saved in the cache. Cannot be used together with expiresAt. */
    var expiresIn: js.UndefOr[Double] = js.native
    
    /** generateFunc - a function used to generate a new cache item if one is not found in the cache when calling get(). The method's signature is function(id, next) where: */
    var generateFunc: js.UndefOr[GenerateFunc[T]] = js.native
    
    /** generateIgnoreWriteError - if false, an upstream cache write error will be passed back with the generated value when calling the get() method. Defaults to true. */
    var generateIgnoreWriteError: js.UndefOr[Boolean] = js.native
    
    /** generateOnReadError - if false, an upstream cache read error will stop the get() method from calling the generate function and will instead pass back the cache error. Defaults to true. */
    var generateOnReadError: js.UndefOr[Boolean] = js.native
    
    /**
      * generateTimeout - number of milliseconds to wait before returning a timeout error when the generateFunc function takes too long to return a value.
      * When the value is eventually returned, it is stored in the cache for future requests. Required if generateFunc is present.
      * Set to false to disable timeouts which may cause all get() requests to get stuck forever.
      */
    var generateTimeout: js.UndefOr[Double | `false`] = js.native
    
    /**
      * pendingGenerateTimeout - number of milliseconds while generateFunc call is in progress for a given id, before a subsequent generateFunc call is allowed.
      * @default 0, no blocking of concurrent generateFunc calls beyond staleTimeout.
      */
    var pendingGenerateTimeout: js.UndefOr[Double] = js.native
    
    /**
      * staleIn - number of milliseconds to mark an item stored in cache as stale and attempt to regenerate it when generateFunc is provided.
      * Must be less than expiresIn. Alternatively function that returns staleIn value in milliseconds. The function signature is function(stored, ttl) where:
      *  * stored - the timestamp when the item was stored in the cache (in milliseconds).
      *  * ttl - the remaining time-to-live (not the original value used when storing the object).
      */
    var staleIn: js.UndefOr[Double | (js.Function2[/* stored */ Double, /* ttl */ Double, Double])] = js.native
    
    /** staleTimeout - number of milliseconds to wait before returning a stale value while generateFunc is generating a fresh value. */
    var staleTimeout: js.UndefOr[Double] = js.native
  }
  object PolicyOptions {
    
    @scala.inline
    def apply[T](): PolicyOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PolicyOptions[T]]
    }
    
    @scala.inline
    implicit class PolicyOptionsMutableBuilder[Self <: PolicyOptions[_], T] (val x: Self with PolicyOptions[T]) extends AnyVal {
      
      @scala.inline
      def setDropOnError(value: Boolean): Self = StObject.set(x, "dropOnError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropOnErrorUndefined: Self = StObject.set(x, "dropOnError", js.undefined)
      
      @scala.inline
      def setExpiresAt(value: String): Self = StObject.set(x, "expiresAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiresAtUndefined: Self = StObject.set(x, "expiresAt", js.undefined)
      
      @scala.inline
      def setExpiresIn(value: Double): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiresInUndefined: Self = StObject.set(x, "expiresIn", js.undefined)
      
      @scala.inline
      def setGenerateFunc(value: (/* id */ Id, /* flags */ GenerateFuncFlags) => js.Promise[T]): Self = StObject.set(x, "generateFunc", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGenerateFuncUndefined: Self = StObject.set(x, "generateFunc", js.undefined)
      
      @scala.inline
      def setGenerateIgnoreWriteError(value: Boolean): Self = StObject.set(x, "generateIgnoreWriteError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGenerateIgnoreWriteErrorUndefined: Self = StObject.set(x, "generateIgnoreWriteError", js.undefined)
      
      @scala.inline
      def setGenerateOnReadError(value: Boolean): Self = StObject.set(x, "generateOnReadError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGenerateOnReadErrorUndefined: Self = StObject.set(x, "generateOnReadError", js.undefined)
      
      @scala.inline
      def setGenerateTimeout(value: Double | `false`): Self = StObject.set(x, "generateTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGenerateTimeoutUndefined: Self = StObject.set(x, "generateTimeout", js.undefined)
      
      @scala.inline
      def setPendingGenerateTimeout(value: Double): Self = StObject.set(x, "pendingGenerateTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPendingGenerateTimeoutUndefined: Self = StObject.set(x, "pendingGenerateTimeout", js.undefined)
      
      @scala.inline
      def setStaleIn(value: Double | (js.Function2[/* stored */ Double, /* ttl */ Double, Double])): Self = StObject.set(x, "staleIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaleInFunction2(value: (/* stored */ Double, /* ttl */ Double) => Double): Self = StObject.set(x, "staleIn", js.Any.fromFunction2(value))
      
      @scala.inline
      def setStaleInUndefined: Self = StObject.set(x, "staleIn", js.undefined)
      
      @scala.inline
      def setStaleTimeout(value: Double): Self = StObject.set(x, "staleTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaleTimeoutUndefined: Self = StObject.set(x, "staleTimeout", js.undefined)
    }
  }
}
