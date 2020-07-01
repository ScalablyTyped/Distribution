package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedPrefixList extends js.Object {
  /**
    * The IP address version.
    */
  var AddressFamily: js.UndefOr[String] = js.native
  /**
    * The maximum number of entries for the prefix list.
    */
  var MaxEntries: js.UndefOr[Integer] = js.native
  /**
    * The ID of the owner of the prefix list.
    */
  var OwnerId: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) for the prefix list.
    */
  var PrefixListArn: js.UndefOr[ResourceArn] = js.native
  /**
    * The ID of the prefix list.
    */
  var PrefixListId: js.UndefOr[PrefixListResourceId] = js.native
  /**
    * The name of the prefix list.
    */
  var PrefixListName: js.UndefOr[String] = js.native
  /**
    * The state of the prefix list.
    */
  var State: js.UndefOr[PrefixListState] = js.native
  /**
    * The state message.
    */
  var StateMessage: js.UndefOr[String] = js.native
  /**
    * The tags for the prefix list.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The version of the prefix list.
    */
  var Version: js.UndefOr[Long] = js.native
}

object ManagedPrefixList {
  @scala.inline
  def apply(
    AddressFamily: String = null,
    MaxEntries: js.UndefOr[Integer] = js.undefined,
    OwnerId: String = null,
    PrefixListArn: ResourceArn = null,
    PrefixListId: PrefixListResourceId = null,
    PrefixListName: String = null,
    State: PrefixListState = null,
    StateMessage: String = null,
    Tags: TagList = null,
    Version: js.UndefOr[Long] = js.undefined
  ): ManagedPrefixList = {
    val __obj = js.Dynamic.literal()
    if (AddressFamily != null) __obj.updateDynamic("AddressFamily")(AddressFamily.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxEntries)) __obj.updateDynamic("MaxEntries")(MaxEntries.get.asInstanceOf[js.Any])
    if (OwnerId != null) __obj.updateDynamic("OwnerId")(OwnerId.asInstanceOf[js.Any])
    if (PrefixListArn != null) __obj.updateDynamic("PrefixListArn")(PrefixListArn.asInstanceOf[js.Any])
    if (PrefixListId != null) __obj.updateDynamic("PrefixListId")(PrefixListId.asInstanceOf[js.Any])
    if (PrefixListName != null) __obj.updateDynamic("PrefixListName")(PrefixListName.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (StateMessage != null) __obj.updateDynamic("StateMessage")(StateMessage.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (!js.isUndefined(Version)) __obj.updateDynamic("Version")(Version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedPrefixList]
  }
}

