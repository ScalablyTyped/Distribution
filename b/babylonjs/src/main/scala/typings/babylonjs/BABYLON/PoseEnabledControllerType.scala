package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PoseEnabledControllerType extends StObject
@JSGlobal("BABYLON.PoseEnabledControllerType")
@js.native
object PoseEnabledControllerType extends StObject {
  
  /**
    * Google Daydream
    */
  @js.native
  sealed trait DAYDREAM
    extends StObject
       with PoseEnabledControllerType
  
  /**
    * Samsung gear VR
    */
  @js.native
  sealed trait GEAR_VR
    extends StObject
       with PoseEnabledControllerType
  
  /**
    * Generic
    */
  @js.native
  sealed trait GENERIC
    extends StObject
       with PoseEnabledControllerType
  
  /**
    * Oculus Rift
    */
  @js.native
  sealed trait OCULUS
    extends StObject
       with PoseEnabledControllerType
  
  /**
    * HTC Vive
    */
  @js.native
  sealed trait VIVE
    extends StObject
       with PoseEnabledControllerType
  
  /**
    * Windows mixed reality
    */
  @js.native
  sealed trait WINDOWS
    extends StObject
       with PoseEnabledControllerType
}
