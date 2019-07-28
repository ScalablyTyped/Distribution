package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PackableForInterpolation extends js.Object

@JSImport("cesium", "PackableForInterpolation")
@js.native
object PackableForInterpolation extends js.Object {
  @js.native
  sealed trait packedInterpolationLength extends PackableForInterpolation
  
  /* 0 */ val packedInterpolationLength: typings.cesium.cesiumMod.PackableForInterpolation.packedInterpolationLength with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PackableForInterpolation with Double] = js.native
}

