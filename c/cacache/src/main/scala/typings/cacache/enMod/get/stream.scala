package typings.cacache.enMod.get

import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cacache/en", "get.stream")
@js.native
object stream extends js.Object {
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
  def apply(cachePath: String, key: String): ReadableStream = js.native
  def apply(cachePath: String, key: String, opts: Options): ReadableStream = js.native
  def byDigest(cachePath: String, hash: String): ReadableStream = js.native
  def byDigest(cachePath: String, hash: String, opts: Options): ReadableStream = js.native
}

