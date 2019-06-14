package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VerticalOrigin extends js.Object

@JSImport("cesium", "VerticalOrigin")
@js.native
object VerticalOrigin extends js.Object {
  @js.native
  sealed trait BOTTOM
    extends cesiumLib.cesiumMod.VerticalOrigin
  
  @js.native
  sealed trait CENTER
    extends cesiumLib.cesiumMod.VerticalOrigin
  
  @js.native
  sealed trait TOP
    extends cesiumLib.cesiumMod.VerticalOrigin
  
  /* 1 */ val BOTTOM: BOTTOM with scala.Double = js.native
  /* 0 */ val CENTER: CENTER with scala.Double = js.native
  /* 2 */ val TOP: TOP with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[cesiumLib.cesiumMod.VerticalOrigin with scala.Double] = js.native
}

