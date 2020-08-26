package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPipelineStateInput extends js.Object {
  /**
    * The name of the pipeline about which you want to get information.
    */
  var name: PipelineName = js.native
}

object GetPipelineStateInput {
  @scala.inline
  def apply(name: PipelineName): GetPipelineStateInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPipelineStateInput]
  }
  @scala.inline
  implicit class GetPipelineStateInputOps[Self <: GetPipelineStateInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: PipelineName): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

