package typings.cacache.enMod.put

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Default: `['sha512']`
    *
    * Hashing algorithms to use when calculating the subresource integrity
    * digest for inserted data. Can use any algorithm listed in
    * `crypto.getHashes()` or `'omakase'`/`'お任せします'` to pick a random
    * hash algorithm on each insertion. You may also use any anagram of
    * `'modnar'` to use this feature.
    *
    * Currently only supports one algorithm at a time (i.e., an array
    * length of exactly `1`). Has no effect if `opts.integrity` is present.
    */
  var algorithms: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * If present, the pre-calculated digest for the inserted content. If
    * this option if provided and does not match the post-insertion digest,
    * insertion will fail with an `EINTEGRITY` error.
    *
    * `algorithms` has no effect if this option is present.
    */
  var integrity: js.UndefOr[String] = js.undefined
  /**
    * Default: `null`
    *
    * If provided, cacache will memoize the given cache insertion in
    * memory, bypassing any filesystem checks for that key or digest in
    * future cache fetches. Nothing will be written to the in-memory cache
    * unless this option is explicitly truthy.
    *
    * If `opts.memoize` is an object or a `Map`-like (that is, an object
    * with `get` and `set` methods), it will be written to instead of the
    * global memoization cache.
    *
    * Reading from disk data can be forced by explicitly passing
    * `memoize: false` to the reader functions, but their default will be
    * to read from memory.
    */
  var memoize: js.UndefOr[Null | Boolean] = js.undefined
  /** Arbitrary metadata to be attached to the inserted key. */
  var metadata: js.UndefOr[js.Any] = js.undefined
  /**
    * If provided, the data stream will be verified to check that enough
    * data was passed through. If there's more or less data than expected,
    * insertion will fail with an `EBADSIZE` error.
    */
  var size: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    algorithms: js.Array[String] = null,
    integrity: String = null,
    memoize: js.UndefOr[Null | Boolean] = js.undefined,
    metadata: js.Any = null,
    size: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (algorithms != null) __obj.updateDynamic("algorithms")(algorithms.asInstanceOf[js.Any])
    if (integrity != null) __obj.updateDynamic("integrity")(integrity.asInstanceOf[js.Any])
    if (!js.isUndefined(memoize)) __obj.updateDynamic("memoize")(memoize.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

