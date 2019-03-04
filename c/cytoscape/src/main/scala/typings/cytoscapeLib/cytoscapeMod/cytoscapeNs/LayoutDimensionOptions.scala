package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#collection/layout
  */
trait LayoutDimensionOptions extends js.Object {
  // Boolean which changes whether label dimensions are included when calculating node dimensions
  var nodeDimensionsIncludeLabels: scala.Boolean
}

object LayoutDimensionOptions {
  @scala.inline
  def apply(nodeDimensionsIncludeLabels: scala.Boolean): LayoutDimensionOptions = {
    val __obj = js.Dynamic.literal(nodeDimensionsIncludeLabels = nodeDimensionsIncludeLabels)
  
    __obj.asInstanceOf[LayoutDimensionOptions]
  }
}

