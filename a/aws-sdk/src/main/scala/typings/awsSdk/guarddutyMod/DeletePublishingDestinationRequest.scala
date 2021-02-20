package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeletePublishingDestinationRequest extends StObject {
  
  /**
    * The ID of the publishing destination to delete.
    */
  var DestinationId: String = js.native
  
  /**
    * The unique ID of the detector associated with the publishing destination to delete.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId = js.native
}
object DeletePublishingDestinationRequest {
  
  @scala.inline
  def apply(DestinationId: String, DetectorId: DetectorId): DeletePublishingDestinationRequest = {
    val __obj = js.Dynamic.literal(DestinationId = DestinationId.asInstanceOf[js.Any], DetectorId = DetectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePublishingDestinationRequest]
  }
  
  @scala.inline
  implicit class DeletePublishingDestinationRequestMutableBuilder[Self <: DeletePublishingDestinationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationId(value: String): Self = StObject.set(x, "DestinationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
  }
}
