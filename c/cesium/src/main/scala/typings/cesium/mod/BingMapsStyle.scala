package typings.cesium.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BingMapsStyle extends js.Object

@JSImport("cesium", "BingMapsStyle")
@js.native
object BingMapsStyle extends js.Object {
  @js.native
  sealed trait AERIAL extends BingMapsStyle
  
  @js.native
  sealed trait AERIAL_WITH_LABELS extends BingMapsStyle
  
  @js.native
  sealed trait AERIAL_WITH_LABELS_ON_DEMAND extends BingMapsStyle
  
  @js.native
  sealed trait CANVAS_DARK extends BingMapsStyle
  
  @js.native
  sealed trait CANVAS_GRAY extends BingMapsStyle
  
  @js.native
  sealed trait CANVAS_LIGHT extends BingMapsStyle
  
  @js.native
  sealed trait COLLINS_BART extends BingMapsStyle
  
  @js.native
  sealed trait ORDNANCE_SURVEY extends BingMapsStyle
  
  @js.native
  sealed trait ROAD extends BingMapsStyle
  
  @js.native
  sealed trait ROAD_ON_DEMAND extends BingMapsStyle
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BingMapsStyle with String] = js.native
  /* "Aerial" */ @js.native
  object AERIAL extends TopLevel[AERIAL with String]
  
  /* "AerialWithLabels" */ @js.native
  object AERIAL_WITH_LABELS extends TopLevel[AERIAL_WITH_LABELS with String]
  
  /* "AerialWithLabelsOnDemand" */ @js.native
  object AERIAL_WITH_LABELS_ON_DEMAND extends TopLevel[AERIAL_WITH_LABELS_ON_DEMAND with String]
  
  /* "CanvasDark" */ @js.native
  object CANVAS_DARK extends TopLevel[CANVAS_DARK with String]
  
  /* "CanvasGray" */ @js.native
  object CANVAS_GRAY extends TopLevel[CANVAS_GRAY with String]
  
  /* "CanvasLight" */ @js.native
  object CANVAS_LIGHT extends TopLevel[CANVAS_LIGHT with String]
  
  /* "CollinsBart" */ @js.native
  object COLLINS_BART extends TopLevel[COLLINS_BART with String]
  
  /* "OrdnanceSurvey" */ @js.native
  object ORDNANCE_SURVEY extends TopLevel[ORDNANCE_SURVEY with String]
  
  /* "Road" */ @js.native
  object ROAD extends TopLevel[ROAD with String]
  
  /* "RoadOnDemand" */ @js.native
  object ROAD_ON_DEMAND extends TopLevel[ROAD_ON_DEMAND with String]
  
}

