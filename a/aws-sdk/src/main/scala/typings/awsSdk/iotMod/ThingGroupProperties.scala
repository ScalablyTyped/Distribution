package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThingGroupProperties extends js.Object {
  /**
    * The thing group attributes in JSON format.
    */
  var attributePayload: js.UndefOr[AttributePayload] = js.native
  /**
    * The thing group description.
    */
  var thingGroupDescription: js.UndefOr[ThingGroupDescription] = js.native
}

object ThingGroupProperties {
  @scala.inline
  def apply(): ThingGroupProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThingGroupProperties]
  }
  @scala.inline
  implicit class ThingGroupPropertiesOps[Self <: ThingGroupProperties] (val x: Self) extends AnyVal {
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
    def setAttributePayload(value: AttributePayload): Self = this.set("attributePayload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributePayload: Self = this.set("attributePayload", js.undefined)
    @scala.inline
    def setThingGroupDescription(value: ThingGroupDescription): Self = this.set("thingGroupDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThingGroupDescription: Self = this.set("thingGroupDescription", js.undefined)
  }
  
}

