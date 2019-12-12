package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.TopLevel
import typings.bingmaps.Microsoft.Maps.NavigationBarOrientation.horizontal
import typings.bingmaps.Microsoft.Maps.NavigationBarOrientation.vertical
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NavigationBarOrientation with Double] = js.native
  /* 0 */ @js.native
  object horizontal extends TopLevel[horizontal with Double]
  
  /* 1 */ @js.native
  object vertical extends TopLevel[vertical with Double]
  
}

