package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThingTypeProperties extends js.Object {
  /**
    * A list of searchable thing attribute names.
    */
  var searchableAttributes: js.UndefOr[SearchableAttributes] = js.native
  /**
    * The description of the thing type.
    */
  var thingTypeDescription: js.UndefOr[ThingTypeDescription] = js.native
}

object ThingTypeProperties {
  @scala.inline
  def apply(
    searchableAttributes: SearchableAttributes = null,
    thingTypeDescription: ThingTypeDescription = null
  ): ThingTypeProperties = {
    val __obj = js.Dynamic.literal()
    if (searchableAttributes != null) __obj.updateDynamic("searchableAttributes")(searchableAttributes.asInstanceOf[js.Any])
    if (thingTypeDescription != null) __obj.updateDynamic("thingTypeDescription")(thingTypeDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThingTypeProperties]
  }
}

