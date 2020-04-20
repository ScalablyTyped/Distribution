package typings.babelParser.mod

import typings.babelParser.babelParserStrings.minimal
import typings.babelParser.babelParserStrings.smart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipelineOperatorPluginOptions extends js.Object {
  var proposal: minimal | smart
}

object PipelineOperatorPluginOptions {
  @scala.inline
  def apply(proposal: minimal | smart): PipelineOperatorPluginOptions = {
    val __obj = js.Dynamic.literal(proposal = proposal.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineOperatorPluginOptions]
  }
}

