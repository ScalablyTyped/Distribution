package typings.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePipelinesOutput extends js.Object {
  /**
    * An array of descriptions for the specified pipelines.
    */
  var pipelineDescriptionList: PipelineDescriptionList = js.native
}

object DescribePipelinesOutput {
  @scala.inline
  def apply(pipelineDescriptionList: PipelineDescriptionList): DescribePipelinesOutput = {
    val __obj = js.Dynamic.literal(pipelineDescriptionList = pipelineDescriptionList.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePipelinesOutput]
  }
}

