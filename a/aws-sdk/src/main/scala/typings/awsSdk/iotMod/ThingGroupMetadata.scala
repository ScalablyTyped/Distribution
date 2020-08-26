package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThingGroupMetadata extends js.Object {
  /**
    * The UNIX timestamp of when the thing group was created.
    */
  var creationDate: js.UndefOr[CreationDate] = js.native
  /**
    * The parent thing group name.
    */
  var parentGroupName: js.UndefOr[ThingGroupName] = js.native
  /**
    * The root parent thing group.
    */
  var rootToParentThingGroups: js.UndefOr[ThingGroupNameAndArnList] = js.native
}

object ThingGroupMetadata {
  @scala.inline
  def apply(): ThingGroupMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThingGroupMetadata]
  }
  @scala.inline
  implicit class ThingGroupMetadataOps[Self <: ThingGroupMetadata] (val x: Self) extends AnyVal {
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
    def setCreationDate(value: CreationDate): Self = this.set("creationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("creationDate", js.undefined)
    @scala.inline
    def setParentGroupName(value: ThingGroupName): Self = this.set("parentGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentGroupName: Self = this.set("parentGroupName", js.undefined)
    @scala.inline
    def setRootToParentThingGroupsVarargs(value: GroupNameAndArn*): Self = this.set("rootToParentThingGroups", js.Array(value :_*))
    @scala.inline
    def setRootToParentThingGroups(value: ThingGroupNameAndArnList): Self = this.set("rootToParentThingGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootToParentThingGroups: Self = this.set("rootToParentThingGroups", js.undefined)
  }
  
}

