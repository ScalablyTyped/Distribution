package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateManagedPrefixListRequest extends js.Object {
  /**
    * The IP address type. Valid Values: IPv4 | IPv6 
    */
  var AddressFamily: String = js.native
  /**
    * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more information, see Ensuring Idempotency. Constraints: Up to 255 UTF-8 characters in length.
    */
  var ClientToken: js.UndefOr[String] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * One or more entries for the prefix list.
    */
  var Entries: js.UndefOr[AddPrefixListEntries] = js.native
  /**
    * The maximum number of entries for the prefix list.
    */
  var MaxEntries: Integer = js.native
  /**
    * A name for the prefix list. Constraints: Up to 255 characters in length. The name cannot start with com.amazonaws.
    */
  var PrefixListName: String = js.native
  /**
    * The tags to apply to the prefix list during creation.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.native
}

object CreateManagedPrefixListRequest {
  @scala.inline
  def apply(
    AddressFamily: String,
    MaxEntries: Integer,
    PrefixListName: String,
    ClientToken: String = null,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    Entries: AddPrefixListEntries = null,
    TagSpecifications: TagSpecificationList = null
  ): CreateManagedPrefixListRequest = {
    val __obj = js.Dynamic.literal(AddressFamily = AddressFamily.asInstanceOf[js.Any], MaxEntries = MaxEntries.asInstanceOf[js.Any], PrefixListName = PrefixListName.asInstanceOf[js.Any])
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    if (Entries != null) __obj.updateDynamic("Entries")(Entries.asInstanceOf[js.Any])
    if (TagSpecifications != null) __obj.updateDynamic("TagSpecifications")(TagSpecifications.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateManagedPrefixListRequest]
  }
}

