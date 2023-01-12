package typings.babelParser

import typings.babelParser.anon.ClassFeatures
import typings.babelParser.anon.Errors
import typings.babelParser.anon.ParseResultFile
import typings.babelParser.anon.Version
import typings.babelParser.babelParserStrings.Numbersign
import typings.babelParser.babelParserStrings.Percentsign
import typings.babelParser.babelParserStrings.`@@`
import typings.babelParser.babelParserStrings.`^^`
import typings.babelParser.babelParserStrings.bar
import typings.babelParser.babelParserStrings.decorators
import typings.babelParser.babelParserStrings.estree
import typings.babelParser.babelParserStrings.flow
import typings.babelParser.babelParserStrings.fsharp
import typings.babelParser.babelParserStrings.hack
import typings.babelParser.babelParserStrings.hash
import typings.babelParser.babelParserStrings.minimal
import typings.babelParser.babelParserStrings.module
import typings.babelParser.babelParserStrings.moduleAttributes
import typings.babelParser.babelParserStrings.pipelineOperator
import typings.babelParser.babelParserStrings.recordAndTuple
import typings.babelParser.babelParserStrings.script
import typings.babelParser.babelParserStrings.smart
import typings.babelParser.babelParserStrings.typescript
import typings.babelParser.babelParserStrings.unambiguous
import typings.babelTypes.mod.Expression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@babel/parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // Type definitions for @babel/parser
  // Project: https://github.com/babel/babel/tree/main/packages/babel-parser
  // Definitions by: Troy Gerwien <https://github.com/yortus>
  //                 Marvin Hagemeister <https://github.com/marvinhagemeister>
  //                 Avi Vahl <https://github.com/AviVahl>
  // TypeScript Version: 2.9
  /**
    * Parse the provided code as an entire ECMAScript program.
    */
  inline def parse(input: String): ParseResultFile = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[ParseResultFile]
  inline def parse(input: String, options: ParserOptions): ParseResultFile = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParseResultFile]
  
  /**
    * Parse the provided code as a single expression.
    */
  inline def parseExpression(input: String): ParseResult[Expression] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseExpression")(input.asInstanceOf[js.Any]).asInstanceOf[ParseResult[Expression]]
  inline def parseExpression(input: String, options: ParserOptions): ParseResult[Expression] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseExpression")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParseResult[Expression]]
  
  trait DecoratorsPluginOptions extends StObject {
    
    var allowCallParenthesized: js.UndefOr[Boolean] = js.undefined
    
    var decoratorsBeforeExport: js.UndefOr[Boolean] = js.undefined
  }
  object DecoratorsPluginOptions {
    
    inline def apply(): DecoratorsPluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DecoratorsPluginOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DecoratorsPluginOptions] (val x: Self) extends AnyVal {
      
      inline def setAllowCallParenthesized(value: Boolean): Self = StObject.set(x, "allowCallParenthesized", value.asInstanceOf[js.Any])
      
      inline def setAllowCallParenthesizedUndefined: Self = StObject.set(x, "allowCallParenthesized", js.undefined)
      
      inline def setDecoratorsBeforeExport(value: Boolean): Self = StObject.set(x, "decoratorsBeforeExport", value.asInstanceOf[js.Any])
      
      inline def setDecoratorsBeforeExportUndefined: Self = StObject.set(x, "decoratorsBeforeExport", js.undefined)
    }
  }
  
  trait FlowPluginOptions extends StObject {
    
    var all: js.UndefOr[Boolean] = js.undefined
    
    var enums: js.UndefOr[Boolean] = js.undefined
  }
  object FlowPluginOptions {
    
    inline def apply(): FlowPluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlowPluginOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FlowPluginOptions] (val x: Self) extends AnyVal {
      
      inline def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
      
      inline def setEnums(value: Boolean): Self = StObject.set(x, "enums", value.asInstanceOf[js.Any])
      
      inline def setEnumsUndefined: Self = StObject.set(x, "enums", js.undefined)
    }
  }
  
  trait ParseError extends StObject {
    
    var code: String
    
    var reasonCode: String
  }
  object ParseError {
    
    inline def apply(code: String, reasonCode: String): ParseError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], reasonCode = reasonCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParseError] (val x: Self) extends AnyVal {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setReasonCode(value: String): Self = StObject.set(x, "reasonCode", value.asInstanceOf[js.Any])
    }
  }
  
  type ParseResult[Result] = Result & Errors
  
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
      * By default, Babel attaches comments to adjacent AST nodes.
      * When this option is set to false, comments are not attached.
      * It can provide up to 30% performance improvement when the input code has many comments.
      * @babel/eslint-parser will set it for you.
      * It is not recommended to use attachComment: false with Babel transform,
      * as doing so removes all the comments in output code, and renders annotations such as
      * / * istanbul ignore next *\/ nonfunctional.
      */
    var attachComment: js.UndefOr[Boolean] = js.undefined
    
    /**
      * By default, the parser adds information about parentheses by setting
      * `extra.parenthesized` to `true` as needed.
      * When this option is `true` the parser creates `ParenthesizedExpression`
      * AST nodes instead of using the `extra` property.
      */
    var createParenthesizedExpressions: js.UndefOr[Boolean] = js.undefined
    
    /**
      * By default, Babel always throws an error when it finds some invalid code.
      * When this option is set to true, it will store the parsing error and
      * try to continue parsing the invalid input file.
      */
    var errorRecovery: js.UndefOr[Boolean] = js.undefined
    
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
      * By default, the parsed code is treated as if it starts from line 1, column 0.
      * You can provide a column number to alternatively start with.
      * Useful for integration with other source tools.
      */
    var startColumn: js.UndefOr[Double] = js.undefined
    
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParserOptions] (val x: Self) extends AnyVal {
      
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
      
      inline def setAttachComment(value: Boolean): Self = StObject.set(x, "attachComment", value.asInstanceOf[js.Any])
      
      inline def setAttachCommentUndefined: Self = StObject.set(x, "attachComment", js.undefined)
      
      inline def setCreateParenthesizedExpressions(value: Boolean): Self = StObject.set(x, "createParenthesizedExpressions", value.asInstanceOf[js.Any])
      
      inline def setCreateParenthesizedExpressionsUndefined: Self = StObject.set(x, "createParenthesizedExpressions", js.undefined)
      
      inline def setErrorRecovery(value: Boolean): Self = StObject.set(x, "errorRecovery", value.asInstanceOf[js.Any])
      
      inline def setErrorRecoveryUndefined: Self = StObject.set(x, "errorRecovery", js.undefined)
      
      inline def setPlugins(value: js.Array[ParserPlugin]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: ParserPlugin*): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setRanges(value: Boolean): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
      
      inline def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
      
      inline def setSourceFilename(value: String): Self = StObject.set(x, "sourceFilename", value.asInstanceOf[js.Any])
      
      inline def setSourceFilenameUndefined: Self = StObject.set(x, "sourceFilename", js.undefined)
      
      inline def setSourceType(value: script | module | unambiguous): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
      
      inline def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
      
      inline def setStartColumn(value: Double): Self = StObject.set(x, "startColumn", value.asInstanceOf[js.Any])
      
      inline def setStartColumnUndefined: Self = StObject.set(x, "startColumn", js.undefined)
      
      inline def setStartLine(value: Double): Self = StObject.set(x, "startLine", value.asInstanceOf[js.Any])
      
      inline def setStartLineUndefined: Self = StObject.set(x, "startLine", js.undefined)
      
      inline def setStrictMode(value: Boolean): Self = StObject.set(x, "strictMode", value.asInstanceOf[js.Any])
      
      inline def setStrictModeUndefined: Self = StObject.set(x, "strictMode", js.undefined)
      
      inline def setTokens(value: Boolean): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
    }
  }
  
  type ParserPlugin = PluginConfig
  
  type ParserPluginWithOptions = js.Tuple2[
    decorators | estree | moduleAttributes | pipelineOperator | recordAndTuple | flow | typescript, 
    ClassFeatures | DecoratorsPluginOptions | FlowPluginOptions | PipelineOperatorPluginOptions | RecordAndTuplePluginOptions | TypeScriptPluginOptions | Version
  ]
  
  trait PipelineOperatorPluginOptions extends StObject {
    
    var proposal: minimal | fsharp | hack | smart
    
    var topicToken: js.UndefOr[
        Percentsign | Numbersign | `@@` | `^^` | typings.babelParser.babelParserStrings.^
      ] = js.undefined
  }
  object PipelineOperatorPluginOptions {
    
    inline def apply(proposal: minimal | fsharp | hack | smart): PipelineOperatorPluginOptions = {
      val __obj = js.Dynamic.literal(proposal = proposal.asInstanceOf[js.Any])
      __obj.asInstanceOf[PipelineOperatorPluginOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PipelineOperatorPluginOptions] (val x: Self) extends AnyVal {
      
      inline def setProposal(value: minimal | fsharp | hack | smart): Self = StObject.set(x, "proposal", value.asInstanceOf[js.Any])
      
      inline def setTopicToken(value: Percentsign | Numbersign | `@@` | `^^` | typings.babelParser.babelParserStrings.^): Self = StObject.set(x, "topicToken", value.asInstanceOf[js.Any])
      
      inline def setTopicTokenUndefined: Self = StObject.set(x, "topicToken", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.babelParser.babelParserStrings.asyncDoExpressions
    - typings.babelParser.babelParserStrings.asyncGenerators
    - typings.babelParser.babelParserStrings.bigInt
    - typings.babelParser.babelParserStrings.classPrivateMethods
    - typings.babelParser.babelParserStrings.classPrivateProperties
    - typings.babelParser.babelParserStrings.classProperties
    - typings.babelParser.babelParserStrings.classStaticBlock
    - typings.babelParser.babelParserStrings.decimal
    - typings.babelParser.babelParserStrings.`decorators-legacy`
    - typings.babelParser.babelParserStrings.decoratorAutoAccessors
    - typings.babelParser.babelParserStrings.destructuringPrivate
    - typings.babelParser.babelParserStrings.doExpressions
    - typings.babelParser.babelParserStrings.dynamicImport
    - typings.babelParser.babelParserStrings.explicitResourceManagement
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
    - typings.babelParser.babelParserStrings.importReflection
    - typings.babelParser.babelParserStrings.moduleBlocks
    - typings.babelParser.babelParserStrings.moduleStringNames
    - typings.babelParser.babelParserStrings.nullishCoalescingOperator
    - typings.babelParser.babelParserStrings.numericSeparator
    - typings.babelParser.babelParserStrings.objectRestSpread
    - typings.babelParser.babelParserStrings.optionalCatchBinding
    - typings.babelParser.babelParserStrings.optionalChaining
    - typings.babelParser.babelParserStrings.partialApplication
    - typings.babelParser.babelParserStrings.placeholders
    - typings.babelParser.babelParserStrings.privateIn
    - typings.babelParser.babelParserStrings.regexpUnicodeSets
    - typings.babelParser.babelParserStrings.throwExpressions
    - typings.babelParser.babelParserStrings.topLevelAwait
    - typings.babelParser.babelParserStrings.v8intrinsic
    - / * import warning: importer.ImportType#apply Failed type conversion: @babel/parser.@babel/parser.ParserPluginWithOptions[0] * / js.Any
  */
  type Plugin = _Plugin | (/* import warning: importer.ImportType#apply Failed type conversion: @babel/parser.@babel/parser.ParserPluginWithOptions[0] */ js.Any)
  
  type PluginConfig = Plugin | ParserPluginWithOptions
  
  trait RecordAndTuplePluginOptions extends StObject {
    
    var syntaxType: bar | hash
  }
  object RecordAndTuplePluginOptions {
    
    inline def apply(syntaxType: bar | hash): RecordAndTuplePluginOptions = {
      val __obj = js.Dynamic.literal(syntaxType = syntaxType.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordAndTuplePluginOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RecordAndTuplePluginOptions] (val x: Self) extends AnyVal {
      
      inline def setSyntaxType(value: bar | hash): Self = StObject.set(x, "syntaxType", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeScriptPluginOptions extends StObject {
    
    var disallowAmbiguousJSXLike: js.UndefOr[Boolean] = js.undefined
    
    var dts: js.UndefOr[Boolean] = js.undefined
  }
  object TypeScriptPluginOptions {
    
    inline def apply(): TypeScriptPluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypeScriptPluginOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeScriptPluginOptions] (val x: Self) extends AnyVal {
      
      inline def setDisallowAmbiguousJSXLike(value: Boolean): Self = StObject.set(x, "disallowAmbiguousJSXLike", value.asInstanceOf[js.Any])
      
      inline def setDisallowAmbiguousJSXLikeUndefined: Self = StObject.set(x, "disallowAmbiguousJSXLike", js.undefined)
      
      inline def setDts(value: Boolean): Self = StObject.set(x, "dts", value.asInstanceOf[js.Any])
      
      inline def setDtsUndefined: Self = StObject.set(x, "dts", js.undefined)
    }
  }
  
  trait _Plugin extends StObject
}
