package typings
package babylonjsLib.BABYLONNs.DebugNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The BoneAxesViewer will attach 3 axes to a specific bone of a specific mesh
  * @see demo here: https://www.babylonjs-playground.com/#0DE8F4#8
  */
@JSGlobal("BABYLON.Debug.BoneAxesViewer")
@js.native
class BoneAxesViewer protected () extends AxesViewer {
  /**
    * Creates a new BoneAxesViewer
    * @param scene defines the hosting scene
    * @param bone defines the target bone
    * @param mesh defines the target mesh
    * @param scaleLines defines a scaling factor for line length (1 by default)
    */
  def this(scene: babylonjsLib.BABYLONNs.Scene, bone: babylonjsLib.BABYLONNs.Bone, mesh: babylonjsLib.BABYLONNs.Mesh) = this()
  def this(scene: babylonjsLib.BABYLONNs.Scene, bone: babylonjsLib.BABYLONNs.Bone, mesh: babylonjsLib.BABYLONNs.Mesh, scaleLines: scala.Double) = this()
  /**
    * Gets or sets the target bone where to display the axes viewer
    */
  var bone: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Bone] = js.native
  /**
    * Gets or sets the target mesh where to display the axes viewer
    */
  var mesh: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Mesh] = js.native
  /** Gets current position */
  var pos: babylonjsLib.BABYLONNs.Vector3 = js.native
  /** Gets direction of X axis */
  var xaxis: babylonjsLib.BABYLONNs.Vector3 = js.native
  /** Gets direction of Y axis */
  var yaxis: babylonjsLib.BABYLONNs.Vector3 = js.native
  /** Gets direction of Z axis */
  var zaxis: babylonjsLib.BABYLONNs.Vector3 = js.native
  /**
    * Force the viewer to update
    */
  def update(): scala.Unit = js.native
}

