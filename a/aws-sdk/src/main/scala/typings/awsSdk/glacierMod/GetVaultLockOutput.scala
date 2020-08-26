package typings.awsSdk.glacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVaultLockOutput extends js.Object {
  /**
    * The UTC date and time at which the vault lock was put into the InProgress state.
    */
  var CreationDate: js.UndefOr[String] = js.native
  /**
    * The UTC date and time at which the lock ID expires. This value can be null if the vault lock is in a Locked state.
    */
  var ExpirationDate: js.UndefOr[String] = js.native
  /**
    * The vault lock policy as a JSON string, which uses "\" as an escape character.
    */
  var Policy: js.UndefOr[String] = js.native
  /**
    * The state of the vault lock. InProgress or Locked.
    */
  var State: js.UndefOr[String] = js.native
}

object GetVaultLockOutput {
  @scala.inline
  def apply(): GetVaultLockOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVaultLockOutput]
  }
  @scala.inline
  implicit class GetVaultLockOutputOps[Self <: GetVaultLockOutput] (val x: Self) extends AnyVal {
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
    def setCreationDate(value: String): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    @scala.inline
    def setExpirationDate(value: String): Self = this.set("ExpirationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpirationDate: Self = this.set("ExpirationDate", js.undefined)
    @scala.inline
    def setPolicy(value: String): Self = this.set("Policy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicy: Self = this.set("Policy", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
  }
  
}

