package typings.babylonjs.BABYLON.Debug

import typings.babylonjs.BABYLON.Scene
import typings.babylonjs.BABYLON.TransformNode
import typings.babylonjs.BABYLON.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxesViewer extends js.Object {
  var _instanced: js.Any
  var _scaleLinesFactor: js.Any
  var _xAxis: js.Any
  var _yAxis: js.Any
  var _zAxis: js.Any
  /**
    * Gets or sets a number used to scale line length
    */
  var scaleLines: Double
  /**
    * Gets the hosting scene
    */
  var scene: Scene
  /**
    * Creates an instance of this axes viewer.
    * @returns a new axes viewer with instanced meshes
    */
  def createInstance(): AxesViewer
  /** Releases resources */
  def dispose(): Unit
  /**
    * Force the viewer to update
    * @param position defines the position of the viewer
    * @param xaxis defines the x axis of the viewer
    * @param yaxis defines the y axis of the viewer
    * @param zaxis defines the z axis of the viewer
    */
  def update(position: Vector3, xaxis: Vector3, yaxis: Vector3, zaxis: Vector3): Unit
  /** Gets the node hierarchy used to render x-axis */
  def xAxis: TransformNode
  /** Gets the node hierarchy used to render y-axis */
  def yAxis: TransformNode
  /** Gets the node hierarchy used to render z-axis */
  def zAxis: TransformNode
}

object AxesViewer {
  @scala.inline
  def apply(
    _instanced: js.Any,
    _scaleLinesFactor: js.Any,
    _xAxis: js.Any,
    _yAxis: js.Any,
    _zAxis: js.Any,
    createInstance: () => AxesViewer,
    dispose: () => Unit,
    scaleLines: Double,
    scene: Scene,
    update: (Vector3, Vector3, Vector3, Vector3) => Unit,
    xAxis: () => TransformNode,
    yAxis: () => TransformNode,
    zAxis: () => TransformNode
  ): AxesViewer = {
    val __obj = js.Dynamic.literal(_instanced = _instanced.asInstanceOf[js.Any], _scaleLinesFactor = _scaleLinesFactor.asInstanceOf[js.Any], _xAxis = _xAxis.asInstanceOf[js.Any], _yAxis = _yAxis.asInstanceOf[js.Any], _zAxis = _zAxis.asInstanceOf[js.Any], createInstance = js.Any.fromFunction0(createInstance), dispose = js.Any.fromFunction0(dispose), scaleLines = scaleLines.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], update = js.Any.fromFunction4(update), xAxis = js.Any.fromFunction0(xAxis), yAxis = js.Any.fromFunction0(yAxis), zAxis = js.Any.fromFunction0(zAxis))
    __obj.asInstanceOf[AxesViewer]
  }
}

