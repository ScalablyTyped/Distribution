package typings
package atBabelTemplateLib.atBabelTemplateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateBuilder[T] extends js.Object {
  // Allow users to explicitly create templates that produce ASTs, skipping the need for an intermediate function.
  @JSName("ast")
  var ast_Original: atBabelTemplateLib.Fn_Args[T] = js.native
  /**
    * Building from a string produces an AST builder function by default.
    */
  def apply(code: java.lang.String): js.Function1[/* arg */ js.UndefOr[PublicReplacements], T] = js.native
  def apply(code: java.lang.String, opts: TemplateBuilderOptions): js.Function1[/* arg */ js.UndefOr[PublicReplacements], T] = js.native
  /**
    * Build a new builder, merging the given options with the previous ones.
    */
  def apply(opts: TemplateBuilderOptions): TemplateBuilder[T] = js.native
  /**
    * Building from a template literal produces an AST builder function by default.
    */
  def apply(tpl: stdLib.TemplateStringsArray, args: js.Any*): js.Function1[/* arg */ js.UndefOr[PublicReplacements], T] = js.native
  // Allow users to explicitly create templates that produce ASTs, skipping the need for an intermediate function.
  def ast(tpl: java.lang.String): T = js.native
  def ast(tpl: java.lang.String, opts: TemplateBuilderOptions): T = js.native
  // Allow users to explicitly create templates that produce ASTs, skipping the need for an intermediate function.
  def ast(tpl: stdLib.TemplateStringsArray, args: js.Any*): T = js.native
}

