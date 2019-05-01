package typings
package bashDashGlobLib.bashDashGlobMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bash-glob", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(pattern: Patterns, callback: Callback): scala.Unit = js.native
  def apply(pattern: Patterns, options: Options, callback: Callback): scala.Unit = js.native
  def each(patterns: Patterns, callback: Callback): scala.Unit = js.native
  def each(patterns: Patterns, options: Options, callback: Callback): scala.Unit = js.native
  @JSName("on")
  def on_end(
    event: bashDashGlobLib.bashDashGlobLibStrings.end,
    callback: js.Function1[/* files */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_files(
    event: bashDashGlobLib.bashDashGlobLibStrings.files,
    callback: js.Function2[/* files */ java.lang.String, /* cwd */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_match(
    event: bashDashGlobLib.bashDashGlobLibStrings.`match`,
    callback: js.Function2[/* files */ java.lang.String, /* cwd */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def promise(patterns: Patterns): js.Promise[js.Array[java.lang.String]] = js.native
  def promise(patterns: Patterns, options: Options): js.Promise[js.Array[java.lang.String]] = js.native
  def sync(patterns: Patterns): js.Array[java.lang.String] = js.native
  def sync(patterns: Patterns, options: Options): js.Array[java.lang.String] = js.native
}

