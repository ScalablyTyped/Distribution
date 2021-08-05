package typings.cacheableLookup

import typings.cacheableLookup.anon.LookupOptionsalltrue
import typings.cacheableLookup.anon.Typeoflookup
import typings.node.NodeJS.ErrnoException
import typings.node.dnsMod.promises.Resolver
import typings.node.httpMod.Agent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cacheable-lookup", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with CacheableLookup {
    def this(options: Options) = this()
  }
  
  type AsyncResolver = Resolver
  
  trait CacheInstance extends StObject {
    
    def clear(): TPromise[Unit]
    
    def delete(hostname: String): TPromise[Boolean]
    
    def get(hostname: String): TPromise[js.UndefOr[js.Array[EntryObject]]]
    
    def set(hostname: String, entries: js.Array[EntryObject], ttl: Double): TPromise[Unit | Boolean | this.type]
  }
  object CacheInstance {
    
    inline def apply(
      clear: () => TPromise[Unit],
      delete: String => TPromise[Boolean],
      get: String => TPromise[js.UndefOr[js.Array[EntryObject]]],
      set: (String, js.Array[EntryObject], Double) => TPromise[Unit | Boolean | CacheInstance]
    ): CacheInstance = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), set = js.Any.fromFunction3(set))
      __obj.asInstanceOf[CacheInstance]
    }
    
    extension [Self <: CacheInstance](x: Self) {
      
      inline def setClear(value: () => TPromise[Unit]): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setDelete(value: String => TPromise[Boolean]): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
      
      inline def setGet(value: String => TPromise[js.UndefOr[js.Array[EntryObject]]]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setSet(value: (String, js.Array[EntryObject], Double) => TPromise[Unit | Boolean | CacheInstance]): Self = StObject.set(x, "set", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait CacheableLookup extends StObject {
    
    /**
    	 * Clears the cache for the given hostname. If the hostname argument is not present, the entire cache will be emptied.
    	 */
    def clear(): Unit = js.native
    def clear(hostname: String): Unit = js.native
    
    /**
    	 * Attaches itself to an Agent instance.
    	 */
    def install(agent: Agent): Unit = js.native
    
    def lookup(
      hostname: String,
      callback: js.Function3[/* error */ ErrnoException, /* address */ String, /* family */ IPFamily, Unit]
    ): Unit = js.native
    /**
    	 * @see https://nodejs.org/api/dns.html#dns_dns_lookup_hostname_options_callback
    	 */
    def lookup(
      hostname: String,
      family: IPFamily,
      callback: js.Function3[/* error */ ErrnoException, /* address */ String, /* family */ IPFamily, Unit]
    ): Unit = js.native
    def lookup(
      hostname: String,
      options: LookupOptionsalltrue,
      callback: js.Function2[/* error */ ErrnoException, /* result */ js.Array[EntryObject], Unit]
    ): Unit = js.native
    def lookup(
      hostname: String,
      options: LookupOptions,
      callback: js.Function3[/* error */ ErrnoException, /* address */ String, /* family */ IPFamily, Unit]
    ): Unit = js.native
    
    def lookupAsync(hostname: String): js.Promise[EntryObject] = js.native
    def lookupAsync(hostname: String, family: IPFamily): js.Promise[EntryObject] = js.native
    /**
    	 * The asynchronous version of `dns.lookup(…)`.
    	 */
    def lookupAsync(hostname: String, options: LookupOptionsalltrue): js.Promise[js.Array[EntryObject]] = js.native
    def lookupAsync(hostname: String, options: LookupOptions): js.Promise[EntryObject] = js.native
    
    /**
    	 * An asynchronous function which returns cached DNS lookup entries. This is the base for `lookupAsync(hostname, options)` and `lookup(hostname, options, callback)`.
    	 */
    def query(hostname: String): js.Promise[js.Array[EntryObject]] = js.native
    
    /**
    	 * An asynchronous function which makes a new DNS lookup query and updates the database. This is used by `query(hostname, family)` if no entry in the database is present. Returns an array of objects with `address`, `family`, `ttl` and `expires` properties.
    	 */
    def queryAndCache(hostname: String): js.Promise[js.Array[EntryObject]] = js.native
    
    /**
    	 * The DNS servers used to make queries. Can be overridden - doing so will clear the cache.
    	 */
    var servers: js.Array[String] = js.native
    
    /**
    	 * Removes itself from an Agent instance.
    	 */
    def uninstall(agent: Agent): Unit = js.native
    
    /**
    	 * Updates interface info. For example, you need to run this when you plug or unplug your WiFi driver.
    	 *
    	 * **Note:** Running `updateInterfaceInfo()` will trigger `clear()` only on network interface removal.
    	 */
    def updateInterfaceInfo(): Unit = js.native
  }
  
  trait EntryObject extends StObject {
    
    /**
    	 * The IP address (can be an IPv4 or IPv5 address).
    	 */
    val address: String
    
    /**
    	 * The expiration timestamp.
    	 */
    val expires: js.UndefOr[Double] = js.undefined
    
    /**
    	 * The IP family.
    	 */
    val family: IPFamily
    
    /**
    	 * The original TTL.
    	 */
    val ttl: js.UndefOr[Double] = js.undefined
  }
  object EntryObject {
    
    inline def apply(address: String, family: IPFamily): EntryObject = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any])
      __obj.asInstanceOf[EntryObject]
    }
    
    extension [Self <: EntryObject](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      inline def setFamily(value: IPFamily): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.cacheableLookup.cacheableLookupNumbers.`4`
    - typings.cacheableLookup.cacheableLookupNumbers.`6`
  */
  trait IPFamily extends StObject
  object IPFamily {
    
    inline def `4`: typings.cacheableLookup.cacheableLookupNumbers.`4` = 4.asInstanceOf[typings.cacheableLookup.cacheableLookupNumbers.`4`]
    
    inline def `6`: typings.cacheableLookup.cacheableLookupNumbers.`6` = 6.asInstanceOf[typings.cacheableLookup.cacheableLookupNumbers.`6`]
  }
  
  trait LookupOptions extends StObject {
    
    /**
    	 * When `true`, the callback returns all resolved addresses in an array. Otherwise, returns a single address.
    	 * @default false
    	 */
    var all: js.UndefOr[Boolean] = js.undefined
    
    /**
    	 * The record family. Must be `4` or `6`. IPv4 and IPv6 addresses are both returned by default.
    	 */
    var family: js.UndefOr[IPFamily] = js.undefined
    
    /**
    	 * One or more supported getaddrinfo flags. Multiple flags may be passed by bitwise ORing their values.
    	 */
    var hints: js.UndefOr[Double] = js.undefined
  }
  object LookupOptions {
    
    inline def apply(): LookupOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LookupOptions]
    }
    
    extension [Self <: LookupOptions](x: Self) {
      
      inline def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
      
      inline def setFamily(value: IPFamily): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      inline def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
      
      inline def setHints(value: Double): Self = StObject.set(x, "hints", value.asInstanceOf[js.Any])
      
      inline def setHintsUndefined: Self = StObject.set(x, "hints", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    /**
    	 * Custom cache instance. If `undefined`, it will create a new one.
    	 * @default undefined
    	 */
    var cache: js.UndefOr[CacheInstance] = js.undefined
    
    /**
    	 * The time how long it needs to remember failed queries (TTL in seconds).
    	 *
    	 * **Note**: This option is independent, `options.maxTtl` does not affect this.
    	 * @default 0.15
    	 */
    var errorTtl: js.UndefOr[Double] = js.undefined
    
    /**
    	 * When the DNS server responds with `ENOTFOUND` or `ENODATA` and the OS reports that the entry is available,
    	 * it will use `dns.lookup(...)` directly for the requested hostnames for the specified amount of time (in seconds).
    	 *
    	 * If you don't query internal hostnames (such as `localhost`, `database.local` etc.),
    	 * it is strongly recommended to set this value to `0`.
    	 * @default 3600
    	 */
    var fallbackDuration: js.UndefOr[Double] = js.undefined
    
    /**
    	 * The fallback function to use when the DNS server responds with `ENOTFOUND` or `ENODATA`.
    	 *
    	 * **Note**: This has no effect if the `fallbackDuration` option is less than `1`.
    	 * @default dns.lookup
    	 */
    var lookup: js.UndefOr[Typeoflookup] = js.undefined
    
    /**
    	 * Limits the cache time (TTL). If set to `0`, it will make a new DNS query each time.
    	 * @default Infinity
    	 */
    var maxTtl: js.UndefOr[Double] = js.undefined
    
    /**
    	 * DNS Resolver used to make DNS queries.
    	 * @default new dns.promises.Resolver()
    	 */
    var resolver: js.UndefOr[typings.node.dnsMod.Resolver | AsyncResolver] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCache(value: CacheInstance): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setErrorTtl(value: Double): Self = StObject.set(x, "errorTtl", value.asInstanceOf[js.Any])
      
      inline def setErrorTtlUndefined: Self = StObject.set(x, "errorTtl", js.undefined)
      
      inline def setFallbackDuration(value: Double): Self = StObject.set(x, "fallbackDuration", value.asInstanceOf[js.Any])
      
      inline def setFallbackDurationUndefined: Self = StObject.set(x, "fallbackDuration", js.undefined)
      
      inline def setLookup(value: Typeoflookup): Self = StObject.set(x, "lookup", value.asInstanceOf[js.Any])
      
      inline def setLookupUndefined: Self = StObject.set(x, "lookup", js.undefined)
      
      inline def setMaxTtl(value: Double): Self = StObject.set(x, "maxTtl", value.asInstanceOf[js.Any])
      
      inline def setMaxTtlUndefined: Self = StObject.set(x, "maxTtl", js.undefined)
      
      inline def setResolver(value: typings.node.dnsMod.Resolver | AsyncResolver): Self = StObject.set(x, "resolver", value.asInstanceOf[js.Any])
      
      inline def setResolverUndefined: Self = StObject.set(x, "resolver", js.undefined)
    }
  }
  
  type TPromise[T] = T | js.Promise[T]
}
