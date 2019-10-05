package typings.cacache.enMod.tmp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cacache/en", "tmp.mkdir")
@js.native
object mkdir extends js.Object {
  /**
    * Returns a unique temporary directory inside the cache's `tmp` dir. This
    * directory will use the same safe user assignment that all the other stuff
    * use.
    *
    * Once the directory is made, it's the user's responsibility that all files
    * within are given the appropriate `gid`/`uid` ownership settings to match
    * the rest of the cache. If not, you can ask cacache to do it for you by
    * calling `tmp.fix()`, which will fix all tmp directory permissions.
    *
    * If you want automatic cleanup of this directory, use `tmp.withTmp()`
    */
  def apply(cachePath: String): js.Promise[String] = js.native
  def apply(cachePath: String, opts: Options): js.Promise[String] = js.native
}

