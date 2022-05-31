package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InspectableType extends StObject
@JSGlobal("BABYLON.InspectableType")
@js.native
object InspectableType extends StObject {
  
  /**
    * Checkbox for booleans
    */
  @js.native
  sealed trait Checkbox
    extends StObject
       with InspectableType
  
  /**
    * Color3
    */
  @js.native
  sealed trait Color3
    extends StObject
       with InspectableType
  
  /**
    * Quaternions
    */
  @js.native
  sealed trait Quaternion
    extends StObject
       with InspectableType
  
  /**
    * Sliders for numbers
    */
  @js.native
  sealed trait Slider
    extends StObject
       with InspectableType
  
  /**
    * String
    */
  @js.native
  sealed trait String
    extends StObject
       with InspectableType
  
  /**
    * Vector3
    */
  @js.native
  sealed trait Vector3
    extends StObject
       with InspectableType
}
