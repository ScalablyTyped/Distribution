package typings.babylonjs.boundingBoxRendererMod.babylonjsSceneAugmentingMod

import typings.babylonjs.boundingBoxRendererMod.BoundingBoxRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scene extends js.Object {
  
  /** @hidden (Backing field) */
  var _boundingBoxRenderer: BoundingBoxRenderer = js.native
  
  /** @hidden (Backing field) */
  var _forceShowBoundingBoxes: Boolean = js.native
  
  /**
    * Gets or sets a boolean indicating if all bounding boxes must be rendered
    */
  var forceShowBoundingBoxes: Boolean = js.native
  
  /**
    * Gets the bounding box renderer associated with the scene
    * @returns a BoundingBoxRenderer
    */
  def getBoundingBoxRenderer(): BoundingBoxRenderer = js.native
}
object Scene {
  
  @scala.inline
  def apply(
    _boundingBoxRenderer: BoundingBoxRenderer,
    _forceShowBoundingBoxes: Boolean,
    forceShowBoundingBoxes: Boolean,
    getBoundingBoxRenderer: () => BoundingBoxRenderer
  ): Scene = {
    val __obj = js.Dynamic.literal(_boundingBoxRenderer = _boundingBoxRenderer.asInstanceOf[js.Any], _forceShowBoundingBoxes = _forceShowBoundingBoxes.asInstanceOf[js.Any], forceShowBoundingBoxes = forceShowBoundingBoxes.asInstanceOf[js.Any], getBoundingBoxRenderer = js.Any.fromFunction0(getBoundingBoxRenderer))
    __obj.asInstanceOf[Scene]
  }
  
  @scala.inline
  implicit class SceneOps[Self <: Scene] (val x: Self) extends AnyVal {
    
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
    def set_boundingBoxRenderer(value: BoundingBoxRenderer): Self = this.set("_boundingBoxRenderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_forceShowBoundingBoxes(value: Boolean): Self = this.set("_forceShowBoundingBoxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceShowBoundingBoxes(value: Boolean): Self = this.set("forceShowBoundingBoxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetBoundingBoxRenderer(value: () => BoundingBoxRenderer): Self = this.set("getBoundingBoxRenderer", js.Any.fromFunction0(value))
  }
}
