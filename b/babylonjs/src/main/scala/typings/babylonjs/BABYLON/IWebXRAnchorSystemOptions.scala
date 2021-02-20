package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWebXRAnchorSystemOptions extends StObject {
  
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
  implicit class IWebXRAnchorSystemOptionsMutableBuilder[Self <: IWebXRAnchorSystemOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDoNotRemoveAnchorsOnSessionEnded(value: Boolean): Self = StObject.set(x, "doNotRemoveAnchorsOnSessionEnded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoNotRemoveAnchorsOnSessionEndedUndefined: Self = StObject.set(x, "doNotRemoveAnchorsOnSessionEnded", js.undefined)
    
    @scala.inline
    def setWorldParentNode(value: TransformNode): Self = StObject.set(x, "worldParentNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorldParentNodeUndefined: Self = StObject.set(x, "worldParentNode", js.undefined)
  }
}
