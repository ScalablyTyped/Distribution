package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * StereoscopicInterlacePostProcess used to render stereo views from a rigged camera
     */
@JSGlobal("BABYLON.StereoscopicInterlacePostProcess")
@js.native
class StereoscopicInterlacePostProcess protected () extends PostProcess {
  /**
           * Initializes a StereoscopicInterlacePostProcess
           * @param name The name of the effect.
           * @param rigCameras The rig cameras to be appled to the post process
           * @param isStereoscopicHoriz If the rendered results are horizontal or verticle
           * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
           * @param engine The engine which the post process will be applied. (default: current engine)
           * @param reusable If the post process can be reused on the same frame. (default: false)
           */
  def this(name: java.lang.String, rigCameras: js.Array[Camera], isStereoscopicHoriz: scala.Boolean) = this()
  /**
           * Initializes a StereoscopicInterlacePostProcess
           * @param name The name of the effect.
           * @param rigCameras The rig cameras to be appled to the post process
           * @param isStereoscopicHoriz If the rendered results are horizontal or verticle
           * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
           * @param engine The engine which the post process will be applied. (default: current engine)
           * @param reusable If the post process can be reused on the same frame. (default: false)
           */
  def this(name: java.lang.String, rigCameras: js.Array[Camera], isStereoscopicHoriz: scala.Boolean, samplingMode: scala.Double) = this()
  /**
           * Initializes a StereoscopicInterlacePostProcess
           * @param name The name of the effect.
           * @param rigCameras The rig cameras to be appled to the post process
           * @param isStereoscopicHoriz If the rendered results are horizontal or verticle
           * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
           * @param engine The engine which the post process will be applied. (default: current engine)
           * @param reusable If the post process can be reused on the same frame. (default: false)
           */
  def this(name: java.lang.String, rigCameras: js.Array[Camera], isStereoscopicHoriz: scala.Boolean, samplingMode: scala.Double, engine: Engine) = this()
  /**
           * Initializes a StereoscopicInterlacePostProcess
           * @param name The name of the effect.
           * @param rigCameras The rig cameras to be appled to the post process
           * @param isStereoscopicHoriz If the rendered results are horizontal or verticle
           * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
           * @param engine The engine which the post process will be applied. (default: current engine)
           * @param reusable If the post process can be reused on the same frame. (default: false)
           */
  def this(name: java.lang.String, rigCameras: js.Array[Camera], isStereoscopicHoriz: scala.Boolean, samplingMode: scala.Double, engine: Engine, reusable: scala.Boolean) = this()
  var _passedProcess: js.Any = js.native
  var _stepSize: js.Any = js.native
}

