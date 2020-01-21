package typings.bizcharts.mod

import typings.bizcharts.AnonOffsetX
import typings.bizcharts.AnonOffsetY
import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.react.mod.Props
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FacetProps
  extends Props[js.Any] {
  var autoSetAxis: js.UndefOr[Boolean] = js.undefined
  var colTitle: js.UndefOr[AnonOffsetY] = js.undefined
  var eachView: js.UndefOr[
    js.Function2[/* view */ js.UndefOr[js.Any], /* facet */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  var fields: js.UndefOr[String | js.Array[_]] = js.undefined
  var margin: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var padding: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var rowTitle: js.UndefOr[AnonOffsetX] = js.undefined
  var showTitle: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[FacetType] = js.undefined
}

object FacetProps {
  @scala.inline
  def apply(
    autoSetAxis: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    colTitle: AnonOffsetY = null,
    eachView: (/* view */ js.UndefOr[js.Any], /* facet */ js.UndefOr[js.Any]) => Unit = null,
    fields: String | js.Array[_] = null,
    key: Key = null,
    margin: Double | js.Array[Double] = null,
    padding: Double | js.Array[Double] = null,
    ref: LegacyRef[js.Any] = null,
    rowTitle: AnonOffsetX = null,
    showTitle: js.UndefOr[Boolean] = js.undefined,
    `type`: FacetType = null
  ): FacetProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoSetAxis)) __obj.updateDynamic("autoSetAxis")(autoSetAxis.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (colTitle != null) __obj.updateDynamic("colTitle")(colTitle.asInstanceOf[js.Any])
    if (eachView != null) __obj.updateDynamic("eachView")(js.Any.fromFunction2(eachView))
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (rowTitle != null) __obj.updateDynamic("rowTitle")(rowTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(showTitle)) __obj.updateDynamic("showTitle")(showTitle.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FacetProps]
  }
}

