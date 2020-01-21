package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceCredentials extends js.Object {
  /**
    * Credential pair.
    */
  var CredentialPair: js.UndefOr[typings.awsSdk.quicksightMod.CredentialPair] = js.native
}

object DataSourceCredentials {
  @scala.inline
  def apply(CredentialPair: CredentialPair = null): DataSourceCredentials = {
    val __obj = js.Dynamic.literal()
    if (CredentialPair != null) __obj.updateDynamic("CredentialPair")(CredentialPair.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceCredentials]
  }
}

