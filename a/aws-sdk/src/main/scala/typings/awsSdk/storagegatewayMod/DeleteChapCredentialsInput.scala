package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteChapCredentialsInput extends js.Object {
  /**
    * The iSCSI initiator that connects to the target.
    */
  var InitiatorName: IqnName = js.native
  /**
    * The Amazon Resource Name (ARN) of the iSCSI volume target. Use the DescribeStorediSCSIVolumes operation to return to retrieve the TargetARN for specified VolumeARN.
    */
  var TargetARN: typings.awsSdk.storagegatewayMod.TargetARN = js.native
}

object DeleteChapCredentialsInput {
  @scala.inline
  def apply(InitiatorName: IqnName, TargetARN: TargetARN): DeleteChapCredentialsInput = {
    val __obj = js.Dynamic.literal(InitiatorName = InitiatorName.asInstanceOf[js.Any], TargetARN = TargetARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteChapCredentialsInput]
  }
}

