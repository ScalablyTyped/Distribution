package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#collection/layout
  */
@js.native
trait LayoutDimensionOptions extends js.Object {
  
  // Boolean which changes whether label dimensions are included when calculating node dimensions
  var nodeDimensionsIncludeLabels: Boolean = js.native
}
object LayoutDimensionOptions {
  
  @scala.inline
  def apply(nodeDimensionsIncludeLabels: Boolean): LayoutDimensionOptions = {
    val __obj = js.Dynamic.literal(nodeDimensionsIncludeLabels = nodeDimensionsIncludeLabels.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutDimensionOptions]
  }
  
  @scala.inline
  implicit class LayoutDimensionOptionsOps[Self <: LayoutDimensionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNodeDimensionsIncludeLabels(value: Boolean): Self = this.set("nodeDimensionsIncludeLabels", value.asInstanceOf[js.Any])
  }
}
