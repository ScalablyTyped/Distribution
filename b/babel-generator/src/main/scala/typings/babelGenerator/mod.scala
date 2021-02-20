package typings.babelGenerator

import org.scalablytyped.runtime.StringDictionary
import typings.babelGenerator.babelGeneratorStrings.auto
import typings.babelGenerator.babelGeneratorStrings.double
import typings.babelGenerator.babelGeneratorStrings.single
import typings.babelTypes.ts36Mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("babel-generator", JSImport.Default)
  @js.native
  def default(ast: Node): GeneratorResult = js.native
  @JSImport("babel-generator", JSImport.Default)
  @js.native
  def default(ast: Node, opts: js.UndefOr[scala.Nothing], code: String): GeneratorResult = js.native
  @JSImport("babel-generator", JSImport.Default)
  @js.native
  def default(ast: Node, opts: js.UndefOr[scala.Nothing], code: StringDictionary[String]): GeneratorResult = js.native
  @JSImport("babel-generator", JSImport.Default)
  @js.native
  def default(ast: Node, opts: GeneratorOptions): GeneratorResult = js.native
  @JSImport("babel-generator", JSImport.Default)
  @js.native
  def default(ast: Node, opts: GeneratorOptions, code: String): GeneratorResult = js.native
  @JSImport("babel-generator", JSImport.Default)
  @js.native
  def default(ast: Node, opts: GeneratorOptions, code: StringDictionary[String]): GeneratorResult = js.native
  
  @js.native
  trait GeneratorOptions extends StObject {
    
    /**
      * Optional string to add as a block comment at the end of the output file.
      */
    var auxiliaryCommentAfter: js.UndefOr[String] = js.native
    
    /**
      * Optional string to add as a block comment at the start of the output file.
      */
    var auxiliaryCommentBefore: js.UndefOr[String] = js.native
    
    /**
      * Should comments be included in output? Defaults to `true`.
      */
    var comments: js.UndefOr[Boolean] = js.native
    
    /**
      * Set to true to avoid adding whitespace for formatting. Defaults to the value of `opts.minified`.
      */
    var compact: js.UndefOr[Boolean | auto] = js.native
    
    /**
      * Set to true to reduce whitespace (but not as much as opts.compact). Defaults to `false`.
      */
    var concise: js.UndefOr[Boolean] = js.native
    
    /**
      * Used in warning messages
      */
    var filename: js.UndefOr[String] = js.native
    
    /**
      * Set to true to run jsesc with "json": true to print "\\u00A9" vs. "©";
      */
    var jsonCompatibleStrings: js.UndefOr[Boolean] = js.native
    
    /**
      * Should the output be minified. Defaults to `false`.
      */
    var minified: js.UndefOr[Boolean] = js.native
    
    /**
      * The type of quote to use in the output. If omitted, autodetects based on `ast.tokens`.
      */
    var quotes: js.UndefOr[single | double] = js.native
    
    /**
      * Attempt to use the same line numbers in the output code as in the source code (helps preserve stack traces).
      * Defaults to `false`.
      */
    var retainLines: js.UndefOr[Boolean] = js.native
    
    /**
      * Function that takes a comment (as a string) and returns true if the comment should be included in the output.
      * By default, comments are included if `opts.comments` is `true` or if `opts.minifed` is `false` and the comment
      * contains `@preserve` or `@license`.
      */
    var shouldPrintComment: js.UndefOr[js.Function1[/* comment */ String, Boolean]] = js.native
    
    /**
      * The filename for the source code (i.e. the code in the `code` argument).
      * This will only be used if `code` is a string.
      */
    var sourceFileName: js.UndefOr[String] = js.native
    
    /**
      * The filename of the generated code that the source map will be associated with.
      */
    var sourceMapTarget: js.UndefOr[String] = js.native
    
    /**
      * Enable generating source maps. Defaults to `false`.
      */
    var sourceMaps: js.UndefOr[Boolean] = js.native
    
    /**
      * A root for all relative URLs in the source map.
      */
    var sourceRoot: js.UndefOr[String] = js.native
  }
  object GeneratorOptions {
    
    @scala.inline
    def apply(): GeneratorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GeneratorOptions]
    }
    
    @scala.inline
    implicit class GeneratorOptionsMutableBuilder[Self <: GeneratorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuxiliaryCommentAfter(value: String): Self = StObject.set(x, "auxiliaryCommentAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuxiliaryCommentAfterUndefined: Self = StObject.set(x, "auxiliaryCommentAfter", js.undefined)
      
      @scala.inline
      def setAuxiliaryCommentBefore(value: String): Self = StObject.set(x, "auxiliaryCommentBefore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuxiliaryCommentBeforeUndefined: Self = StObject.set(x, "auxiliaryCommentBefore", js.undefined)
      
      @scala.inline
      def setComments(value: Boolean): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
      
      @scala.inline
      def setCompact(value: Boolean | auto): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      @scala.inline
      def setConcise(value: Boolean): Self = StObject.set(x, "concise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConciseUndefined: Self = StObject.set(x, "concise", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setJsonCompatibleStrings(value: Boolean): Self = StObject.set(x, "jsonCompatibleStrings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonCompatibleStringsUndefined: Self = StObject.set(x, "jsonCompatibleStrings", js.undefined)
      
      @scala.inline
      def setMinified(value: Boolean): Self = StObject.set(x, "minified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinifiedUndefined: Self = StObject.set(x, "minified", js.undefined)
      
      @scala.inline
      def setQuotes(value: single | double): Self = StObject.set(x, "quotes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuotesUndefined: Self = StObject.set(x, "quotes", js.undefined)
      
      @scala.inline
      def setRetainLines(value: Boolean): Self = StObject.set(x, "retainLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetainLinesUndefined: Self = StObject.set(x, "retainLines", js.undefined)
      
      @scala.inline
      def setShouldPrintComment(value: /* comment */ String => Boolean): Self = StObject.set(x, "shouldPrintComment", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShouldPrintCommentUndefined: Self = StObject.set(x, "shouldPrintComment", js.undefined)
      
      @scala.inline
      def setSourceFileName(value: String): Self = StObject.set(x, "sourceFileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceFileNameUndefined: Self = StObject.set(x, "sourceFileName", js.undefined)
      
      @scala.inline
      def setSourceMapTarget(value: String): Self = StObject.set(x, "sourceMapTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceMapTargetUndefined: Self = StObject.set(x, "sourceMapTarget", js.undefined)
      
      @scala.inline
      def setSourceMaps(value: Boolean): Self = StObject.set(x, "sourceMaps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceMapsUndefined: Self = StObject.set(x, "sourceMaps", js.undefined)
      
      @scala.inline
      def setSourceRoot(value: String): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceRootUndefined: Self = StObject.set(x, "sourceRoot", js.undefined)
    }
  }
  
  @js.native
  trait GeneratorResult extends StObject {
    
    var code: String = js.native
  }
  object GeneratorResult {
    
    @scala.inline
    def apply(code: String): GeneratorResult = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeneratorResult]
    }
    
    @scala.inline
    implicit class GeneratorResultMutableBuilder[Self <: GeneratorResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    }
  }
}
