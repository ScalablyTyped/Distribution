package typings.cacache.enMod

import typings.cacache.Anon_Algorithm
import typings.cacache.cacacheNumbers.`false`
import typings.cacache.enMod.getNs.HasContentObject
import typings.cacache.enMod.getNs.Options
import typings.node.NodeJSNs.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cacache/en", "get")
@js.native
object getNs extends js.Object {
  trait HasContentObject extends js.Object {
    var size: Double
    var sri: Anon_Algorithm
  }
  
  trait Options extends js.Object {
    var integrity: js.UndefOr[String] = js.undefined
    var memoize: js.UndefOr[Boolean] = js.undefined
    var size: js.UndefOr[Double] = js.undefined
  }
  
  def byDigest(cachePath: String, hash: String): js.Promise[String] = js.native
  def byDigest(cachePath: String, hash: String, opts: Options): js.Promise[String] = js.native
  def copy(cachePath: String, key: String, dest: String): js.Promise[CacheObject] = js.native
  def copy(cachePath: String, key: String, dest: String, opts: Options): js.Promise[CacheObject] = js.native
  /**
    * Looks up a Subresource Integrity hash in the cache. If content exists
    * for this `integrity`, it will return an object, with the specific single
    * integrity hash that was found in sri key, and the size of the found
    * content as size. If no content exists for this integrity, it will return
    * `false`.
    */
  def hasContent(cachePath: String, hash: String): js.Promise[HasContentObject | `false`] = js.native
  def hasContentnc(cachePath: String, hash: String): HasContentObject | `false` = js.native
  /**
    * Looks up `key` in the cache index, returning information about the entry
    * if one exists.
    */
  def info(cachePath: String, key: String): js.Promise[CacheObject] = js.native
  /**
    * Returns a Readable Stream of the cached data identified by `key`.
    *
    * If there is no content identified by `key`, or if the locally-stored data
    * does not pass the validity checksum, an error will be emitted.
    *
    * `metadata` and `integrity` events will be emitted before the stream
    * closes, if you need to collect that extra data about the cached entry.
    *
    * A sub-function, `get.stream.byDigest` may be used for identical behavior,
    * except lookup will happen by integrity hash, bypassing the index
    * entirely. This version does not emit the `metadata` and `integrity`
    * events at all.
    */
  def stream(cachePath: String, key: String): ReadableStream = js.native
  def stream(cachePath: String, key: String, opts: Options): ReadableStream = js.native
  def sync(cachePath: String, key: String): CacheObject = js.native
  def sync(cachePath: String, key: String, opts: Options): CacheObject = js.native
  def syncDigest(cachePath: String, key: String): CacheObject = js.native
  def syncDigest(cachePath: String, key: String, opts: Options): CacheObject = js.native
  @JSName("copy")
  @js.native
  object copyNs extends js.Object {
    def byDigest(cachePath: String, hash: String, dest: String): js.Promise[String] = js.native
    def byDigest(cachePath: String, hash: String, dest: String, opts: Options): js.Promise[String] = js.native
  }
  
  @JSName("stream")
  @js.native
  object streamNs extends js.Object {
    def byDigest(cachePath: String, hash: String): ReadableStream = js.native
    def byDigest(cachePath: String, hash: String, opts: Options): ReadableStream = js.native
  }
  
}

