package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ArcGisBaseMapType extends StObject
@JSImport("cesium", "ArcGisBaseMapType")
@js.native
object ArcGisBaseMapType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ArcGisBaseMapType & Double] = js.native
  
  @js.native
  sealed trait HILLSHADE
    extends StObject
       with ArcGisBaseMapType
  /* 3 */ val HILLSHADE: typings.cesium.mod.ArcGisBaseMapType.HILLSHADE & Double = js.native
  
  @js.native
  sealed trait OCEANS
    extends StObject
       with ArcGisBaseMapType
  /* 2 */ val OCEANS: typings.cesium.mod.ArcGisBaseMapType.OCEANS & Double = js.native
  
  @js.native
  sealed trait SATELLITE
    extends StObject
       with ArcGisBaseMapType
  /* 1 */ val SATELLITE: typings.cesium.mod.ArcGisBaseMapType.SATELLITE & Double = js.native
}
