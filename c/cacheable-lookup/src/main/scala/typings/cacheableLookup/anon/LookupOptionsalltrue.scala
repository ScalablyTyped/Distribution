package typings.cacheableLookup.anon

import typings.cacheableLookup.cacheableLookupBooleans.`true`
import typings.cacheableLookup.mod.IPFamily
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined cacheable-lookup.cacheable-lookup.LookupOptions & {  all :true} */
@js.native
trait LookupOptionsalltrue extends js.Object {
  /**
  	 * When `true`, the callback returns all resolved addresses in an array. Otherwise, returns a single address.
  	 * @default false
  	 */
  var all: js.UndefOr[Boolean] with `true` = js.native
  /**
  	 * The record family. Must be `4` or `6`. IPv4 and IPv6 addresses are both returned by default.
  	 */
  var family: js.UndefOr[IPFamily] = js.native
  /**
  	 * One or more supported getaddrinfo flags. Multiple flags may be passed by bitwise ORing their values.
  	 */
  var hints: js.UndefOr[Double] = js.native
  /**
  	 * Throw when there's no match. If set to `false` and it gets no match, it will return `undefined`.
  	 * @default false
  	 */
  var throwNotFound: js.UndefOr[Boolean] = js.native
}

object LookupOptionsalltrue {
  @scala.inline
  def apply(all: js.UndefOr[Boolean] with `true`): LookupOptionsalltrue = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookupOptionsalltrue]
  }
  @scala.inline
  implicit class LookupOptionsalltrueOps[Self <: LookupOptionsalltrue] (val x: Self) extends AnyVal {
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
    def setAll(value: js.UndefOr[Boolean] with `true`): Self = this.set("all", value.asInstanceOf[js.Any])
    @scala.inline
    def setFamily(value: IPFamily): Self = this.set("family", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFamily: Self = this.set("family", js.undefined)
    @scala.inline
    def setHints(value: Double): Self = this.set("hints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHints: Self = this.set("hints", js.undefined)
    @scala.inline
    def setThrowNotFound(value: Boolean): Self = this.set("throwNotFound", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThrowNotFound: Self = this.set("throwNotFound", js.undefined)
  }
  
}

