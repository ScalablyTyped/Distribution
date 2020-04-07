package typings.babylonjs.outlineRendererMod.babylonjsSceneAugmentingMod

import typings.babylonjs.outlineRendererMod.OutlineRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scene extends js.Object {
  /** @hidden */
  var _outlineRenderer: OutlineRenderer
  /**
    * Gets the outline renderer associated with the scene
    * @returns a OutlineRenderer
    */
  def getOutlineRenderer(): OutlineRenderer
}

object Scene {
  @scala.inline
  def apply(_outlineRenderer: OutlineRenderer, getOutlineRenderer: () => OutlineRenderer): Scene = {
    val __obj = js.Dynamic.literal(_outlineRenderer = _outlineRenderer.asInstanceOf[js.Any], getOutlineRenderer = js.Any.fromFunction0(getOutlineRenderer))
  
    __obj.asInstanceOf[Scene]
  }
}

