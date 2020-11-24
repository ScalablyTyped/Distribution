package typings.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPipelinesOutput extends js.Object {
  
  /**
    * Indicates whether there are more results that can be obtained by a subsequent call.
    */
  var hasMoreResults: js.UndefOr[Boolean] = js.native
  
  /**
    * The starting point for the next page of results. To view the next page of results, call ListPipelinesOutput again with this marker value. If the value is null, there are no more results.
    */
  var marker: js.UndefOr[String] = js.native
  
  /**
    * The pipeline identifiers. If you require additional information about the pipelines, you can use these identifiers to call DescribePipelines and GetPipelineDefinition.
    */
  var pipelineIdList: pipelineList = js.native
}
object ListPipelinesOutput {
  
  @scala.inline
  def apply(pipelineIdList: pipelineList): ListPipelinesOutput = {
    val __obj = js.Dynamic.literal(pipelineIdList = pipelineIdList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPipelinesOutput]
  }
  
  @scala.inline
  implicit class ListPipelinesOutputOps[Self <: ListPipelinesOutput] (val x: Self) extends AnyVal {
    
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
    def setPipelineIdListVarargs(value: PipelineIdName*): Self = this.set("pipelineIdList", js.Array(value :_*))
    
    @scala.inline
    def setPipelineIdList(value: pipelineList): Self = this.set("pipelineIdList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasMoreResults(value: Boolean): Self = this.set("hasMoreResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasMoreResults: Self = this.set("hasMoreResults", js.undefined)
    
    @scala.inline
    def setMarker(value: String): Self = this.set("marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("marker", js.undefined)
  }
}
