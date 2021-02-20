package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlgorithmStatusDetails extends StObject {
  
  /**
    * The status of the scan of the algorithm's Docker image container.
    */
  var ImageScanStatuses: js.UndefOr[AlgorithmStatusItemList] = js.native
  
  /**
    * The status of algorithm validation.
    */
  var ValidationStatuses: js.UndefOr[AlgorithmStatusItemList] = js.native
}
object AlgorithmStatusDetails {
  
  @scala.inline
  def apply(): AlgorithmStatusDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlgorithmStatusDetails]
  }
  
  @scala.inline
  implicit class AlgorithmStatusDetailsMutableBuilder[Self <: AlgorithmStatusDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageScanStatuses(value: AlgorithmStatusItemList): Self = StObject.set(x, "ImageScanStatuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageScanStatusesUndefined: Self = StObject.set(x, "ImageScanStatuses", js.undefined)
    
    @scala.inline
    def setImageScanStatusesVarargs(value: AlgorithmStatusItem*): Self = StObject.set(x, "ImageScanStatuses", js.Array(value :_*))
    
    @scala.inline
    def setValidationStatuses(value: AlgorithmStatusItemList): Self = StObject.set(x, "ValidationStatuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationStatusesUndefined: Self = StObject.set(x, "ValidationStatuses", js.undefined)
    
    @scala.inline
    def setValidationStatusesVarargs(value: AlgorithmStatusItem*): Self = StObject.set(x, "ValidationStatuses", js.Array(value :_*))
  }
}
