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
  
  val BACK: BACK with java.lang.String = js.native
  val FRONT: FRONT with java.lang.String = js.native
  val FRONT_AND_BACK: FRONT_AND_BACK with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[cesiumLib.cesiumMod.CullFace with java.lang.String] = js.native
}

