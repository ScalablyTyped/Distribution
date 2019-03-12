package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#layouts/grid
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- cytoscapeLib.cytoscapeMod.cytoscapeNs.LayoutOptions because Already inherited */ trait GridLayoutOptions extends ShapedLayoutOptions {
  // extra spacing around nodes when avoidOverlap: true
  var avoidOverlapPadding: js.UndefOr[scala.Double] = js.undefined
  // force num of columns in the grid
  var cols: js.UndefOr[scala.Double] = js.undefined
  // uses all available space on false, uses minimal space on true
  var condense: scala.Boolean
  @JSName("name")
  var name_GridLayoutOptions: cytoscapeLib.cytoscapeLibStrings.grid
  // force num of rows in the grid
  var rows: js.UndefOr[scala.Double] = js.undefined
  // returns { row, col } for element
  def position(nodeid: java.lang.String): cytoscapeLib.Anon_Col
}

object GridLayoutOptions {
  @scala.inline
  def apply(
    condense: scala.Boolean,
    fit: scala.Boolean,
    name: cytoscapeLib.cytoscapeLibStrings.grid,
    nodeDimensionsIncludeLabels: scala.Boolean,
    position: java.lang.String => cytoscapeLib.Anon_Col,
    animate: js.UndefOr[scala.Boolean] = js.undefined,
    animationDuration: scala.Int | scala.Double = null,
    animationEasing: js.UndefOr[scala.Boolean] = js.undefined,
    avoidOverlap: js.UndefOr[scala.Boolean] = js.undefined,
    avoidOverlapPadding: scala.Int | scala.Double = null,
    boundingBox: BoundingBox12 | BoundingBoxWH = null,
    cols: scala.Int | scala.Double = null,
    padding: scala.Int | scala.Double = null,
    ready: LayoutHandler = null,
    rows: scala.Int | scala.Double = null,
    sort: SortingFunction = null,
    spacingFactor: scala.Int | scala.Double = null,
    stop: LayoutHandler = null
  ): GridLayoutOptions = {
    val __obj = js.Dynamic.literal(condense = condense, fit = fit, name = name, nodeDimensionsIncludeLabels = nodeDimensionsIncludeLabels, position = js.Any.fromFunction1(position))
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(animationEasing)) __obj.updateDynamic("animationEasing")(animationEasing)
    if (!js.isUndefined(avoidOverlap)) __obj.updateDynamic("avoidOverlap")(avoidOverlap)
    if (avoidOverlapPadding != null) __obj.updateDynamic("avoidOverlapPadding")(avoidOverlapPadding.asInstanceOf[js.Any])
    if (boundingBox != null) __obj.updateDynamic("boundingBox")(boundingBox.asInstanceOf[js.Any])
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (ready != null) __obj.updateDynamic("ready")(ready)
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (spacingFactor != null) __obj.updateDynamic("spacingFactor")(spacingFactor.asInstanceOf[js.Any])
    if (stop != null) __obj.updateDynamic("stop")(stop)
    __obj.asInstanceOf[GridLayoutOptions]
  }
}

