package typings.cacache.enMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cacache/en", "rm")
@js.native
object rmNs extends js.Object {
  /**
    * Clears the entire cache. Mainly by blowing away the cache directory
    * itself.
    */
  def all(cachePath: String): js.Promise[Unit] = js.native
  /**
    * Removes the content identified by `integrity`. Any index entries
    * referring to it will not be usable again until the content is re-added
    * to the cache with an identical digest.
    */
  def content(cachePath: String, hash: String): js.Promise[Boolean] = js.native
  /**
    * Removes the index entry for `key`. Content will still be accessible if
    * requested directly by content address (`get.stream.byDigest`).
    *
    * To remove the content itself (which might still be used by other
    * entries), use `rm.content`. Or, to safely vacuum any unused content,
    * use `verify`.
    */
  def entry(cachePath: String, key: String): js.Promise[CacheObject] = js.native
}

