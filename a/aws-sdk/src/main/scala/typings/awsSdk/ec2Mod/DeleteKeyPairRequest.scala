package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteKeyPairRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The name of the key pair.
    */
  var KeyName: js.UndefOr[KeyPairName] = js.native
  /**
    * The ID of the key pair.
    */
  var KeyPairId: js.UndefOr[typings.awsSdk.ec2Mod.KeyPairId] = js.native
}

object DeleteKeyPairRequest {
  @scala.inline
  def apply(): DeleteKeyPairRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteKeyPairRequest]
  }
  @scala.inline
  implicit class DeleteKeyPairRequestOps[Self <: DeleteKeyPairRequest] (val x: Self) extends AnyVal {
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
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    @scala.inline
    def setKeyName(value: KeyPairName): Self = this.set("KeyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyName: Self = this.set("KeyName", js.undefined)
    @scala.inline
    def setKeyPairId(value: KeyPairId): Self = this.set("KeyPairId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyPairId: Self = this.set("KeyPairId", js.undefined)
  }
  
}

