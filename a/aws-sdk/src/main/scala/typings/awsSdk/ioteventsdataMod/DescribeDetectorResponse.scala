package typings.awsSdk.ioteventsdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDetectorResponse extends StObject {
  
  /**
    * Information about the detector (instance).
    */
  var detector: js.UndefOr[Detector] = js.native
}
object DescribeDetectorResponse {
  
  @scala.inline
  def apply(): DescribeDetectorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDetectorResponse]
  }
  
  @scala.inline
  implicit class DescribeDetectorResponseMutableBuilder[Self <: DescribeDetectorResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetector(value: Detector): Self = StObject.set(x, "detector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectorUndefined: Self = StObject.set(x, "detector", js.undefined)
  }
}
