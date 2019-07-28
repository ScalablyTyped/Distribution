package typings.d3pie

import typings.d3pie.d3pieStrings.`label-asc`
import typings.d3pie.d3pieStrings.`label-desc`
import typings.d3pie.d3pieStrings.`value-asc`
import typings.d3pie.d3pieStrings.`value-desc`
import typings.d3pie.d3pieStrings.none
import typings.d3pie.d3pieStrings.random
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Content extends js.Object {
  var content: js.Array[Anon_ColorLabel]
  var smallSegmentGrouping: js.UndefOr[Anon_Color] = js.undefined
  var sortOrder: js.UndefOr[none | random | `value-asc` | `value-desc` | `label-asc` | `label-desc`] = js.undefined
}

object Anon_Content {
  @scala.inline
  def apply(
    content: js.Array[Anon_ColorLabel],
    smallSegmentGrouping: Anon_Color = null,
    sortOrder: none | random | `value-asc` | `value-desc` | `label-asc` | `label-desc` = null
  ): Anon_Content = {
    val __obj = js.Dynamic.literal(content = content)
    if (smallSegmentGrouping != null) __obj.updateDynamic("smallSegmentGrouping")(smallSegmentGrouping)
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Content]
  }
}

