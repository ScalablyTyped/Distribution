package typings.catbox.mod

import typings.catbox.catboxBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class PolicyOptionsOps[Self <: PolicyOptions[_], T] (val x: Self with PolicyOptions[T]) extends AnyVal {
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
    def setDropOnError(value: Boolean): Self = this.set("dropOnError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropOnError: Self = this.set("dropOnError", js.undefined)
    @scala.inline
    def setExpiresAt(value: String): Self = this.set("expiresAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpiresAt: Self = this.set("expiresAt", js.undefined)
    @scala.inline
    def setExpiresIn(value: Double): Self = this.set("expiresIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpiresIn: Self = this.set("expiresIn", js.undefined)
    @scala.inline
    def setGenerateFunc(value: (/* id */ Id, /* flags */ GenerateFuncFlags) => js.Promise[T]): Self = this.set("generateFunc", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGenerateFunc: Self = this.set("generateFunc", js.undefined)
    @scala.inline
    def setGenerateIgnoreWriteError(value: Boolean): Self = this.set("generateIgnoreWriteError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGenerateIgnoreWriteError: Self = this.set("generateIgnoreWriteError", js.undefined)
    @scala.inline
    def setGenerateOnReadError(value: Boolean): Self = this.set("generateOnReadError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGenerateOnReadError: Self = this.set("generateOnReadError", js.undefined)
    @scala.inline
    def setGenerateTimeout(value: Double | `false`): Self = this.set("generateTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGenerateTimeout: Self = this.set("generateTimeout", js.undefined)
    @scala.inline
    def setPendingGenerateTimeout(value: Double): Self = this.set("pendingGenerateTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePendingGenerateTimeout: Self = this.set("pendingGenerateTimeout", js.undefined)
    @scala.inline
    def setStaleInFunction2(value: (/* stored */ Double, /* ttl */ Double) => Double): Self = this.set("staleIn", js.Any.fromFunction2(value))
    @scala.inline
    def setStaleIn(value: Double | (js.Function2[/* stored */ Double, /* ttl */ Double, Double])): Self = this.set("staleIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStaleIn: Self = this.set("staleIn", js.undefined)
    @scala.inline
    def setStaleTimeout(value: Double): Self = this.set("staleTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStaleTimeout: Self = this.set("staleTimeout", js.undefined)
  }
  
}

