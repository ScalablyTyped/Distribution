package typings.babylonjs.meshSimplificationMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SimplificationType extends js.Object

@JSImport("babylonjs/Meshes/meshSimplification", "SimplificationType")
@js.native
object SimplificationType extends js.Object {
  /** Quadratic error decimation */
  @js.native
  sealed trait QUADRATIC extends SimplificationType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SimplificationType with Double] = js.native
  /* 0 */ @js.native
  object QUADRATIC extends TopLevel[QUADRATIC with Double]
  
}

