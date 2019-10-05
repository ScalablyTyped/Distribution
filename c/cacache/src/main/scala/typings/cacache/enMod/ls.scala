package typings.cacache.enMod

import typings.cacache.Anon_Size
import typings.cacache.enMod.ls.Cache
import typings.node.NodeJS.ReadableStream
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cacache/en", "ls")
@js.native
object ls extends js.Object {
  def apply(cachePath: String): js.Promise[Cache] = js.native
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

