package typings
package atBabelParserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atBabelParserMod {
  type ParserPlugin = _ParserPlugin | ParserPluginWithOptions
  type ParserPluginWithOptions = (js.Tuple2[atBabelParserLib.atBabelParserLibStrings.decorators, DecoratorsPluginOptions]) | (js.Tuple2[
    atBabelParserLib.atBabelParserLibStrings.pipelineOperator, 
    PipelineOperatorPluginOptions
  ]) | (js.Tuple2[atBabelParserLib.atBabelParserLibStrings.flow, FlowPluginOptions])
}
