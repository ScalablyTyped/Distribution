package typings.cytoscape.mod

import typings.cytoscape.anon.Col
import typings.cytoscape.cytoscapeStrings.grid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#layouts/grid
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
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
  def position(node: NodeSingular): Col
}

object GridLayoutOptions {
  @scala.inline
  def apply(
    condense: Boolean,
    fit: Boolean,
    name: grid,
    nodeDimensionsIncludeLabels: Boolean,
    position: NodeSingular => Col,
    animate: js.UndefOr[Boolean] = js.undefined,
    animationDuration: js.UndefOr[Double] = js.undefined,
    animationEasing: js.UndefOr[Boolean] = js.undefined,
    avoidOverlap: js.UndefOr[Boolean] = js.undefined,
    avoidOverlapPadding: js.UndefOr[Double] = js.undefined,
    boundingBox: BoundingBox12 | BoundingBoxWH = null,
    cols: js.UndefOr[Double] = js.undefined,
    padding: js.UndefOr[Double] = js.undefined,
    ready: /* e */ LayoutEventObject => Unit = null,
    rows: js.UndefOr[Double] = js.undefined,
    sort: (/* a */ SortableNode, /* b */ SortableNode) => Double = null,
    spacingFactor: js.UndefOr[Double] = js.undefined,
    stop: /* e */ LayoutEventObject => Unit = null
  ): GridLayoutOptions = {
    val __obj = js.Dynamic.literal(condense = condense.asInstanceOf[js.Any], fit = fit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nodeDimensionsIncludeLabels = nodeDimensionsIncludeLabels.asInstanceOf[js.Any], position = js.Any.fromFunction1(position))
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(animationDuration)) __obj.updateDynamic("animationDuration")(animationDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(animationEasing)) __obj.updateDynamic("animationEasing")(animationEasing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(avoidOverlap)) __obj.updateDynamic("avoidOverlap")(avoidOverlap.get.asInstanceOf[js.Any])
    if (!js.isUndefined(avoidOverlapPadding)) __obj.updateDynamic("avoidOverlapPadding")(avoidOverlapPadding.get.asInstanceOf[js.Any])
    if (boundingBox != null) __obj.updateDynamic("boundingBox")(boundingBox.asInstanceOf[js.Any])
    if (!js.isUndefined(cols)) __obj.updateDynamic("cols")(cols.get.asInstanceOf[js.Any])
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.get.asInstanceOf[js.Any])
    if (ready != null) __obj.updateDynamic("ready")(js.Any.fromFunction1(ready))
    if (!js.isUndefined(rows)) __obj.updateDynamic("rows")(rows.get.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(js.Any.fromFunction2(sort))
    if (!js.isUndefined(spacingFactor)) __obj.updateDynamic("spacingFactor")(spacingFactor.get.asInstanceOf[js.Any])
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction1(stop))
    __obj.asInstanceOf[GridLayoutOptions]
  }
}

