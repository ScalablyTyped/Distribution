package typings.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDetectorModelRequest extends StObject {
  
  /**
    * The name of the detector model to be deleted.
    */
  var detectorModelName: DetectorModelName = js.native
}
object DeleteDetectorModelRequest {
  
  @scala.inline
  def apply(detectorModelName: DetectorModelName): DeleteDetectorModelRequest = {
    val __obj = js.Dynamic.literal(detectorModelName = detectorModelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDetectorModelRequest]
  }
  
  @scala.inline
  implicit class DeleteDetectorModelRequestMutableBuilder[Self <: DeleteDetectorModelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetectorModelName(value: DetectorModelName): Self = StObject.set(x, "detectorModelName", value.asInstanceOf[js.Any])
  }
}
