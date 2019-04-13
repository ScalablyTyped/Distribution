package typings
package axeDashCoreLib.axeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunOnly extends js.Object {
  var `type`: RunOnlyType
  var values: js.UndefOr[js.Array[TagValue] | js.Array[java.lang.String] | RunOnlyObject] = js.undefined
}

object RunOnly {
  @scala.inline
  def apply(
    `type`: RunOnlyType,
    values: js.Array[TagValue] | js.Array[java.lang.String] | RunOnlyObject = null
  ): RunOnly = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunOnly]
  }
}

