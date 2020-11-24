package typings.babylonjs.prePassRendererSceneComponentMod

import typings.babylonjs.sceneComponentMod.ISceneComponent
import typings.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Rendering/prePassRendererSceneComponent", "PrePassRendererSceneComponent")
@js.native
class PrePassRendererSceneComponent protected () extends ISceneComponent {
  /**
    * Creates a new instance of the component for the given scene
    * @param scene Defines the scene to register the component in
    */
  def this(scene: Scene) = this()
  
  var _afterCameraDraw: js.Any = js.native
  
  var _afterRenderingMeshStage: js.Any = js.native
  
  var _beforeCameraDraw: js.Any = js.native
  
  var _beforeClearStage: js.Any = js.native
  
  var _beforeRenderingMeshStage: js.Any = js.native
}
