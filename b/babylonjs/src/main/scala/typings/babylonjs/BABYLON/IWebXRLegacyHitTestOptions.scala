package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWebXRLegacyHitTestOptions extends js.Object {
  
  /**
    * Only test when user interacted with the scene. Default - hit test every frame
    */
  var testOnPointerDownOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * The node to use to transform the local results to world coordinates
    */
  var worldParentNode: js.UndefOr[TransformNode] = js.native
}
object IWebXRLegacyHitTestOptions {
  
  @scala.inline
  def apply(): IWebXRLegacyHitTestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWebXRLegacyHitTestOptions]
  }
  
  @scala.inline
  implicit class IWebXRLegacyHitTestOptionsOps[Self <: IWebXRLegacyHitTestOptions] (val x: Self) extends AnyVal {
    
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
    def setTestOnPointerDownOnly(value: Boolean): Self = this.set("testOnPointerDownOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestOnPointerDownOnly: Self = this.set("testOnPointerDownOnly", js.undefined)
    
    @scala.inline
    def setWorldParentNode(value: TransformNode): Self = this.set("worldParentNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorldParentNode: Self = this.set("worldParentNode", js.undefined)
  }
}
