package typings
package bingmapsLib.MicrosoftNs.MapsNs

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
  sealed trait expanded
    extends bingmapsLib.MicrosoftNs.MapsNs.OverviewMapMode
  
  /** Hides the overview map. */
  @js.native
  sealed trait hidden
    extends bingmapsLib.MicrosoftNs.MapsNs.OverviewMapMode
  
  /** Shows the overview map in a minimized state. */
  @js.native
  sealed trait minimized
    extends bingmapsLib.MicrosoftNs.MapsNs.OverviewMapMode
  
  /* 0 */ val expanded: expanded with scala.Double = js.native
  /* 1 */ val hidden: hidden with scala.Double = js.native
  /* 2 */ val minimized: minimized with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[bingmapsLib.MicrosoftNs.MapsNs.OverviewMapMode with scala.Double] = js.native
}

