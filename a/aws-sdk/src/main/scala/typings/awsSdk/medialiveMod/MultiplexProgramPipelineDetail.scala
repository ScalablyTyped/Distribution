package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiplexProgramPipelineDetail extends js.Object {
  
  /**
    * Identifies the channel pipeline that is currently active for the pipeline (identified by PipelineId) in the multiplex.
    */
  var ActiveChannelPipeline: js.UndefOr[string] = js.native
  
  /**
    * Identifies a specific pipeline in the multiplex.
    */
  var PipelineId: js.UndefOr[string] = js.native
}
object MultiplexProgramPipelineDetail {
  
  @scala.inline
  def apply(): MultiplexProgramPipelineDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiplexProgramPipelineDetail]
  }
  
  @scala.inline
  implicit class MultiplexProgramPipelineDetailOps[Self <: MultiplexProgramPipelineDetail] (val x: Self) extends AnyVal {
    
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
    def setActiveChannelPipeline(value: string): Self = this.set("ActiveChannelPipeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveChannelPipeline: Self = this.set("ActiveChannelPipeline", js.undefined)
    
    @scala.inline
    def setPipelineId(value: string): Self = this.set("PipelineId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePipelineId: Self = this.set("PipelineId", js.undefined)
  }
}
