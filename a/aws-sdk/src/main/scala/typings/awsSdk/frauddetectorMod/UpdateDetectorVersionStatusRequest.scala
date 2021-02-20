package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDetectorVersionStatusRequest extends StObject {
  
  /**
    * The detector ID. 
    */
  var detectorId: identifier = js.native
  
  /**
    * The detector version ID. 
    */
  var detectorVersionId: wholeNumberVersionString = js.native
  
  /**
    * The new status.
    */
  var status: DetectorVersionStatus = js.native
}
object UpdateDetectorVersionStatusRequest {
  
  @scala.inline
  def apply(detectorId: identifier, detectorVersionId: wholeNumberVersionString, status: DetectorVersionStatus): UpdateDetectorVersionStatusRequest = {
    val __obj = js.Dynamic.literal(detectorId = detectorId.asInstanceOf[js.Any], detectorVersionId = detectorVersionId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDetectorVersionStatusRequest]
  }
  
  @scala.inline
  implicit class UpdateDetectorVersionStatusRequestMutableBuilder[Self <: UpdateDetectorVersionStatusRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetectorId(value: identifier): Self = StObject.set(x, "detectorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectorVersionId(value: wholeNumberVersionString): Self = StObject.set(x, "detectorVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: DetectorVersionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
