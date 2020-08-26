package typings.babelCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/core", "transformFromAstAsync")
@js.native
object transformFromAstAsync extends js.Object {
  def apply(ast: Node): js.Promise[BabelFileResult | Null] = js.native
  def apply(ast: Node, code: js.UndefOr[scala.Nothing], opts: TransformOptions): js.Promise[BabelFileResult | Null] = js.native
  def apply(ast: Node, code: String): js.Promise[BabelFileResult | Null] = js.native
  def apply(ast: Node, code: String, opts: TransformOptions): js.Promise[BabelFileResult | Null] = js.native
}

