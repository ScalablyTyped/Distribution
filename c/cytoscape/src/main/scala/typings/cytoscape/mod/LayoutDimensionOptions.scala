package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#collection/layout
  */
trait LayoutDimensionOptions extends StObject {
  
  // Boolean which changes whether label dimensions are included when calculating node dimensions
  var nodeDimensionsIncludeLabels: Boolean
}
object LayoutDimensionOptions {
  
  @scala.inline
  def apply(nodeDimensionsIncludeLabels: Boolean): LayoutDimensionOptions = {
    val __obj = js.Dynamic.literal(nodeDimensionsIncludeLabels = nodeDimensionsIncludeLabels.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutDimensionOptions]
  }
  
  @scala.inline
  implicit class LayoutDimensionOptionsMutableBuilder[Self <: LayoutDimensionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodeDimensionsIncludeLabels(value: Boolean): Self = StObject.set(x, "nodeDimensionsIncludeLabels", value.asInstanceOf[js.Any])
  }
}
