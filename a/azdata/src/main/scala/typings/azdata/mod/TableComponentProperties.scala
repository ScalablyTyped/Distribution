package typings.azdata.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableComponentProperties extends ComponentProperties {
  var ariaColumnCount: js.UndefOr[Double] = js.undefined
  var ariaRowCount: js.UndefOr[Double] = js.undefined
  var columns: js.Array[String | TableColumn]
  var data: js.Array[js.Array[_]]
  var fontSize: js.UndefOr[Double | String] = js.undefined
  var forceFitColumns: js.UndefOr[ColumnSizingMode] = js.undefined
  var moveFocusOutWithTab: js.UndefOr[Boolean] = js.undefined
  var selectedRows: js.UndefOr[js.Array[Double]] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var updateCells: js.UndefOr[js.Array[TableCell]] = js.undefined
}

object TableComponentProperties {
  @scala.inline
  def apply(
    columns: js.Array[String | TableColumn],
    data: js.Array[js.Array[_]],
    CSSStyles: StringDictionary[String] = null,
    ariaColumnCount: Int | Double = null,
    ariaLabel: String = null,
    ariaRole: String = null,
    ariaRowCount: Int | Double = null,
    ariaSelected: js.UndefOr[Boolean] = js.undefined,
    display: DisplayType = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    fontSize: Double | String = null,
    forceFitColumns: ColumnSizingMode = null,
    height: Double | String = null,
    moveFocusOutWithTab: js.UndefOr[Boolean] = js.undefined,
    position: PositionType = null,
    selectedRows: js.Array[Double] = null,
    title: String = null,
    updateCells: js.Array[TableCell] = null,
    width: Double | String = null
  ): TableComponentProperties = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    if (CSSStyles != null) __obj.updateDynamic("CSSStyles")(CSSStyles.asInstanceOf[js.Any])
    if (ariaColumnCount != null) __obj.updateDynamic("ariaColumnCount")(ariaColumnCount.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (ariaRole != null) __obj.updateDynamic("ariaRole")(ariaRole.asInstanceOf[js.Any])
    if (ariaRowCount != null) __obj.updateDynamic("ariaRowCount")(ariaRowCount.asInstanceOf[js.Any])
    if (!js.isUndefined(ariaSelected)) __obj.updateDynamic("ariaSelected")(ariaSelected.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (forceFitColumns != null) __obj.updateDynamic("forceFitColumns")(forceFitColumns.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(moveFocusOutWithTab)) __obj.updateDynamic("moveFocusOutWithTab")(moveFocusOutWithTab.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (selectedRows != null) __obj.updateDynamic("selectedRows")(selectedRows.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (updateCells != null) __obj.updateDynamic("updateCells")(updateCells.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableComponentProperties]
  }
}

