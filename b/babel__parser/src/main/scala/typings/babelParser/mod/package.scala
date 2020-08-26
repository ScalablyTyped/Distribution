package typings.babelParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Rewritten from type alias, can be one of: 
    - typings.babelParser.babelParserStrings.asyncGenerators
    - typings.babelParser.babelParserStrings.bigInt
    - typings.babelParser.babelParserStrings.classPrivateMethods
    - typings.babelParser.babelParserStrings.classPrivateProperties
    - typings.babelParser.babelParserStrings.classProperties
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
    - typings.babelParser.babelParserStrings.moduleAttributes
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
  type ParserPlugin = typings.babelParser.mod._ParserPlugin | typings.babelParser.mod.ParserPluginWithOptions
  type ParserPluginWithOptions = js.Tuple2[
    typings.babelParser.babelParserStrings.decorators | typings.babelParser.babelParserStrings.pipelineOperator | typings.babelParser.babelParserStrings.flow, 
    typings.babelParser.mod.DecoratorsPluginOptions | typings.babelParser.mod.FlowPluginOptions | typings.babelParser.mod.PipelineOperatorPluginOptions
  ]
}
