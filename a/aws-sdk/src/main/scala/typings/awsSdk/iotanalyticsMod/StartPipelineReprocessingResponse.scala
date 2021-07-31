package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartPipelineReprocessingResponse extends StObject {
  
  /**
    * The ID of the pipeline reprocessing activity that was started.
    */
  var reprocessingId: js.UndefOr[ReprocessingId] = js.undefined
}
object StartPipelineReprocessingResponse {
  
  @scala.inline
  def apply(): StartPipelineReprocessingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartPipelineReprocessingResponse]
  }
  
  @scala.inline
  implicit class StartPipelineReprocessingResponseMutableBuilder[Self <: StartPipelineReprocessingResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReprocessingId(value: ReprocessingId): Self = StObject.set(x, "reprocessingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReprocessingIdUndefined: Self = StObject.set(x, "reprocessingId", js.undefined)
  }
}
