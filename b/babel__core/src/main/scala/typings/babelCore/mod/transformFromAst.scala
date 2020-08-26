package typings.babelCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/core", "transformFromAst")
@js.native
object transformFromAst extends js.Object {
  def apply(ast: Node, code: js.UndefOr[scala.Nothing], callback: FileResultCallback): Unit = js.native
  def apply(
    ast: Node,
    code: js.UndefOr[scala.Nothing],
    opts: js.UndefOr[scala.Nothing],
    callback: FileResultCallback
  ): Unit = js.native
  def apply(ast: Node, code: js.UndefOr[scala.Nothing], opts: TransformOptions, callback: FileResultCallback): Unit = js.native
  def apply(ast: Node, code: String, callback: FileResultCallback): Unit = js.native
  def apply(ast: Node, code: String, opts: js.UndefOr[scala.Nothing], callback: FileResultCallback): Unit = js.native
  def apply(ast: Node, code: String, opts: TransformOptions, callback: FileResultCallback): Unit = js.native
}

