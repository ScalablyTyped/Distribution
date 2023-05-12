package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BingMapsStyle extends StObject
@JSImport("@cesium/engine", "BingMapsStyle")
@js.native
object BingMapsStyle extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BingMapsStyle & String] = js.native
  
  /**
    * Aerial imagery.
    */
  @js.native
  sealed trait AERIAL
    extends StObject
       with BingMapsStyle
  /* "Aerial" */ val AERIAL: typings.cesiumEngine.mod.BingMapsStyle.AERIAL & String = js.native
  
  /**
    * Aerial imagery with a road overlay.
    */
  @js.native
  sealed trait AERIAL_WITH_LABELS
    extends StObject
       with BingMapsStyle
  /* "AerialWithLabels" */ val AERIAL_WITH_LABELS: typings.cesiumEngine.mod.BingMapsStyle.AERIAL_WITH_LABELS & String = js.native
  
  /**
    * Aerial imagery with a road overlay.
    */
  @js.native
  sealed trait AERIAL_WITH_LABELS_ON_DEMAND
    extends StObject
       with BingMapsStyle
  /* "AerialWithLabelsOnDemand" */ val AERIAL_WITH_LABELS_ON_DEMAND: typings.cesiumEngine.mod.BingMapsStyle.AERIAL_WITH_LABELS_ON_DEMAND & String = js.native
  
  /**
    * A dark version of the road maps.
    */
  @js.native
  sealed trait CANVAS_DARK
    extends StObject
       with BingMapsStyle
  /* "CanvasDark" */ val CANVAS_DARK: typings.cesiumEngine.mod.BingMapsStyle.CANVAS_DARK & String = js.native
  
  /**
    * A grayscale version of the road maps.
    */
  @js.native
  sealed trait CANVAS_GRAY
    extends StObject
       with BingMapsStyle
  /* "CanvasGray" */ val CANVAS_GRAY: typings.cesiumEngine.mod.BingMapsStyle.CANVAS_GRAY & String = js.native
  
  /**
    * A lighter version of the road maps.
    */
  @js.native
  sealed trait CANVAS_LIGHT
    extends StObject
       with BingMapsStyle
  /* "CanvasLight" */ val CANVAS_LIGHT: typings.cesiumEngine.mod.BingMapsStyle.CANVAS_LIGHT & String = js.native
  
  /**
    * Collins Bart imagery.
    */
  @js.native
  sealed trait COLLINS_BART
    extends StObject
       with BingMapsStyle
  /* "CollinsBart" */ val COLLINS_BART: typings.cesiumEngine.mod.BingMapsStyle.COLLINS_BART & String = js.native
  
  /**
    * Ordnance Survey imagery. This imagery is visible only for the London, UK area.
    */
  @js.native
  sealed trait ORDNANCE_SURVEY
    extends StObject
       with BingMapsStyle
  /* "OrdnanceSurvey" */ val ORDNANCE_SURVEY: typings.cesiumEngine.mod.BingMapsStyle.ORDNANCE_SURVEY & String = js.native
  
  /**
    * Roads without additional imagery.
    */
  @js.native
  sealed trait ROAD
    extends StObject
       with BingMapsStyle
  /* "Road" */ val ROAD: typings.cesiumEngine.mod.BingMapsStyle.ROAD & String = js.native
  
  /**
    * Roads without additional imagery.
    */
  @js.native
  sealed trait ROAD_ON_DEMAND
    extends StObject
       with BingMapsStyle
  /* "RoadOnDemand" */ val ROAD_ON_DEMAND: typings.cesiumEngine.mod.BingMapsStyle.ROAD_ON_DEMAND & String = js.native
}
