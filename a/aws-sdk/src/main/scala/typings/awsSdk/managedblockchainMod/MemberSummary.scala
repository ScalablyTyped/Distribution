package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemberSummary extends js.Object {
  /**
    * The date and time that the member was created.
    */
  var CreationDate: js.UndefOr[Timestamp] = js.native
  /**
    * An optional description of the member.
    */
  var Description: js.UndefOr[DescriptionString] = js.native
  /**
    * The unique identifier of the member.
    */
  var Id: js.UndefOr[ResourceIdString] = js.native
  /**
    * An indicator of whether the member is owned by your AWS account or a different AWS account.
    */
  var IsOwned: js.UndefOr[typings.awsSdk.managedblockchainMod.IsOwned] = js.native
  /**
    * The name of the member.
    */
  var Name: js.UndefOr[NetworkMemberNameString] = js.native
  /**
    * The status of the member.    CREATING - The AWS account is in the process of creating a member.    AVAILABLE - The member has been created and can participate in the network.    CREATE_FAILED - The AWS account attempted to create a member and creation failed.    DELETING - The member and all associated resources are in the process of being deleted. Either the AWS account that owns the member deleted it, or the member is being deleted as the result of an APPROVED PROPOSAL to remove the member.    DELETED - The member can no longer participate on the network and all associated resources are deleted. Either the AWS account that owns the member deleted it, or the member is being deleted as the result of an APPROVED PROPOSAL to remove the member.  
    */
  var Status: js.UndefOr[MemberStatus] = js.native
}

object MemberSummary {
  @scala.inline
  def apply(
    CreationDate: Timestamp = null,
    Description: DescriptionString = null,
    Id: ResourceIdString = null,
    IsOwned: js.UndefOr[IsOwned] = js.undefined,
    Name: NetworkMemberNameString = null,
    Status: MemberStatus = null
  ): MemberSummary = {
    val __obj = js.Dynamic.literal()
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (!js.isUndefined(IsOwned)) __obj.updateDynamic("IsOwned")(IsOwned.get.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberSummary]
  }
}

