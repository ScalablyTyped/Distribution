package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChapInfo extends js.Object {
  /**
    * The iSCSI initiator that connects to the target.
    */
  var InitiatorName: js.UndefOr[IqnName] = js.native
  /**
    * The secret key that the initiator (for example, the Windows client) must provide to participate in mutual CHAP with the target.
    */
  var SecretToAuthenticateInitiator: js.UndefOr[ChapSecret] = js.native
  /**
    * The secret key that the target must provide to participate in mutual CHAP with the initiator (e.g. Windows client).
    */
  var SecretToAuthenticateTarget: js.UndefOr[ChapSecret] = js.native
  /**
    * The Amazon Resource Name (ARN) of the volume.  Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
    */
  var TargetARN: js.UndefOr[typings.awsSdk.storagegatewayMod.TargetARN] = js.native
}

object ChapInfo {
  @scala.inline
  def apply(
    InitiatorName: IqnName = null,
    SecretToAuthenticateInitiator: ChapSecret = null,
    SecretToAuthenticateTarget: ChapSecret = null,
    TargetARN: TargetARN = null
  ): ChapInfo = {
    val __obj = js.Dynamic.literal()
    if (InitiatorName != null) __obj.updateDynamic("InitiatorName")(InitiatorName.asInstanceOf[js.Any])
    if (SecretToAuthenticateInitiator != null) __obj.updateDynamic("SecretToAuthenticateInitiator")(SecretToAuthenticateInitiator.asInstanceOf[js.Any])
    if (SecretToAuthenticateTarget != null) __obj.updateDynamic("SecretToAuthenticateTarget")(SecretToAuthenticateTarget.asInstanceOf[js.Any])
    if (TargetARN != null) __obj.updateDynamic("TargetARN")(TargetARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChapInfo]
  }
}

