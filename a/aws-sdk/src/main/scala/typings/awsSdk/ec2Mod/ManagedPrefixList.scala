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
  def apply(): ManagedPrefixList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedPrefixList]
  }
  @scala.inline
  implicit class ManagedPrefixListOps[Self <: ManagedPrefixList] (val x: Self) extends AnyVal {
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
    def deleteAddressFamily: Self = this.set("AddressFamily", js.undefined)
    @scala.inline
    def setMaxEntries(value: Integer): Self = this.set("MaxEntries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxEntries: Self = this.set("MaxEntries", js.undefined)
    @scala.inline
    def setOwnerId(value: String): Self = this.set("OwnerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnerId: Self = this.set("OwnerId", js.undefined)
    @scala.inline
    def setPrefixListArn(value: ResourceArn): Self = this.set("PrefixListArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixListArn: Self = this.set("PrefixListArn", js.undefined)
    @scala.inline
    def setPrefixListId(value: PrefixListResourceId): Self = this.set("PrefixListId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixListId: Self = this.set("PrefixListId", js.undefined)
    @scala.inline
    def setPrefixListName(value: String): Self = this.set("PrefixListName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixListName: Self = this.set("PrefixListName", js.undefined)
    @scala.inline
    def setState(value: PrefixListState): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    @scala.inline
    def setStateMessage(value: String): Self = this.set("StateMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStateMessage: Self = this.set("StateMessage", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    @scala.inline
    def setVersion(value: Long): Self = this.set("Version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
  }
  
}

