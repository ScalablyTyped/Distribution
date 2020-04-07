package typings.babylonjs.effectLayerSceneComponentMod

import typings.babylonjs.sceneComponentMod.ISceneSerializableComponent
import typings.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  /**
    * The name of the component. Each component must have a unique name.
    */
  /* CompleteClass */
  override var name: String = js.native
  /**
    * The scene the component belongs to.
    */
  /* CompleteClass */
  override var scene: Scene = js.native
  /**
    * Disposes the component and the associated ressources.
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  /**
    * Rebuilds the elements related to this component in case of
    * context lost for instance.
    */
  /* CompleteClass */
  override def rebuild(): Unit = js.native
  /**
    * Register the component to one instance of a scene.
    */
  /* CompleteClass */
  override def register(): Unit = js.native
}

