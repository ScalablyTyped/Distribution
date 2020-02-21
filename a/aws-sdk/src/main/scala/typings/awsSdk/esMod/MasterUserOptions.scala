package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MasterUserOptions extends js.Object {
  /**
    * ARN for the master user (if IAM is enabled).
    */
  var MasterUserARN: js.UndefOr[ARN] = js.native
  /**
    * The master user's username, which is stored in the Amazon Elasticsearch Service domain's internal database.
    */
  var MasterUserName: js.UndefOr[Username] = js.native
  /**
    * The master user's password, which is stored in the Amazon Elasticsearch Service domain's internal database.
    */
  var MasterUserPassword: js.UndefOr[Password] = js.native
}

object MasterUserOptions {
  @scala.inline
  def apply(MasterUserARN: ARN = null, MasterUserName: Username = null, MasterUserPassword: Password = null): MasterUserOptions = {
    val __obj = js.Dynamic.literal()
    if (MasterUserARN != null) __obj.updateDynamic("MasterUserARN")(MasterUserARN.asInstanceOf[js.Any])
    if (MasterUserName != null) __obj.updateDynamic("MasterUserName")(MasterUserName.asInstanceOf[js.Any])
    if (MasterUserPassword != null) __obj.updateDynamic("MasterUserPassword")(MasterUserPassword.asInstanceOf[js.Any])
    __obj.asInstanceOf[MasterUserOptions]
  }
}

