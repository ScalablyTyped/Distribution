package typings
package atBabelParserLib.atBabelParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipelineOperatorPluginOptions extends js.Object {
  var proposal: atBabelParserLib.atBabelParserLibStrings.minimal | atBabelParserLib.atBabelParserLibStrings.smart
}

object PipelineOperatorPluginOptions {
  @scala.inline
  def apply(
    proposal: atBabelParserLib.atBabelParserLibStrings.minimal | atBabelParserLib.atBabelParserLibStrings.smart
  ): PipelineOperatorPluginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("proposal")(proposal.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineOperatorPluginOptions]
  }
}

