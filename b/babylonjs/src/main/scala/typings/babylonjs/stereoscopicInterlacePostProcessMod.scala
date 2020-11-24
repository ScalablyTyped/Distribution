package typings.babylonjs

import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.engineMod.Engine
import typings.babylonjs.postProcessMod.PostProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/PostProcesses/stereoscopicInterlacePostProcess", JSImport.Namespace)
@js.native
object stereoscopicInterlacePostProcessMod extends js.Object {
  
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
    def this(name: String, rigCameras: js.Array[Camera], isStereoscopicHoriz: Boolean) = this()
    def this(name: String, rigCameras: js.Array[Camera], isStereoscopicHoriz: Boolean, samplingMode: Double) = this()
    def this(
      name: String,
      rigCameras: js.Array[Camera],
      isStereoscopicHoriz: Boolean,
      samplingMode: js.UndefOr[scala.Nothing],
      engine: Engine
    ) = this()
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
      samplingMode: js.UndefOr[scala.Nothing],
      engine: js.UndefOr[scala.Nothing],
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      rigCameras: js.Array[Camera],
      isStereoscopicHoriz: Boolean,
      samplingMode: js.UndefOr[scala.Nothing],
      engine: Engine,
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      rigCameras: js.Array[Camera],
      isStereoscopicHoriz: Boolean,
      samplingMode: Double,
      engine: js.UndefOr[scala.Nothing],
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      rigCameras: js.Array[Camera],
      isStereoscopicHoriz: Boolean,
      samplingMode: Double,
      engine: Engine,
      reusable: Boolean
    ) = this()
    
    var _passedProcess: js.Any = js.native
    
    var _stepSize: js.Any = js.native
  }
  
  @js.native
  class StereoscopicInterlacePostProcessI protected () extends PostProcess {
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
      rigCameras: js.Array[Camera],
      isStereoscopicHoriz: Boolean,
      isStereoscopicInterlaced: Boolean
    ) = this()
    def this(
      name: String,
      rigCameras: js.Array[Camera],
      isStereoscopicHoriz: Boolean,
      isStereoscopicInterlaced: Boolean,
      samplingMode: Double
    ) = this()
    def this(
      name: String,
      rigCameras: js.Array[Camera],
      isStereoscopicHoriz: Boolean,
      isStereoscopicInterlaced: Boolean,
      samplingMode: js.UndefOr[scala.Nothing],
      engine: Engine
    ) = this()
    def this(
      name: String,
      rigCameras: js.Array[Camera],
      isStereoscopicHoriz: Boolean,
      isStereoscopicInterlaced: Boolean,
      samplingMode: Double,
      engine: Engine
    ) = this()
    def this(
      name: String,
      rigCameras: js.Array[Camera],
      isStereoscopicHoriz: Boolean,
      isStereoscopicInterlaced: Boolean,
      samplingMode: js.UndefOr[scala.Nothing],
      engine: js.UndefOr[scala.Nothing],
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      rigCameras: js.Array[Camera],
      isStereoscopicHoriz: Boolean,
      isStereoscopicInterlaced: Boolean,
      samplingMode: js.UndefOr[scala.Nothing],
      engine: Engine,
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      rigCameras: js.Array[Camera],
      isStereoscopicHoriz: Boolean,
      isStereoscopicInterlaced: Boolean,
      samplingMode: Double,
      engine: js.UndefOr[scala.Nothing],
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      rigCameras: js.Array[Camera],
      isStereoscopicHoriz: Boolean,
      isStereoscopicInterlaced: Boolean,
      samplingMode: Double,
      engine: Engine,
      reusable: Boolean
    ) = this()
    
    var _passedProcess: js.Any = js.native
    
    var _stepSize: js.Any = js.native
  }
}
