package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizeDBSecurityGroupIngressResult extends js.Object {
  var DBSecurityGroup: js.UndefOr[typings.awsSdk.rdsMod.DBSecurityGroup] = js.native
}

object AuthorizeDBSecurityGroupIngressResult {
  @scala.inline
  def apply(DBSecurityGroup: DBSecurityGroup = null): AuthorizeDBSecurityGroupIngressResult = {
    val __obj = js.Dynamic.literal()
    if (DBSecurityGroup != null) __obj.updateDynamic("DBSecurityGroup")(DBSecurityGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizeDBSecurityGroupIngressResult]
  }
}

