package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateThingGroupRequest extends js.Object {
  /**
    * The name of the parent thing group.
    */
  var parentGroupName: js.UndefOr[ThingGroupName] = js.native
  /**
    * Metadata which can be used to manage the thing group.
    */
  var tags: js.UndefOr[TagList] = js.native
  /**
    * The thing group name to create.
    */
  var thingGroupName: ThingGroupName = js.native
  /**
    * The thing group properties.
    */
  var thingGroupProperties: js.UndefOr[ThingGroupProperties] = js.native
}

object CreateThingGroupRequest {
  @scala.inline
  def apply(thingGroupName: ThingGroupName): CreateThingGroupRequest = {
    val __obj = js.Dynamic.literal(thingGroupName = thingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateThingGroupRequest]
  }
  @scala.inline
  implicit class CreateThingGroupRequestOps[Self <: CreateThingGroupRequest] (val x: Self) extends AnyVal {
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
    def setThingGroupName(value: ThingGroupName): Self = this.set("thingGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentGroupName(value: ThingGroupName): Self = this.set("parentGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentGroupName: Self = this.set("parentGroupName", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setThingGroupProperties(value: ThingGroupProperties): Self = this.set("thingGroupProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThingGroupProperties: Self = this.set("thingGroupProperties", js.undefined)
  }
  
}

