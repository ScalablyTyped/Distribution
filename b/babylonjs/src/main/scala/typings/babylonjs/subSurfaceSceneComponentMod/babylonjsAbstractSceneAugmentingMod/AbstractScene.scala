package typings.babylonjs.subSurfaceSceneComponentMod.babylonjsAbstractSceneAugmentingMod

import typings.babylonjs.subSurfaceConfigurationMod.SubSurfaceConfiguration
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbstractScene extends js.Object {
  
  /** @hidden (Backing field) */
  var _subSurfaceConfiguration: Nullable[SubSurfaceConfiguration] = js.native
  
  /**
    * Disables the subsurface effect for prepass
    */
  def disableSubSurfaceForPrePass(): Unit = js.native
  
  /**
    * Enables the subsurface effect for prepass
    * @returns the SubSurfaceConfiguration
    */
  def enableSubSurfaceForPrePass(): Nullable[SubSurfaceConfiguration] = js.native
  
  /**
    * Gets or Sets the current prepass renderer associated to the scene.
    */
  var subSurfaceConfiguration: Nullable[SubSurfaceConfiguration] = js.native
}
object AbstractScene {
  
  @scala.inline
  def apply(
    disableSubSurfaceForPrePass: () => Unit,
    enableSubSurfaceForPrePass: () => Nullable[SubSurfaceConfiguration]
  ): AbstractScene = {
    val __obj = js.Dynamic.literal(disableSubSurfaceForPrePass = js.Any.fromFunction0(disableSubSurfaceForPrePass), enableSubSurfaceForPrePass = js.Any.fromFunction0(enableSubSurfaceForPrePass))
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
    def setDisableSubSurfaceForPrePass(value: () => Unit): Self = this.set("disableSubSurfaceForPrePass", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnableSubSurfaceForPrePass(value: () => Nullable[SubSurfaceConfiguration]): Self = this.set("enableSubSurfaceForPrePass", js.Any.fromFunction0(value))
    
    @scala.inline
    def set_subSurfaceConfiguration(value: Nullable[SubSurfaceConfiguration]): Self = this.set("_subSurfaceConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_subSurfaceConfigurationNull: Self = this.set("_subSurfaceConfiguration", null)
    
    @scala.inline
    def setSubSurfaceConfiguration(value: Nullable[SubSurfaceConfiguration]): Self = this.set("subSurfaceConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubSurfaceConfigurationNull: Self = this.set("subSurfaceConfiguration", null)
  }
}
