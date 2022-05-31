package typings.babylonjs

import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.engineMod.Engine
import typings.babylonjs.postProcessMod.PostProcess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stereoscopicInterlacePostProcessMod {
  
  @JSImport("babylonjs/PostProcesses/stereoscopicInterlacePostProcess", "StereoscopicInterlacePostProcess")
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
      samplingMode: Double,
      engine: Engine
    ) = this()
    def this(
      name: String,
      rigCameras: js.Array[Camera],
      isStereoscopicHoriz: Boolean,
      samplingMode: Unit,
      engine: Engine
    ) = this()
    def this(
      name: String,
      rigCameras: js.Array[Camera],
      isStereoscopicHoriz: Boolean,
      samplingMode: Double,
      engine: Unit,
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
    def this(
      name: String,
      rigCameras: js.Array[Camera],
      isStereoscopicHoriz: Boolean,
      samplingMode: Unit,
      engine: Unit,
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      rigCameras: js.Array[Camera],
      isStereoscopicHoriz: Boolean,
      samplingMode: Unit,
      engine: Engine,
      reusable: Boolean
    ) = this()
    
    /* private */ var _passedProcess: js.Any = js.native
    
    /* private */ var _stepSize: js.Any = js.native
  }
  
  @JSImport("babylonjs/PostProcesses/stereoscopicInterlacePostProcess", "StereoscopicInterlacePostProcessI")
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
      samplingMode: Double,
      engine: Engine
    ) = this()
    def this(
      name: String,
      rigCameras: js.Array[Camera],
      isStereoscopicHoriz: Boolean,
      isStereoscopicInterlaced: Boolean,
      samplingMode: Unit,
      engine: Engine
    ) = this()
    def this(
      name: String,
      rigCameras: js.Array[Camera],
      isStereoscopicHoriz: Boolean,
      isStereoscopicInterlaced: Boolean,
      samplingMode: Double,
      engine: Unit,
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
    def this(
      name: String,
      rigCameras: js.Array[Camera],
      isStereoscopicHoriz: Boolean,
      isStereoscopicInterlaced: Boolean,
      samplingMode: Unit,
      engine: Unit,
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      rigCameras: js.Array[Camera],
      isStereoscopicHoriz: Boolean,
      isStereoscopicInterlaced: Boolean,
      samplingMode: Unit,
      engine: Engine,
      reusable: Boolean
    ) = this()
    
    /* private */ var _passedProcess: js.Any = js.native
    
    /* private */ var _stepSize: js.Any = js.native
  }
}
