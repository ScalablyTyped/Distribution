package typings
package d3pieLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Location extends js.Object {
  var location: js.UndefOr[
    d3pieLib.d3pieLibStrings.`top-center` | d3pieLib.d3pieLibStrings.`top-left` | d3pieLib.d3pieLibStrings.`pie-center`
  ] = js.undefined
  var subtitle: js.UndefOr[d3pieLib.d3pieNs.ID3PieTextOptions] = js.undefined
  var title: js.UndefOr[d3pieLib.d3pieNs.ID3PieTextOptions] = js.undefined
  var titleSubtitlePadding: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Location {
  @scala.inline
  def apply(
    location: d3pieLib.d3pieLibStrings.`top-center` | d3pieLib.d3pieLibStrings.`top-left` | d3pieLib.d3pieLibStrings.`pie-center` = null,
    subtitle: d3pieLib.d3pieNs.ID3PieTextOptions = null,
    title: d3pieLib.d3pieNs.ID3PieTextOptions = null,
    titleSubtitlePadding: scala.Int | scala.Double = null
  ): Anon_Location = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle)
    if (title != null) __obj.updateDynamic("title")(title)
    if (titleSubtitlePadding != null) __obj.updateDynamic("titleSubtitlePadding")(titleSubtitlePadding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Location]
  }
}

