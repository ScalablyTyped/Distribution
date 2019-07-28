package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CullFace extends js.Object

@JSImport("cesium", "CullFace")
@js.native
object CullFace extends js.Object {
  @js.native
  sealed trait BACK extends CullFace
  
  @js.native
  sealed trait FRONT extends CullFace
  
  @js.native
  sealed trait FRONT_AND_BACK extends CullFace
  
  /* 1 */ val BACK: typings.cesium.cesiumMod.CullFace.BACK with Double = js.native
  /* 0 */ val FRONT: typings.cesium.cesiumMod.CullFace.FRONT with Double = js.native
  /* 2 */ val FRONT_AND_BACK: typings.cesium.cesiumMod.CullFace.FRONT_AND_BACK with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CullFace with Double] = js.native
}

