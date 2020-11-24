package typings.babylonjs.geometryBufferRendererSceneComponentMod

import typings.babylonjs.sceneComponentMod.ISceneComponent
import typings.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Rendering/geometryBufferRendererSceneComponent", "GeometryBufferRendererSceneComponent")
@js.native
class GeometryBufferRendererSceneComponent protected () extends ISceneComponent {
  /**
    * Creates a new instance of the component for the given scene
    * @param scene Defines the scene to register the component in
    */
  def this(scene: Scene) = this()
  
  var _gatherRenderTargets: js.Any = js.native
}
