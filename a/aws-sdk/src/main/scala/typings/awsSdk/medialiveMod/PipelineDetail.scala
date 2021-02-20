package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PipelineDetail extends StObject {
  
  /**
    * The name of the active input attachment currently being ingested by this pipeline.
    */
  var ActiveInputAttachmentName: js.UndefOr[string] = js.native
  
  /**
    * The name of the input switch schedule action that occurred most recently and that resulted in the switch to the current input attachment for this pipeline.
    */
  var ActiveInputSwitchActionName: js.UndefOr[string] = js.native
  
  /**
    * Pipeline ID
    */
  var PipelineId: js.UndefOr[string] = js.native
}
object PipelineDetail {
  
  @scala.inline
  def apply(): PipelineDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipelineDetail]
  }
  
  @scala.inline
  implicit class PipelineDetailMutableBuilder[Self <: PipelineDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveInputAttachmentName(value: string): Self = StObject.set(x, "ActiveInputAttachmentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveInputAttachmentNameUndefined: Self = StObject.set(x, "ActiveInputAttachmentName", js.undefined)
    
    @scala.inline
    def setActiveInputSwitchActionName(value: string): Self = StObject.set(x, "ActiveInputSwitchActionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveInputSwitchActionNameUndefined: Self = StObject.set(x, "ActiveInputSwitchActionName", js.undefined)
    
    @scala.inline
    def setPipelineId(value: string): Self = StObject.set(x, "PipelineId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipelineIdUndefined: Self = StObject.set(x, "PipelineId", js.undefined)
  }
}
