package typings.babylonjs.BABYLON.Debug

import typings.babylonjs.BABYLON.Bone
import typings.babylonjs.BABYLON.Mesh
import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.BABYLON.Scene
import typings.babylonjs.BABYLON.TransformNode
import typings.babylonjs.BABYLON.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoneAxesViewer extends AxesViewer {
  /**
    * Gets or sets the target bone where to display the axes viewer
    */
  var bone: Nullable[Bone]
  /**
    * Gets or sets the target mesh where to display the axes viewer
    */
  var mesh: Nullable[Mesh]
  /** Gets current position */
  var pos: Vector3
  /** Gets direction of X axis */
  var xaxis: Vector3
  /** Gets direction of Y axis */
  var yaxis: Vector3
  /** Gets direction of Z axis */
  var zaxis: Vector3
  /**
    * Force the viewer to update
    */
  def update(): Unit
}

object BoneAxesViewer {
  @scala.inline
  def apply(
    _instanced: js.Any,
    _scaleLinesFactor: js.Any,
    _xAxis: js.Any,
    _yAxis: js.Any,
    _zAxis: js.Any,
    createInstance: () => AxesViewer,
    dispose: () => Unit,
    pos: Vector3,
    scaleLines: Double,
    scene: Scene,
    update: () => Unit,
    xAxis: () => TransformNode,
    xaxis: Vector3,
    yAxis: () => TransformNode,
    yaxis: Vector3,
    zAxis: () => TransformNode,
    zaxis: Vector3,
    bone: Nullable[Bone] = null,
    mesh: Nullable[Mesh] = null
  ): BoneAxesViewer = {
    val __obj = js.Dynamic.literal(_instanced = _instanced.asInstanceOf[js.Any], _scaleLinesFactor = _scaleLinesFactor.asInstanceOf[js.Any], _xAxis = _xAxis.asInstanceOf[js.Any], _yAxis = _yAxis.asInstanceOf[js.Any], _zAxis = _zAxis.asInstanceOf[js.Any], createInstance = js.Any.fromFunction0(createInstance), dispose = js.Any.fromFunction0(dispose), pos = pos.asInstanceOf[js.Any], scaleLines = scaleLines.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], update = js.Any.fromFunction0(update), xAxis = js.Any.fromFunction0(xAxis), xaxis = xaxis.asInstanceOf[js.Any], yAxis = js.Any.fromFunction0(yAxis), yaxis = yaxis.asInstanceOf[js.Any], zAxis = js.Any.fromFunction0(zAxis), zaxis = zaxis.asInstanceOf[js.Any], bone = bone.asInstanceOf[js.Any], mesh = mesh.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoneAxesViewer]
  }
}

