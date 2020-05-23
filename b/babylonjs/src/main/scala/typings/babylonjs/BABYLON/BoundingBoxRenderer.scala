package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoundingBoxRenderer extends ISceneComponent {
  var _activeMesh: js.Any
  var _colorShader: js.Any
  var _createIndexBuffer: js.Any
  var _evaluateSubMesh: js.Any
  var _fillIndexBuffer: js.Any
  var _fillIndexData: js.Any
  var _indexBuffer: js.Any
  var _prepareRessources: js.Any
  var _vertexBuffers: js.Any
  /**
    * Color of the bounding box lines placed behind an object
    */
  var backColor: Color3
  /**
    * Color of the bounding box lines placed in front of an object
    */
  var frontColor: Color3
  /**
    * @hidden
    */
  var renderList: SmartArray[BoundingBox]
  /**
    * Defines if the renderer should show the back lines or not
    */
  var showBackLines: Boolean
  /**
    * Render the bounding boxes of a specific rendering group
    * @param renderingGroupId defines the rendering group to render
    */
  def render(renderingGroupId: Double): Unit
  /**
    * In case of occlusion queries, we can render the occlusion bounding box through this method
    * @param mesh Define the mesh to render the occlusion bounding box for
    */
  def renderOcclusionBoundingBox(mesh: AbstractMesh): Unit
  /**
    * @hidden
    */
  def reset(): Unit
}

object BoundingBoxRenderer {
  @scala.inline
  def apply(
    _activeMesh: js.Any,
    _colorShader: js.Any,
    _createIndexBuffer: js.Any,
    _evaluateSubMesh: js.Any,
    _fillIndexBuffer: js.Any,
    _fillIndexData: js.Any,
    _indexBuffer: js.Any,
    _prepareRessources: js.Any,
    _vertexBuffers: js.Any,
    backColor: Color3,
    dispose: () => Unit,
    frontColor: Color3,
    name: String,
    rebuild: () => Unit,
    register: () => Unit,
    render: Double => Unit,
    renderList: SmartArray[BoundingBox],
    renderOcclusionBoundingBox: AbstractMesh => Unit,
    reset: () => Unit,
    scene: Scene,
    showBackLines: Boolean
  ): BoundingBoxRenderer = {
    val __obj = js.Dynamic.literal(_activeMesh = _activeMesh.asInstanceOf[js.Any], _colorShader = _colorShader.asInstanceOf[js.Any], _createIndexBuffer = _createIndexBuffer.asInstanceOf[js.Any], _evaluateSubMesh = _evaluateSubMesh.asInstanceOf[js.Any], _fillIndexBuffer = _fillIndexBuffer.asInstanceOf[js.Any], _fillIndexData = _fillIndexData.asInstanceOf[js.Any], _indexBuffer = _indexBuffer.asInstanceOf[js.Any], _prepareRessources = _prepareRessources.asInstanceOf[js.Any], _vertexBuffers = _vertexBuffers.asInstanceOf[js.Any], backColor = backColor.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), frontColor = frontColor.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rebuild = js.Any.fromFunction0(rebuild), register = js.Any.fromFunction0(register), render = js.Any.fromFunction1(render), renderList = renderList.asInstanceOf[js.Any], renderOcclusionBoundingBox = js.Any.fromFunction1(renderOcclusionBoundingBox), reset = js.Any.fromFunction0(reset), scene = scene.asInstanceOf[js.Any], showBackLines = showBackLines.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoundingBoxRenderer]
  }
}

