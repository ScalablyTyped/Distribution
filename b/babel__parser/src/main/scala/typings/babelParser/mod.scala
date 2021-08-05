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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@babel/parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(input: String): File_ = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[File_]
  inline def parse(input: String, options: ParserOptions): File_ = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[File_]
  
  inline def parseExpression(input: String): Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("parseExpression")(input.asInstanceOf[js.Any]).asInstanceOf[Expression]
  inline def parseExpression(input: String, options: ParserOptions): Expression = (^.asInstanceOf[js.Dynamic].applyDynamic("parseExpression")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Expression]
  
  trait DecoratorsPluginOptions extends StObject {
    
    var decoratorsBeforeExport: js.UndefOr[Boolean] = js.undefined
  }
  object DecoratorsPluginOptions {
    
    inline def apply(): DecoratorsPluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DecoratorsPluginOptions]
    }
    
    extension [Self <: DecoratorsPluginOptions](x: Self) {
      
      inline def setDecoratorsBeforeExport(value: Boolean): Self = StObject.set(x, "decoratorsBeforeExport", value.asInstanceOf[js.Any])
      
      inline def setDecoratorsBeforeExportUndefined: Self = StObject.set(x, "decoratorsBeforeExport", js.undefined)
    }
  }
  
  trait FlowPluginOptions extends StObject {
    
    var all: js.UndefOr[Boolean] = js.undefined
  }
  object FlowPluginOptions {
    
    inline def apply(): FlowPluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlowPluginOptions]
    }
    
    extension [Self <: FlowPluginOptions](x: Self) {
      
      inline def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
    }
  }
  
  trait ParserOptions extends StObject {
    
    /**
      * By default, await use is not allowed outside of an async function.
      * Set this to true to accept such code.
      */
    var allowAwaitOutsideFunction: js.UndefOr[Boolean] = js.undefined
    
    /**
      * By default, import and export declarations can only appear at a program's top level.
      * Setting this option to true allows them anywhere where a statement is allowed.
      */
    var allowImportExportEverywhere: js.UndefOr[Boolean] = js.undefined
    
    /**
      * By default, a return statement at the top level raises an error.
      * Set this to true to accept such code.
      */
    var allowReturnOutsideFunction: js.UndefOr[Boolean] = js.undefined
    
    var allowSuperOutsideMethod: js.UndefOr[Boolean] = js.undefined
    
    /**
      * By default, exported identifiers must refer to a declared variable.
      * Set this to true to allow export statements to reference undeclared variables.
      */
    var allowUndeclaredExports: js.UndefOr[Boolean] = js.undefined
    
    /**
      * By default, the parser adds information about parentheses by setting
      * `extra.parenthesized` to `true` as needed.
      * When this option is `true` the parser creates `ParenthesizedExpression`
      * AST nodes instead of using the `extra` property.
      */
    var createParenthesizedExpressions: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Array containing the plugins that you want to enable.
      */
    var plugins: js.UndefOr[js.Array[ParserPlugin]] = js.undefined
    
    /**
      * Adds a ranges property to each node: [node.start, node.end]
      */
    var ranges: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Correlate output AST nodes with their source filename.
      * Useful when generating code and source maps from the ASTs of multiple input files.
      */
    var sourceFilename: js.UndefOr[String] = js.undefined
    
    /**
      * Indicate the mode the code should be parsed in.
      * Can be one of "script", "module", or "unambiguous". Defaults to "script".
      * "unambiguous" will make @babel/parser attempt to guess, based on the presence
      * of ES6 import or export statements.
      * Files with ES6 imports and exports are considered "module" and are otherwise "script".
      */
    var sourceType: js.UndefOr[script | module | unambiguous] = js.undefined
    
    /**
      * By default, the first line of code parsed is treated as line 1.
      * You can provide a line number to alternatively start with.
      * Useful for integration with other source tools.
      */
    var startLine: js.UndefOr[Double] = js.undefined
    
    /**
      * Should the parser work in strict mode.
      * Defaults to true if sourceType === 'module'. Otherwise, false.
      */
    var strictMode: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Adds all parsed tokens to a tokens property on the File node.
      */
    var tokens: js.UndefOr[Boolean] = js.undefined
  }
  object ParserOptions {
    
    inline def apply(): ParserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParserOptions]
    }
    
    extension [Self <: ParserOptions](x: Self) {
      
      inline def setAllowAwaitOutsideFunction(value: Boolean): Self = StObject.set(x, "allowAwaitOutsideFunction", value.asInstanceOf[js.Any])
      
      inline def setAllowAwaitOutsideFunctionUndefined: Self = StObject.set(x, "allowAwaitOutsideFunction", js.undefined)
      
      inline def setAllowImportExportEverywhere(value: Boolean): Self = StObject.set(x, "allowImportExportEverywhere", value.asInstanceOf[js.Any])
      
      inline def setAllowImportExportEverywhereUndefined: Self = StObject.set(x, "allowImportExportEverywhere", js.undefined)
      
      inline def setAllowReturnOutsideFunction(value: Boolean): Self = StObject.set(x, "allowReturnOutsideFunction", value.asInstanceOf[js.Any])
      
      inline def setAllowReturnOutsideFunctionUndefined: Self = StObject.set(x, "allowReturnOutsideFunction", js.undefined)
      
      inline def setAllowSuperOutsideMethod(value: Boolean): Self = StObject.set(x, "allowSuperOutsideMethod", value.asInstanceOf[js.Any])
      
      inline def setAllowSuperOutsideMethodUndefined: Self = StObject.set(x, "allowSuperOutsideMethod", js.undefined)
      
      inline def setAllowUndeclaredExports(value: Boolean): Self = StObject.set(x, "allowUndeclaredExports", value.asInstanceOf[js.Any])
      
      inline def setAllowUndeclaredExportsUndefined: Self = StObject.set(x, "allowUndeclaredExports", js.undefined)
      
      inline def setCreateParenthesizedExpressions(value: Boolean): Self = StObject.set(x, "createParenthesizedExpressions", value.asInstanceOf[js.Any])
      
      inline def setCreateParenthesizedExpressionsUndefined: Self = StObject.set(x, "createParenthesizedExpressions", js.undefined)
      
      inline def setPlugins(value: js.Array[ParserPlugin]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: ParserPlugin*): Self = StObject.set(x, "plugins", js.Array(value :_*))
      
      inline def setRanges(value: Boolean): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
      
      inline def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
      
      inline def setSourceFilename(value: String): Self = StObject.set(x, "sourceFilename", value.asInstanceOf[js.Any])
      
      inline def setSourceFilenameUndefined: Self = StObject.set(x, "sourceFilename", js.undefined)
      
      inline def setSourceType(value: script | module | unambiguous): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
      
      inline def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
      
      inline def setStartLine(value: Double): Self = StObject.set(x, "startLine", value.asInstanceOf[js.Any])
      
      inline def setStartLineUndefined: Self = StObject.set(x, "startLine", js.undefined)
      
      inline def setStrictMode(value: Boolean): Self = StObject.set(x, "strictMode", value.asInstanceOf[js.Any])
      
      inline def setStrictModeUndefined: Self = StObject.set(x, "strictMode", js.undefined)
      
      inline def setTokens(value: Boolean): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
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
  
  trait PipelineOperatorPluginOptions extends StObject {
    
    var proposal: fsharp | minimal | smart
  }
  object PipelineOperatorPluginOptions {
    
    inline def apply(proposal: fsharp | minimal | smart): PipelineOperatorPluginOptions = {
      val __obj = js.Dynamic.literal(proposal = proposal.asInstanceOf[js.Any])
      __obj.asInstanceOf[PipelineOperatorPluginOptions]
    }
    
    extension [Self <: PipelineOperatorPluginOptions](x: Self) {
      
      inline def setProposal(value: fsharp | minimal | smart): Self = StObject.set(x, "proposal", value.asInstanceOf[js.Any])
    }
  }
  
  trait RecordAndTuplePluginOptions extends StObject {
    
    var syntaxType: bar | hash
  }
  object RecordAndTuplePluginOptions {
    
    inline def apply(syntaxType: bar | hash): RecordAndTuplePluginOptions = {
      val __obj = js.Dynamic.literal(syntaxType = syntaxType.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordAndTuplePluginOptions]
    }
    
    extension [Self <: RecordAndTuplePluginOptions](x: Self) {
      
      inline def setSyntaxType(value: bar | hash): Self = StObject.set(x, "syntaxType", value.asInstanceOf[js.Any])
    }
  }
  
  trait _ParserPlugin extends StObject
}
