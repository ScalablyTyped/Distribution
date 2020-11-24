package typings.babylonjs.prePassRendererSceneComponentMod.babylonjsAbstractSceneAugmentingMod

import typings.babylonjs.prePassRendererMod.PrePassRenderer
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbstractScene extends js.Object {
  
  /** @hidden (Backing field) */
  var _prePassRenderer: Nullable[PrePassRenderer] = js.native
  
  /**
    * Disables the prepass associated with the scene
    */
  def disablePrePassRenderer(): Unit = js.native
  
  /**
    * Enables the prepass and associates it with the scene
    * @returns the PrePassRenderer
    */
  def enablePrePassRenderer(): Nullable[PrePassRenderer] = js.native
  
  /**
    * Gets or Sets the current prepass renderer associated to the scene.
    */
  var prePassRenderer: Nullable[PrePassRenderer] = js.native
}
object AbstractScene {
  
  @scala.inline
  def apply(disablePrePassRenderer: () => Unit, enablePrePassRenderer: () => Nullable[PrePassRenderer]): AbstractScene = {
    val __obj = js.Dynamic.literal(disablePrePassRenderer = js.Any.fromFunction0(disablePrePassRenderer), enablePrePassRenderer = js.Any.fromFunction0(enablePrePassRenderer))
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
    def setDisablePrePassRenderer(value: () => Unit): Self = this.set("disablePrePassRenderer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnablePrePassRenderer(value: () => Nullable[PrePassRenderer]): Self = this.set("enablePrePassRenderer", js.Any.fromFunction0(value))
    
    @scala.inline
    def set_prePassRenderer(value: Nullable[PrePassRenderer]): Self = this.set("_prePassRenderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_prePassRendererNull: Self = this.set("_prePassRenderer", null)
    
    @scala.inline
    def setPrePassRenderer(value: Nullable[PrePassRenderer]): Self = this.set("prePassRenderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrePassRendererNull: Self = this.set("prePassRenderer", null)
  }
}
