package typings
package cacheableDashRequestLib.cacheableDashRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * When set to `true`, if the DB connection fails we will automatically fallback to a network request.
    * DB errors will still be emitted to notify you of the problem even though the request callback may succeed.
    * @default false
    */
  var automaticFailover: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If the cache should be used. Setting this to `false` will completely bypass the cache for the current request.
    * @default true
    */
  var cache: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Forces refreshing the cache. If the response could be retrieved from the cache, it will perform a
    * new request and override the cache instead.
    * @default false
    */
  var forceRefresh: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Limits TTL. The `number` represents milliseconds.
    * @default undefined
    */
  var maxTtl: js.UndefOr[scala.Double] = js.undefined
  /**
    * If set to `true` once a cached resource has expired it is deleted and will have to be re-requested.
    *
    * If set to `false`, after a cached resource's TTL expires it is kept in the cache and will be revalidated
    * on the next request with `If-None-Match`/`If-Modified-Since` headers.
    * @default false
    */
  var strictTtl: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    automaticFailover: js.UndefOr[scala.Boolean] = js.undefined,
    cache: js.UndefOr[scala.Boolean] = js.undefined,
    forceRefresh: js.UndefOr[scala.Boolean] = js.undefined,
    maxTtl: scala.Int | scala.Double = null,
    strictTtl: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(automaticFailover)) __obj.updateDynamic("automaticFailover")(automaticFailover)
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (!js.isUndefined(forceRefresh)) __obj.updateDynamic("forceRefresh")(forceRefresh)
    if (maxTtl != null) __obj.updateDynamic("maxTtl")(maxTtl.asInstanceOf[js.Any])
    if (!js.isUndefined(strictTtl)) __obj.updateDynamic("strictTtl")(strictTtl)
    __obj.asInstanceOf[Options]
  }
}

