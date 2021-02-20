package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteIPSetRequest extends StObject {
  
  /**
    * The unique ID of the detector associated with the IPSet.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId = js.native
  
  /**
    * The unique ID of the IPSet to delete.
    */
  var IpSetId: String = js.native
}
object DeleteIPSetRequest {
  
  @scala.inline
  def apply(DetectorId: DetectorId, IpSetId: String): DeleteIPSetRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any], IpSetId = IpSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteIPSetRequest]
  }
  
  @scala.inline
  implicit class DeleteIPSetRequestMutableBuilder[Self <: DeleteIPSetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpSetId(value: String): Self = StObject.set(x, "IpSetId", value.asInstanceOf[js.Any])
  }
}
