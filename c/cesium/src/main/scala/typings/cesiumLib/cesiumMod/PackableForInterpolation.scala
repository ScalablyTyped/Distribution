package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PackableForInterpolation extends js.Object

@JSImport("cesium", "PackableForInterpolation")
@js.native
object PackableForInterpolation extends js.Object {
  @js.native
  sealed trait packedInterpolationLength
    extends cesiumLib.cesiumMod.PackableForInterpolation
  
  /* 0 */ val packedInterpolationLength: packedInterpolationLength with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[cesiumLib.cesiumMod.PackableForInterpolation with scala.Double] = js.native
}

