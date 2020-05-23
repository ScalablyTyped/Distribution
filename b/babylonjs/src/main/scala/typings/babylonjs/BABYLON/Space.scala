package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Space extends js.Object

@JSGlobal("BABYLON.Space")
@js.native
object Space extends js.Object {
  /** Bone space */
  @js.native
  sealed trait BONE extends Space
  
  /** Local (object) space */
  @js.native
  sealed trait LOCAL extends Space
  
  /** World space */
  @js.native
  sealed trait WORLD extends Space
  
}

