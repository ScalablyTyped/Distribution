package typings.babylonjs.outlineRendererMod.babylonjsMeshesAbstractMeshAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbstractMesh extends js.Object {
  
  /** @hidden (Backing field) */
  var _renderOutline: Boolean = js.native
  
  /** @hidden (Backing field) */
  var _renderOverlay: Boolean = js.native
  
  /**
    * Gets or sets a boolean indicating if the outline must be rendered as well
    * @see https://www.babylonjs-playground.com/#10WJ5S#3
    */
  var renderOutline: Boolean = js.native
  
  /**
    * Gets or sets a boolean indicating if the overlay must be rendered as well
    * @see https://www.babylonjs-playground.com/#10WJ5S#2
    */
  var renderOverlay: Boolean = js.native
}
object AbstractMesh {
  
  @scala.inline
  def apply(_renderOutline: Boolean, _renderOverlay: Boolean, renderOutline: Boolean, renderOverlay: Boolean): AbstractMesh = {
    val __obj = js.Dynamic.literal(_renderOutline = _renderOutline.asInstanceOf[js.Any], _renderOverlay = _renderOverlay.asInstanceOf[js.Any], renderOutline = renderOutline.asInstanceOf[js.Any], renderOverlay = renderOverlay.asInstanceOf[js.Any])
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
    def set_renderOutline(value: Boolean): Self = this.set("_renderOutline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_renderOverlay(value: Boolean): Self = this.set("_renderOverlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderOutline(value: Boolean): Self = this.set("renderOutline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderOverlay(value: Boolean): Self = this.set("renderOverlay", value.asInstanceOf[js.Any])
  }
}
