package typings.d3pie.anon

import typings.d3pie.d3pie.ID3PieTextOptions
import typings.d3pie.d3pieStrings.`pie-center`
import typings.d3pie.d3pieStrings.`top-center`
import typings.d3pie.d3pieStrings.`top-left`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  var location: js.UndefOr[`top-center` | `top-left` | `pie-center`] = js.undefined
  var subtitle: js.UndefOr[ID3PieTextOptions] = js.undefined
  var title: js.UndefOr[ID3PieTextOptions] = js.undefined
  var titleSubtitlePadding: js.UndefOr[Double] = js.undefined
}

object Location {
  @scala.inline
  def apply(
    location: `top-center` | `top-left` | `pie-center` = null,
    subtitle: ID3PieTextOptions = null,
    title: ID3PieTextOptions = null,
    titleSubtitlePadding: js.UndefOr[Double] = js.undefined
  ): Location = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(titleSubtitlePadding)) __obj.updateDynamic("titleSubtitlePadding")(titleSubtitlePadding.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
}

