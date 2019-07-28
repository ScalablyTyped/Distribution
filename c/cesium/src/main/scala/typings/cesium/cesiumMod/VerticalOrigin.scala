package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VerticalOrigin extends js.Object

@JSImport("cesium", "VerticalOrigin")
@js.native
object VerticalOrigin extends js.Object {
  @js.native
  sealed trait BOTTOM extends VerticalOrigin
  
  @js.native
  sealed trait CENTER extends VerticalOrigin
  
  @js.native
  sealed trait TOP extends VerticalOrigin
  
  /* 1 */ val BOTTOM: typings.cesium.cesiumMod.VerticalOrigin.BOTTOM with Double = js.native
  /* 0 */ val CENTER: typings.cesium.cesiumMod.VerticalOrigin.CENTER with Double = js.native
  /* 2 */ val TOP: typings.cesium.cesiumMod.VerticalOrigin.TOP with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VerticalOrigin with Double] = js.native
}

