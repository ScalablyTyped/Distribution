package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ArcType extends StObject
@JSImport("@cesium/engine", "ArcType")
@js.native
object ArcType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ArcType & Double] = js.native
  
  /**
    * Follow geodesic path.
    */
  @js.native
  sealed trait GEODESIC
    extends StObject
       with ArcType
  /* 1 */ val GEODESIC: typings.cesiumEngine.mod.ArcType.GEODESIC & Double = js.native
  
  /**
    * Straight line that does not conform to the surface of the ellipsoid.
    */
  @js.native
  sealed trait NONE
    extends StObject
       with ArcType
  /* 0 */ val NONE: typings.cesiumEngine.mod.ArcType.NONE & Double = js.native
  
  /**
    * Follow rhumb or loxodrome path.
    */
  @js.native
  sealed trait RHUMB
    extends StObject
       with ArcType
  /* 2 */ val RHUMB: typings.cesiumEngine.mod.ArcType.RHUMB & Double = js.native
}
