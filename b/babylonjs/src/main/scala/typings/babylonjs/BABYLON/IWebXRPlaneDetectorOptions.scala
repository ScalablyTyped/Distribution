package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWebXRPlaneDetectorOptions extends StObject {
  
  /**
    * If set to true a reference of the created planes will be kept until the next session starts
    * If not defined, planes will be removed from the array when the feature is detached or the session ended.
    */
  var doNotRemovePlanesOnSessionEnded: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The node to use to transform the local results to world coordinates
    */
  var worldParentNode: js.UndefOr[TransformNode] = js.undefined
}
object IWebXRPlaneDetectorOptions {
  
  inline def apply(): IWebXRPlaneDetectorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWebXRPlaneDetectorOptions]
  }
  
  extension [Self <: IWebXRPlaneDetectorOptions](x: Self) {
    
    inline def setDoNotRemovePlanesOnSessionEnded(value: Boolean): Self = StObject.set(x, "doNotRemovePlanesOnSessionEnded", value.asInstanceOf[js.Any])
    
    inline def setDoNotRemovePlanesOnSessionEndedUndefined: Self = StObject.set(x, "doNotRemovePlanesOnSessionEnded", js.undefined)
    
    inline def setWorldParentNode(value: TransformNode): Self = StObject.set(x, "worldParentNode", value.asInstanceOf[js.Any])
    
    inline def setWorldParentNodeUndefined: Self = StObject.set(x, "worldParentNode", js.undefined)
  }
}
