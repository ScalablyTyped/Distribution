package typings.babylonjs.effectLayerSceneComponentMod

import typings.babylonjs.sceneComponentMod.ISceneSerializableComponent
import typings.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Layers/effectLayerSceneComponent", "EffectLayerSceneComponent")
@js.native
class EffectLayerSceneComponent protected () extends ISceneSerializableComponent {
  /**
    * Creates a new instance of the component for the given scene
    * @param scene Defines the scene to register the component in
    */
  def this(scene: Scene) = this()
  
  var _draw: js.Any = js.native
  
  var _drawCamera: js.Any = js.native
  
  var _drawRenderingGroup: js.Any = js.native
  
  var _engine: js.Any = js.native
  
  var _isReadyForMesh: js.Any = js.native
  
  var _needStencil: js.Any = js.native
  
  var _previousStencilState: js.Any = js.native
  
  var _renderEffects: js.Any = js.native
  
  var _renderMainTexture: js.Any = js.native
  
  var _setStencil: js.Any = js.native
  
  var _setStencilBack: js.Any = js.native
}
