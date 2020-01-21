package typings.babelCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/core", "transformFromAstSync")
@js.native
object transformFromAstSync extends js.Object {
  def apply(ast: Node): BabelFileResult | Null = js.native
  def apply(ast: Node, code: String): BabelFileResult | Null = js.native
  def apply(ast: Node, code: String, opts: TransformOptions): BabelFileResult | Null = js.native
}

