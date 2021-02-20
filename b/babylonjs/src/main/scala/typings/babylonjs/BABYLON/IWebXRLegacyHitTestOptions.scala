package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWebXRLegacyHitTestOptions extends StObject {
  
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
  implicit class IWebXRLegacyHitTestOptionsMutableBuilder[Self <: IWebXRLegacyHitTestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTestOnPointerDownOnly(value: Boolean): Self = StObject.set(x, "testOnPointerDownOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestOnPointerDownOnlyUndefined: Self = StObject.set(x, "testOnPointerDownOnly", js.undefined)
    
    @scala.inline
    def setWorldParentNode(value: TransformNode): Self = StObject.set(x, "worldParentNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorldParentNodeUndefined: Self = StObject.set(x, "worldParentNode", js.undefined)
  }
}
