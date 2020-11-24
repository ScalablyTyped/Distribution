package typings.builderUtil.mod

import typings.node.childProcessMod.ExecFileOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("builder-util", "exec")
@js.native
object exec extends js.Object {
  
  def apply(file: String): js.Promise[String] = js.native
  def apply(
    file: String,
    args: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    isLogOutIfDebug: Boolean
  ): js.Promise[String] = js.native
  def apply(file: String, args: js.UndefOr[scala.Nothing], options: ExecFileOptions): js.Promise[String] = js.native
  def apply(file: String, args: js.UndefOr[scala.Nothing], options: ExecFileOptions, isLogOutIfDebug: Boolean): js.Promise[String] = js.native
  def apply(file: String, args: js.Array[String]): js.Promise[String] = js.native
  def apply(file: String, args: js.Array[String], options: js.UndefOr[scala.Nothing], isLogOutIfDebug: Boolean): js.Promise[String] = js.native
  def apply(file: String, args: js.Array[String], options: ExecFileOptions): js.Promise[String] = js.native
  def apply(file: String, args: js.Array[String], options: ExecFileOptions, isLogOutIfDebug: Boolean): js.Promise[String] = js.native
  def apply(file: String, args: Null, options: js.UndefOr[scala.Nothing], isLogOutIfDebug: Boolean): js.Promise[String] = js.native
  def apply(file: String, args: Null, options: ExecFileOptions): js.Promise[String] = js.native
  def apply(file: String, args: Null, options: ExecFileOptions, isLogOutIfDebug: Boolean): js.Promise[String] = js.native
}
