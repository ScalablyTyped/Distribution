package typings.cacache.enMod

import typings.cacache.enMod.tmpNs.Callback
import typings.cacache.enMod.tmpNs.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cacache/en", "tmp")
@js.native
object tmpNs extends js.Object {
  trait Options extends js.Object {
    var tmpPrefix: js.UndefOr[String] = js.undefined
  }
  
  /**
    * Sets the `uid` and `gid` properties on all files and folders within the
    * tmp folder to match the rest of the cache.
    *
    * Use this after manually writing files into `tmp.mkdir` or `tmp.withTmp`.
    */
  def fix(cachePath: String): js.Promise[Unit] = js.native
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
  def mkdir(cachePath: String): js.Promise[String] = js.native
  def mkdir(cachePath: String, opts: Options): js.Promise[String] = js.native
  def withTmp(cachePath: String, cb: Callback): Unit = js.native
  /**
    * Creates a temporary directory with `tmp.mkdir()` and calls `cb` with it.
    * The created temporary directory will be removed when the return value of
    * `cb()` resolves -- that is, if you return a Promise from `cb()`, the tmp
    * directory will be automatically deleted once that promise completes.
    *
    * The same caveats apply when it comes to managing permissions for the tmp dir's contents.
    */
  def withTmp(cachePath: String, opts: Options, cb: Callback): Unit = js.native
  type Callback = js.Function1[/* dir */ String, Unit]
}

