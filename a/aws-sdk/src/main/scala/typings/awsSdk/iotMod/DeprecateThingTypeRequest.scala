package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeprecateThingTypeRequest extends js.Object {
  /**
    * The name of the thing type to deprecate.
    */
  var thingTypeName: ThingTypeName = js.native
  /**
    * Whether to undeprecate a deprecated thing type. If true, the thing type will not be deprecated anymore and you can associate it with things.
    */
  var undoDeprecate: js.UndefOr[UndoDeprecate] = js.native
}

object DeprecateThingTypeRequest {
  @scala.inline
  def apply(thingTypeName: ThingTypeName): DeprecateThingTypeRequest = {
    val __obj = js.Dynamic.literal(thingTypeName = thingTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeprecateThingTypeRequest]
  }
  @scala.inline
  implicit class DeprecateThingTypeRequestOps[Self <: DeprecateThingTypeRequest] (val x: Self) extends AnyVal {
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
    def setUndoDeprecate(value: UndoDeprecate): Self = this.set("undoDeprecate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUndoDeprecate: Self = this.set("undoDeprecate", js.undefined)
  }
  
}

