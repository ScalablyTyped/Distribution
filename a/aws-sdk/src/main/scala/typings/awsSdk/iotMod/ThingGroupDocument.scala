package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThingGroupDocument extends js.Object {
  /**
    * The thing group attributes.
    */
  var attributes: js.UndefOr[Attributes] = js.native
  /**
    * Parent group names.
    */
  var parentGroupNames: js.UndefOr[ThingGroupNameList] = js.native
  /**
    * The thing group description.
    */
  var thingGroupDescription: js.UndefOr[ThingGroupDescription] = js.native
  /**
    * The thing group ID.
    */
  var thingGroupId: js.UndefOr[ThingGroupId] = js.native
  /**
    * The thing group name.
    */
  var thingGroupName: js.UndefOr[ThingGroupName] = js.native
}

object ThingGroupDocument {
  @scala.inline
  def apply(): ThingGroupDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThingGroupDocument]
  }
  @scala.inline
  implicit class ThingGroupDocumentOps[Self <: ThingGroupDocument] (val x: Self) extends AnyVal {
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
    def setAttributes(value: Attributes): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def setParentGroupNamesVarargs(value: ThingGroupName*): Self = this.set("parentGroupNames", js.Array(value :_*))
    @scala.inline
    def setParentGroupNames(value: ThingGroupNameList): Self = this.set("parentGroupNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentGroupNames: Self = this.set("parentGroupNames", js.undefined)
    @scala.inline
    def setThingGroupDescription(value: ThingGroupDescription): Self = this.set("thingGroupDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThingGroupDescription: Self = this.set("thingGroupDescription", js.undefined)
    @scala.inline
    def setThingGroupId(value: ThingGroupId): Self = this.set("thingGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThingGroupId: Self = this.set("thingGroupId", js.undefined)
    @scala.inline
    def setThingGroupName(value: ThingGroupName): Self = this.set("thingGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThingGroupName: Self = this.set("thingGroupName", js.undefined)
  }
  
}

