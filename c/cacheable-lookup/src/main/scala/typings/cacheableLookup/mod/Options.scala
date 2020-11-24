package typings.cacheableLookup.mod

import typings.cacheableLookup.anon.Typeoflookup
import typings.node.dnsMod.Resolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
  	 * Custom cache instance. If `undefined`, it will create a new one.
  	 * @default undefined
  	 */
  var cache: js.UndefOr[CacheInstance] = js.native
  
  /**
  	 * The time how long it needs to remember failed queries (TTL in seconds).
  	 *
  	 * **Note**: This option is independent, `options.maxTtl` does not affect this.
  	 * @default 0.15
  	 */
  var errorTtl: js.UndefOr[Double] = js.native
  
  /**
  	 * When the DNS server responds with `ENOTFOUND` or `ENODATA` and the OS reports that the entry is available,
  	 * it will use `dns.lookup(...)` directly for the requested hostnames for the specified amount of time (in seconds).
  	 *
  	 * If you don't query internal hostnames (such as `localhost`, `database.local` etc.),
  	 * it is strongly recommended to set this value to `0`.
  	 * @default 3600
  	 */
  var fallbackDuration: js.UndefOr[Double] = js.native
  
  /**
  	 * The fallback function to use when the DNS server responds with `ENOTFOUND` or `ENODATA`.
  	 *
  	 * **Note**: This has no effect if the `fallbackDuration` option is less than `1`.
  	 * @default dns.lookup
  	 */
  var lookup: js.UndefOr[Typeoflookup] = js.native
  
  /**
  	 * Limits the cache time (TTL). If set to `0`, it will make a new DNS query each time.
  	 * @default Infinity
  	 */
  var maxTtl: js.UndefOr[Double] = js.native
  
  /**
  	 * DNS Resolver used to make DNS queries.
  	 * @default new dns.promises.Resolver()
  	 */
  var resolver: js.UndefOr[Resolver | AsyncResolver] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCache(value: CacheInstance): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    
    @scala.inline
    def setErrorTtl(value: Double): Self = this.set("errorTtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorTtl: Self = this.set("errorTtl", js.undefined)
    
    @scala.inline
    def setFallbackDuration(value: Double): Self = this.set("fallbackDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallbackDuration: Self = this.set("fallbackDuration", js.undefined)
    
    @scala.inline
    def setLookup(value: Typeoflookup): Self = this.set("lookup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLookup: Self = this.set("lookup", js.undefined)
    
    @scala.inline
    def setMaxTtl(value: Double): Self = this.set("maxTtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxTtl: Self = this.set("maxTtl", js.undefined)
    
    @scala.inline
    def setResolver(value: Resolver | AsyncResolver): Self = this.set("resolver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolver: Self = this.set("resolver", js.undefined)
  }
}
