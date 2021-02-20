package typings.awsSdk.ioteventsdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDetectorRequest extends StObject {
  
  /**
    * The name of the detector model whose detectors (instances) you want information about.
    */
  var detectorModelName: DetectorModelName = js.native
  
  /**
    * A filter used to limit results to detectors (instances) created because of the given key ID.
    */
  var keyValue: js.UndefOr[KeyValue] = js.native
}
object DescribeDetectorRequest {
  
  @scala.inline
  def apply(detectorModelName: DetectorModelName): DescribeDetectorRequest = {
    val __obj = js.Dynamic.literal(detectorModelName = detectorModelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDetectorRequest]
  }
  
  @scala.inline
  implicit class DescribeDetectorRequestMutableBuilder[Self <: DescribeDetectorRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetectorModelName(value: DetectorModelName): Self = StObject.set(x, "detectorModelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyValue(value: KeyValue): Self = StObject.set(x, "keyValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyValueUndefined: Self = StObject.set(x, "keyValue", js.undefined)
  }
}
