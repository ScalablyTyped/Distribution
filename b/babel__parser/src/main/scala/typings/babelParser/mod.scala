package typings.babelParser

import typings.babelParser.babelParserStrings.bar
import typings.babelParser.babelParserStrings.decorators
import typings.babelParser.babelParserStrings.flow
import typings.babelParser.babelParserStrings.fsharp
import typings.babelParser.babelParserStrings.hash
import typings.babelParser.babelParserStrings.minimal
import typings.babelParser.babelParserStrings.module
import typings.babelParser.babelParserStrings.pipelineOperator
import typings.babelParser.babelParserStrings.recordAndTuple
import typings.babelParser.babelParserStrings.script
import typings.babelParser.babelParserStrings.smart
import typings.babelParser.babelParserStrings.unambiguous
import typings.babelTypes.mod.Expression
import typings.babelTypes.mod.File_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@babel/parser", "parse")
  @js.native
  def parse(input: String): File_ = js.native
  @JSImport("@babel/parser", "parse")
  @js.native
  def parse(input: String, options: ParserOptions): File_ = js.native
  
  @JSImport("@babel/parser", "parseExpression")
  @js.native
  def parseExpression(input: String): Expression = js.native
  @JSImport("@babel/parser", "parseExpression")
  @js.native
  def parseExpression(input: String, options: ParserOptions): Expression = js.native
  
  @js.native
  trait DecoratorsPluginOptions extends StObject {
    
    var decoratorsBeforeExport: js.UndefOr[Boolean] = js.native
  }
  object DecoratorsPluginOptions {
    
    @scala.inline
    def apply(): DecoratorsPluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DecoratorsPluginOptions]
    }
    
    @scala.inline
    implicit class DecoratorsPluginOptionsMutableBuilder[Self <: DecoratorsPluginOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecoratorsBeforeExport(value: Boolean): Self = StObject.set(x, "decoratorsBeforeExport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecoratorsBeforeExportUndefined: Self = StObject.set(x, "decoratorsBeforeExport", js.undefined)
    }
  }
  
  @js.native
  trait FlowPluginOptions extends StObject {
    
    var all: js.UndefOr[Boolean] = js.native
  }
  object FlowPluginOptions {
    
    @scala.inline
    def apply(): FlowPluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlowPluginOptions]
    }
    
    @scala.inline
    implicit class FlowPluginOptionsMutableBuilder[Self <: FlowPluginOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
    }
  }
  
  @js.native
  trait ParserOptions extends StObject {
    
    /**
      * By default, await use is not allowed outside of an async function.
      * Set this to true to accept such code.
      */
    var allowAwaitOutsideFunction: js.UndefOr[Boolean] = js.native
    
    /**
      * By default, import and export declarations can only appear at a program's top level.
      * Setting this option to true allows them anywhere where a statement is allowed.
      */
    var allowImportExportEverywhere: js.UndefOr[Boolean] = js.native
    
    /**
      * By default, a return statement at the top level raises an error.
      * Set this to true to accept such code.
      */
    var allowReturnOutsideFunction: js.UndefOr[Boolean] = js.native
    
    var allowSuperOutsideMethod: js.UndefOr[Boolean] = js.native
    
    /**
      * By default, exported identifiers must refer to a declared variable.
      * Set this to true to allow export statements to reference undeclared variables.
      */
    var allowUndeclaredExports: js.UndefOr[Boolean] = js.native
    
    /**
      * By default, the parser adds information about parentheses by setting
      * `extra.parenthesized` to `true` as needed.
      * When this option is `true` the parser creates `ParenthesizedExpression`
      * AST nodes instead of using the `extra` property.
      */
    var createParenthesizedExpressions: js.UndefOr[Boolean] = js.native
    
    /**
      * Array containing the plugins that you want to enable.
      */
    var plugins: js.UndefOr[js.Array[ParserPlugin]] = js.native
    
    /**
      * Adds a ranges property to each node: [node.start, node.end]
      */
    var ranges: js.UndefOr[Boolean] = js.native
    
    /**
      * Correlate output AST nodes with their source filename.
      * Useful when generating code and source maps from the ASTs of multiple input files.
      */
    var sourceFilename: js.UndefOr[String] = js.native
    
    /**
      * Indicate the mode the code should be parsed in.
      * Can be one of "script", "module", or "unambiguous". Defaults to "script".
      * "unambiguous" will make @babel/parser attempt to guess, based on the presence
      * of ES6 import or export statements.
      * Files with ES6 imports and exports are considered "module" and are otherwise "script".
      */
    var sourceType: js.UndefOr[script | module | unambiguous] = js.native
    
    /**
      * By default, the first line of code parsed is treated as line 1.
      * You can provide a line number to alternatively start with.
      * Useful for integration with other source tools.
      */
    var startLine: js.UndefOr[Double] = js.native
    
    /**
      * Should the parser work in strict mode.
      * Defaults to true if sourceType === 'module'. Otherwise, false.
      */
    var strictMode: js.UndefOr[Boolean] = js.native
    
    /**
      * Adds all parsed tokens to a tokens property on the File node.
      */
    var tokens: js.UndefOr[Boolean] = js.native
  }
  object ParserOptions {
    
    @scala.inline
    def apply(): ParserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParserOptions]
    }
    
    @scala.inline
    implicit class ParserOptionsMutableBuilder[Self <: ParserOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowAwaitOutsideFunction(value: Boolean): Self = StObject.set(x, "allowAwaitOutsideFunction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowAwaitOutsideFunctionUndefined: Self = StObject.set(x, "allowAwaitOutsideFunction", js.undefined)
      
      @scala.inline
      def setAllowImportExportEverywhere(value: Boolean): Self = StObject.set(x, "allowImportExportEverywhere", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowImportExportEverywhereUndefined: Self = StObject.set(x, "allowImportExportEverywhere", js.undefined)
      
      @scala.inline
      def setAllowReturnOutsideFunction(value: Boolean): Self = StObject.set(x, "allowReturnOutsideFunction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowReturnOutsideFunctionUndefined: Self = StObject.set(x, "allowReturnOutsideFunction", js.undefined)
      
      @scala.inline
      def setAllowSuperOutsideMethod(value: Boolean): Self = StObject.set(x, "allowSuperOutsideMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowSuperOutsideMethodUndefined: Self = StObject.set(x, "allowSuperOutsideMethod", js.undefined)
      
      @scala.inline
      def setAllowUndeclaredExports(value: Boolean): Self = StObject.set(x, "allowUndeclaredExports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowUndeclaredExportsUndefined: Self = StObject.set(x, "allowUndeclaredExports", js.undefined)
      
      @scala.inline
      def setCreateParenthesizedExpressions(value: Boolean): Self = StObject.set(x, "createParenthesizedExpressions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateParenthesizedExpressionsUndefined: Self = StObject.set(x, "createParenthesizedExpressions", js.undefined)
      
      @scala.inline
      def setPlugins(value: js.Array[ParserPlugin]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      @scala.inline
      def setPluginsVarargs(value: ParserPlugin*): Self = StObject.set(x, "plugins", js.Array(value :_*))
      
      @scala.inline
      def setRanges(value: Boolean): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
      
      @scala.inline
      def setSourceFilename(value: String): Self = StObject.set(x, "sourceFilename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceFilenameUndefined: Self = StObject.set(x, "sourceFilename", js.undefined)
      
      @scala.inline
      def setSourceType(value: script | module | unambiguous): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
      
      @scala.inline
      def setStartLine(value: Double): Self = StObject.set(x, "startLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartLineUndefined: Self = StObject.set(x, "startLine", js.undefined)
      
      @scala.inline
      def setStrictMode(value: Boolean): Self = StObject.set(x, "strictMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictModeUndefined: Self = StObject.set(x, "strictMode", js.undefined)
      
      @scala.inline
      def setTokens(value: Boolean): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.babelParser.babelParserStrings.asyncGenerators
    - typings.babelParser.babelParserStrings.bigInt
    - typings.babelParser.babelParserStrings.classPrivateMethods
    - typings.babelParser.babelParserStrings.classPrivateProperties
    - typings.babelParser.babelParserStrings.classProperties
    - typings.babelParser.babelParserStrings.classStaticBlock
    - typings.babelParser.babelParserStrings.decimal
    - typings.babelParser.babelParserStrings.decorators
    - typings.babelParser.babelParserStrings.`decorators-legacy`
    - typings.babelParser.babelParserStrings.doExpressions
    - typings.babelParser.babelParserStrings.dynamicImport
    - typings.babelParser.babelParserStrings.estree
    - typings.babelParser.babelParserStrings.exportDefaultFrom
    - typings.babelParser.babelParserStrings.exportNamespaceFrom
    - typings.babelParser.babelParserStrings.flow
    - typings.babelParser.babelParserStrings.flowComments
    - typings.babelParser.babelParserStrings.functionBind
    - typings.babelParser.babelParserStrings.functionSent
    - typings.babelParser.babelParserStrings.importMeta
    - typings.babelParser.babelParserStrings.jsx
    - typings.babelParser.babelParserStrings.logicalAssignment
    - typings.babelParser.babelParserStrings.importAssertions
    - typings.babelParser.babelParserStrings.moduleStringNames
    - typings.babelParser.babelParserStrings.nullishCoalescingOperator
    - typings.babelParser.babelParserStrings.numericSeparator
    - typings.babelParser.babelParserStrings.objectRestSpread
    - typings.babelParser.babelParserStrings.optionalCatchBinding
    - typings.babelParser.babelParserStrings.optionalChaining
    - typings.babelParser.babelParserStrings.partialApplication
    - typings.babelParser.babelParserStrings.pipelineOperator
    - typings.babelParser.babelParserStrings.placeholders
    - typings.babelParser.babelParserStrings.privateIn
    - typings.babelParser.babelParserStrings.throwExpressions
    - typings.babelParser.babelParserStrings.topLevelAwait
    - typings.babelParser.babelParserStrings.typescript
    - typings.babelParser.babelParserStrings.v8intrinsic
    - typings.babelParser.mod.ParserPluginWithOptions
  */
  type ParserPlugin = _ParserPlugin | ParserPluginWithOptions
  
  type ParserPluginWithOptions = js.Tuple2[
    decorators | pipelineOperator | recordAndTuple | flow, 
    DecoratorsPluginOptions | FlowPluginOptions | PipelineOperatorPluginOptions | RecordAndTuplePluginOptions
  ]
  
  @js.native
  trait PipelineOperatorPluginOptions extends StObject {
    
    var proposal: fsharp | minimal | smart = js.native
  }
  object PipelineOperatorPluginOptions {
    
    @scala.inline
    def apply(proposal: fsharp | minimal | smart): PipelineOperatorPluginOptions = {
      val __obj = js.Dynamic.literal(proposal = proposal.asInstanceOf[js.Any])
      __obj.asInstanceOf[PipelineOperatorPluginOptions]
    }
    
    @scala.inline
    implicit class PipelineOperatorPluginOptionsMutableBuilder[Self <: PipelineOperatorPluginOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProposal(value: fsharp | minimal | smart): Self = StObject.set(x, "proposal", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RecordAndTuplePluginOptions extends StObject {
    
    var syntaxType: bar | hash = js.native
  }
  object RecordAndTuplePluginOptions {
    
    @scala.inline
    def apply(syntaxType: bar | hash): RecordAndTuplePluginOptions = {
      val __obj = js.Dynamic.literal(syntaxType = syntaxType.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordAndTuplePluginOptions]
    }
    
    @scala.inline
    implicit class RecordAndTuplePluginOptionsMutableBuilder[Self <: RecordAndTuplePluginOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSyntaxType(value: bar | hash): Self = StObject.set(x, "syntaxType", value.asInstanceOf[js.Any])
    }
  }
  
  trait _ParserPlugin extends StObject
}
