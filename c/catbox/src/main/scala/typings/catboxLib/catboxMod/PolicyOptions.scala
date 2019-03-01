package typings
package catboxLib.catboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyOptions[T] extends PolicyOptionVariants[T] {
  /** dropOnError - if true, an error or timeout in the generateFunc causes the stale value to be evicted from the cache. Defaults to true. */
  var dropOnError: js.UndefOr[scala.Boolean] = js.undefined
  /** expiresAt - time of day expressed in 24h notation using the 'HH:MM' format, at which point all cache records for the route expire. Uses local time. Cannot be used together with expiresIn. */
  var expiresAt: js.UndefOr[java.lang.String] = js.undefined
  /** expiresIn - relative expiration expressed in the number of milliseconds since the item was saved in the cache. Cannot be used together with expiresAt. */
  var expiresIn: js.UndefOr[scala.Double] = js.undefined
  /** generateFunc - a function used to generate a new cache item if one is not found in the cache when calling get(). The method's signature is function(id, next) where: */
  var generateFunc: js.UndefOr[GenerateFunc[T]] = js.undefined
  /** generateIgnoreWriteError - if false, an upstream cache write error will be passed back with the generated value when calling the get() method. Defaults to true. */
  var generateIgnoreWriteError: js.UndefOr[scala.Boolean] = js.undefined
  /** generateOnReadError - if false, an upstream cache read error will stop the get() method from calling the generate function and will instead pass back the cache error. Defaults to true. */
  var generateOnReadError: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * generateTimeout - number of milliseconds to wait before returning a timeout error when the generateFunc function takes too long to return a value.
    * When the value is eventually returned, it is stored in the cache for future requests. Required if generateFunc is present.
    * Set to false to disable timeouts which may cause all get() requests to get stuck forever.
    */
  var generateTimeout: js.UndefOr[scala.Double | catboxLib.catboxLibNumbers.`false`] = js.undefined
  /**
    * pendingGenerateTimeout - number of milliseconds while generateFunc call is in progress for a given id, before a subsequent generateFunc call is allowed.
    * @default 0, no blocking of concurrent generateFunc calls beyond staleTimeout.
    */
  var pendingGenerateTimeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * staleIn - number of milliseconds to mark an item stored in cache as stale and attempt to regenerate it when generateFunc is provided.
    * Must be less than expiresIn. Alternatively function that returns staleIn value in milliseconds. The function signature is function(stored, ttl) where:
    *  * stored - the timestamp when the item was stored in the cache (in milliseconds).
    *  * ttl - the remaining time-to-live (not the original value used when storing the object).
    */
  var staleIn: js.UndefOr[
    scala.Double | (js.Function2[/* stored */ scala.Double, /* ttl */ scala.Double, scala.Double])
  ] = js.undefined
  /** staleTimeout - number of milliseconds to wait before returning a stale value while generateFunc is generating a fresh value. */
  var staleTimeout: js.UndefOr[scala.Double] = js.undefined
}

object PolicyOptions {
  @scala.inline
  def apply[T](
    dropOnError: js.UndefOr[scala.Boolean] = js.undefined,
    expiresAt: java.lang.String = null,
    expiresIn: scala.Int | scala.Double = null,
    generateFunc: GenerateFunc[T] = null,
    generateIgnoreWriteError: js.UndefOr[scala.Boolean] = js.undefined,
    generateOnReadError: js.UndefOr[scala.Boolean] = js.undefined,
    generateTimeout: scala.Double | catboxLib.catboxLibNumbers.`false` = null,
    pendingGenerateTimeout: scala.Int | scala.Double = null,
    staleIn: scala.Double | (js.Function2[/* stored */ scala.Double, /* ttl */ scala.Double, scala.Double]) = null,
    staleTimeout: scala.Int | scala.Double = null
  ): PolicyOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dropOnError)) __obj.updateDynamic("dropOnError")(dropOnError)
    if (expiresAt != null) __obj.updateDynamic("expiresAt")(expiresAt)
    if (expiresIn != null) __obj.updateDynamic("expiresIn")(expiresIn.asInstanceOf[js.Any])
    if (generateFunc != null) __obj.updateDynamic("generateFunc")(generateFunc)
    if (!js.isUndefined(generateIgnoreWriteError)) __obj.updateDynamic("generateIgnoreWriteError")(generateIgnoreWriteError)
    if (!js.isUndefined(generateOnReadError)) __obj.updateDynamic("generateOnReadError")(generateOnReadError)
    if (generateTimeout != null) __obj.updateDynamic("generateTimeout")(generateTimeout.asInstanceOf[js.Any])
    if (pendingGenerateTimeout != null) __obj.updateDynamic("pendingGenerateTimeout")(pendingGenerateTimeout.asInstanceOf[js.Any])
    if (staleIn != null) __obj.updateDynamic("staleIn")(staleIn.asInstanceOf[js.Any])
    if (staleTimeout != null) __obj.updateDynamic("staleTimeout")(staleTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyOptions[T]]
  }
}

