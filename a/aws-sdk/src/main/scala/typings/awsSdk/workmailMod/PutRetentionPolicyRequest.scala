package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutRetentionPolicyRequest extends js.Object {
  /**
    * The retention policy description.
    */
  var Description: js.UndefOr[PolicyDescription] = js.native
  /**
    * The retention policy folder configurations.
    */
  var FolderConfigurations: typings.awsSdk.workmailMod.FolderConfigurations = js.native
  /**
    * The retention policy ID.
    */
  var Id: js.UndefOr[ShortString] = js.native
  /**
    * The retention policy name.
    */
  var Name: ShortString = js.native
  /**
    * The organization ID.
    */
  var OrganizationId: typings.awsSdk.workmailMod.OrganizationId = js.native
}

object PutRetentionPolicyRequest {
  @scala.inline
  def apply(
    FolderConfigurations: FolderConfigurations,
    Name: ShortString,
    OrganizationId: OrganizationId,
    Description: PolicyDescription = null,
    Id: ShortString = null
  ): PutRetentionPolicyRequest = {
    val __obj = js.Dynamic.literal(FolderConfigurations = FolderConfigurations.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRetentionPolicyRequest]
  }
}

