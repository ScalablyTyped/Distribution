package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BingMapsStyle extends StObject
@JSImport("cesium", "BingMapsStyle")
@js.native
object BingMapsStyle extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BingMapsStyle with String] = js.native
  
  @js.native
  sealed trait AERIAL extends BingMapsStyle
  /* "Aerial" */ val AERIAL: typings.cesium.mod.BingMapsStyle.AERIAL with String = js.native
  
  @js.native
  sealed trait AERIAL_WITH_LABELS extends BingMapsStyle
  /* "AerialWithLabels" */ val AERIAL_WITH_LABELS: typings.cesium.mod.BingMapsStyle.AERIAL_WITH_LABELS with String = js.native
  
  @js.native
  sealed trait AERIAL_WITH_LABELS_ON_DEMAND extends BingMapsStyle
  /* "AerialWithLabelsOnDemand" */ val AERIAL_WITH_LABELS_ON_DEMAND: typings.cesium.mod.BingMapsStyle.AERIAL_WITH_LABELS_ON_DEMAND with String = js.native
  
  @js.native
  sealed trait CANVAS_DARK extends BingMapsStyle
  /* "CanvasDark" */ val CANVAS_DARK: typings.cesium.mod.BingMapsStyle.CANVAS_DARK with String = js.native
  
  @js.native
  sealed trait CANVAS_GRAY extends BingMapsStyle
  /* "CanvasGray" */ val CANVAS_GRAY: typings.cesium.mod.BingMapsStyle.CANVAS_GRAY with String = js.native
  
  @js.native
  sealed trait CANVAS_LIGHT extends BingMapsStyle
  /* "CanvasLight" */ val CANVAS_LIGHT: typings.cesium.mod.BingMapsStyle.CANVAS_LIGHT with String = js.native
  
  @js.native
  sealed trait COLLINS_BART extends BingMapsStyle
  /* "CollinsBart" */ val COLLINS_BART: typings.cesium.mod.BingMapsStyle.COLLINS_BART with String = js.native
  
  @js.native
  sealed trait ORDNANCE_SURVEY extends BingMapsStyle
  /* "OrdnanceSurvey" */ val ORDNANCE_SURVEY: typings.cesium.mod.BingMapsStyle.ORDNANCE_SURVEY with String = js.native
  
  @js.native
  sealed trait ROAD extends BingMapsStyle
  /* "Road" */ val ROAD: typings.cesium.mod.BingMapsStyle.ROAD with String = js.native
  
  @js.native
  sealed trait ROAD_ON_DEMAND extends BingMapsStyle
  /* "RoadOnDemand" */ val ROAD_ON_DEMAND: typings.cesium.mod.BingMapsStyle.ROAD_ON_DEMAND with String = js.native
}
