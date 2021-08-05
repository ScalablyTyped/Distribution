package typings.awsSdk.ioteventsdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDetectorRequest extends StObject {
  
  /**
    * The name of the detector model whose detectors (instances) you want information about.
    */
  var detectorModelName: DetectorModelName
  
  /**
    * A filter used to limit results to detectors (instances) created because of the given key ID.
    */
  var keyValue: js.UndefOr[KeyValue] = js.undefined
}
object DescribeDetectorRequest {
  
  inline def apply(detectorModelName: DetectorModelName): DescribeDetectorRequest = {
    val __obj = js.Dynamic.literal(detectorModelName = detectorModelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDetectorRequest]
  }
  
  extension [Self <: DescribeDetectorRequest](x: Self) {
    
    inline def setDetectorModelName(value: DetectorModelName): Self = StObject.set(x, "detectorModelName", value.asInstanceOf[js.Any])
    
    inline def setKeyValue(value: KeyValue): Self = StObject.set(x, "keyValue", value.asInstanceOf[js.Any])
    
    inline def setKeyValueUndefined: Self = StObject.set(x, "keyValue", js.undefined)
  }
}
