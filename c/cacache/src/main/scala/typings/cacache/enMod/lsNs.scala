package typings.cacache.enMod

import typings.cacache.Anon_Size
import typings.node.NodeJSNs.ReadableStream
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cacache/en", "ls")
@js.native
object lsNs extends js.Object {
  /**
    * Lists info for all entries currently in the cache as a single large
    * object.
    *
    * This works just like `ls`, except `get.info` entries are returned as
    * `'data'` events on the returned stream.
    */
  def stream(cachePath: String): ReadableStream = js.native
  type Cache = Record[String, CacheObject with Anon_Size]
}

