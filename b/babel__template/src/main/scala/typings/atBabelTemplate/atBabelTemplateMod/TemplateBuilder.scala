package typings.atBabelTemplate.atBabelTemplateMod

import typings.atBabelTemplate.Fn_Args
import typings.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateBuilder[T] extends js.Object {
  // Allow users to explicitly create templates that produce ASTs, skipping the need for an intermediate function.
  @JSName("ast")
  var ast_Original: Fn_Args[T] = js.native
  /**
    * Building from a string produces an AST builder function by default.
    */
  def apply(code: String): js.Function1[/* arg */ js.UndefOr[PublicReplacements], T] = js.native
  def apply(code: String, opts: TemplateBuilderOptions): js.Function1[/* arg */ js.UndefOr[PublicReplacements], T] = js.native
  /**
    * Build a new builder, merging the given options with the previous ones.
    */
  def apply(opts: TemplateBuilderOptions): TemplateBuilder[T] = js.native
  /**
    * Building from a template literal produces an AST builder function by default.
    */
  def apply(tpl: TemplateStringsArray, args: js.Any*): js.Function1[/* arg */ js.UndefOr[PublicReplacements], T] = js.native
  // Allow users to explicitly create templates that produce ASTs, skipping the need for an intermediate function.
  def ast(tpl: String): T = js.native
  def ast(tpl: String, opts: TemplateBuilderOptions): T = js.native
  // Allow users to explicitly create templates that produce ASTs, skipping the need for an intermediate function.
  def ast(tpl: TemplateStringsArray, args: js.Any*): T = js.native
}

