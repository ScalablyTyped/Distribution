package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GrantAccessResult extends js.Object {
  /**
    * A TemporaryCredential object that contains the data needed to log in to the instance by RDP clients, such as the Microsoft Remote Desktop Connection.
    */
  var TemporaryCredential: js.UndefOr[typings.awsSdk.opsworksMod.TemporaryCredential] = js.native
}

object GrantAccessResult {
  @scala.inline
  def apply(TemporaryCredential: TemporaryCredential = null): GrantAccessResult = {
    val __obj = js.Dynamic.literal()
    if (TemporaryCredential != null) __obj.updateDynamic("TemporaryCredential")(TemporaryCredential.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrantAccessResult]
  }
}

