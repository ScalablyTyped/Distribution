package typings.chartmogulDashNode.chartmogulDashNodeMod.Customer

import typings.chartmogulDashNode.commonMod.Strings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewAttributes extends js.Object {
  var custom: js.UndefOr[js.Array[NewCustomAttributes]] = js.undefined
  var tags: js.UndefOr[Strings] = js.undefined
}

object NewAttributes {
  @scala.inline
  def apply(custom: js.Array[NewCustomAttributes] = null, tags: Strings = null): NewAttributes = {
    val __obj = js.Dynamic.literal()
    if (custom != null) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewAttributes]
  }
}

