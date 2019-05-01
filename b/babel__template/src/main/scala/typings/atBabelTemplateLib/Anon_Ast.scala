package typings
package atBabelTemplateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Ast extends js.Object {
  @JSName("ast")
  var ast_Original: Anon_ArgsOpts = js.native
  @JSName("expression")
  var expression_Original: atBabelTemplateLib.atBabelTemplateMod.TemplateBuilder[atBabelTypesLib.atBabelTypesMod.Expression] = js.native
  @JSName("program")
  var program_Original: atBabelTemplateLib.atBabelTemplateMod.TemplateBuilder[atBabelTypesLib.atBabelTypesMod.Program] = js.native
  @JSName("smart")
  var smart_Original: atBabelTemplateLib.atBabelTemplateMod.TemplateBuilder[
    atBabelTypesLib.atBabelTypesMod.Statement | js.Array[atBabelTypesLib.atBabelTypesMod.Statement]
  ] = js.native
  @JSName("statement")
  var statement_Original: atBabelTemplateLib.atBabelTemplateMod.TemplateBuilder[atBabelTypesLib.atBabelTypesMod.Statement] = js.native
  @JSName("statements")
  var statements_Original: atBabelTemplateLib.atBabelTemplateMod.TemplateBuilder[js.Array[atBabelTypesLib.atBabelTypesMod.Statement]] = js.native
  def ast(tpl: java.lang.String): atBabelTypesLib.atBabelTypesMod.Statement | js.Array[atBabelTypesLib.atBabelTypesMod.Statement] = js.native
  def ast(tpl: java.lang.String, opts: atBabelTemplateLib.atBabelTemplateMod.TemplateBuilderOptions): atBabelTypesLib.atBabelTypesMod.Statement | js.Array[atBabelTypesLib.atBabelTypesMod.Statement] = js.native
  def ast(tpl: stdLib.TemplateStringsArray, args: js.Any*): atBabelTypesLib.atBabelTypesMod.Statement | js.Array[atBabelTypesLib.atBabelTypesMod.Statement] = js.native
  /**
    * Building from a string produces an AST builder function by default.
    */
  def expression(code: java.lang.String): js.Function1[
    /* arg */ js.UndefOr[atBabelTemplateLib.atBabelTemplateMod.PublicReplacements], 
    atBabelTypesLib.atBabelTypesMod.Expression
  ] = js.native
  def expression(code: java.lang.String, opts: atBabelTemplateLib.atBabelTemplateMod.TemplateBuilderOptions): js.Function1[
    /* arg */ js.UndefOr[atBabelTemplateLib.atBabelTemplateMod.PublicReplacements], 
    atBabelTypesLib.atBabelTypesMod.Expression
  ] = js.native
  /**
    * Build a new builder, merging the given options with the previous ones.
    */
  def expression(opts: atBabelTemplateLib.atBabelTemplateMod.TemplateBuilderOptions): atBabelTemplateLib.atBabelTemplateMod.TemplateBuilder[atBabelTypesLib.atBabelTypesMod.Expression] = js.native
  /**
    * Building from a template literal produces an AST builder function by default.
    */
  def expression(tpl: stdLib.TemplateStringsArray, args: js.Any*): js.Function1[
    /* arg */ js.UndefOr[atBabelTemplateLib.atBabelTemplateMod.PublicReplacements], 
    atBabelTypesLib.atBabelTypesMod.Expression
  ] = js.native
  /**
    * Building from a string produces an AST builder function by default.
    */
  def program(code: java.lang.String): js.Function1[
    /* arg */ js.UndefOr[atBabelTemplateLib.atBabelTemplateMod.PublicReplacements], 
    atBabelTypesLib.atBabelTypesMod.Program
  ] = js.native
  def program(code: java.lang.String, opts: atBabelTemplateLib.atBabelTemplateMod.TemplateBuilderOptions): js.Function1[
    /* arg */ js.UndefOr[atBabelTemplateLib.atBabelTemplateMod.PublicReplacements], 
    atBabelTypesLib.atBabelTypesMod.Program
  ] = js.native
  /**
    * Build a new builder, merging the given options with the previous ones.
    */
  def program(opts: atBabelTemplateLib.atBabelTemplateMod.TemplateBuilderOptions): atBabelTemplateLib.atBabelTemplateMod.TemplateBuilder[atBabelTypesLib.atBabelTypesMod.Program] = js.native
  /**
    * Building from a template literal produces an AST builder function by default.
    */
  def program(tpl: stdLib.TemplateStringsArray, args: js.Any*): js.Function1[
    /* arg */ js.UndefOr[atBabelTemplateLib.atBabelTemplateMod.PublicReplacements], 
    atBabelTypesLib.atBabelTypesMod.Program
  ] = js.native
  /**
    * Building from a string produces an AST builder function by default.
    */
  def smart(code: java.lang.String): js.Function1[
    /* arg */ js.UndefOr[atBabelTemplateLib.atBabelTemplateMod.PublicReplacements], 
    atBabelTypesLib.atBabelTypesMod.Statement | js.Array[atBabelTypesLib.atBabelTypesMod.Statement]
  ] = js.native
  def smart(code: java.lang.String, opts: atBabelTemplateLib.atBabelTemplateMod.TemplateBuilderOptions): js.Function1[
    /* arg */ js.UndefOr[atBabelTemplateLib.atBabelTemplateMod.PublicReplacements], 
    atBabelTypesLib.atBabelTypesMod.Statement | js.Array[atBabelTypesLib.atBabelTypesMod.Statement]
  ] = js.native
  /**
    * Build a new builder, merging the given options with the previous ones.
    */
  def smart(opts: atBabelTemplateLib.atBabelTemplateMod.TemplateBuilderOptions): atBabelTemplateLib.atBabelTemplateMod.TemplateBuilder[
    atBabelTypesLib.atBabelTypesMod.Statement | js.Array[atBabelTypesLib.atBabelTypesMod.Statement]
  ] = js.native
  /**
    * Building from a template literal produces an AST builder function by default.
    */
  def smart(tpl: stdLib.TemplateStringsArray, args: js.Any*): js.Function1[
    /* arg */ js.UndefOr[atBabelTemplateLib.atBabelTemplateMod.PublicReplacements], 
    atBabelTypesLib.atBabelTypesMod.Statement | js.Array[atBabelTypesLib.atBabelTypesMod.Statement]
  ] = js.native
  /**
    * Building from a string produces an AST builder function by default.
    */
  def statement(code: java.lang.String): js.Function1[
    /* arg */ js.UndefOr[atBabelTemplateLib.atBabelTemplateMod.PublicReplacements], 
    atBabelTypesLib.atBabelTypesMod.Statement
  ] = js.native
  def statement(code: java.lang.String, opts: atBabelTemplateLib.atBabelTemplateMod.TemplateBuilderOptions): js.Function1[
    /* arg */ js.UndefOr[atBabelTemplateLib.atBabelTemplateMod.PublicReplacements], 
    atBabelTypesLib.atBabelTypesMod.Statement
  ] = js.native
  /**
    * Build a new builder, merging the given options with the previous ones.
    */
  def statement(opts: atBabelTemplateLib.atBabelTemplateMod.TemplateBuilderOptions): atBabelTemplateLib.atBabelTemplateMod.TemplateBuilder[atBabelTypesLib.atBabelTypesMod.Statement] = js.native
  /**
    * Building from a template literal produces an AST builder function by default.
    */
  def statement(tpl: stdLib.TemplateStringsArray, args: js.Any*): js.Function1[
    /* arg */ js.UndefOr[atBabelTemplateLib.atBabelTemplateMod.PublicReplacements], 
    atBabelTypesLib.atBabelTypesMod.Statement
  ] = js.native
  /**
    * Building from a string produces an AST builder function by default.
    */
  def statements(code: java.lang.String): js.Function1[
    /* arg */ js.UndefOr[atBabelTemplateLib.atBabelTemplateMod.PublicReplacements], 
    js.Array[atBabelTypesLib.atBabelTypesMod.Statement]
  ] = js.native
  def statements(code: java.lang.String, opts: atBabelTemplateLib.atBabelTemplateMod.TemplateBuilderOptions): js.Function1[
    /* arg */ js.UndefOr[atBabelTemplateLib.atBabelTemplateMod.PublicReplacements], 
    js.Array[atBabelTypesLib.atBabelTypesMod.Statement]
  ] = js.native
  /**
    * Build a new builder, merging the given options with the previous ones.
    */
  def statements(opts: atBabelTemplateLib.atBabelTemplateMod.TemplateBuilderOptions): atBabelTemplateLib.atBabelTemplateMod.TemplateBuilder[js.Array[atBabelTypesLib.atBabelTypesMod.Statement]] = js.native
  /**
    * Building from a template literal produces an AST builder function by default.
    */
  def statements(tpl: stdLib.TemplateStringsArray, args: js.Any*): js.Function1[
    /* arg */ js.UndefOr[atBabelTemplateLib.atBabelTemplateMod.PublicReplacements], 
    js.Array[atBabelTypesLib.atBabelTypesMod.Statement]
  ] = js.native
}

