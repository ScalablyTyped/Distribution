package typings
package cssoLib.cssoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Csso extends js.Object {
  var syntax: cssoLib.Typeofcsstree = js.native
  /**
    * Does the main task – compress an AST.
    */
  def compress(ast: cssDashTreeLib.cssDashTreeMod.CssNode): cssoLib.Anon_Ast = js.native
  def compress(ast: cssDashTreeLib.cssDashTreeMod.CssNode, options: CompressOptions): cssoLib.Anon_Ast = js.native
  /**
    * Minify source CSS passed as String
    * @param source
    * @param options
    */
  def minify(source: java.lang.String): Result = js.native
  def minify(source: java.lang.String, options: MinifyOptions with CompressOptions): Result = js.native
  /**
    * The same as minify() but for list of declarations. Usually it's a style attribute value.
    * @param source
    * @param options
    */
  def minifyBlock(source: java.lang.String): Result = js.native
  def minifyBlock(source: java.lang.String, options: MinifyOptions with CompressOptions): Result = js.native
}

