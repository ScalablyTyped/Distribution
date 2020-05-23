package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TonemappingOperator extends js.Object

@JSGlobal("BABYLON.TonemappingOperator")
@js.native
object TonemappingOperator extends js.Object {
  /** Hable */
  @js.native
  sealed trait Hable extends TonemappingOperator
  
  /** HejiDawson */
  @js.native
  sealed trait HejiDawson extends TonemappingOperator
  
  /** Photographic */
  @js.native
  sealed trait Photographic extends TonemappingOperator
  
  /** Reinhard */
  @js.native
  sealed trait Reinhard extends TonemappingOperator
  
}

