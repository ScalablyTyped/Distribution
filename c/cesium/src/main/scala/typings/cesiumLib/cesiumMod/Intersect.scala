package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Intersect extends js.Object

@JSImport("cesium", "Intersect")
@js.native
object Intersect extends js.Object {
  @js.native
  sealed trait INSIDE
    extends cesiumLib.cesiumMod.Intersect
  
  @js.native
  sealed trait INTERSECTING
    extends cesiumLib.cesiumMod.Intersect
  
  @js.native
  sealed trait OUTSIDE
    extends cesiumLib.cesiumMod.Intersect
  
  /* 2 */ val INSIDE: INSIDE with scala.Double = js.native
  /* 1 */ val INTERSECTING: INTERSECTING with scala.Double = js.native
  /* 0 */ val OUTSIDE: OUTSIDE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[cesiumLib.cesiumMod.Intersect with scala.Double] = js.native
}

