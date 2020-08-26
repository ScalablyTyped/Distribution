package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteThingRequest extends js.Object {
  /**
    * The expected version of the thing record in the registry. If the version of the record in the registry does not match the expected version specified in the request, the DeleteThing request is rejected with a VersionConflictException.
    */
  var expectedVersion: js.UndefOr[OptionalVersion] = js.native
  /**
    * The name of the thing to delete.
    */
  var thingName: ThingName = js.native
}

object DeleteThingRequest {
  @scala.inline
  def apply(thingName: ThingName): DeleteThingRequest = {
    val __obj = js.Dynamic.literal(thingName = thingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteThingRequest]
  }
  @scala.inline
  implicit class DeleteThingRequestOps[Self <: DeleteThingRequest] (val x: Self) extends AnyVal {
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
    def setExpectedVersion(value: OptionalVersion): Self = this.set("expectedVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpectedVersion: Self = this.set("expectedVersion", js.undefined)
  }
  
}

