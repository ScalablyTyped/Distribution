package typings.cytoscape.cytoscapeMod

import typings.cytoscape.cytoscapeStrings.breadthfirst
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#layouts/breadthfirst
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.cytoscape.cytoscapeMod.LayoutOptions because Already inherited */ trait BreadthFirstLayoutOptions extends ShapedLayoutOptions {
  // put depths in concentric circles if true, put depths top down if false
  var circle: Boolean
  // whether the tree is directed downwards (or edges can point in any direction if false)
  var directed: Boolean
  // how many times to try to position the nodes in a maximal way (i.e. no backtracking)
  var maximalAdjustments: Double
  @JSName("name")
  var name_BreadthFirstLayoutOptions: breadthfirst
  // the roots of the trees
  var roots: js.UndefOr[String] = js.undefined
}

object BreadthFirstLayoutOptions {
  @scala.inline
  def apply(
    circle: Boolean,
    directed: Boolean,
    fit: Boolean,
    maximalAdjustments: Double,
    name: breadthfirst,
    nodeDimensionsIncludeLabels: Boolean,
    animate: js.UndefOr[Boolean] = js.undefined,
    animationDuration: Int | Double = null,
    animationEasing: js.UndefOr[Boolean] = js.undefined,
    avoidOverlap: js.UndefOr[Boolean] = js.undefined,
    boundingBox: BoundingBox12 | BoundingBoxWH = null,
    padding: Int | Double = null,
    ready: /* e */ LayoutEventObject => Unit = null,
    roots: String = null,
    sort: (/* a */ SortableNode, /* b */ SortableNode) => Double = null,
    spacingFactor: Int | Double = null,
    stop: /* e */ LayoutEventObject => Unit = null
  ): BreadthFirstLayoutOptions = {
    val __obj = js.Dynamic.literal(circle = circle, directed = directed, fit = fit, maximalAdjustments = maximalAdjustments, name = name, nodeDimensionsIncludeLabels = nodeDimensionsIncludeLabels)
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(animationEasing)) __obj.updateDynamic("animationEasing")(animationEasing)
    if (!js.isUndefined(avoidOverlap)) __obj.updateDynamic("avoidOverlap")(avoidOverlap)
    if (boundingBox != null) __obj.updateDynamic("boundingBox")(boundingBox.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (ready != null) __obj.updateDynamic("ready")(js.Any.fromFunction1(ready))
    if (roots != null) __obj.updateDynamic("roots")(roots)
    if (sort != null) __obj.updateDynamic("sort")(js.Any.fromFunction2(sort))
    if (spacingFactor != null) __obj.updateDynamic("spacingFactor")(spacingFactor.asInstanceOf[js.Any])
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction1(stop))
    __obj.asInstanceOf[BreadthFirstLayoutOptions]
  }
}

