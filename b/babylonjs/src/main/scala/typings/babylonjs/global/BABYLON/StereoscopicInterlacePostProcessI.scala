package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.StereoscopicInterlacePostProcessI")
@js.native
class StereoscopicInterlacePostProcessI protected ()
  extends typings.babylonjs.BABYLON.StereoscopicInterlacePostProcessI {
  /**
    * Initializes a StereoscopicInterlacePostProcessI
    * @param name The name of the effect.
    * @param rigCameras The rig cameras to be appled to the post process
    * @param isStereoscopicHoriz If the rendered results are horizontal or vertical
    * @param isStereoscopicInterlaced If the rendered results are alternate line interlaced
    * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
    * @param engine The engine which the post process will be applied. (default: current engine)
    * @param reusable If the post process can be reused on the same frame. (default: false)
    */
  def this(
    name: String,
    rigCameras: js.Array[typings.babylonjs.BABYLON.Camera],
    isStereoscopicHoriz: Boolean,
    isStereoscopicInterlaced: Boolean
  ) = this()
  def this(
    name: String,
    rigCameras: js.Array[typings.babylonjs.BABYLON.Camera],
    isStereoscopicHoriz: Boolean,
    isStereoscopicInterlaced: Boolean,
    samplingMode: Double
  ) = this()
  def this(
    name: String,
    rigCameras: js.Array[typings.babylonjs.BABYLON.Camera],
    isStereoscopicHoriz: Boolean,
    isStereoscopicInterlaced: Boolean,
    samplingMode: Double,
    engine: typings.babylonjs.BABYLON.Engine
  ) = this()
  def this(
    name: String,
    rigCameras: js.Array[typings.babylonjs.BABYLON.Camera],
    isStereoscopicHoriz: Boolean,
    isStereoscopicInterlaced: Boolean,
    samplingMode: Double,
    engine: typings.babylonjs.BABYLON.Engine,
    reusable: Boolean
  ) = this()
}

