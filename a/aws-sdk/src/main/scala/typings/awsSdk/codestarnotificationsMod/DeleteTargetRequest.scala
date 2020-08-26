package typings.awsSdk.codestarnotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTargetRequest extends js.Object {
  /**
    * A Boolean value that can be used to delete all associations with this SNS topic. The default value is FALSE. If set to TRUE, all associations between that target and every notification rule in your AWS account are deleted.
    */
  var ForceUnsubscribeAll: js.UndefOr[typings.awsSdk.codestarnotificationsMod.ForceUnsubscribeAll] = js.native
  /**
    * The Amazon Resource Name (ARN) of the SNS topic to delete.
    */
  var TargetAddress: typings.awsSdk.codestarnotificationsMod.TargetAddress = js.native
}

object DeleteTargetRequest {
  @scala.inline
  def apply(TargetAddress: TargetAddress): DeleteTargetRequest = {
    val __obj = js.Dynamic.literal(TargetAddress = TargetAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTargetRequest]
  }
  @scala.inline
  implicit class DeleteTargetRequestOps[Self <: DeleteTargetRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTargetAddress(value: TargetAddress): Self = this.set("TargetAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setForceUnsubscribeAll(value: ForceUnsubscribeAll): Self = this.set("ForceUnsubscribeAll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceUnsubscribeAll: Self = this.set("ForceUnsubscribeAll", js.undefined)
  }
  
}

