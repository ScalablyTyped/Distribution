package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateThingRequest extends js.Object {
  /**
    * A list of thing attributes, a JSON string containing name-value pairs. For example:  {\"attributes\":{\"name1\":\"value2\"}}  This data is used to add new attributes or update existing attributes.
    */
  var attributePayload: js.UndefOr[AttributePayload] = js.native
  /**
    * The expected version of the thing record in the registry. If the version of the record in the registry does not match the expected version specified in the request, the UpdateThing request is rejected with a VersionConflictException.
    */
  var expectedVersion: js.UndefOr[OptionalVersion] = js.native
  /**
    * Remove a thing type association. If true, the association is removed.
    */
  var removeThingType: js.UndefOr[RemoveThingType] = js.native
  /**
    * The name of the thing to update. You can't change a thing's name. To change a thing's name, you must create a new thing, give it the new name, and then delete the old thing.
    */
  var thingName: ThingName = js.native
  /**
    * The name of the thing type.
    */
  var thingTypeName: js.UndefOr[ThingTypeName] = js.native
}

object UpdateThingRequest {
  @scala.inline
  def apply(thingName: ThingName): UpdateThingRequest = {
    val __obj = js.Dynamic.literal(thingName = thingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateThingRequest]
  }
  @scala.inline
  implicit class UpdateThingRequestOps[Self <: UpdateThingRequest] (val x: Self) extends AnyVal {
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
    def setThingName(value: ThingName): Self = this.set("thingName", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttributePayload(value: AttributePayload): Self = this.set("attributePayload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributePayload: Self = this.set("attributePayload", js.undefined)
    @scala.inline
    def setExpectedVersion(value: OptionalVersion): Self = this.set("expectedVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpectedVersion: Self = this.set("expectedVersion", js.undefined)
    @scala.inline
    def setRemoveThingType(value: RemoveThingType): Self = this.set("removeThingType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveThingType: Self = this.set("removeThingType", js.undefined)
    @scala.inline
    def setThingTypeName(value: ThingTypeName): Self = this.set("thingTypeName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThingTypeName: Self = this.set("thingTypeName", js.undefined)
  }
  
}

