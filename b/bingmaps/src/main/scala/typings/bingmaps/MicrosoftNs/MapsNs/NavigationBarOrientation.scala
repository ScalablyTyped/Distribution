package typings.bingmaps.MicrosoftNs.MapsNs

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
  sealed trait horizontal extends NavigationBarOrientation
  
  /** Repositions the buttons in the navigation bar such that they are aligned vertically. */
  @js.native
  sealed trait vertical extends NavigationBarOrientation
  
  /* 0 */ val horizontal: typings.bingmaps.MicrosoftNs.MapsNs.NavigationBarOrientation.horizontal with Double = js.native
  /* 1 */ val vertical: typings.bingmaps.MicrosoftNs.MapsNs.NavigationBarOrientation.vertical with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NavigationBarOrientation with Double] = js.native
}

