package typings.awsSdk.datapipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeactivatePipelineInput extends StObject {
  
  /**
    * Indicates whether to cancel any running objects. The default is true, which sets the state of any running objects to CANCELED. If this value is false, the pipeline is deactivated after all running objects finish.
    */
  var cancelActive: js.UndefOr[typings.awsSdk.datapipelineMod.cancelActive] = js.native
  
  /**
    * The ID of the pipeline.
    */
  var pipelineId: id = js.native
}
object DeactivatePipelineInput {
  
  @scala.inline
  def apply(pipelineId: id): DeactivatePipelineInput = {
    val __obj = js.Dynamic.literal(pipelineId = pipelineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeactivatePipelineInput]
  }
  
  @scala.inline
  implicit class DeactivatePipelineInputMutableBuilder[Self <: DeactivatePipelineInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancelActive(value: cancelActive): Self = StObject.set(x, "cancelActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelActiveUndefined: Self = StObject.set(x, "cancelActive", js.undefined)
    
    @scala.inline
    def setPipelineId(value: id): Self = StObject.set(x, "pipelineId", value.asInstanceOf[js.Any])
  }
}
