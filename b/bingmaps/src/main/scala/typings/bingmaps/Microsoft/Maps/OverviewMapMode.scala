package typings.bingmaps.Microsoft.Maps

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
  
  /* 0 */ val expanded: typings.bingmaps.Microsoft.Maps.OverviewMapMode.expanded with Double = js.native
  /* 1 */ val hidden: typings.bingmaps.Microsoft.Maps.OverviewMapMode.hidden with Double = js.native
  /* 2 */ val minimized: typings.bingmaps.Microsoft.Maps.OverviewMapMode.minimized with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OverviewMapMode with Double] = js.native
}

