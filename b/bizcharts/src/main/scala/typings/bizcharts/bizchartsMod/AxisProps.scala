package typings.bizcharts.bizchartsMod

import typings.atAntvG2.atAntvG2Mod.AxisGrid
import typings.atAntvG2.atAntvG2Mod.AxisLabel
import typings.atAntvG2.atAntvG2Mod.Styles.line
import typings.atAntvG2.atAntvG2Mod.Styles.tickLine
import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import typings.react.reactMod.Props
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxisProps
  extends Props[js.Any] {
  var grid: js.UndefOr[AxisGrid | Null] = js.undefined
  var label: js.UndefOr[AxisLabel | Null] = js.undefined
  var line: js.UndefOr[typings.atAntvG2.atAntvG2Mod.Styles.line | Null] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[PositionType] = js.undefined
  var subTickCount: js.UndefOr[Double] = js.undefined
  var subTickLine: js.UndefOr[tickLine] = js.undefined
  var tickLine: js.UndefOr[typings.atAntvG2.atAntvG2Mod.Styles.tickLine | Null] = js.undefined
  var title: js.UndefOr[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify G2.AxisTile */ js.Any) | Boolean | Null
  ] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object AxisProps {
  @scala.inline
  def apply(
    children: ReactNode = null,
    grid: AxisGrid = null,
    key: Key = null,
    label: AxisLabel = null,
    line: line = null,
    min: Int | Double = null,
    name: String = null,
    position: PositionType = null,
    ref: LegacyRef[js.Any] = null,
    subTickCount: Int | Double = null,
    subTickLine: tickLine = null,
    tickLine: tickLine = null,
    title: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify G2.AxisTile */ js.Any) | Boolean = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    zIndex: Int | Double = null
  ): AxisProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (subTickCount != null) __obj.updateDynamic("subTickCount")(subTickCount.asInstanceOf[js.Any])
    if (subTickLine != null) __obj.updateDynamic("subTickLine")(subTickLine.asInstanceOf[js.Any])
    if (tickLine != null) __obj.updateDynamic("tickLine")(tickLine.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisProps]
  }
}

