package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InspectableType extends js.Object

@JSGlobal("BABYLON.InspectableType")
@js.native
object InspectableType extends js.Object {
  /**
    * Checkbox for booleans
    */
  @js.native
  sealed trait Checkbox extends InspectableType
  
  /**
    * Color3
    */
  @js.native
  sealed trait Color3 extends InspectableType
  
  /**
    * Quaternions
    */
  @js.native
  sealed trait Quaternion extends InspectableType
  
  /**
    * Sliders for numbers
    */
  @js.native
  sealed trait Slider extends InspectableType
  
  /**
    * String
    */
  @js.native
  sealed trait String extends InspectableType
  
  /**
    * Vector3
    */
  @js.native
  sealed trait Vector3 extends InspectableType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InspectableType with Double] = js.native
  /* 0 */ @js.native
  object Checkbox extends TopLevel[Checkbox with Double]
  
  /* 4 */ @js.native
  object Color3
    extends TopLevel[typings.babylonjs.BABYLON.InspectableType.Color3 with Double]
  
  /* 3 */ @js.native
  object Quaternion
    extends TopLevel[typings.babylonjs.BABYLON.InspectableType.Quaternion with Double]
  
  /* 1 */ @js.native
  object Slider extends TopLevel[Slider with Double]
  
  /* 5 */ @js.native
  object String extends TopLevel[String with Double]
  
  /* 2 */ @js.native
  object Vector3
    extends TopLevel[typings.babylonjs.BABYLON.InspectableType.Vector3 with Double]
  
}

