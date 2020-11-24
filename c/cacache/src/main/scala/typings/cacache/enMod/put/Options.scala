package typings.cacache.enMod.put

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
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
  var algorithms: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * If present, the pre-calculated digest for the inserted content. If
    * this option if provided and does not match the post-insertion digest,
    * insertion will fail with an `EINTEGRITY` error.
    *
    * `algorithms` has no effect if this option is present.
    */
  var integrity: js.UndefOr[String] = js.native
  
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
  var memoize: js.UndefOr[Null | Boolean] = js.native
  
  /** Arbitrary metadata to be attached to the inserted key. */
  var metadata: js.UndefOr[js.Any] = js.native
  
  /**
    * If provided, the data stream will be verified to check that enough
    * data was passed through. If there's more or less data than expected,
    * insertion will fail with an `EBADSIZE` error.
    */
  var size: js.UndefOr[Double] = js.native
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
    def setAlgorithmsVarargs(value: String*): Self = this.set("algorithms", js.Array(value :_*))
    
    @scala.inline
    def setAlgorithms(value: js.Array[String]): Self = this.set("algorithms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlgorithms: Self = this.set("algorithms", js.undefined)
    
    @scala.inline
    def setIntegrity(value: String): Self = this.set("integrity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntegrity: Self = this.set("integrity", js.undefined)
    
    @scala.inline
    def setMemoize(value: Boolean): Self = this.set("memoize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemoize: Self = this.set("memoize", js.undefined)
    
    @scala.inline
    def setMemoizeNull: Self = this.set("memoize", null)
    
    @scala.inline
    def setMetadata(value: js.Any): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
