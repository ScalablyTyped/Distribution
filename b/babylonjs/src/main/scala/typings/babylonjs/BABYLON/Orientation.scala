package typings.babylonjs.BABYLON

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
  
}

