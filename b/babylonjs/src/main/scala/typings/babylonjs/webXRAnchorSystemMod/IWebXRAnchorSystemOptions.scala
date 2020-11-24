package typings.babylonjs.webXRAnchorSystemMod

import typings.babylonjs.transformNodeMod.TransformNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWebXRAnchorSystemOptions extends js.Object {
  
  /**
    * If set to true a reference of the created anchors will be kept until the next session starts
    * If not defined, anchors will be removed from the array when the feature is detached or the session ended.
    */
  var doNotRemoveAnchorsOnSessionEnded: js.UndefOr[Boolean] = js.native
  
  /**
    * a node that will be used to convert local to world coordinates
    */
  var worldParentNode: js.UndefOr[TransformNode] = js.native
}
object IWebXRAnchorSystemOptions {
  
  @scala.inline
  def apply(): IWebXRAnchorSystemOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWebXRAnchorSystemOptions]
  }
  
  @scala.inline
  implicit class IWebXRAnchorSystemOptionsOps[Self <: IWebXRAnchorSystemOptions] (val x: Self) extends AnyVal {
    
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
    def setDoNotRemoveAnchorsOnSessionEnded(value: Boolean): Self = this.set("doNotRemoveAnchorsOnSessionEnded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoNotRemoveAnchorsOnSessionEnded: Self = this.set("doNotRemoveAnchorsOnSessionEnded", js.undefined)
    
    @scala.inline
    def setWorldParentNode(value: TransformNode): Self = this.set("worldParentNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorldParentNode: Self = this.set("worldParentNode", js.undefined)
  }
}
