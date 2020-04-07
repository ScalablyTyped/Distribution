package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Orientation extends js.Object

@JSGlobal("BABYLON.Orientation")
@js.native
object Orientation extends js.Object {
  /** Counter clockwise */
  @js.native
  sealed trait CCW extends Orientation
  
  /**
    * Clockwise
    */
  @js.native
  sealed trait CW extends Orientation
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Orientation with Double] = js.native
  /* 1 */ @js.native
  object CCW extends TopLevel[CCW with Double]
  
  /* 0 */ @js.native
  object CW extends TopLevel[CW with Double]
  
}

