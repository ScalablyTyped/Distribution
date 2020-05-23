package typings.baseui.layoutGridMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridProps extends js.Object {
  var align: js.UndefOr[Responsive[ALIGNMENT]] = js.undefined
  var behavior: js.UndefOr[BEHAVIOR] = js.undefined
  var children: ReactNode
  var gridColumns: js.UndefOr[Responsive[Double]] = js.undefined
  var gridGaps: js.UndefOr[Responsive[Double]] = js.undefined
  var gridGutters: js.UndefOr[Responsive[Double]] = js.undefined
  var gridMargins: js.UndefOr[Responsive[Double]] = js.undefined
  var gridMaxWidth: js.UndefOr[Double] = js.undefined
  var gridUnit: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSLengthUnitT */ js.Any
  ] = js.undefined
  var overrides: js.UndefOr[typings.baseui.anon.Grid] = js.undefined
}

object GridProps {
  @scala.inline
  def apply(
    align: Responsive[ALIGNMENT] = null,
    behavior: BEHAVIOR = null,
    children: ReactNode = null,
    gridColumns: Responsive[Double] = null,
    gridGaps: Responsive[Double] = null,
    gridGutters: Responsive[Double] = null,
    gridMargins: Responsive[Double] = null,
    gridMaxWidth: js.UndefOr[Double] = js.undefined,
    gridUnit: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSLengthUnitT */ js.Any = null,
    overrides: typings.baseui.anon.Grid = null
  ): GridProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (behavior != null) __obj.updateDynamic("behavior")(behavior.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (gridColumns != null) __obj.updateDynamic("gridColumns")(gridColumns.asInstanceOf[js.Any])
    if (gridGaps != null) __obj.updateDynamic("gridGaps")(gridGaps.asInstanceOf[js.Any])
    if (gridGutters != null) __obj.updateDynamic("gridGutters")(gridGutters.asInstanceOf[js.Any])
    if (gridMargins != null) __obj.updateDynamic("gridMargins")(gridMargins.asInstanceOf[js.Any])
    if (!js.isUndefined(gridMaxWidth)) __obj.updateDynamic("gridMaxWidth")(gridMaxWidth.get.asInstanceOf[js.Any])
    if (gridUnit != null) __obj.updateDynamic("gridUnit")(gridUnit.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridProps]
  }
}

