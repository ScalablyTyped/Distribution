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
  def apply(
    attributes: Attributes = null,
    connectivity: ThingConnectivity = null,
    shadow: JsonDocument = null,
    thingGroupNames: ThingGroupNameList = null,
    thingId: ThingId = null,
    thingName: ThingName = null,
    thingTypeName: ThingTypeName = null
  ): ThingDocument = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (connectivity != null) __obj.updateDynamic("connectivity")(connectivity.asInstanceOf[js.Any])
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (thingGroupNames != null) __obj.updateDynamic("thingGroupNames")(thingGroupNames.asInstanceOf[js.Any])
    if (thingId != null) __obj.updateDynamic("thingId")(thingId.asInstanceOf[js.Any])
    if (thingName != null) __obj.updateDynamic("thingName")(thingName.asInstanceOf[js.Any])
    if (thingTypeName != null) __obj.updateDynamic("thingTypeName")(thingTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThingDocument]
  }
}

