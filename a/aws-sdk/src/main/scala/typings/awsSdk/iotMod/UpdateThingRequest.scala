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
    * The name of the thing to update.
    */
  var thingName: ThingName = js.native
  /**
    * The name of the thing type.
    */
  var thingTypeName: js.UndefOr[ThingTypeName] = js.native
}

object UpdateThingRequest {
  @scala.inline
  def apply(
    thingName: ThingName,
    attributePayload: AttributePayload = null,
    expectedVersion: Int | Double = null,
    removeThingType: js.UndefOr[scala.Boolean] = js.undefined,
    thingTypeName: ThingTypeName = null
  ): UpdateThingRequest = {
    val __obj = js.Dynamic.literal(thingName = thingName.asInstanceOf[js.Any])
    if (attributePayload != null) __obj.updateDynamic("attributePayload")(attributePayload.asInstanceOf[js.Any])
    if (expectedVersion != null) __obj.updateDynamic("expectedVersion")(expectedVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(removeThingType)) __obj.updateDynamic("removeThingType")(removeThingType.asInstanceOf[js.Any])
    if (thingTypeName != null) __obj.updateDynamic("thingTypeName")(thingTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateThingRequest]
  }
}

