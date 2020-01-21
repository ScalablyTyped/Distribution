package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeChapCredentialsOutput extends js.Object {
  /**
    * An array of ChapInfo objects that represent CHAP credentials. Each object in the array contains CHAP credential information for one target-initiator pair. If no CHAP credentials are set, an empty array is returned. CHAP credential information is provided in a JSON object with the following fields:    InitiatorName: The iSCSI initiator that connects to the target.    SecretToAuthenticateInitiator: The secret key that the initiator (for example, the Windows client) must provide to participate in mutual CHAP with the target.    SecretToAuthenticateTarget: The secret key that the target must provide to participate in mutual CHAP with the initiator (e.g. Windows client).    TargetARN: The Amazon Resource Name (ARN) of the storage volume.  
    */
  var ChapCredentials: js.UndefOr[typings.awsSdk.storagegatewayMod.ChapCredentials] = js.native
}

object DescribeChapCredentialsOutput {
  @scala.inline
  def apply(ChapCredentials: ChapCredentials = null): DescribeChapCredentialsOutput = {
    val __obj = js.Dynamic.literal()
    if (ChapCredentials != null) __obj.updateDynamic("ChapCredentials")(ChapCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeChapCredentialsOutput]
  }
}

