package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiplexProgramPipelineDetail extends StObject {
  
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
  implicit class MultiplexProgramPipelineDetailMutableBuilder[Self <: MultiplexProgramPipelineDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveChannelPipeline(value: string): Self = StObject.set(x, "ActiveChannelPipeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveChannelPipelineUndefined: Self = StObject.set(x, "ActiveChannelPipeline", js.undefined)
    
    @scala.inline
    def setPipelineId(value: string): Self = StObject.set(x, "PipelineId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipelineIdUndefined: Self = StObject.set(x, "PipelineId", js.undefined)
  }
}
