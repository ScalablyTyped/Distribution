package typings.babelCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babel-core", "transformFromAst")
@js.native
object transformFromAst extends js.Object {
  
  def apply(ast: Node): BabelFileResult = js.native
  def apply(ast: Node, code: js.UndefOr[scala.Nothing], opts: TransformOptions): BabelFileResult = js.native
  def apply(ast: Node, code: String): BabelFileResult = js.native
  def apply(ast: Node, code: String, opts: TransformOptions): BabelFileResult = js.native
}
