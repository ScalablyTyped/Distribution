package typings.babelCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/core", "transformFromAst")
@js.native
object transformFromAst extends js.Object {
  def apply(ast: Node, code: js.UndefOr[String], callback: FileResultCallback): Unit = js.native
  def apply(
    ast: Node,
    code: js.UndefOr[String],
    opts: js.UndefOr[TransformOptions],
    callback: FileResultCallback
  ): Unit = js.native
}

