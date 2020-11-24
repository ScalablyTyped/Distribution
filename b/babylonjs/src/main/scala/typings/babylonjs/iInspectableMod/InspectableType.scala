package typings.babylonjs.iInspectableMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InspectableType extends js.Object
@JSImport("babylonjs/Misc/iInspectable", "InspectableType")
@js.native
object InspectableType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InspectableType with Double] = js.native
  
  /**
    * Checkbox for booleans
    */
  @js.native
  sealed trait Checkbox extends InspectableType
  /* 0 */ @js.native
  object Checkbox extends TopLevel[Checkbox with Double]
  
  /**
    * Color3
    */
  @js.native
  sealed trait Color3 extends InspectableType
  /* 4 */ @js.native
  object Color3 extends TopLevel[Color3 with Double]
  
  /**
    * Quaternions
    */
  @js.native
  sealed trait Quaternion extends InspectableType
  /* 3 */ @js.native
  object Quaternion extends TopLevel[Quaternion with Double]
  
  /**
    * Sliders for numbers
    */
  @js.native
  sealed trait Slider extends InspectableType
  /* 1 */ @js.native
  object Slider extends TopLevel[Slider with Double]
  
  /**
    * String
    */
  @js.native
  sealed trait String extends InspectableType
  /* 5 */ @js.native
  object String extends TopLevel[String with Double]
  
  /**
    * Vector3
    */
  @js.native
  sealed trait Vector3 extends InspectableType
  /* 2 */ @js.native
  object Vector3 extends TopLevel[Vector3 with Double]
}
