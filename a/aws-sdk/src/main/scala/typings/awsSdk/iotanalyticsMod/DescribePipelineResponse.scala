package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribePipelineResponse extends js.Object {
  
  /**
    * A Pipeline object that contains information about the pipeline.
    */
  var pipeline: js.UndefOr[Pipeline] = js.native
}
object DescribePipelineResponse {
  
  @scala.inline
  def apply(): DescribePipelineResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePipelineResponse]
  }
  
  @scala.inline
  implicit class DescribePipelineResponseOps[Self <: DescribePipelineResponse] (val x: Self) extends AnyVal {
    
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
    def setPipeline(value: Pipeline): Self = this.set("pipeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePipeline: Self = this.set("pipeline", js.undefined)
  }
}
