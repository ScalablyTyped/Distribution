package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateFromMasterAccountRequest extends StObject {
  
  /**
    * The unique ID of the detector of the GuardDuty member account.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId
}
object DisassociateFromMasterAccountRequest {
  
  @scala.inline
  def apply(DetectorId: DetectorId): DisassociateFromMasterAccountRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateFromMasterAccountRequest]
  }
  
  @scala.inline
  implicit class DisassociateFromMasterAccountRequestMutableBuilder[Self <: DisassociateFromMasterAccountRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
  }
}
