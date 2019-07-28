package typings.atBabelParser

import typings.atBabelParser.atBabelParserStrings.decorators
import typings.atBabelParser.atBabelParserStrings.flow
import typings.atBabelParser.atBabelParserStrings.pipelineOperator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atBabelParserMod {
  /* Rewritten from type alias, can be one of: 
    - typings.atBabelParser.atBabelParserStrings.estree
    - typings.atBabelParser.atBabelParserStrings.jsx
    - typings.atBabelParser.atBabelParserStrings.flow
    - typings.atBabelParser.atBabelParserStrings.flowComments
    - typings.atBabelParser.atBabelParserStrings.typescript
    - typings.atBabelParser.atBabelParserStrings.doExpressions
    - typings.atBabelParser.atBabelParserStrings.objectRestSpread
    - typings.atBabelParser.atBabelParserStrings.decorators
    - typings.atBabelParser.atBabelParserStrings.`decorators-legacy`
    - typings.atBabelParser.atBabelParserStrings.classProperties
    - typings.atBabelParser.atBabelParserStrings.classPrivateProperties
    - typings.atBabelParser.atBabelParserStrings.classPrivateMethods
    - typings.atBabelParser.atBabelParserStrings.exportDefaultFrom
    - typings.atBabelParser.atBabelParserStrings.exportNamespaceFrom
    - typings.atBabelParser.atBabelParserStrings.asyncGenerators
    - typings.atBabelParser.atBabelParserStrings.functionBind
    - typings.atBabelParser.atBabelParserStrings.functionSent
    - typings.atBabelParser.atBabelParserStrings.dynamicImport
    - typings.atBabelParser.atBabelParserStrings.numericSeparator
    - typings.atBabelParser.atBabelParserStrings.optionalChaining
    - typings.atBabelParser.atBabelParserStrings.importMeta
    - typings.atBabelParser.atBabelParserStrings.bigInt
    - typings.atBabelParser.atBabelParserStrings.optionalCatchBinding
    - typings.atBabelParser.atBabelParserStrings.throwExpressions
    - typings.atBabelParser.atBabelParserStrings.pipelineOperator
    - typings.atBabelParser.atBabelParserStrings.nullishCoalescingOperator
    - typings.atBabelParser.atBabelParserMod.ParserPluginWithOptions
  */
  type ParserPlugin = _ParserPlugin | ParserPluginWithOptions
  type ParserPluginWithOptions = js.Tuple2[
    decorators | pipelineOperator | flow, 
    DecoratorsPluginOptions | FlowPluginOptions | PipelineOperatorPluginOptions
  ]
}
