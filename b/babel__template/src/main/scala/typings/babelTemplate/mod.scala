package typings.babelTemplate

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.babelParser.mod.ParserOptions
import typings.babelTemplate.anon.FnCall
import typings.babelTemplate.babelTemplateBooleans.`false`
import typings.babelTypes.mod.Expression
import typings.babelTypes.mod.Program_
import typings.babelTypes.mod.Statement
import typings.std.RegExp
import typings.std.Set
import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@babel/template", JSImport.Default)
  @js.native
  val default: DefaultTemplateBuilder = js.native
  
  @JSImport("@babel/template", "expression")
  @js.native
  val expression: TemplateBuilder[Expression] = js.native
  
  @JSImport("@babel/template", "program")
  @js.native
  val program: TemplateBuilder[Program_] = js.native
  
  @JSImport("@babel/template", "smart")
  @js.native
  val smart: TemplateBuilder[Statement | js.Array[Statement]] = js.native
  
  @JSImport("@babel/template", "statement")
  @js.native
  val statement: TemplateBuilder[Statement] = js.native
  
  @JSImport("@babel/template", "statements")
  @js.native
  val statements: TemplateBuilder[js.Array[Statement]] = js.native
  
  @js.native
  trait DefaultTemplateBuilder
    extends StObject
       with TemplateBuilder[Statement | js.Array[Statement]] {
    
    @JSName("ast")
    var ast_Original: FnCall = js.native
    
    /**
      * Building from a string produces an AST builder function by default.
      */
    def expression(code: String): js.Function1[/* arg */ js.UndefOr[PublicReplacements], Expression] = js.native
    def expression(code: String, opts: TemplateBuilderOptions): js.Function1[/* arg */ js.UndefOr[PublicReplacements], Expression] = js.native
    /**
      * Build a new builder, merging the given options with the previous ones.
      */
    def expression(opts: TemplateBuilderOptions): TemplateBuilder[Expression] = js.native
    /**
      * Building from a template literal produces an AST builder function by default.
      */
    def expression(tpl: TemplateStringsArray, args: js.Any*): js.Function1[/* arg */ js.UndefOr[PublicReplacements], Expression] = js.native
    @JSName("expression")
    var expression_Original: TemplateBuilder[Expression] = js.native
    
    /**
      * Building from a string produces an AST builder function by default.
      */
    def program(code: String): js.Function1[/* arg */ js.UndefOr[PublicReplacements], Program_] = js.native
    def program(code: String, opts: TemplateBuilderOptions): js.Function1[/* arg */ js.UndefOr[PublicReplacements], Program_] = js.native
    /**
      * Build a new builder, merging the given options with the previous ones.
      */
    def program(opts: TemplateBuilderOptions): TemplateBuilder[Program_] = js.native
    /**
      * Building from a template literal produces an AST builder function by default.
      */
    def program(tpl: TemplateStringsArray, args: js.Any*): js.Function1[/* arg */ js.UndefOr[PublicReplacements], Program_] = js.native
    @JSName("program")
    var program_Original: TemplateBuilder[Program_] = js.native
    
    /**
      * Building from a string produces an AST builder function by default.
      */
    def smart(code: String): js.Function1[/* arg */ js.UndefOr[PublicReplacements], Statement | js.Array[Statement]] = js.native
    def smart(code: String, opts: TemplateBuilderOptions): js.Function1[/* arg */ js.UndefOr[PublicReplacements], Statement | js.Array[Statement]] = js.native
    /**
      * Build a new builder, merging the given options with the previous ones.
      */
    def smart(opts: TemplateBuilderOptions): TemplateBuilder[Statement | js.Array[Statement]] = js.native
    /**
      * Building from a template literal produces an AST builder function by default.
      */
    def smart(tpl: TemplateStringsArray, args: js.Any*): js.Function1[/* arg */ js.UndefOr[PublicReplacements], Statement | js.Array[Statement]] = js.native
    @JSName("smart")
    var smart_Original: TemplateBuilder[Statement | js.Array[Statement]] = js.native
    
    /**
      * Building from a string produces an AST builder function by default.
      */
    def statement(code: String): js.Function1[/* arg */ js.UndefOr[PublicReplacements], Statement] = js.native
    def statement(code: String, opts: TemplateBuilderOptions): js.Function1[/* arg */ js.UndefOr[PublicReplacements], Statement] = js.native
    /**
      * Build a new builder, merging the given options with the previous ones.
      */
    def statement(opts: TemplateBuilderOptions): TemplateBuilder[Statement] = js.native
    /**
      * Building from a template literal produces an AST builder function by default.
      */
    def statement(tpl: TemplateStringsArray, args: js.Any*): js.Function1[/* arg */ js.UndefOr[PublicReplacements], Statement] = js.native
    @JSName("statement")
    var statement_Original: TemplateBuilder[Statement] = js.native
    
    /**
      * Building from a string produces an AST builder function by default.
      */
    def statements(code: String): js.Function1[/* arg */ js.UndefOr[PublicReplacements], js.Array[Statement]] = js.native
    def statements(code: String, opts: TemplateBuilderOptions): js.Function1[/* arg */ js.UndefOr[PublicReplacements], js.Array[Statement]] = js.native
    /**
      * Build a new builder, merging the given options with the previous ones.
      */
    def statements(opts: TemplateBuilderOptions): TemplateBuilder[js.Array[Statement]] = js.native
    /**
      * Building from a template literal produces an AST builder function by default.
      */
    def statements(tpl: TemplateStringsArray, args: js.Any*): js.Function1[/* arg */ js.UndefOr[PublicReplacements], js.Array[Statement]] = js.native
    @JSName("statements")
    var statements_Original: TemplateBuilder[js.Array[Statement]] = js.native
  }
  
  type PublicReplacements = StringDictionary[js.Any] | js.Array[js.Any]
  
  @js.native
  trait TemplateBuilder[T] extends StObject {
    
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
    
    /**
      * Allow users to explicitly create templates that produce ASTs,
      * skipping the need for an intermediate function.
      *
      * Does not allow `%%foo%%` style placeholders.
      */
    def ast(tpl: String): T = js.native
    def ast(tpl: String, opts: TemplateBuilderOptions): T = js.native
    /**
      * Allow users to explicitly create templates that produce ASTs,
      * skipping the need for an intermediate function.
      *
      * Does not allow `%%foo%%` style placeholders.
      */
    def ast(tpl: TemplateStringsArray, args: js.Any*): T = js.native
  }
  
  trait TemplateBuilderOptions
    extends StObject
       with ParserOptions {
    
    /**
      * A pattern to search for when looking for `Identifier` and `StringLiteral`
      * nodes that should be considered as placeholders.
      *
      * `false` will disable placeholder searching placeholders, leaving only
      * the `placeholderWhitelist` value to find replacements.
      *
      * This option cannot be used when using `%%foo%%` style placeholders.
      *
      * @default /^[_$A-Z0-9]+$/
      */
    var placeholderPattern: js.UndefOr[RegExp | `false` | Null] = js.undefined
    
    /**
      * A set of placeholder names to automatically accept.
      * Items in this list do not need to match `placeholderPattern`.
      *
      * This option cannot be used when using `%%foo%%` style placeholders.
      */
    var placeholderWhitelist: js.UndefOr[Set[String] | Null] = js.undefined
    
    /**
      * Set this to `true` to preserve comments from the template string
      * into the resulting AST, or `false` to automatically discard comments.
      *
      * @default false
      */
    var preserveComments: js.UndefOr[Boolean | Null] = js.undefined
    
    /**
      * Set to `true` to use `%%foo%%` style placeholders, `false` to use legacy placeholders
      * described by `placeholderPattern` or `placeholderWhitelist`.
      *
      * When it is not set, it behaves as `true` if there are syntactic placeholders, otherwise as `false`.
      *
      * @since 7.4.0
      */
    var syntacticPlaceholders: js.UndefOr[Boolean | Null] = js.undefined
  }
  object TemplateBuilderOptions {
    
    @scala.inline
    def apply(): TemplateBuilderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TemplateBuilderOptions]
    }
    
    @scala.inline
    implicit class TemplateBuilderOptionsMutableBuilder[Self <: TemplateBuilderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPlaceholderPattern(value: RegExp | `false`): Self = StObject.set(x, "placeholderPattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderPatternNull: Self = StObject.set(x, "placeholderPattern", null)
      
      @scala.inline
      def setPlaceholderPatternUndefined: Self = StObject.set(x, "placeholderPattern", js.undefined)
      
      @scala.inline
      def setPlaceholderWhitelist(value: Set[String]): Self = StObject.set(x, "placeholderWhitelist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderWhitelistNull: Self = StObject.set(x, "placeholderWhitelist", null)
      
      @scala.inline
      def setPlaceholderWhitelistUndefined: Self = StObject.set(x, "placeholderWhitelist", js.undefined)
      
      @scala.inline
      def setPreserveComments(value: Boolean): Self = StObject.set(x, "preserveComments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveCommentsNull: Self = StObject.set(x, "preserveComments", null)
      
      @scala.inline
      def setPreserveCommentsUndefined: Self = StObject.set(x, "preserveComments", js.undefined)
      
      @scala.inline
      def setSyntacticPlaceholders(value: Boolean): Self = StObject.set(x, "syntacticPlaceholders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSyntacticPlaceholdersNull: Self = StObject.set(x, "syntacticPlaceholders", null)
      
      @scala.inline
      def setSyntacticPlaceholdersUndefined: Self = StObject.set(x, "syntacticPlaceholders", js.undefined)
    }
  }
  
  type _To = DefaultTemplateBuilder
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: DefaultTemplateBuilder = default
}
