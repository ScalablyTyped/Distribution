package typings.babylonjs.highlightLayerMod.babylonjsAbstractSceneAugmentingMod

import typings.babylonjs.highlightLayerMod.HighlightLayer
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbstractScene extends js.Object {
  
  /**
    * Return a the first highlight layer of the scene with a given name.
    * @param name The name of the highlight layer to look for.
    * @return The highlight layer if found otherwise null.
    */
  def getHighlightLayerByName(name: String): Nullable[HighlightLayer] = js.native
}
object AbstractScene {
  
  @scala.inline
  def apply(getHighlightLayerByName: String => Nullable[HighlightLayer]): AbstractScene = {
    val __obj = js.Dynamic.literal(getHighlightLayerByName = js.Any.fromFunction1(getHighlightLayerByName))
    __obj.asInstanceOf[AbstractScene]
  }
  
  @scala.inline
  implicit class AbstractSceneOps[Self <: AbstractScene] (val x: Self) extends AnyVal {
    
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
    def setGetHighlightLayerByName(value: String => Nullable[HighlightLayer]): Self = this.set("getHighlightLayerByName", js.Any.fromFunction1(value))
  }
}
