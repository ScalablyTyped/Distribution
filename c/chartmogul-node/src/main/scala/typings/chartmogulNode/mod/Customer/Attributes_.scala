package typings.chartmogulNode.mod.Customer

import typings.chartmogulNode.commonMod.Map
import typings.chartmogulNode.commonMod.Strings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attributes_ extends js.Object {
  var clearbit: js.UndefOr[Map] = js.undefined
  var custom: js.UndefOr[Map] = js.undefined
  var stripe: js.UndefOr[Map] = js.undefined
  var tags: js.UndefOr[Strings] = js.undefined
}

object Attributes_ {
  @scala.inline
  def apply(clearbit: Map = null, custom: Map = null, stripe: Map = null, tags: Strings = null): Attributes_ = {
    val __obj = js.Dynamic.literal()
    if (clearbit != null) __obj.updateDynamic("clearbit")(clearbit.asInstanceOf[js.Any])
    if (custom != null) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    if (stripe != null) __obj.updateDynamic("stripe")(stripe.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributes_]
  }
}

