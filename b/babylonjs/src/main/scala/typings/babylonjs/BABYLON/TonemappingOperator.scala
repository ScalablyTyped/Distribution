package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TonemappingOperator with Double] = js.native
  /* 0 */ @js.native
  object Hable extends TopLevel[Hable with Double]
  
  /* 2 */ @js.native
  object HejiDawson extends TopLevel[HejiDawson with Double]
  
  /* 3 */ @js.native
  object Photographic extends TopLevel[Photographic with Double]
  
  /* 1 */ @js.native
  object Reinhard extends TopLevel[Reinhard with Double]
  
}

