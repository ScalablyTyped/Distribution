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
  def apply(TargetAddress: TargetAddress, ForceUnsubscribeAll: js.UndefOr[ForceUnsubscribeAll] = js.undefined): DeleteTargetRequest = {
    val __obj = js.Dynamic.literal(TargetAddress = TargetAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(ForceUnsubscribeAll)) __obj.updateDynamic("ForceUnsubscribeAll")(ForceUnsubscribeAll.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTargetRequest]
  }
}

