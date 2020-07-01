package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceCredentials extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of a data source that has the credential pair that you want to use. When CopySourceArn is not null, the credential pair from the data source in the ARN is used as the credentials for the DataSourceCredentials structure.
    */
  var CopySourceArn: js.UndefOr[typings.awsSdk.quicksightMod.CopySourceArn] = js.native
  /**
    * Credential pair. For more information, see CredentialPair.
    */
  var CredentialPair: js.UndefOr[typings.awsSdk.quicksightMod.CredentialPair] = js.native
}

object DataSourceCredentials {
  @scala.inline
  def apply(CopySourceArn: CopySourceArn = null, CredentialPair: CredentialPair = null): DataSourceCredentials = {
    val __obj = js.Dynamic.literal()
    if (CopySourceArn != null) __obj.updateDynamic("CopySourceArn")(CopySourceArn.asInstanceOf[js.Any])
    if (CredentialPair != null) __obj.updateDynamic("CredentialPair")(CredentialPair.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceCredentials]
  }
}

