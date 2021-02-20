package typings.awsSdk.ioteventsdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchUpdateDetectorRequest extends StObject {
  
  /**
    * The list of detectors (instances) to update, along with the values to update.
    */
  var detectors: UpdateDetectorRequests = js.native
}
object BatchUpdateDetectorRequest {
  
  @scala.inline
  def apply(detectors: UpdateDetectorRequests): BatchUpdateDetectorRequest = {
    val __obj = js.Dynamic.literal(detectors = detectors.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpdateDetectorRequest]
  }
  
  @scala.inline
  implicit class BatchUpdateDetectorRequestMutableBuilder[Self <: BatchUpdateDetectorRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetectors(value: UpdateDetectorRequests): Self = StObject.set(x, "detectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectorsVarargs(value: UpdateDetectorRequest*): Self = StObject.set(x, "detectors", js.Array(value :_*))
  }
}
