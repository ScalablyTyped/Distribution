package typings.blueprintjsCore.anon

import typings.blueprintjsCore.toasterMod.IToastOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Toasts extends js.Object {
  var toasts: js.Array[IToastOptions]
}

object Toasts {
  @scala.inline
  def apply(toasts: js.Array[IToastOptions]): Toasts = {
    val __obj = js.Dynamic.literal(toasts = toasts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Toasts]
  }
}

