package typings.blueprintjsCore

import typings.blueprintjsCore.toasterMod.IToastOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonToasts extends js.Object {
  var toasts: js.Array[IToastOptions]
}

object AnonToasts {
  @scala.inline
  def apply(toasts: js.Array[IToastOptions]): AnonToasts = {
    val __obj = js.Dynamic.literal(toasts = toasts.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonToasts]
  }
}

