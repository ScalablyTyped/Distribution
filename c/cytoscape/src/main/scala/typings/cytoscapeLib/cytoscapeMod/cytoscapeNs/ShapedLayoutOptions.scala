package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ShapedLayoutOptions
  extends BaseLayoutOptions
     with AnimatedLayoutOptions {
  // prevents node overlap, may overflow boundingBox if not enough space
  var avoidOverlap: js.UndefOr[scala.Boolean] = js.undefined
  // constrain layout bounds
  var boundingBox: js.UndefOr[BoundingBox12 | BoundingBoxWH] = js.undefined
  // whether to fit to viewport
  var fit: scala.Boolean
  // Excludes the label when calculating node bounding boxes for the layout algorithm
  var nodeDimensionsIncludeLabels: scala.Boolean
  // padding used on fit
  var padding: js.UndefOr[scala.Double] = js.undefined
  // a sorting function to order the nodes
  var sort: js.UndefOr[SortingFunction] = js.undefined
  // Applies a multiplicative factor (>0) to expand or compress the overall area that the nodes take up
  var spacingFactor: js.UndefOr[scala.Double] = js.undefined
}

