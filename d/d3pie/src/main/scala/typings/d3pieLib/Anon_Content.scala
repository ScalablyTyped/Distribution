package typings
package d3pieLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Content extends js.Object {
  var content: js.Array[Anon_ColorLabel]
  var smallSegmentGrouping: js.UndefOr[Anon_Color] = js.undefined
  var sortOrder: js.UndefOr[
    d3pieLib.d3pieLibStrings.none | d3pieLib.d3pieLibStrings.random | d3pieLib.d3pieLibStrings.`value-asc` | d3pieLib.d3pieLibStrings.`value-desc` | d3pieLib.d3pieLibStrings.`label-asc` | d3pieLib.d3pieLibStrings.`label-desc`
  ] = js.undefined
}

object Anon_Content {
  @scala.inline
  def apply(
    content: js.Array[Anon_ColorLabel],
    smallSegmentGrouping: Anon_Color = null,
    sortOrder: d3pieLib.d3pieLibStrings.none | d3pieLib.d3pieLibStrings.random | d3pieLib.d3pieLibStrings.`value-asc` | d3pieLib.d3pieLibStrings.`value-desc` | d3pieLib.d3pieLibStrings.`label-asc` | d3pieLib.d3pieLibStrings.`label-desc` = null
  ): Anon_Content = {
    val __obj = js.Dynamic.literal(content = content)
    if (smallSegmentGrouping != null) __obj.updateDynamic("smallSegmentGrouping")(smallSegmentGrouping)
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Content]
  }
}

