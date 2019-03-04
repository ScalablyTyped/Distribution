package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#layouts/breadthfirst
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- cytoscapeLib.cytoscapeMod.cytoscapeNs.LayoutOptions because Already inherited */ trait BreadthFirstLayoutOptions extends ShapedLayoutOptions {
  // put depths in concentric circles if true, put depths top down if false
  var circle: scala.Boolean
  // whether the tree is directed downwards (or edges can point in any direction if false)
  var directed: scala.Boolean
  // how many times to try to position the nodes in a maximal way (i.e. no backtracking)
  var maximalAdjustments: scala.Double
  @JSName("name")
  var name_BreadthFirstLayoutOptions: cytoscapeLib.cytoscapeLibStrings.breadthfirst
  // the roots of the trees
  var roots: js.UndefOr[java.lang.String] = js.undefined
}

object BreadthFirstLayoutOptions {
  @scala.inline
  def apply(
    circle: scala.Boolean,
    directed: scala.Boolean,
    fit: scala.Boolean,
    maximalAdjustments: scala.Double,
    name: cytoscapeLib.cytoscapeLibStrings.breadthfirst,
    nodeDimensionsIncludeLabels: scala.Boolean,
    animate: js.UndefOr[scala.Boolean] = js.undefined,
    animationDuration: scala.Int | scala.Double = null,
    animationEasing: js.UndefOr[scala.Boolean] = js.undefined,
    avoidOverlap: js.UndefOr[scala.Boolean] = js.undefined,
    boundingBox: BoundingBox12 | BoundingBoxWH = null,
    padding: scala.Int | scala.Double = null,
    ready: LayoutHandler = null,
    roots: java.lang.String = null,
    sort: SortingFunction = null,
    spacingFactor: scala.Int | scala.Double = null,
    stop: LayoutHandler = null
  ): BreadthFirstLayoutOptions = {
    val __obj = js.Dynamic.literal(circle = circle, directed = directed, fit = fit, maximalAdjustments = maximalAdjustments, name = name, nodeDimensionsIncludeLabels = nodeDimensionsIncludeLabels)
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(animationEasing)) __obj.updateDynamic("animationEasing")(animationEasing)
    if (!js.isUndefined(avoidOverlap)) __obj.updateDynamic("avoidOverlap")(avoidOverlap)
    if (boundingBox != null) __obj.updateDynamic("boundingBox")(boundingBox.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (ready != null) __obj.updateDynamic("ready")(ready)
    if (roots != null) __obj.updateDynamic("roots")(roots)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (spacingFactor != null) __obj.updateDynamic("spacingFactor")(spacingFactor.asInstanceOf[js.Any])
    if (stop != null) __obj.updateDynamic("stop")(stop)
    __obj.asInstanceOf[BreadthFirstLayoutOptions]
  }
}

