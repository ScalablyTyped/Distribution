package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderingGroupInfo extends js.Object {
  
  /**
    * The camera currently used for the rendering pass
    */
  var camera: Nullable[Camera] = js.native
  
  /**
    * The ID of the renderingGroup being processed
    */
  var renderingGroupId: Double = js.native
  
  /**
    * The Scene that being rendered
    */
  var scene: Scene = js.native
}
object RenderingGroupInfo {
  
  @scala.inline
  def apply(renderingGroupId: Double, scene: Scene): RenderingGroupInfo = {
    val __obj = js.Dynamic.literal(renderingGroupId = renderingGroupId.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderingGroupInfo]
  }
  
  @scala.inline
  implicit class RenderingGroupInfoOps[Self <: RenderingGroupInfo] (val x: Self) extends AnyVal {
    
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
    def setRenderingGroupId(value: Double): Self = this.set("renderingGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScene(value: Scene): Self = this.set("scene", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCamera(value: Nullable[Camera]): Self = this.set("camera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCameraNull: Self = this.set("camera", null)
  }
}
