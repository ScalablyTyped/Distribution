package typings.chartmogulDashNode.chartmogulDashNodeMod.Customer

import typings.chartmogulDashNode.chartmogulDashNodeMod.Config
import typings.chartmogulDashNode.commonMod.Map
import typings.chartmogulDashNode.commonMod.Strings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attributes extends js.Object {
  var clearbit: js.UndefOr[Map] = js.undefined
  var custom: js.UndefOr[Map] = js.undefined
  var stripe: js.UndefOr[Map] = js.undefined
  var tags: js.UndefOr[Strings] = js.undefined
}

object Attributes {
  @scala.inline
  def apply(clearbit: Map = null, custom: Map = null, stripe: Map = null, tags: Strings = null): Attributes = {
    val __obj = js.Dynamic.literal()
    if (clearbit != null) __obj.updateDynamic("clearbit")(clearbit)
    if (custom != null) __obj.updateDynamic("custom")(custom)
    if (stripe != null) __obj.updateDynamic("stripe")(stripe)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[Attributes]
  }
}

@JSImport("chartmogul-node", "Customer.attributes")
@js.native
object attributes extends js.Object {
  def apply(config: Config, uuid: String): js.Promise[Attributes] = js.native
}

