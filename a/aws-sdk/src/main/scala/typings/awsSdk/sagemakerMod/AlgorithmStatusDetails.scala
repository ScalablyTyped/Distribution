package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlgorithmStatusDetails extends js.Object {
  
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
  implicit class AlgorithmStatusDetailsOps[Self <: AlgorithmStatusDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setImageScanStatusesVarargs(value: AlgorithmStatusItem*): Self = this.set("ImageScanStatuses", js.Array(value :_*))
    
    @scala.inline
    def setImageScanStatuses(value: AlgorithmStatusItemList): Self = this.set("ImageScanStatuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageScanStatuses: Self = this.set("ImageScanStatuses", js.undefined)
    
    @scala.inline
    def setValidationStatusesVarargs(value: AlgorithmStatusItem*): Self = this.set("ValidationStatuses", js.Array(value :_*))
    
    @scala.inline
    def setValidationStatuses(value: AlgorithmStatusItemList): Self = this.set("ValidationStatuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationStatuses: Self = this.set("ValidationStatuses", js.undefined)
  }
}
