package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelPackageStatusItem extends js.Object {
  /**
    * if the overall status is Failed, the reason for the failure.
    */
  var FailureReason: js.UndefOr[String] = js.native
  /**
    * The name of the model package for which the overall status is being reported.
    */
  var Name: EntityName = js.native
  /**
    * The current status.
    */
  var Status: DetailedModelPackageStatus = js.native
}

object ModelPackageStatusItem {
  @scala.inline
  def apply(Name: EntityName, Status: DetailedModelPackageStatus): ModelPackageStatusItem = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelPackageStatusItem]
  }
  @scala.inline
  implicit class ModelPackageStatusItemOps[Self <: ModelPackageStatusItem] (val x: Self) extends AnyVal {
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
    def setName(value: EntityName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: DetailedModelPackageStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def setFailureReason(value: String): Self = this.set("FailureReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureReason: Self = this.set("FailureReason", js.undefined)
  }
  
}

