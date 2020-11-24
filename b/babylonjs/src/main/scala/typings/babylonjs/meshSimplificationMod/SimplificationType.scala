package typings.babylonjs.meshSimplificationMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SimplificationType extends js.Object
@JSImport("babylonjs/Meshes/meshSimplification", "SimplificationType")
@js.native
object SimplificationType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SimplificationType with Double] = js.native
  
  /** Quadratic error decimation */
  @js.native
  sealed trait QUADRATIC extends SimplificationType
  /* 0 */ @js.native
  object QUADRATIC extends TopLevel[QUADRATIC with Double]
}
