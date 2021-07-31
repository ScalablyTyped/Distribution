package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BingMapsStyle extends StObject
@JSImport("cesium", "BingMapsStyle")
@js.native
object BingMapsStyle extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BingMapsStyle & String] = js.native
  
  @js.native
  sealed trait AERIAL
    extends StObject
       with BingMapsStyle
  /* "Aerial" */ val AERIAL: typings.cesium.mod.BingMapsStyle.AERIAL & String = js.native
  
  @js.native
  sealed trait AERIAL_WITH_LABELS
    extends StObject
       with BingMapsStyle
  /* "AerialWithLabels" */ val AERIAL_WITH_LABELS: typings.cesium.mod.BingMapsStyle.AERIAL_WITH_LABELS & String = js.native
  
  @js.native
  sealed trait AERIAL_WITH_LABELS_ON_DEMAND
    extends StObject
       with BingMapsStyle
  /* "AerialWithLabelsOnDemand" */ val AERIAL_WITH_LABELS_ON_DEMAND: typings.cesium.mod.BingMapsStyle.AERIAL_WITH_LABELS_ON_DEMAND & String = js.native
  
  @js.native
  sealed trait CANVAS_DARK
    extends StObject
       with BingMapsStyle
  /* "CanvasDark" */ val CANVAS_DARK: typings.cesium.mod.BingMapsStyle.CANVAS_DARK & String = js.native
  
  @js.native
  sealed trait CANVAS_GRAY
    extends StObject
       with BingMapsStyle
  /* "CanvasGray" */ val CANVAS_GRAY: typings.cesium.mod.BingMapsStyle.CANVAS_GRAY & String = js.native
  
  @js.native
  sealed trait CANVAS_LIGHT
    extends StObject
       with BingMapsStyle
  /* "CanvasLight" */ val CANVAS_LIGHT: typings.cesium.mod.BingMapsStyle.CANVAS_LIGHT & String = js.native
  
  @js.native
  sealed trait COLLINS_BART
    extends StObject
       with BingMapsStyle
  /* "CollinsBart" */ val COLLINS_BART: typings.cesium.mod.BingMapsStyle.COLLINS_BART & String = js.native
  
  @js.native
  sealed trait ORDNANCE_SURVEY
    extends StObject
       with BingMapsStyle
  /* "OrdnanceSurvey" */ val ORDNANCE_SURVEY: typings.cesium.mod.BingMapsStyle.ORDNANCE_SURVEY & String = js.native
  
  @js.native
  sealed trait ROAD
    extends StObject
       with BingMapsStyle
  /* "Road" */ val ROAD: typings.cesium.mod.BingMapsStyle.ROAD & String = js.native
  
  @js.native
  sealed trait ROAD_ON_DEMAND
    extends StObject
       with BingMapsStyle
  /* "RoadOnDemand" */ val ROAD_ON_DEMAND: typings.cesium.mod.BingMapsStyle.ROAD_ON_DEMAND & String = js.native
}
