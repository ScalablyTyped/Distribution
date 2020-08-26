package typings.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePipelinesInput extends js.Object {
  /**
    * The IDs of the pipelines to describe. You can pass as many as 25 identifiers in a single call. To obtain pipeline IDs, call ListPipelines.
    */
  var pipelineIds: idList = js.native
}

object DescribePipelinesInput {
  @scala.inline
  def apply(pipelineIds: idList): DescribePipelinesInput = {
    val __obj = js.Dynamic.literal(pipelineIds = pipelineIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePipelinesInput]
  }
  @scala.inline
  implicit class DescribePipelinesInputOps[Self <: DescribePipelinesInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPipelineIdsVarargs(value: id*): Self = this.set("pipelineIds", js.Array(value :_*))
    @scala.inline
    def setPipelineIds(value: idList): Self = this.set("pipelineIds", value.asInstanceOf[js.Any])
  }
  
}

