package typings.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SshPublicKey extends js.Object {
  /**
    * Specifies the date that the public key was added to the user account.
    */
  var DateImported: typings.awsSdk.transferMod.DateImported = js.native
  /**
    * Specifies the content of the SSH public key as specified by the PublicKeyId.
    */
  var SshPublicKeyBody: typings.awsSdk.transferMod.SshPublicKeyBody = js.native
  /**
    * Specifies the SshPublicKeyId parameter contains the identifier of the public key.
    */
  var SshPublicKeyId: typings.awsSdk.transferMod.SshPublicKeyId = js.native
}

object SshPublicKey {
  @scala.inline
  def apply(DateImported: DateImported, SshPublicKeyBody: SshPublicKeyBody, SshPublicKeyId: SshPublicKeyId): SshPublicKey = {
    val __obj = js.Dynamic.literal(DateImported = DateImported.asInstanceOf[js.Any], SshPublicKeyBody = SshPublicKeyBody.asInstanceOf[js.Any], SshPublicKeyId = SshPublicKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SshPublicKey]
  }
}

