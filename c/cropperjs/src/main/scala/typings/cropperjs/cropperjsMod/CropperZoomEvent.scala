package typings.cropperjs.cropperjsMod

import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CropperZoomEvent
  extends CustomEvent[js.Any] {
  @JSName("detail")
  var detail_CropperZoomEvent: ZoomData = js.native
}

