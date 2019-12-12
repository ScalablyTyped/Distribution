package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.TopLevel
import typings.bingmaps.Microsoft.Maps.OverviewMapMode.expanded
import typings.bingmaps.Microsoft.Maps.OverviewMapMode.hidden
import typings.bingmaps.Microsoft.Maps.OverviewMapMode.minimized
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OverviewMapMode extends js.Object

@JSGlobal("Microsoft.Maps.OverviewMapMode")
@js.native
object OverviewMapMode extends js.Object {
  /** Shows the overview map in an expanded state. */
  @js.native
  sealed trait expanded extends OverviewMapMode
  
  /** Hides the overview map. */
  @js.native
  sealed trait hidden extends OverviewMapMode
  
  /** Shows the overview map in a minimized state. */
  @js.native
  sealed trait minimized extends OverviewMapMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OverviewMapMode with Double] = js.native
  /* 0 */ @js.native
  object expanded extends TopLevel[expanded with Double]
  
  /* 1 */ @js.native
  object hidden extends TopLevel[hidden with Double]
  
  /* 2 */ @js.native
  object minimized extends TopLevel[minimized with Double]
  
}

