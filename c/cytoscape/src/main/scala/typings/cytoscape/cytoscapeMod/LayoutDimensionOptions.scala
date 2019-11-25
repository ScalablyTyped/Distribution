package typings.cytoscape.cytoscapeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#collection/layout
  */
trait LayoutDimensionOptions extends js.Object {
  // Boolean which changes whether label dimensions are included when calculating node dimensions
  var nodeDimensionsIncludeLabels: Boolean
}

object LayoutDimensionOptions {
  @scala.inline
  def apply(nodeDimensionsIncludeLabels: Boolean): LayoutDimensionOptions = {
    val __obj = js.Dynamic.literal(nodeDimensionsIncludeLabels = nodeDimensionsIncludeLabels.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LayoutDimensionOptions]
  }
}

