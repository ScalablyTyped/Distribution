package typings.babylonjs.postProcessesIndexMod

import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.engineMod.Engine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/PostProcesses/index", "StereoscopicInterlacePostProcess")
@js.native
class StereoscopicInterlacePostProcess protected ()
  extends typings.babylonjs.stereoscopicInterlacePostProcessMod.StereoscopicInterlacePostProcess {
  /**
    * Initializes a StereoscopicInterlacePostProcess
    * @param name The name of the effect.
    * @param rigCameras The rig cameras to be appled to the post process
    * @param isStereoscopicHoriz If the rendered results are horizontal or verticle
    * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
    * @param engine The engine which the post process will be applied. (default: current engine)
    * @param reusable If the post process can be reused on the same frame. (default: false)
    */
  def this(name: String, rigCameras: js.Array[Camera], isStereoscopicHoriz: Boolean) = this()
  def this(name: String, rigCameras: js.Array[Camera], isStereoscopicHoriz: Boolean, samplingMode: Double) = this()
  def this(
    name: String,
    rigCameras: js.Array[Camera],
    isStereoscopicHoriz: Boolean,
    samplingMode: Double,
    engine: Engine
  ) = this()
  def this(
    name: String,
    rigCameras: js.Array[Camera],
    isStereoscopicHoriz: Boolean,
    samplingMode: Double,
    engine: Engine,
    reusable: Boolean
  ) = this()
}

