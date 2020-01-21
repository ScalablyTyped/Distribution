package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Permission extends js.Object {
  /**
    * The identifier of the user, group, or resource to which the permissions are granted.
    */
  var GranteeId: WorkMailIdentifier = js.native
  /**
    * The type of user, group, or resource referred to in GranteeId.
    */
  var GranteeType: MemberType = js.native
  /**
    * The permissions granted to the grantee. SEND_AS allows the grantee to send email as the owner of the mailbox (the grantee is not mentioned on these emails). SEND_ON_BEHALF allows the grantee to send email on behalf of the owner of the mailbox (the grantee is not mentioned as the physical sender of these emails). FULL_ACCESS allows the grantee full access to the mailbox, irrespective of other folder-level permissions set on the mailbox.
    */
  var PermissionValues: typings.awsSdk.workmailMod.PermissionValues = js.native
}

object Permission {
  @scala.inline
  def apply(GranteeId: WorkMailIdentifier, GranteeType: MemberType, PermissionValues: PermissionValues): Permission = {
    val __obj = js.Dynamic.literal(GranteeId = GranteeId.asInstanceOf[js.Any], GranteeType = GranteeType.asInstanceOf[js.Any], PermissionValues = PermissionValues.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Permission]
  }
}

