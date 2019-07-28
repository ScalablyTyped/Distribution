package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Intersect extends js.Object

@JSImport("cesium", "Intersect")
@js.native
object Intersect extends js.Object {
  @js.native
  sealed trait INSIDE extends Intersect
  
  @js.native
  sealed trait INTERSECTING extends Intersect
  
  @js.native
  sealed trait OUTSIDE extends Intersect
  
  /* 2 */ val INSIDE: typings.cesium.cesiumMod.Intersect.INSIDE with Double = js.native
  /* 1 */ val INTERSECTING: typings.cesium.cesiumMod.Intersect.INTERSECTING with Double = js.native
  /* 0 */ val OUTSIDE: typings.cesium.cesiumMod.Intersect.OUTSIDE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Intersect with Double] = js.native
}

