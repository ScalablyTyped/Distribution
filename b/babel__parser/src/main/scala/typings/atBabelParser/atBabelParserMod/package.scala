package typings.atBabelParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atBabelParserMod {
  import typings.atBabelParser.atBabelParserStrings.decorators
  import typings.atBabelParser.atBabelParserStrings.flow
  import typings.atBabelParser.atBabelParserStrings.pipelineOperator

  /* Rewritten from type alias, can be one of: 
    - typings.atBabelParser.atBabelParserStrings.asyncGenerators
    - typings.atBabelParser.atBabelParserStrings.bigInt
    - typings.atBabelParser.atBabelParserStrings.classPrivateMethods
    - typings.atBabelParser.atBabelParserStrings.classPrivateProperties
    - typings.atBabelParser.atBabelParserStrings.classProperties
    - typings.atBabelParser.atBabelParserStrings.decorators
    - typings.atBabelParser.atBabelParserStrings.`decorators-legacy`
    - typings.atBabelParser.atBabelParserStrings.doExpressions
    - typings.atBabelParser.atBabelParserStrings.dynamicImport
    - typings.atBabelParser.atBabelParserStrings.estree
    - typings.atBabelParser.atBabelParserStrings.exportDefaultFrom
    - typings.atBabelParser.atBabelParserStrings.exportNamespaceFrom
    - typings.atBabelParser.atBabelParserStrings.flow
    - typings.atBabelParser.atBabelParserStrings.flowComments
    - typings.atBabelParser.atBabelParserStrings.functionBind
    - typings.atBabelParser.atBabelParserStrings.functionSent
    - typings.atBabelParser.atBabelParserStrings.importMeta
    - typings.atBabelParser.atBabelParserStrings.jsx
    - typings.atBabelParser.atBabelParserStrings.logicalAssignment
    - typings.atBabelParser.atBabelParserStrings.nullishCoalescingOperator
    - typings.atBabelParser.atBabelParserStrings.numericSeparator
    - typings.atBabelParser.atBabelParserStrings.objectRestSpread
    - typings.atBabelParser.atBabelParserStrings.optionalCatchBinding
    - typings.atBabelParser.atBabelParserStrings.optionalChaining
    - typings.atBabelParser.atBabelParserStrings.partialApplication
    - typings.atBabelParser.atBabelParserStrings.pipelineOperator
    - typings.atBabelParser.atBabelParserStrings.placeholders
    - typings.atBabelParser.atBabelParserStrings.throwExpressions
    - typings.atBabelParser.atBabelParserStrings.topLevelAwait
    - typings.atBabelParser.atBabelParserStrings.typescript
    - typings.atBabelParser.atBabelParserStrings.v8intrinsic
    - typings.atBabelParser.atBabelParserMod.ParserPluginWithOptions
  */
  type ParserPlugin = _ParserPlugin | ParserPluginWithOptions
  type ParserPluginWithOptions = js.Tuple2[
    decorators | pipelineOperator | flow, 
    DecoratorsPluginOptions | FlowPluginOptions | PipelineOperatorPluginOptions
  ]
}
