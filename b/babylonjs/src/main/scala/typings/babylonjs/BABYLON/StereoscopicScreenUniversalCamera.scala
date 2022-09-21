package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StereoscopicScreenUniversalCamera
  extends StObject
     with UniversalCamera {
  
  /* private */ var _distanceBetweenEyes: Any = js.native
  
  /* private */ var _distanceToProjectionPlane: Any = js.native
  
  /* protected */ def _setRigMode(): Unit = js.native
  
  /* private */ var _updateCamera: Any = js.native
  
  /**
    * @param name
    * @hidden
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
