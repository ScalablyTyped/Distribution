package typings.babylonjs.depthRendererSceneComponentMod

import typings.babylonjs.sceneComponentMod.ISceneComponent
import typings.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Rendering/depthRendererSceneComponent", "DepthRendererSceneComponent")
@js.native
class DepthRendererSceneComponent protected () extends ISceneComponent {
  /**
    * Creates a new instance of the component for the given scene
    * @param scene Defines the scene to register the component in
    */
  def this(scene: Scene) = this()
  
  var _gatherActiveCameraRenderTargets: js.Any = js.native
  
  var _gatherRenderTargets: js.Any = js.native
}
