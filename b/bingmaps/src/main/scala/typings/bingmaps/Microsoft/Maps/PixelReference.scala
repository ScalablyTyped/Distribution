package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.TopLevel
import typings.bingmaps.Microsoft.Maps.PixelReference.control
import typings.bingmaps.Microsoft.Maps.PixelReference.page
import typings.bingmaps.Microsoft.Maps.PixelReference.viewport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PixelReference extends js.Object

@JSGlobal("Microsoft.Maps.PixelReference")
@js.native
object PixelReference extends js.Object {
  /** The pixel is defined relative to the map control’s root element, where the top left corner of the map control is (0, 0). */
  @js.native
  sealed trait control extends PixelReference
  
  /** The pixel is defined relative to the page, where the top left corner of the HTML page is (0, 0). */
  @js.native
  sealed trait page extends PixelReference
  
  /** The pixel is defined in viewport coordinates, relative to the center of the map, where the center of the map is (0, 0). */
  @js.native
  sealed trait viewport extends PixelReference
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PixelReference with Double] = js.native
  /* 0 */ @js.native
  object control extends TopLevel[control with Double]
  
  /* 1 */ @js.native
  object page extends TopLevel[page with Double]
  
  /* 2 */ @js.native
  object viewport extends TopLevel[viewport with Double]
  
}

