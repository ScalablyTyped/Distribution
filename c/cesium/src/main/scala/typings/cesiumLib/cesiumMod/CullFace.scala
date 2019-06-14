package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CullFace extends js.Object

@JSImport("cesium", "CullFace")
@js.native
object CullFace extends js.Object {
  @js.native
  sealed trait BACK
    extends cesiumLib.cesiumMod.CullFace
  
  @js.native
  sealed trait FRONT
    extends cesiumLib.cesiumMod.CullFace
  
  @js.native
  sealed trait FRONT_AND_BACK
    extends cesiumLib.cesiumMod.CullFace
  
  /* 1 */ val BACK: BACK with scala.Double = js.native
  /* 0 */ val FRONT: FRONT with scala.Double = js.native
  /* 2 */ val FRONT_AND_BACK: FRONT_AND_BACK with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[cesiumLib.cesiumMod.CullFace with scala.Double] = js.native
}

