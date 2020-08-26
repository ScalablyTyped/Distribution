package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteThingTypeRequest extends js.Object {
  /**
    * The name of the thing type.
    */
  var thingTypeName: ThingTypeName = js.native
}

object DeleteThingTypeRequest {
  @scala.inline
  def apply(thingTypeName: ThingTypeName): DeleteThingTypeRequest = {
    val __obj = js.Dynamic.literal(thingTypeName = thingTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteThingTypeRequest]
  }
  @scala.inline
  implicit class DeleteThingTypeRequestOps[Self <: DeleteThingTypeRequest] (val x: Self) extends AnyVal {
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
  }
  
}

