package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThingDocument extends js.Object {
  /**
    * The attributes.
    */
  var attributes: js.UndefOr[Attributes] = js.native
  /**
    * Indicates whether the thing is connected to the AWS IoT service.
    */
  var connectivity: js.UndefOr[ThingConnectivity] = js.native
  /**
    * The shadow.
    */
  var shadow: js.UndefOr[JsonDocument] = js.native
  /**
    * Thing group names.
    */
  var thingGroupNames: js.UndefOr[ThingGroupNameList] = js.native
  /**
    * The thing ID.
    */
  var thingId: js.UndefOr[ThingId] = js.native
  /**
    * The thing name.
    */
  var thingName: js.UndefOr[ThingName] = js.native
  /**
    * The thing type name.
    */
  var thingTypeName: js.UndefOr[ThingTypeName] = js.native
}

object ThingDocument {
  @scala.inline
  def apply(): ThingDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThingDocument]
  }
  @scala.inline
  implicit class ThingDocumentOps[Self <: ThingDocument] (val x: Self) extends AnyVal {
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
    def setConnectivity(value: ThingConnectivity): Self = this.set("connectivity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectivity: Self = this.set("connectivity", js.undefined)
    @scala.inline
    def setShadow(value: JsonDocument): Self = this.set("shadow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadow: Self = this.set("shadow", js.undefined)
    @scala.inline
    def setThingGroupNamesVarargs(value: ThingGroupName*): Self = this.set("thingGroupNames", js.Array(value :_*))
    @scala.inline
    def setThingGroupNames(value: ThingGroupNameList): Self = this.set("thingGroupNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThingGroupNames: Self = this.set("thingGroupNames", js.undefined)
    @scala.inline
    def setThingId(value: ThingId): Self = this.set("thingId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThingId: Self = this.set("thingId", js.undefined)
    @scala.inline
    def setThingName(value: ThingName): Self = this.set("thingName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThingName: Self = this.set("thingName", js.undefined)
    @scala.inline
    def setThingTypeName(value: ThingTypeName): Self = this.set("thingTypeName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThingTypeName: Self = this.set("thingTypeName", js.undefined)
  }
  
}

