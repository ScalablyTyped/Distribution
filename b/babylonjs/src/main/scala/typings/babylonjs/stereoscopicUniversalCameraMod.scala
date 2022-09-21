package typings.babylonjs

import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.universalCameraMod.UniversalCamera
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stereoscopicUniversalCameraMod {
  
  @JSImport("babylonjs/Cameras/Stereoscopic/stereoscopicUniversalCamera", "StereoscopicUniversalCamera")
  @js.native
  open class StereoscopicUniversalCamera protected () extends UniversalCamera {
    /**
      * Creates a new StereoscopicUniversalCamera
      * @param name defines camera name
      * @param position defines initial position
      * @param interaxialDistance defines distance between each color axis
      * @param isStereoscopicSideBySide defines is stereoscopic is done side by side or over under
      * @param scene defines the hosting scene
      */
    def this(name: String, position: Vector3, interaxialDistance: Double, isStereoscopicSideBySide: Boolean) = this()
    def this(
      name: String,
      position: Vector3,
      interaxialDistance: Double,
      isStereoscopicSideBySide: Boolean,
      scene: Scene
    ) = this()
    
    /* protected */ var _setRigMode: Any = js.native
  }
}
