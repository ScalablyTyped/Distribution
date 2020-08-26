package typings.cacheableLookup.mod

import typings.keyv.mod.^
import typings.node.dnsMod.Resolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
  	 * A Keyv adapter which stores the cache.
  	 * @default new Map()
  	 */
  var cacheAdapter: js.UndefOr[^[_]] = js.native
  /**
  	 * Limits the cache time (TTL). If set to `0`, it will make a new DNS query each time.
  	 * @default Infinity
  	 */
  var maxTtl: js.UndefOr[Double] = js.native
  /**
  	 * DNS Resolver used to make DNS queries.
  	 * @default new dns.Resolver()
  	 */
  var resolver: js.UndefOr[Resolver] = js.native
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
    def setCacheAdapter(value: ^[_]): Self = this.set("cacheAdapter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheAdapter: Self = this.set("cacheAdapter", js.undefined)
    @scala.inline
    def setMaxTtl(value: Double): Self = this.set("maxTtl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxTtl: Self = this.set("maxTtl", js.undefined)
    @scala.inline
    def setResolver(value: Resolver): Self = this.set("resolver", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolver: Self = this.set("resolver", js.undefined)
  }
  
}

