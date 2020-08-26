package typings.blueprintjsCore.anon

import typings.blueprintjsCore.blueprintjsCoreBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HasEverOpened extends js.Object {
  var hasEverOpened: `true` = js.native
}

object HasEverOpened {
  @scala.inline
  def apply(hasEverOpened: `true`): HasEverOpened = {
    val __obj = js.Dynamic.literal(hasEverOpened = hasEverOpened.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasEverOpened]
  }
  @scala.inline
  implicit class HasEverOpenedOps[Self <: HasEverOpened] (val x: Self) extends AnyVal {
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
    def setHasEverOpened(value: `true`): Self = this.set("hasEverOpened", value.asInstanceOf[js.Any])
  }
  
}

