package typings.babylonjs.webXRPlaneDetectorMod

import typings.babylonjs.transformNodeMod.TransformNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWebXRPlaneDetectorOptions extends js.Object {
  
  /**
    * If set to true a reference of the created planes will be kept until the next session starts
    * If not defined, planes will be removed from the array when the feature is detached or the session ended.
    */
  var doNotRemovePlanesOnSessionEnded: js.UndefOr[Boolean] = js.native
  
  /**
    * The node to use to transform the local results to world coordinates
    */
  var worldParentNode: js.UndefOr[TransformNode] = js.native
}
object IWebXRPlaneDetectorOptions {
  
  @scala.inline
  def apply(): IWebXRPlaneDetectorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWebXRPlaneDetectorOptions]
  }
  
  @scala.inline
  implicit class IWebXRPlaneDetectorOptionsOps[Self <: IWebXRPlaneDetectorOptions] (val x: Self) extends AnyVal {
    
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
    def setDoNotRemovePlanesOnSessionEnded(value: Boolean): Self = this.set("doNotRemovePlanesOnSessionEnded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoNotRemovePlanesOnSessionEnded: Self = this.set("doNotRemovePlanesOnSessionEnded", js.undefined)
    
    @scala.inline
    def setWorldParentNode(value: TransformNode): Self = this.set("worldParentNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorldParentNode: Self = this.set("worldParentNode", js.undefined)
  }
}
