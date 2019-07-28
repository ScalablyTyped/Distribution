package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShadowMode extends js.Object

@JSImport("cesium", "ShadowMode")
@js.native
object ShadowMode extends js.Object {
  @js.native
  sealed trait CAST_ONLY extends ShadowMode
  
  @js.native
  sealed trait DISABLED extends ShadowMode
  
  @js.native
  sealed trait ENABLED extends ShadowMode
  
  @js.native
  sealed trait RECEIVE_ONLY extends ShadowMode
  
  /* 0 */ val CAST_ONLY: typings.cesium.cesiumMod.ShadowMode.CAST_ONLY with Double = js.native
  /* 1 */ val DISABLED: typings.cesium.cesiumMod.ShadowMode.DISABLED with Double = js.native
  /* 2 */ val ENABLED: typings.cesium.cesiumMod.ShadowMode.ENABLED with Double = js.native
  /* 3 */ val RECEIVE_ONLY: typings.cesium.cesiumMod.ShadowMode.RECEIVE_ONLY with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ShadowMode with Double] = js.native
}

