package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ArcType extends StObject
@JSImport("cesium", "ArcType")
@js.native
object ArcType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ArcType with Double] = js.native
  
  @js.native
  sealed trait GEODESIC extends ArcType
  /* 1 */ val GEODESIC: typings.cesium.mod.ArcType.GEODESIC with Double = js.native
  
  @js.native
  sealed trait NONE extends ArcType
  /* 0 */ val NONE: typings.cesium.mod.ArcType.NONE with Double = js.native
  
  @js.native
  sealed trait RHUMB extends ArcType
  /* 2 */ val RHUMB: typings.cesium.mod.ArcType.RHUMB with Double = js.native
}
