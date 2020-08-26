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
  def apply(AddressFamily: String, MaxEntries: Integer, PrefixListName: String): CreateManagedPrefixListRequest = {
    val __obj = js.Dynamic.literal(AddressFamily = AddressFamily.asInstanceOf[js.Any], MaxEntries = MaxEntries.asInstanceOf[js.Any], PrefixListName = PrefixListName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateManagedPrefixListRequest]
  }
  @scala.inline
  implicit class CreateManagedPrefixListRequestOps[Self <: CreateManagedPrefixListRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddressFamily(value: String): Self = this.set("AddressFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxEntries(value: Integer): Self = this.set("MaxEntries", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefixListName(value: String): Self = this.set("PrefixListName", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientToken(value: String): Self = this.set("ClientToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientToken: Self = this.set("ClientToken", js.undefined)
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    @scala.inline
    def setEntriesVarargs(value: AddPrefixListEntry*): Self = this.set("Entries", js.Array(value :_*))
    @scala.inline
    def setEntries(value: AddPrefixListEntries): Self = this.set("Entries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntries: Self = this.set("Entries", js.undefined)
    @scala.inline
    def setTagSpecificationsVarargs(value: TagSpecification*): Self = this.set("TagSpecifications", js.Array(value :_*))
    @scala.inline
    def setTagSpecifications(value: TagSpecificationList): Self = this.set("TagSpecifications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagSpecifications: Self = this.set("TagSpecifications", js.undefined)
  }
  
}

