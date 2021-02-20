package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDetectorRequest extends StObject {
  
  /**
    * The unique ID of the detector that you want to get.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId = js.native
}
object GetDetectorRequest {
  
  @scala.inline
  def apply(DetectorId: DetectorId): GetDetectorRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDetectorRequest]
  }
  
  @scala.inline
  implicit class GetDetectorRequestMutableBuilder[Self <: GetDetectorRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
  }
}
