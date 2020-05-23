package typings.csso.mod

import typings.cssTree.mod.CssNode
import typings.csso.anon.Ast
import typings.csso.anon.Typeofcsstree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Csso extends js.Object {
  var syntax: Typeofcsstree = js.native
  /**
    * Does the main task – compress an AST.
    */
  def compress(ast: CssNode): Ast = js.native
  def compress(ast: CssNode, options: CompressOptions): Ast = js.native
  /**
    * Minify source CSS passed as String
    * @param source
    * @param options
    */
  def minify(source: String): Result = js.native
  def minify(source: String, options: MinifyOptions with CompressOptions): Result = js.native
  /**
    * The same as minify() but for list of declarations. Usually it's a style attribute value.
    * @param source
    * @param options
    */
  def minifyBlock(source: String): Result = js.native
  def minifyBlock(source: String, options: MinifyOptions with CompressOptions): Result = js.native
}

