package typings
package commonmarkLib.commonmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListData extends js.Object {
  var bulletChar: js.UndefOr[java.lang.String] = js.undefined
  var delimiter: js.UndefOr[java.lang.String] = js.undefined
  var tight: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ListData {
  @scala.inline
  def apply(
    bulletChar: java.lang.String = null,
    delimiter: java.lang.String = null,
    tight: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: java.lang.String = null
  ): ListData = {
    val __obj = js.Dynamic.literal()
    if (bulletChar != null) __obj.updateDynamic("bulletChar")(bulletChar)
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    if (!js.isUndefined(tight)) __obj.updateDynamic("tight")(tight)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ListData]
  }
}

