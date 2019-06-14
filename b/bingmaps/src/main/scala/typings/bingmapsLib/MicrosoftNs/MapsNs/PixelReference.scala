package typings
package bingmapsLib.MicrosoftNs.MapsNs

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
  sealed trait control
    extends bingmapsLib.MicrosoftNs.MapsNs.PixelReference
  
  /** The pixel is defined relative to the page, where the top left corner of the HTML page is (0, 0). */
  @js.native
  sealed trait page
    extends bingmapsLib.MicrosoftNs.MapsNs.PixelReference
  
  /** The pixel is defined in viewport coordinates, relative to the center of the map, where the center of the map is (0, 0). */
  @js.native
  sealed trait viewport
    extends bingmapsLib.MicrosoftNs.MapsNs.PixelReference
  
  /* 0 */ val control: control with scala.Double = js.native
  /* 1 */ val page: page with scala.Double = js.native
  /* 2 */ val viewport: viewport with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[bingmapsLib.MicrosoftNs.MapsNs.PixelReference with scala.Double] = js.native
}

