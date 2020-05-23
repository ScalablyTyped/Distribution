package typings.cacheableLookup.mod

import typings.keyv.mod.^
import typings.node.dnsMod.Resolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  	 * A Keyv adapter which stores the cache.
  	 * @default new Map()
  	 */
  var cacheAdapter: js.UndefOr[^[_]] = js.undefined
  /**
  	 * Limits the cache time (TTL). If set to `0`, it will make a new DNS query each time.
  	 * @default Infinity
  	 */
  var maxTtl: js.UndefOr[Double] = js.undefined
  /**
  	 * DNS Resolver used to make DNS queries.
  	 * @default new dns.Resolver()
  	 */
  var resolver: js.UndefOr[Resolver] = js.undefined
}

object Options {
  @scala.inline
  def apply(cacheAdapter: ^[_] = null, maxTtl: js.UndefOr[Double] = js.undefined, resolver: Resolver = null): Options = {
    val __obj = js.Dynamic.literal()
    if (cacheAdapter != null) __obj.updateDynamic("cacheAdapter")(cacheAdapter.asInstanceOf[js.Any])
    if (!js.isUndefined(maxTtl)) __obj.updateDynamic("maxTtl")(maxTtl.get.asInstanceOf[js.Any])
    if (resolver != null) __obj.updateDynamic("resolver")(resolver.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

