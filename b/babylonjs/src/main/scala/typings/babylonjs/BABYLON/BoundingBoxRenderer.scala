package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.BoundingBoxRenderer")
@js.native
class BoundingBoxRenderer protected () extends ISceneComponent {
  /**
    * Instantiates a new bounding box renderer in a scene.
    * @param scene the scene the  renderer renders in
    */
  def this(scene: Scene) = this()
  var _activeMesh: js.Any = js.native
  var _colorShader: js.Any = js.native
  var _createIndexBuffer: js.Any = js.native
  var _evaluateSubMesh: js.Any = js.native
  var _fillIndexBuffer: js.Any = js.native
  var _fillIndexData: js.Any = js.native
  var _indexBuffer: js.Any = js.native
  var _prepareRessources: js.Any = js.native
  var _vertexBuffers: js.Any = js.native
  /**
    * Color of the bounding box lines placed behind an object
    */
  var backColor: Color3 = js.native
  /**
    * Color of the bounding box lines placed in front of an object
    */
  var frontColor: Color3 = js.native
  /**
    * The name of the component. Each component must have a unique name.
    */
  /* CompleteClass */
  override var name: String = js.native
  /**
    * @hidden
    */
  var renderList: SmartArray[BoundingBox] = js.native
  /**
    * The scene the component belongs to.
    */
  /* CompleteClass */
  override var scene: Scene = js.native
  /**
    * Defines if the renderer should show the back lines or not
    */
  var showBackLines: Boolean = js.native
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
  /**
    * Render the bounding boxes of a specific rendering group
    * @param renderingGroupId defines the rendering group to render
    */
  def render(renderingGroupId: Double): Unit = js.native
  /**
    * In case of occlusion queries, we can render the occlusion bounding box through this method
    * @param mesh Define the mesh to render the occlusion bounding box for
    */
  def renderOcclusionBoundingBox(mesh: AbstractMesh): Unit = js.native
  /**
    * @hidden
    */
  def reset(): Unit = js.native
}

