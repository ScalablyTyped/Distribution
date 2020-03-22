package typings.cacheableLookup

import typings.cacheableLookup.cacheableLookupBooleans.`true`
import typings.cacheableLookup.mod.IPFamily
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined cacheable-lookup.cacheable-lookup.LookupOptions & {  all  :true} */
trait LookupOptionsalltrue extends js.Object {
  /**
  	 * When `true`, the callback returns all resolved addresses in an array. Otherwise, returns a single address.
  	 * @default false
  	 */
  var all: js.UndefOr[Boolean with `true`] = js.undefined
  /**
  	 * The record family. Must be `4` or `6`. IPv4 and IPv6 addresses are both returned by default.
  	 */
  var family: js.UndefOr[IPFamily] = js.undefined
  /**
  	 * One or more supported getaddrinfo flags. Multiple flags may be passed by bitwise ORing their values.
  	 */
  var hints: js.UndefOr[Double] = js.undefined
  /**
  	 * Throw when there's no match. If set to `false` and it gets no match, it will return `undefined`.
  	 * @default false
  	 */
  var throwNotFound: js.UndefOr[Boolean] = js.undefined
}

object LookupOptionsalltrue {
  @scala.inline
  def apply(
    all: js.UndefOr[Boolean with `true`] = js.undefined,
    family: IPFamily = null,
    hints: Int | Double = null,
    throwNotFound: js.UndefOr[Boolean] = js.undefined
  ): LookupOptionsalltrue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(all)) __obj.updateDynamic("all")(all.asInstanceOf[js.Any])
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (hints != null) __obj.updateDynamic("hints")(hints.asInstanceOf[js.Any])
    if (!js.isUndefined(throwNotFound)) __obj.updateDynamic("throwNotFound")(throwNotFound.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookupOptionsalltrue]
  }
}

