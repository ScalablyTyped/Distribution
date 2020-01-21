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
  def apply(thingTypeName: ThingTypeName, undoDeprecate: js.UndefOr[scala.Boolean] = js.undefined): DeprecateThingTypeRequest = {
    val __obj = js.Dynamic.literal(thingTypeName = thingTypeName.asInstanceOf[js.Any])
    if (!js.isUndefined(undoDeprecate)) __obj.updateDynamic("undoDeprecate")(undoDeprecate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeprecateThingTypeRequest]
  }
}

