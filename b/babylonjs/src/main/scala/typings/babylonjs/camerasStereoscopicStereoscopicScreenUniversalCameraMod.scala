package typings.babylonjs

import typings.babylonjs.camerasCameraMod.Camera
import typings.babylonjs.camerasUniversalCameraMod.UniversalCamera
import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object camerasStereoscopicStereoscopicScreenUniversalCameraMod {
  
  @JSImport("babylonjs/Cameras/Stereoscopic/stereoscopicScreenUniversalCamera", "StereoscopicScreenUniversalCamera")
  @js.native
  open class StereoscopicScreenUniversalCamera protected () extends UniversalCamera {
    /**
      * Creates a new StereoscopicScreenUniversalCamera
      * @param name defines camera name
      * @param position defines initial position
      * @param scene defines the hosting scene
      * @param distanceToProjectionPlane defines distance between each color axis. The rig cameras will receive this as their negative z position!
      * @param distanceBetweenEyes defines is stereoscopic is done side by side or over under
      */
    def this(name: String, position: Vector3) = this()
    def this(name: String, position: Vector3, scene: Scene) = this()
    def this(name: String, position: Vector3, scene: Unit, distanceToProjectionPlane: Double) = this()
    def this(name: String, position: Vector3, scene: Scene, distanceToProjectionPlane: Double) = this()
    def this(
      name: String,
      position: Vector3,
      scene: Unit,
      distanceToProjectionPlane: Double,
      distanceBetweenEyes: Double
    ) = this()
    def this(
      name: String,
      position: Vector3,
      scene: Unit,
      distanceToProjectionPlane: Unit,
      distanceBetweenEyes: Double
    ) = this()
    def this(
      name: String,
      position: Vector3,
      scene: Scene,
      distanceToProjectionPlane: Double,
      distanceBetweenEyes: Double
    ) = this()
    def this(
      name: String,
      position: Vector3,
      scene: Scene,
      distanceToProjectionPlane: Unit,
      distanceBetweenEyes: Double
    ) = this()
    
    /* private */ var _distanceBetweenEyes: Any = js.native
    
    /* private */ var _distanceToProjectionPlane: Any = js.native
    
    /* protected */ def _setRigMode(): Unit = js.native
    
    /* private */ var _updateCamera: Any = js.native
    
    /**
      * @internal
      */
    def createRigCamera(name: String): Nullable[Camera] = js.native
    
    /**
      * distance between the eyes
      */
    def distanceBetweenEyes: Double = js.native
    def distanceBetweenEyes_=(newValue: Double): Unit = js.native
    
    /**
      * Distance to projection plane (should be the same units the like distance between the eyes)
      */
    def distanceToProjectionPlane: Double = js.native
    def distanceToProjectionPlane_=(newValue: Double): Unit = js.native
  }
}
