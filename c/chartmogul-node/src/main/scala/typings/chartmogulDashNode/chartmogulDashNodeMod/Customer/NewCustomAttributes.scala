package typings.chartmogulDashNode.chartmogulDashNodeMod.Customer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewCustomAttributes extends js.Object {
  var key: String
  var source: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var value: js.Any
}

object NewCustomAttributes {
  @scala.inline
  def apply(key: String, value: js.Any, source: String = null, `type`: String = null): NewCustomAttributes = {
    val __obj = js.Dynamic.literal(key = key, value = value)
    if (source != null) __obj.updateDynamic("source")(source)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NewCustomAttributes]
  }
}

