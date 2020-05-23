package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SubEmitterType extends js.Object

@JSGlobal("BABYLON.SubEmitterType")
@js.native
object SubEmitterType extends js.Object {
  /**
    * Attached to the particle over it's lifetime
    */
  @js.native
  sealed trait ATTACHED extends SubEmitterType
  
  /**
    * Created when the particle dies
    */
  @js.native
  sealed trait END extends SubEmitterType
  
}

