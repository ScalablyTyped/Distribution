package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Component responsible of rendering the bounding box of the meshes in a scene.
     * This is usually used through the mesh.showBoundingBox or the scene.forceShowBoundingBoxes properties
     */
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
  override var name: java.lang.String = js.native
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
  var showBackLines: scala.Boolean = js.native
  /**
           * Disposes the component and the associated ressources.
           */
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
  /**
           * Rebuilds the elements related to this component in case of
           * context lost for instance.
           */
  /* CompleteClass */
  override def rebuild(): scala.Unit = js.native
  /**
           * Register the component to one instance of a scene.
           */
  /* CompleteClass */
  override def register(): scala.Unit = js.native
  /**
           * Render the bounding boxes of a specific rendering group
           * @param renderingGroupId defines the rendering group to render
           */
  def render(renderingGroupId: scala.Double): scala.Unit = js.native
  /**
           * In case of occlusion queries, we can render the occlusion bounding box through this method
           * @param mesh Define the mesh to render the occlusion bounding box for
           */
  def renderOcclusionBoundingBox(mesh: AbstractMesh): scala.Unit = js.native
  /**
           * @hidden
           */
  def reset(): scala.Unit = js.native
}

