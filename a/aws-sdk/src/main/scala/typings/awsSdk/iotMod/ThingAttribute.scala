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
  def apply(
    attributes: Attributes = null,
    thingArn: ThingArn = null,
    thingName: ThingName = null,
    thingTypeName: ThingTypeName = null,
    version: js.UndefOr[Version] = js.undefined
  ): ThingAttribute = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (thingArn != null) __obj.updateDynamic("thingArn")(thingArn.asInstanceOf[js.Any])
    if (thingName != null) __obj.updateDynamic("thingName")(thingName.asInstanceOf[js.Any])
    if (thingTypeName != null) __obj.updateDynamic("thingTypeName")(thingTypeName.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThingAttribute]
  }
}

