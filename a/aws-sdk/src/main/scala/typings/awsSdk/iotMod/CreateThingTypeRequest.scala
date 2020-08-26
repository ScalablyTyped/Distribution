package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateThingTypeRequest extends js.Object {
  /**
    * Metadata which can be used to manage the thing type.
    */
  var tags: js.UndefOr[TagList] = js.native
  /**
    * The name of the thing type.
    */
  var thingTypeName: ThingTypeName = js.native
  /**
    * The ThingTypeProperties for the thing type to create. It contains information about the new thing type including a description, and a list of searchable thing attribute names.
    */
  var thingTypeProperties: js.UndefOr[ThingTypeProperties] = js.native
}

object CreateThingTypeRequest {
  @scala.inline
  def apply(thingTypeName: ThingTypeName): CreateThingTypeRequest = {
    val __obj = js.Dynamic.literal(thingTypeName = thingTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateThingTypeRequest]
  }
  @scala.inline
  implicit class CreateThingTypeRequestOps[Self <: CreateThingTypeRequest] (val x: Self) extends AnyVal {
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
    def setThingTypeName(value: ThingTypeName): Self = this.set("thingTypeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setThingTypeProperties(value: ThingTypeProperties): Self = this.set("thingTypeProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThingTypeProperties: Self = this.set("thingTypeProperties", js.undefined)
  }
  
}

