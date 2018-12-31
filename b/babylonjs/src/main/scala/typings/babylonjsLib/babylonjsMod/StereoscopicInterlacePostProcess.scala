package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * StereoscopicInterlacePostProcess used to render stereo views from a rigged camera
  */
@JSImport("babylonjs", "StereoscopicInterlacePostProcess")
@js.native
class StereoscopicInterlacePostProcess protected ()
  extends babylonjsLib.BABYLONNs.StereoscopicInterlacePostProcess {
  /**
    * Initializes a StereoscopicInterlacePostProcess
    * @param name The name of the effect.
    * @param rigCameras The rig cameras to be appled to the post process
    * @param isStereoscopicHoriz If the rendered results are horizontal or verticle
    * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
    * @param engine The engine which the post process will be applied. (default: current engine)
    * @param reusable If the post process can be reused on the same frame. (default: false)
    */
  def this(name: java.lang.String, rigCameras: js.Array[babylonjsLib.BABYLONNs.Camera], isStereoscopicHoriz: scala.Boolean) = this()
  def this(name: java.lang.String, rigCameras: js.Array[babylonjsLib.BABYLONNs.Camera], isStereoscopicHoriz: scala.Boolean, samplingMode: scala.Double) = this()
  def this(name: java.lang.String, rigCameras: js.Array[babylonjsLib.BABYLONNs.Camera], isStereoscopicHoriz: scala.Boolean, samplingMode: scala.Double, engine: babylonjsLib.BABYLONNs.Engine) = this()
  def this(name: java.lang.String, rigCameras: js.Array[babylonjsLib.BABYLONNs.Camera], isStereoscopicHoriz: scala.Boolean, samplingMode: scala.Double, engine: babylonjsLib.BABYLONNs.Engine, reusable: scala.Boolean) = this()
}

