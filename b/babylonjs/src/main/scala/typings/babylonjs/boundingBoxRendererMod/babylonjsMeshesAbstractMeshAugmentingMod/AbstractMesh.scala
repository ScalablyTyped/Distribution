package typings.babylonjs.boundingBoxRendererMod.babylonjsMeshesAbstractMeshAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbstractMesh extends js.Object {
  
  /** @hidden (Backing field) */
  var _showBoundingBox: Boolean = js.native
  
  /**
    * Gets or sets a boolean indicating if the bounding box must be rendered as well (false by default)
    */
  var showBoundingBox: Boolean = js.native
}
object AbstractMesh {
  
  @scala.inline
  def apply(_showBoundingBox: Boolean, showBoundingBox: Boolean): AbstractMesh = {
    val __obj = js.Dynamic.literal(_showBoundingBox = _showBoundingBox.asInstanceOf[js.Any], showBoundingBox = showBoundingBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractMesh]
  }
  
  @scala.inline
  implicit class AbstractMeshOps[Self <: AbstractMesh] (val x: Self) extends AnyVal {
    
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
    def set_showBoundingBox(value: Boolean): Self = this.set("_showBoundingBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowBoundingBox(value: Boolean): Self = this.set("showBoundingBox", value.asInstanceOf[js.Any])
  }
}
