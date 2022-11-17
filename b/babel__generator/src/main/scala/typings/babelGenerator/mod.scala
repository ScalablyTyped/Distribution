package typings.babelGenerator

import org.scalablytyped.runtime.StringDictionary
import typings.babelGenerator.anon.Compact
import typings.babelGenerator.anon.File
import typings.babelTypes.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@babel/generator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(ast: Node): GeneratorResult = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(ast.asInstanceOf[js.Any]).asInstanceOf[GeneratorResult]
  inline def default(ast: Node, opts: Unit, code: String): GeneratorResult = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ast.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[GeneratorResult]
  inline def default(ast: Node, opts: Unit, code: StringDictionary[String]): GeneratorResult = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ast.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[GeneratorResult]
  inline def default(ast: Node, opts: GeneratorOptions): GeneratorResult = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ast.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[GeneratorResult]
  inline def default(ast: Node, opts: GeneratorOptions, code: String): GeneratorResult = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ast.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[GeneratorResult]
  inline def default(ast: Node, opts: GeneratorOptions, code: StringDictionary[String]): GeneratorResult = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ast.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[GeneratorResult]
  
  @JSImport("@babel/generator", "CodeGenerator")
  @js.native
  open class CodeGenerator protected () extends StObject {
    def this(ast: Node) = this()
    def this(ast: Node, opts: GeneratorOptions) = this()
    def this(ast: Node, opts: Unit, code: String) = this()
    def this(ast: Node, opts: GeneratorOptions, code: String) = this()
    
    def generate(): GeneratorResult = js.native
  }
  
  trait GeneratorOptions extends StObject {
    
    /**
      * Optional string to add as a block comment at the end of the output file.
      */
    var auxiliaryCommentAfter: js.UndefOr[String] = js.undefined
    
    /**
      * Optional string to add as a block comment at the start of the output file.
      */
    var auxiliaryCommentBefore: js.UndefOr[String] = js.undefined
    
    /**
      * Should comments be included in output? Defaults to `true`.
      */
    var comments: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set to true to avoid adding whitespace for formatting. Defaults to the value of `opts.minified`.
      */
    var compact: js.UndefOr[Boolean | "auto"] = js.undefined
    
    /**
      * Set to true to reduce whitespace (but not as much as opts.compact). Defaults to `false`.
      */
    var concise: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set to true to enable support for experimental decorators syntax before module exports.
      * Defaults to `false`.
      */
    var decoratorsBeforeExport: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Used in warning messages
      */
    var filename: js.UndefOr[String] = js.undefined
    
    /**
      * Options for outputting jsesc representation.
      */
    var jsescOption: js.UndefOr[Compact] = js.undefined
    
    /**
      * Set to true to run jsesc with "json": true to print "\\u00A9" vs. "©";
      */
    var jsonCompatibleStrings: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Should the output be minified. Defaults to `false`.
      */
    var minified: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Retain parens around function expressions (could be used to change engine parsing behavior)
      * Defaults to `false`.
      */
    var retainFunctionParens: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Attempt to use the same line numbers in the output code as in the source code (helps preserve stack traces).
      * Defaults to `false`.
      */
    var retainLines: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Function that takes a comment (as a string) and returns true if the comment should be included in the output.
      * By default, comments are included if `opts.comments` is `true` or if `opts.minifed` is `false` and the comment
      * contains `@preserve` or `@license`.
      */
    var shouldPrintComment: js.UndefOr[js.Function1[/* comment */ String, Boolean]] = js.undefined
    
    /**
      * The filename for the source code (i.e. the code in the `code` argument).
      * This will only be used if `code` is a string.
      */
    var sourceFileName: js.UndefOr[String] = js.undefined
    
    /**
      * Enable generating source maps. Defaults to `false`.
      */
    var sourceMaps: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A root for all relative URLs in the source map.
      */
    var sourceRoot: js.UndefOr[String] = js.undefined
  }
  object GeneratorOptions {
    
    inline def apply(): GeneratorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GeneratorOptions]
    }
    
    extension [Self <: GeneratorOptions](x: Self) {
      
      inline def setAuxiliaryCommentAfter(value: String): Self = StObject.set(x, "auxiliaryCommentAfter", value.asInstanceOf[js.Any])
      
      inline def setAuxiliaryCommentAfterUndefined: Self = StObject.set(x, "auxiliaryCommentAfter", js.undefined)
      
      inline def setAuxiliaryCommentBefore(value: String): Self = StObject.set(x, "auxiliaryCommentBefore", value.asInstanceOf[js.Any])
      
      inline def setAuxiliaryCommentBeforeUndefined: Self = StObject.set(x, "auxiliaryCommentBefore", js.undefined)
      
      inline def setComments(value: Boolean): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
      
      inline def setCompact(value: Boolean | "auto"): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      inline def setConcise(value: Boolean): Self = StObject.set(x, "concise", value.asInstanceOf[js.Any])
      
      inline def setConciseUndefined: Self = StObject.set(x, "concise", js.undefined)
      
      inline def setDecoratorsBeforeExport(value: Boolean): Self = StObject.set(x, "decoratorsBeforeExport", value.asInstanceOf[js.Any])
      
      inline def setDecoratorsBeforeExportUndefined: Self = StObject.set(x, "decoratorsBeforeExport", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setJsescOption(value: Compact): Self = StObject.set(x, "jsescOption", value.asInstanceOf[js.Any])
      
      inline def setJsescOptionUndefined: Self = StObject.set(x, "jsescOption", js.undefined)
      
      inline def setJsonCompatibleStrings(value: Boolean): Self = StObject.set(x, "jsonCompatibleStrings", value.asInstanceOf[js.Any])
      
      inline def setJsonCompatibleStringsUndefined: Self = StObject.set(x, "jsonCompatibleStrings", js.undefined)
      
      inline def setMinified(value: Boolean): Self = StObject.set(x, "minified", value.asInstanceOf[js.Any])
      
      inline def setMinifiedUndefined: Self = StObject.set(x, "minified", js.undefined)
      
      inline def setRetainFunctionParens(value: Boolean): Self = StObject.set(x, "retainFunctionParens", value.asInstanceOf[js.Any])
      
      inline def setRetainFunctionParensUndefined: Self = StObject.set(x, "retainFunctionParens", js.undefined)
      
      inline def setRetainLines(value: Boolean): Self = StObject.set(x, "retainLines", value.asInstanceOf[js.Any])
      
      inline def setRetainLinesUndefined: Self = StObject.set(x, "retainLines", js.undefined)
      
      inline def setShouldPrintComment(value: /* comment */ String => Boolean): Self = StObject.set(x, "shouldPrintComment", js.Any.fromFunction1(value))
      
      inline def setShouldPrintCommentUndefined: Self = StObject.set(x, "shouldPrintComment", js.undefined)
      
      inline def setSourceFileName(value: String): Self = StObject.set(x, "sourceFileName", value.asInstanceOf[js.Any])
      
      inline def setSourceFileNameUndefined: Self = StObject.set(x, "sourceFileName", js.undefined)
      
      inline def setSourceMaps(value: Boolean): Self = StObject.set(x, "sourceMaps", value.asInstanceOf[js.Any])
      
      inline def setSourceMapsUndefined: Self = StObject.set(x, "sourceMaps", js.undefined)
      
      inline def setSourceRoot(value: String): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
      
      inline def setSourceRootUndefined: Self = StObject.set(x, "sourceRoot", js.undefined)
    }
  }
  
  trait GeneratorResult extends StObject {
    
    var code: String
    
    var map: File | Null
  }
  object GeneratorResult {
    
    inline def apply(code: String): GeneratorResult = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], map = null)
      __obj.asInstanceOf[GeneratorResult]
    }
    
    extension [Self <: GeneratorResult](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setMap(value: File): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapNull: Self = StObject.set(x, "map", null)
    }
  }
}
