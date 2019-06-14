package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NavigationBarOrientation extends js.Object

@JSGlobal("Microsoft.Maps.NavigationBarOrientation")
@js.native
object NavigationBarOrientation extends js.Object {
  /** Repositions the buttons in the navigation bar such that they are aligned horizontally. */
  @js.native
  sealed trait horizontal
    extends bingmapsLib.MicrosoftNs.MapsNs.NavigationBarOrientation
  
  /** Repositions the buttons in the navigation bar such that they are aligned vertically. */
  @js.native
  sealed trait vertical
    extends bingmapsLib.MicrosoftNs.MapsNs.NavigationBarOrientation
  
  /* 0 */ val horizontal: horizontal with scala.Double = js.native
  /* 1 */ val vertical: vertical with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[bingmapsLib.MicrosoftNs.MapsNs.NavigationBarOrientation with scala.Double] = js.native
}

