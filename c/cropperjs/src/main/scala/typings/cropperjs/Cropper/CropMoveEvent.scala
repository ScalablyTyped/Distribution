package typings.cropperjs.Cropper

import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CropMoveEvent
  extends CustomEvent[js.Any] {
  
  @JSName("detail")
  var detail_CropMoveEvent: CropEventData = js.native
}
