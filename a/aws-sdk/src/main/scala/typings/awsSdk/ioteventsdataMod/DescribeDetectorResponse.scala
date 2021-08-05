package typings.awsSdk.ioteventsdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDetectorResponse extends StObject {
  
  /**
    * Information about the detector (instance).
    */
  var detector: js.UndefOr[Detector] = js.undefined
}
object DescribeDetectorResponse {
  
  inline def apply(): DescribeDetectorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDetectorResponse]
  }
  
  extension [Self <: DescribeDetectorResponse](x: Self) {
    
    inline def setDetector(value: Detector): Self = StObject.set(x, "detector", value.asInstanceOf[js.Any])
    
    inline def setDetectorUndefined: Self = StObject.set(x, "detector", js.undefined)
  }
}
