package typings.builderDashUtil.builderDashUtilMod

import typings.node.childUnderscoreProcessMod.ExecFileOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("builder-util", "exec")
@js.native
object exec extends js.Object {
  def apply(file: String): js.Promise[String] = js.native
  def apply(file: String, args: js.Array[String]): js.Promise[String] = js.native
  def apply(file: String, args: js.Array[String], options: ExecFileOptions): js.Promise[String] = js.native
  def apply(file: String, args: js.Array[String], options: ExecFileOptions, isLogOutIfDebug: Boolean): js.Promise[String] = js.native
  def apply(file: String, args: Null, options: ExecFileOptions): js.Promise[String] = js.native
  def apply(file: String, args: Null, options: ExecFileOptions, isLogOutIfDebug: Boolean): js.Promise[String] = js.native
}

