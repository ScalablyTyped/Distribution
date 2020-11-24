package typings.cesium.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BingMapsStyle extends js.Object
@JSImport("cesium", "BingMapsStyle")
@js.native
object BingMapsStyle extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BingMapsStyle with String] = js.native
  
  @js.native
  sealed trait AERIAL extends BingMapsStyle
  /* "Aerial" */ @js.native
  object AERIAL extends TopLevel[AERIAL with String]
  
  @js.native
  sealed trait AERIAL_WITH_LABELS extends BingMapsStyle
  /* "AerialWithLabels" */ @js.native
  object AERIAL_WITH_LABELS extends TopLevel[AERIAL_WITH_LABELS with String]
  
  @js.native
  sealed trait AERIAL_WITH_LABELS_ON_DEMAND extends BingMapsStyle
  /* "AerialWithLabelsOnDemand" */ @js.native
  object AERIAL_WITH_LABELS_ON_DEMAND extends TopLevel[AERIAL_WITH_LABELS_ON_DEMAND with String]
  
  @js.native
  sealed trait CANVAS_DARK extends BingMapsStyle
  /* "CanvasDark" */ @js.native
  object CANVAS_DARK extends TopLevel[CANVAS_DARK with String]
  
  @js.native
  sealed trait CANVAS_GRAY extends BingMapsStyle
  /* "CanvasGray" */ @js.native
  object CANVAS_GRAY extends TopLevel[CANVAS_GRAY with String]
  
  @js.native
  sealed trait CANVAS_LIGHT extends BingMapsStyle
  /* "CanvasLight" */ @js.native
  object CANVAS_LIGHT extends TopLevel[CANVAS_LIGHT with String]
  
  @js.native
  sealed trait COLLINS_BART extends BingMapsStyle
  /* "CollinsBart" */ @js.native
  object COLLINS_BART extends TopLevel[COLLINS_BART with String]
  
  @js.native
  sealed trait ORDNANCE_SURVEY extends BingMapsStyle
  /* "OrdnanceSurvey" */ @js.native
  object ORDNANCE_SURVEY extends TopLevel[ORDNANCE_SURVEY with String]
  
  @js.native
  sealed trait ROAD extends BingMapsStyle
  /* "Road" */ @js.native
  object ROAD extends TopLevel[ROAD with String]
  
  @js.native
  sealed trait ROAD_ON_DEMAND extends BingMapsStyle
  /* "RoadOnDemand" */ @js.native
  object ROAD_ON_DEMAND extends TopLevel[ROAD_ON_DEMAND with String]
}
