package typings.builderUtilRuntime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFormat extends js.Object {
  var format: String
  var variant: String
  var version: js.UndefOr[scala.Nothing] = js.undefined
}

object AnonFormat {
  @scala.inline
  def apply(format: String, variant: String, version: js.UndefOr[scala.Nothing] = js.undefined): AnonFormat = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], variant = variant.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFormat]
  }
}

