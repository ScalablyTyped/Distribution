package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelPackageStatusDetails extends js.Object {
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
  implicit class ModelPackageStatusDetailsOps[Self <: ModelPackageStatusDetails] (val x: Self) extends AnyVal {
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
    def setValidationStatusesVarargs(value: ModelPackageStatusItem*): Self = this.set("ValidationStatuses", js.Array(value :_*))
    @scala.inline
    def setValidationStatuses(value: ModelPackageStatusItemList): Self = this.set("ValidationStatuses", value.asInstanceOf[js.Any])
    @scala.inline
    def setImageScanStatusesVarargs(value: ModelPackageStatusItem*): Self = this.set("ImageScanStatuses", js.Array(value :_*))
    @scala.inline
    def setImageScanStatuses(value: ModelPackageStatusItemList): Self = this.set("ImageScanStatuses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageScanStatuses: Self = this.set("ImageScanStatuses", js.undefined)
  }
  
}

