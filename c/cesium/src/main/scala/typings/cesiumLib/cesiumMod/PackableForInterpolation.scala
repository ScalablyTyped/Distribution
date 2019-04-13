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
  
  val packedInterpolationLength: packedInterpolationLength with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[cesiumLib.cesiumMod.PackableForInterpolation with java.lang.String] = js.native
}

