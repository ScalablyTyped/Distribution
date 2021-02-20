package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDetectorVersionRequest extends StObject {
  
  /**
    * The ID of the parent detector for the detector version to delete.
    */
  var detectorId: identifier = js.native
  
  /**
    * The ID of the detector version to delete.
    */
  var detectorVersionId: wholeNumberVersionString = js.native
}
object DeleteDetectorVersionRequest {
  
  @scala.inline
  def apply(detectorId: identifier, detectorVersionId: wholeNumberVersionString): DeleteDetectorVersionRequest = {
    val __obj = js.Dynamic.literal(detectorId = detectorId.asInstanceOf[js.Any], detectorVersionId = detectorVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDetectorVersionRequest]
  }
  
  @scala.inline
  implicit class DeleteDetectorVersionRequestMutableBuilder[Self <: DeleteDetectorVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetectorId(value: identifier): Self = StObject.set(x, "detectorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectorVersionId(value: wholeNumberVersionString): Self = StObject.set(x, "detectorVersionId", value.asInstanceOf[js.Any])
  }
}
