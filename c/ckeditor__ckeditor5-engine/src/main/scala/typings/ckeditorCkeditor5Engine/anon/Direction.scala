package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.backward
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.character
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.codePoint
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.forward
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.word
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Direction extends js.Object {
  var direction: js.UndefOr[forward | backward] = js.native
  var unit: js.UndefOr[character | codePoint | word] = js.native
}

object Direction {
  @scala.inline
  def apply(): Direction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Direction]
  }
  @scala.inline
  implicit class DirectionOps[Self <: Direction] (val x: Self) extends AnyVal {
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
    def setDirection(value: forward | backward): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setUnit(value: character | codePoint | word): Self = this.set("unit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
  }
  
}

