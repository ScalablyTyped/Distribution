package typings.bingmaps.Microsoft.Maps

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
  
}

