package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDetectorVersionRequest extends StObject {
  
  /**
    * The detector ID.
    */
  var detectorId: identifier = js.native
  
  /**
    * The detector version ID.
    */
  var detectorVersionId: wholeNumberVersionString = js.native
}
object GetDetectorVersionRequest {
  
  @scala.inline
  def apply(detectorId: identifier, detectorVersionId: wholeNumberVersionString): GetDetectorVersionRequest = {
    val __obj = js.Dynamic.literal(detectorId = detectorId.asInstanceOf[js.Any], detectorVersionId = detectorVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDetectorVersionRequest]
  }
  
  @scala.inline
  implicit class GetDetectorVersionRequestMutableBuilder[Self <: GetDetectorVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetectorId(value: identifier): Self = StObject.set(x, "detectorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectorVersionId(value: wholeNumberVersionString): Self = StObject.set(x, "detectorVersionId", value.asInstanceOf[js.Any])
  }
}
