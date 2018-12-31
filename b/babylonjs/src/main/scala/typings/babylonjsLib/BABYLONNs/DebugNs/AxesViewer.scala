package typings
package babylonjsLib.BABYLONNs.DebugNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Axes viewer will show 3 axes in a specific point in space
  */
@JSGlobal("BABYLON.Debug.AxesViewer")
@js.native
class AxesViewer protected () extends js.Object {
  /**
    * Creates a new AxesViewer
    * @param scene defines the hosting scene
    * @param scaleLines defines a number used to scale line length (1 by default)
    */
  def this(scene: babylonjsLib.BABYLONNs.Scene) = this()
  def this(scene: babylonjsLib.BABYLONNs.Scene, scaleLines: scala.Double) = this()
  var _xline: js.Any = js.native
  var _xmesh: js.Any = js.native
  var _yline: js.Any = js.native
  var _ymesh: js.Any = js.native
  var _zline: js.Any = js.native
  var _zmesh: js.Any = js.native
  /**
    * Gets or sets a number used to scale line length
    */
  var scaleLines: scala.Double = js.native
  /**
    * Gets the hosting scene
    */
  var scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene] = js.native
  /** Releases resources */
  def dispose(): scala.Unit = js.native
  /**
    * Force the viewer to update
    * @param position defines the position of the viewer
    * @param xaxis defines the x axis of the viewer
    * @param yaxis defines the y axis of the viewer
    * @param zaxis defines the z axis of the viewer
    */
  def update(
    position: babylonjsLib.BABYLONNs.Vector3,
    xaxis: babylonjsLib.BABYLONNs.Vector3,
    yaxis: babylonjsLib.BABYLONNs.Vector3,
    zaxis: babylonjsLib.BABYLONNs.Vector3
  ): scala.Unit = js.native
}

