package typings.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDetectorModelRequest extends StObject {
  
  /**
    * The name of the detector model.
    */
  var detectorModelName: DetectorModelName
  
  /**
    * The version of the detector model.
    */
  var detectorModelVersion: js.UndefOr[DetectorModelVersion] = js.undefined
}
object DescribeDetectorModelRequest {
  
  @scala.inline
  def apply(detectorModelName: DetectorModelName): DescribeDetectorModelRequest = {
    val __obj = js.Dynamic.literal(detectorModelName = detectorModelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDetectorModelRequest]
  }
  
  @scala.inline
  implicit class DescribeDetectorModelRequestMutableBuilder[Self <: DescribeDetectorModelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetectorModelName(value: DetectorModelName): Self = StObject.set(x, "detectorModelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectorModelVersion(value: DetectorModelVersion): Self = StObject.set(x, "detectorModelVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectorModelVersionUndefined: Self = StObject.set(x, "detectorModelVersion", js.undefined)
  }
}
