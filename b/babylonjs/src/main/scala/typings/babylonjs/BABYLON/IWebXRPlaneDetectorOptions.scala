package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWebXRPlaneDetectorOptions extends StObject {
  
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
  implicit class IWebXRPlaneDetectorOptionsMutableBuilder[Self <: IWebXRPlaneDetectorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDoNotRemovePlanesOnSessionEnded(value: Boolean): Self = StObject.set(x, "doNotRemovePlanesOnSessionEnded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoNotRemovePlanesOnSessionEndedUndefined: Self = StObject.set(x, "doNotRemovePlanesOnSessionEnded", js.undefined)
    
    @scala.inline
    def setWorldParentNode(value: TransformNode): Self = StObject.set(x, "worldParentNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorldParentNodeUndefined: Self = StObject.set(x, "worldParentNode", js.undefined)
  }
}
