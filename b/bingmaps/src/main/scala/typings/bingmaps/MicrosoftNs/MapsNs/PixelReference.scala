package typings.bingmaps.MicrosoftNs.MapsNs

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
  
  /* 0 */ val control: typings.bingmaps.MicrosoftNs.MapsNs.PixelReference.control with Double = js.native
  /* 1 */ val page: typings.bingmaps.MicrosoftNs.MapsNs.PixelReference.page with Double = js.native
  /* 2 */ val viewport: typings.bingmaps.MicrosoftNs.MapsNs.PixelReference.viewport with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PixelReference with Double] = js.native
}

