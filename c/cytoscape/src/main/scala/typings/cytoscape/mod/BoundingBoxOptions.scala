package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoundingBoxOptions extends js.Object {
  
  /** A boolean indicating whether to include edges in the bounding box (default true). */
  var includeEdges: js.UndefOr[Boolean] = js.native
  
  /** A boolean indicating whether to include labels in the bounding box (default true). */
  var includeLabels: js.UndefOr[Boolean] = js.native
  
  /** A boolean indicating whether to include main (node or edge) labels in the bounding box (default true). */
  var includeMainLabels: js.UndefOr[Boolean] = js.native
  
  /** A boolean indicating whether to include nodes in the bounding box (default true). */
  var includeNodes: js.UndefOr[Boolean] = js.native
  
  /** A boolean indicating whether to include overlays (such as the one which appears when a node is clicked) in the bounding box (default true). */
  var includeOverlays: js.UndefOr[Boolean] = js.native
  
  /** A boolean indicating whether to include (edge) source-labels in the bounding box (default true). */
  var includeSourceLabels: js.UndefOr[Boolean] = js.native
  
  /** A boolean indicating whether to include (edge) target-labels in the bounding box (default true). */
  var includeTargetLabels: js.UndefOr[Boolean] = js.native
}
object BoundingBoxOptions {
  
  @scala.inline
  def apply(): BoundingBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoundingBoxOptions]
  }
  
  @scala.inline
  implicit class BoundingBoxOptionsOps[Self <: BoundingBoxOptions] (val x: Self) extends AnyVal {
    
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
    def setIncludeEdges(value: Boolean): Self = this.set("includeEdges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeEdges: Self = this.set("includeEdges", js.undefined)
    
    @scala.inline
    def setIncludeLabels(value: Boolean): Self = this.set("includeLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeLabels: Self = this.set("includeLabels", js.undefined)
    
    @scala.inline
    def setIncludeMainLabels(value: Boolean): Self = this.set("includeMainLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeMainLabels: Self = this.set("includeMainLabels", js.undefined)
    
    @scala.inline
    def setIncludeNodes(value: Boolean): Self = this.set("includeNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeNodes: Self = this.set("includeNodes", js.undefined)
    
    @scala.inline
    def setIncludeOverlays(value: Boolean): Self = this.set("includeOverlays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeOverlays: Self = this.set("includeOverlays", js.undefined)
    
    @scala.inline
    def setIncludeSourceLabels(value: Boolean): Self = this.set("includeSourceLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeSourceLabels: Self = this.set("includeSourceLabels", js.undefined)
    
    @scala.inline
    def setIncludeTargetLabels(value: Boolean): Self = this.set("includeTargetLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeTargetLabels: Self = this.set("includeTargetLabels", js.undefined)
  }
}
