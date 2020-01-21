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
  sealed trait COLLINS_BART extends BingMapsStyle
  
  @js.native
  sealed trait ORDNANCE_SURVEY extends BingMapsStyle
  
  @js.native
  sealed trait ROAD extends BingMapsStyle
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BingMapsStyle with Double] = js.native
  /* 0 */ @js.native
  object AERIAL extends TopLevel[AERIAL with Double]
  
  /* 1 */ @js.native
  object AERIAL_WITH_LABELS extends TopLevel[AERIAL_WITH_LABELS with Double]
  
  /* 4 */ @js.native
  object COLLINS_BART extends TopLevel[COLLINS_BART with Double]
  
  /* 3 */ @js.native
  object ORDNANCE_SURVEY extends TopLevel[ORDNANCE_SURVEY with Double]
  
  /* 2 */ @js.native
  object ROAD extends TopLevel[ROAD with Double]
  
}

