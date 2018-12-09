package typings
package bashDashGlobLib.bashDashGlobMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bash-glob", JSImport.Namespace)
@js.native
object bashDashGlobModMembers extends js.Object {
  def apply(pattern: bashDashGlobLib.Patterns, callback: bashDashGlobLib.Callback): scala.Unit = js.native
  def apply(
    pattern: bashDashGlobLib.Patterns,
    options: bashDashGlobLib.bashDashGlobMod.bashGlobNs.Options,
    callback: bashDashGlobLib.Callback
  ): scala.Unit = js.native
  def each(patterns: bashDashGlobLib.Patterns, callback: bashDashGlobLib.Callback): scala.Unit = js.native
  def each(
    patterns: bashDashGlobLib.Patterns,
    options: bashDashGlobLib.bashDashGlobMod.bashGlobNs.Options,
    callback: bashDashGlobLib.Callback
  ): scala.Unit = js.native
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
  def promise(patterns: bashDashGlobLib.Patterns): js.Promise[js.Array[java.lang.String]] = js.native
  def promise(patterns: bashDashGlobLib.Patterns, options: bashDashGlobLib.bashDashGlobMod.bashGlobNs.Options): js.Promise[js.Array[java.lang.String]] = js.native
  def sync(patterns: bashDashGlobLib.Patterns): js.Array[java.lang.String] = js.native
  def sync(patterns: bashDashGlobLib.Patterns, options: bashDashGlobLib.bashDashGlobMod.bashGlobNs.Options): js.Array[java.lang.String] = js.native
}

