package typings.cathoQuantum.anon

import typings.cathoQuantum.cathoQuantumStrings.CardDotContent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisplayName extends js.Object {
  var displayName: CardDotContent = js.native
}

object DisplayName {
  @scala.inline
  def apply(displayName: CardDotContent): DisplayName = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayName]
  }
  @scala.inline
  implicit class DisplayNameOps[Self <: DisplayName] (val x: Self) extends AnyVal {
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
    def setDisplayName(value: CardDotContent): Self = this.set("displayName", value.asInstanceOf[js.Any])
  }
  
}

