package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiplexProgramPipelineDetail extends StObject {
  
  /**
    * Identifies the channel pipeline that is currently active for the pipeline (identified by PipelineId) in the multiplex.
    */
  var ActiveChannelPipeline: js.UndefOr[string] = js.undefined
  
  /**
    * Identifies a specific pipeline in the multiplex.
    */
  var PipelineId: js.UndefOr[string] = js.undefined
}
object MultiplexProgramPipelineDetail {
  
  inline def apply(): MultiplexProgramPipelineDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiplexProgramPipelineDetail]
  }
  
  extension [Self <: MultiplexProgramPipelineDetail](x: Self) {
    
    inline def setActiveChannelPipeline(value: string): Self = StObject.set(x, "ActiveChannelPipeline", value.asInstanceOf[js.Any])
    
    inline def setActiveChannelPipelineUndefined: Self = StObject.set(x, "ActiveChannelPipeline", js.undefined)
    
    inline def setPipelineId(value: string): Self = StObject.set(x, "PipelineId", value.asInstanceOf[js.Any])
    
    inline def setPipelineIdUndefined: Self = StObject.set(x, "PipelineId", js.undefined)
  }
}
