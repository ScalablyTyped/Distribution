package typings.bleno.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescriptorOptions extends js.Object {
  var uuid: String
  var value: js.UndefOr[Buffer | String | Null] = js.undefined
}

object DescriptorOptions {
  @scala.inline
  def apply(uuid: String, value: js.UndefOr[Null | Buffer | String] = js.undefined): DescriptorOptions = {
    val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescriptorOptions]
  }
}

