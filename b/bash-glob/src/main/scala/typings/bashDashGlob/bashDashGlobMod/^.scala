package typings.bashDashGlob.bashDashGlobMod

import typings.bashDashGlob.bashDashGlobStrings.`match`
import typings.bashDashGlob.bashDashGlobStrings.end
import typings.bashDashGlob.bashDashGlobStrings.files
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bash-glob", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(pattern: Patterns, callback: Callback): Unit = js.native
  def apply(pattern: Patterns, options: Options, callback: Callback): Unit = js.native
  def each(patterns: Patterns, callback: Callback): Unit = js.native
  def each(patterns: Patterns, options: Options, callback: Callback): Unit = js.native
  @JSName("on")
  def on_end(event: end, callback: js.Function1[/* files */ String, Unit]): Unit = js.native
  @JSName("on")
  def on_files(event: files, callback: js.Function2[/* files */ String, /* cwd */ String, Unit]): Unit = js.native
  @JSName("on")
  def on_match(event: `match`, callback: js.Function2[/* files */ String, /* cwd */ String, Unit]): Unit = js.native
  def promise(patterns: Patterns): js.Promise[js.Array[String]] = js.native
  def promise(patterns: Patterns, options: Options): js.Promise[js.Array[String]] = js.native
  def sync(patterns: Patterns): js.Array[String] = js.native
  def sync(patterns: Patterns, options: Options): js.Array[String] = js.native
}

