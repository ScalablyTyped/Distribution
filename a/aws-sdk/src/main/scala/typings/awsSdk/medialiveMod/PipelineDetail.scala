package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipelineDetail extends StObject {
  
  /**
    * The name of the active input attachment currently being ingested by this pipeline.
    */
  var ActiveInputAttachmentName: js.UndefOr[string] = js.undefined
  
  /**
    * The name of the input switch schedule action that occurred most recently and that resulted in the switch to the current input attachment for this pipeline.
    */
  var ActiveInputSwitchActionName: js.UndefOr[string] = js.undefined
  
  /**
    * The name of the motion graphics activate action that occurred most recently and that resulted in the current graphics URI for this pipeline.
    */
  var ActiveMotionGraphicsActionName: js.UndefOr[string] = js.undefined
  
  /**
    * The current URI being used for HTML5 motion graphics for this pipeline.
    */
  var ActiveMotionGraphicsUri: js.UndefOr[string] = js.undefined
  
  /**
    * Pipeline ID
    */
  var PipelineId: js.UndefOr[string] = js.undefined
}
object PipelineDetail {
  
  inline def apply(): PipelineDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipelineDetail]
  }
  
  extension [Self <: PipelineDetail](x: Self) {
    
    inline def setActiveInputAttachmentName(value: string): Self = StObject.set(x, "ActiveInputAttachmentName", value.asInstanceOf[js.Any])
    
    inline def setActiveInputAttachmentNameUndefined: Self = StObject.set(x, "ActiveInputAttachmentName", js.undefined)
    
    inline def setActiveInputSwitchActionName(value: string): Self = StObject.set(x, "ActiveInputSwitchActionName", value.asInstanceOf[js.Any])
    
    inline def setActiveInputSwitchActionNameUndefined: Self = StObject.set(x, "ActiveInputSwitchActionName", js.undefined)
    
    inline def setActiveMotionGraphicsActionName(value: string): Self = StObject.set(x, "ActiveMotionGraphicsActionName", value.asInstanceOf[js.Any])
    
    inline def setActiveMotionGraphicsActionNameUndefined: Self = StObject.set(x, "ActiveMotionGraphicsActionName", js.undefined)
    
    inline def setActiveMotionGraphicsUri(value: string): Self = StObject.set(x, "ActiveMotionGraphicsUri", value.asInstanceOf[js.Any])
    
    inline def setActiveMotionGraphicsUriUndefined: Self = StObject.set(x, "ActiveMotionGraphicsUri", js.undefined)
    
    inline def setPipelineId(value: string): Self = StObject.set(x, "PipelineId", value.asInstanceOf[js.Any])
    
    inline def setPipelineIdUndefined: Self = StObject.set(x, "PipelineId", js.undefined)
  }
}
