package typings.cytoscape.mod

import typings.cytoscape.AnonCol
import typings.cytoscape.cytoscapeStrings.grid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#layouts/grid
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.cytoscape.mod.LayoutOptions because Already inherited */ trait GridLayoutOptions extends ShapedLayoutOptions {
  // extra spacing around nodes when avoidOverlap: true
  var avoidOverlapPadding: js.UndefOr[Double] = js.undefined
  // force num of columns in the grid
  var cols: js.UndefOr[Double] = js.undefined
  // uses all available space on false, uses minimal space on true
  var condense: Boolean
  @JSName("name")
  var name_GridLayoutOptions: grid
  // force num of rows in the grid
  var rows: js.UndefOr[Double] = js.undefined
  // returns { row, col } for element
  def position(node: NodeSingular): AnonCol
}

object GridLayoutOptions {
  @scala.inline
  def apply(
    condense: Boolean,
    fit: Boolean,
    name: grid,
    nodeDimensionsIncludeLabels: Boolean,
    position: NodeSingular => AnonCol,
    animate: js.UndefOr[Boolean] = js.undefined,
    animationDuration: Int | Double = null,
    animationEasing: js.UndefOr[Boolean] = js.undefined,
    avoidOverlap: js.UndefOr[Boolean] = js.undefined,
    avoidOverlapPadding: Int | Double = null,
    boundingBox: BoundingBox12 | BoundingBoxWH = null,
    cols: Int | Double = null,
    padding: Int | Double = null,
    ready: /* e */ LayoutEventObject => Unit = null,
    rows: Int | Double = null,
    sort: (/* a */ SortableNode, /* b */ SortableNode) => Double = null,
    spacingFactor: Int | Double = null,
    stop: /* e */ LayoutEventObject => Unit = null
  ): GridLayoutOptions = {
    val __obj = js.Dynamic.literal(condense = condense.asInstanceOf[js.Any], fit = fit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nodeDimensionsIncludeLabels = nodeDimensionsIncludeLabels.asInstanceOf[js.Any], position = js.Any.fromFunction1(position))
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(animationEasing)) __obj.updateDynamic("animationEasing")(animationEasing.asInstanceOf[js.Any])
    if (!js.isUndefined(avoidOverlap)) __obj.updateDynamic("avoidOverlap")(avoidOverlap.asInstanceOf[js.Any])
    if (avoidOverlapPadding != null) __obj.updateDynamic("avoidOverlapPadding")(avoidOverlapPadding.asInstanceOf[js.Any])
    if (boundingBox != null) __obj.updateDynamic("boundingBox")(boundingBox.asInstanceOf[js.Any])
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (ready != null) __obj.updateDynamic("ready")(js.Any.fromFunction1(ready))
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(js.Any.fromFunction2(sort))
    if (spacingFactor != null) __obj.updateDynamic("spacingFactor")(spacingFactor.asInstanceOf[js.Any])
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction1(stop))
    __obj.asInstanceOf[GridLayoutOptions]
  }
}

