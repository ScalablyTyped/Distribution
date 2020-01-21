package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThingTypeMetadata extends js.Object {
  /**
    * The date and time when the thing type was created.
    */
  var creationDate: js.UndefOr[CreationDate] = js.native
  /**
    * Whether the thing type is deprecated. If true, no new things could be associated with this type.
    */
  var deprecated: js.UndefOr[Boolean] = js.native
  /**
    * The date and time when the thing type was deprecated.
    */
  var deprecationDate: js.UndefOr[DeprecationDate] = js.native
}

object ThingTypeMetadata {
  @scala.inline
  def apply(
    creationDate: CreationDate = null,
    deprecated: js.UndefOr[scala.Boolean] = js.undefined,
    deprecationDate: DeprecationDate = null
  ): ThingTypeMetadata = {
    val __obj = js.Dynamic.literal()
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate.asInstanceOf[js.Any])
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    if (deprecationDate != null) __obj.updateDynamic("deprecationDate")(deprecationDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThingTypeMetadata]
  }
}

