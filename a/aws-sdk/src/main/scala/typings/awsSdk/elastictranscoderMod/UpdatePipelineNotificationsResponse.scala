package typings.awsSdk.elastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePipelineNotificationsResponse extends StObject {
  
  /**
    * A section of the response body that provides information about the pipeline associated with this notification.
    */
  var Pipeline: js.UndefOr[typings.awsSdk.elastictranscoderMod.Pipeline] = js.undefined
}
object UpdatePipelineNotificationsResponse {
  
  @scala.inline
  def apply(): UpdatePipelineNotificationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdatePipelineNotificationsResponse]
  }
  
  @scala.inline
  implicit class UpdatePipelineNotificationsResponseMutableBuilder[Self <: UpdatePipelineNotificationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPipeline(value: Pipeline): Self = StObject.set(x, "Pipeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipelineUndefined: Self = StObject.set(x, "Pipeline", js.undefined)
  }
}
