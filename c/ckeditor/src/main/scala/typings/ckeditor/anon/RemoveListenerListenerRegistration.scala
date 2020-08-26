package typings.ckeditor.anon

import typings.ckeditor.CKEDITOR.listenerRegistration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveListenerListenerRegistration extends js.Object {
  var removeListener: listenerRegistration = js.native
}

object RemoveListenerListenerRegistration {
  @scala.inline
  def apply(removeListener: listenerRegistration): RemoveListenerListenerRegistration = {
    val __obj = js.Dynamic.literal(removeListener = removeListener.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveListenerListenerRegistration]
  }
  @scala.inline
  implicit class RemoveListenerListenerRegistrationOps[Self <: RemoveListenerListenerRegistration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRemoveListener(value: listenerRegistration): Self = this.set("removeListener", value.asInstanceOf[js.Any])
  }
  
}

