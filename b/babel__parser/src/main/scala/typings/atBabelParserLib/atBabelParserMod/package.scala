package typings
package atBabelParserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atBabelParserMod {
  /* Rewritten from type alias, can be one of: 
    - atBabelParserLib.atBabelParserLibStrings.estree
    - atBabelParserLib.atBabelParserLibStrings.jsx
    - atBabelParserLib.atBabelParserLibStrings.flow
    - atBabelParserLib.atBabelParserLibStrings.flowComments
    - atBabelParserLib.atBabelParserLibStrings.typescript
    - atBabelParserLib.atBabelParserLibStrings.doExpressions
    - atBabelParserLib.atBabelParserLibStrings.objectRestSpread
    - atBabelParserLib.atBabelParserLibStrings.decorators
    - atBabelParserLib.atBabelParserLibStrings.`decorators-legacy`
    - atBabelParserLib.atBabelParserLibStrings.classProperties
    - atBabelParserLib.atBabelParserLibStrings.classPrivateProperties
    - atBabelParserLib.atBabelParserLibStrings.classPrivateMethods
    - atBabelParserLib.atBabelParserLibStrings.exportDefaultFrom
    - atBabelParserLib.atBabelParserLibStrings.exportNamespaceFrom
    - atBabelParserLib.atBabelParserLibStrings.asyncGenerators
    - atBabelParserLib.atBabelParserLibStrings.functionBind
    - atBabelParserLib.atBabelParserLibStrings.functionSent
    - atBabelParserLib.atBabelParserLibStrings.dynamicImport
    - atBabelParserLib.atBabelParserLibStrings.numericSeparator
    - atBabelParserLib.atBabelParserLibStrings.optionalChaining
    - atBabelParserLib.atBabelParserLibStrings.importMeta
    - atBabelParserLib.atBabelParserLibStrings.bigInt
    - atBabelParserLib.atBabelParserLibStrings.optionalCatchBinding
    - atBabelParserLib.atBabelParserLibStrings.throwExpressions
    - atBabelParserLib.atBabelParserLibStrings.pipelineOperator
    - atBabelParserLib.atBabelParserLibStrings.nullishCoalescingOperator
    - ParserPluginWithOptions
  */
  type ParserPlugin = _ParserPlugin | ParserPluginWithOptions
  type ParserPluginWithOptions = (js.Tuple2[atBabelParserLib.atBabelParserLibStrings.decorators, DecoratorsPluginOptions]) | (js.Tuple2[
    atBabelParserLib.atBabelParserLibStrings.pipelineOperator, 
    PipelineOperatorPluginOptions
  ]) | (js.Tuple2[atBabelParserLib.atBabelParserLibStrings.flow, FlowPluginOptions])
}
