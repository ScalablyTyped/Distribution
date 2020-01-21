package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThingTypeDefinition extends js.Object {
  /**
    * The thing type ARN.
    */
  var thingTypeArn: js.UndefOr[ThingTypeArn] = js.native
  /**
    * The ThingTypeMetadata contains additional information about the thing type including: creation date and time, a value indicating whether the thing type is deprecated, and a date and time when it was deprecated.
    */
  var thingTypeMetadata: js.UndefOr[ThingTypeMetadata] = js.native
  /**
    * The name of the thing type.
    */
  var thingTypeName: js.UndefOr[ThingTypeName] = js.native
  /**
    * The ThingTypeProperties for the thing type.
    */
  var thingTypeProperties: js.UndefOr[ThingTypeProperties] = js.native
}

object ThingTypeDefinition {
  @scala.inline
  def apply(
    thingTypeArn: ThingTypeArn = null,
    thingTypeMetadata: ThingTypeMetadata = null,
    thingTypeName: ThingTypeName = null,
    thingTypeProperties: ThingTypeProperties = null
  ): ThingTypeDefinition = {
    val __obj = js.Dynamic.literal()
    if (thingTypeArn != null) __obj.updateDynamic("thingTypeArn")(thingTypeArn.asInstanceOf[js.Any])
    if (thingTypeMetadata != null) __obj.updateDynamic("thingTypeMetadata")(thingTypeMetadata.asInstanceOf[js.Any])
    if (thingTypeName != null) __obj.updateDynamic("thingTypeName")(thingTypeName.asInstanceOf[js.Any])
    if (thingTypeProperties != null) __obj.updateDynamic("thingTypeProperties")(thingTypeProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThingTypeDefinition]
  }
}

