package typings.cacache.enMod

import typings.cacache.enMod.putNs.Options
import typings.node.NodeJSNs.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cacache/en", "put")
@js.native
object putNs extends js.Object {
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
  
  /**
    * Returns a Writable Stream that inserts data written to it into the cache.
    * Emits an `integrity` event with the digest of written contents when it
    * succeeds.
    */
  def stream(cachePath: String, key: String): WritableStream = js.native
  def stream(cachePath: String, key: String, opts: Options): WritableStream = js.native
}

