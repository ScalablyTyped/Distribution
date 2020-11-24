package typings.cesium.anon

import typings.cesium.mod.Matrix4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlendOption extends js.Object {
  
  var blendOption: js.UndefOr[typings.cesium.mod.BlendOption] = js.native
  
  var debugShowBoundingVolume: js.UndefOr[Boolean] = js.native
  
  var modelMatrix: js.UndefOr[Matrix4] = js.native
  
  var scene: js.UndefOr[typings.cesium.mod.Scene] = js.native
}
object BlendOption {
  
  @scala.inline
  def apply(): BlendOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlendOption]
  }
  
  @scala.inline
  implicit class BlendOptionOps[Self <: BlendOption] (val x: Self) extends AnyVal {
    
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
    def setBlendOption(value: typings.cesium.mod.BlendOption): Self = this.set("blendOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlendOption: Self = this.set("blendOption", js.undefined)
    
    @scala.inline
    def setDebugShowBoundingVolume(value: Boolean): Self = this.set("debugShowBoundingVolume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebugShowBoundingVolume: Self = this.set("debugShowBoundingVolume", js.undefined)
    
    @scala.inline
    def setModelMatrix(value: Matrix4): Self = this.set("modelMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModelMatrix: Self = this.set("modelMatrix", js.undefined)
    
    @scala.inline
    def setScene(value: typings.cesium.mod.Scene): Self = this.set("scene", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScene: Self = this.set("scene", js.undefined)
  }
}
