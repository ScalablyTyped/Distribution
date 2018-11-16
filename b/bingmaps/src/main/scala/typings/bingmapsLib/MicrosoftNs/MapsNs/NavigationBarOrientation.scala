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
  
  val horizontal: horizontal with java.lang.String = js.native
  val vertical: vertical with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[bingmapsLib.MicrosoftNs.MapsNs.NavigationBarOrientation with java.lang.String] = js.native
}

