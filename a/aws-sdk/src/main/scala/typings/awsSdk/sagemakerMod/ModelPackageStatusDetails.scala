package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelPackageStatusDetails extends StObject {
  
  /**
    * The status of the scan of the Docker image container for the model package.
    */
  var ImageScanStatuses: js.UndefOr[ModelPackageStatusItemList] = js.native
  
  /**
    * The validation status of the model package.
    */
  var ValidationStatuses: ModelPackageStatusItemList = js.native
}
object ModelPackageStatusDetails {
  
  @scala.inline
  def apply(ValidationStatuses: ModelPackageStatusItemList): ModelPackageStatusDetails = {
    val __obj = js.Dynamic.literal(ValidationStatuses = ValidationStatuses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelPackageStatusDetails]
  }
  
  @scala.inline
  implicit class ModelPackageStatusDetailsMutableBuilder[Self <: ModelPackageStatusDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageScanStatuses(value: ModelPackageStatusItemList): Self = StObject.set(x, "ImageScanStatuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageScanStatusesUndefined: Self = StObject.set(x, "ImageScanStatuses", js.undefined)
    
    @scala.inline
    def setImageScanStatusesVarargs(value: ModelPackageStatusItem*): Self = StObject.set(x, "ImageScanStatuses", js.Array(value :_*))
    
    @scala.inline
    def setValidationStatuses(value: ModelPackageStatusItemList): Self = StObject.set(x, "ValidationStatuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationStatusesVarargs(value: ModelPackageStatusItem*): Self = StObject.set(x, "ValidationStatuses", js.Array(value :_*))
  }
}
