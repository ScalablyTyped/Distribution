package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DualShockDpad extends js.Object

@JSGlobal("BABYLON.DualShockDpad")
@js.native
object DualShockDpad extends js.Object {
  /** Down */
  @js.native
  sealed trait Down extends DualShockDpad
  
  /** Left */
  @js.native
  sealed trait Left extends DualShockDpad
  
  /** Right */
  @js.native
  sealed trait Right extends DualShockDpad
  
  /** Up */
  @js.native
  sealed trait Up extends DualShockDpad
  
}

