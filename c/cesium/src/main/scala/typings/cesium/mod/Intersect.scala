package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Intersect extends StObject
@JSImport("cesium", "Intersect")
@js.native
object Intersect extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Intersect & Double] = js.native
  
  /**
    * Represents that an object is fully within the frustum.
    */
  @js.native
  sealed trait INSIDE
    extends StObject
       with Intersect
  /* 1 */ val INSIDE: typings.cesium.mod.Intersect.INSIDE & Double = js.native
  
  /**
    * Represents that an object intersects one of the frustum's planes.
    */
  @js.native
  sealed trait INTERSECTING
    extends StObject
       with Intersect
  /* 0 */ val INTERSECTING: typings.cesium.mod.Intersect.INTERSECTING & Double = js.native
  
  /**
    * Represents that an object is not contained within the frustum.
    */
  @js.native
  sealed trait OUTSIDE
    extends StObject
       with Intersect
  /* -1 */ val OUTSIDE: typings.cesium.mod.Intersect.OUTSIDE & Double = js.native
}
