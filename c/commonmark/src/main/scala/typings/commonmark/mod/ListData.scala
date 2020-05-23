package typings.commonmark.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListData extends js.Object {
  var bulletChar: js.UndefOr[String] = js.undefined
  var delimiter: js.UndefOr[String] = js.undefined
  var tight: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object ListData {
  @scala.inline
  def apply(
    bulletChar: String = null,
    delimiter: String = null,
    tight: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null
  ): ListData = {
    val __obj = js.Dynamic.literal()
    if (bulletChar != null) __obj.updateDynamic("bulletChar")(bulletChar.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (!js.isUndefined(tight)) __obj.updateDynamic("tight")(tight.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListData]
  }
}

