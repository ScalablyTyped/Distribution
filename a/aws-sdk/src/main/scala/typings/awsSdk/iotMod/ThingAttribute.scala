package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThingAttribute extends js.Object {
  /**
    * A list of thing attributes which are name-value pairs.
    */
  var attributes: js.UndefOr[Attributes] = js.native
  /**
    * The thing ARN.
    */
  var thingArn: js.UndefOr[ThingArn] = js.native
  /**
    * The name of the thing.
    */
  var thingName: js.UndefOr[ThingName] = js.native
  /**
    * The name of the thing type, if the thing has been associated with a type.
    */
  var thingTypeName: js.UndefOr[ThingTypeName] = js.native
  /**
    * The version of the thing record in the registry.
    */
  var version: js.UndefOr[Version] = js.native
}

object ThingAttribute {
  @scala.inline
  def apply(): ThingAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThingAttribute]
  }
  @scala.inline
  implicit class ThingAttributeOps[Self <: ThingAttribute] (val x: Self) extends AnyVal {
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
    def setThingArn(value: ThingArn): Self = this.set("thingArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThingArn: Self = this.set("thingArn", js.undefined)
    @scala.inline
    def setThingName(value: ThingName): Self = this.set("thingName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThingName: Self = this.set("thingName", js.undefined)
    @scala.inline
    def setThingTypeName(value: ThingTypeName): Self = this.set("thingTypeName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThingTypeName: Self = this.set("thingTypeName", js.undefined)
    @scala.inline
    def setVersion(value: Version): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

