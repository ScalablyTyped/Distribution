package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlgorithmStatusItem extends js.Object {
  /**
    * if the overall status is Failed, the reason for the failure.
    */
  var FailureReason: js.UndefOr[String] = js.native
  /**
    * The name of the algorithm for which the overall status is being reported.
    */
  var Name: EntityName = js.native
  /**
    * The current status.
    */
  var Status: DetailedAlgorithmStatus = js.native
}

object AlgorithmStatusItem {
  @scala.inline
  def apply(Name: EntityName, Status: DetailedAlgorithmStatus): AlgorithmStatusItem = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlgorithmStatusItem]
  }
  @scala.inline
  implicit class AlgorithmStatusItemOps[Self <: AlgorithmStatusItem] (val x: Self) extends AnyVal {
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
    def setStatus(value: DetailedAlgorithmStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def setFailureReason(value: String): Self = this.set("FailureReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureReason: Self = this.set("FailureReason", js.undefined)
  }
  
}

