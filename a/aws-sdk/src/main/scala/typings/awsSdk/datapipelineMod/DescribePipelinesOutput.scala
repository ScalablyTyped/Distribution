package typings.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class DescribePipelinesOutputOps[Self <: DescribePipelinesOutput] (val x: Self) extends AnyVal {
    
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
    def setPipelineDescriptionListVarargs(value: PipelineDescription*): Self = this.set("pipelineDescriptionList", js.Array(value :_*))
    
    @scala.inline
    def setPipelineDescriptionList(value: PipelineDescriptionList): Self = this.set("pipelineDescriptionList", value.asInstanceOf[js.Any])
  }
}
