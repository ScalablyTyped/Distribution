package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWebXRAnchorSystemOptions extends StObject {
  
  /**
    * If set to true a reference of the created anchors will be kept until the next session starts
    * If not defined, anchors will be removed from the array when the feature is detached or the session ended.
    */
  var doNotRemoveAnchorsOnSessionEnded: js.UndefOr[Boolean] = js.undefined
  
  /**
    * a node that will be used to convert local to world coordinates
    */
  var worldParentNode: js.UndefOr[TransformNode] = js.undefined
}
object IWebXRAnchorSystemOptions {
  
  inline def apply(): IWebXRAnchorSystemOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWebXRAnchorSystemOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IWebXRAnchorSystemOptions] (val x: Self) extends AnyVal {
    
    inline def setDoNotRemoveAnchorsOnSessionEnded(value: Boolean): Self = StObject.set(x, "doNotRemoveAnchorsOnSessionEnded", value.asInstanceOf[js.Any])
    
    inline def setDoNotRemoveAnchorsOnSessionEndedUndefined: Self = StObject.set(x, "doNotRemoveAnchorsOnSessionEnded", js.undefined)
    
    inline def setWorldParentNode(value: TransformNode): Self = StObject.set(x, "worldParentNode", value.asInstanceOf[js.Any])
    
    inline def setWorldParentNodeUndefined: Self = StObject.set(x, "worldParentNode", js.undefined)
  }
}
