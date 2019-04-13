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
  
  val INSIDE: INSIDE with java.lang.String = js.native
  val INTERSECTING: INTERSECTING with java.lang.String = js.native
  val OUTSIDE: OUTSIDE with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[cesiumLib.cesiumMod.Intersect with java.lang.String] = js.native
}

