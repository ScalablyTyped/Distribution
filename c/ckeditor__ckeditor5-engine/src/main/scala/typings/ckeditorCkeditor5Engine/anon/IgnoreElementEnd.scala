package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.mod.model.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgnoreElementEnd extends js.Object {
  var ignoreElementEnd: Boolean = js.native
  var shallow: Boolean = js.native
  var singleCharacters: Boolean = js.native
  var startPosition: Position = js.native
}

object IgnoreElementEnd {
  @scala.inline
  def apply(ignoreElementEnd: Boolean, shallow: Boolean, singleCharacters: Boolean, startPosition: Position): IgnoreElementEnd = {
    val __obj = js.Dynamic.literal(ignoreElementEnd = ignoreElementEnd.asInstanceOf[js.Any], shallow = shallow.asInstanceOf[js.Any], singleCharacters = singleCharacters.asInstanceOf[js.Any], startPosition = startPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgnoreElementEnd]
  }
  @scala.inline
  implicit class IgnoreElementEndOps[Self <: IgnoreElementEnd] (val x: Self) extends AnyVal {
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
    def setIgnoreElementEnd(value: Boolean): Self = this.set("ignoreElementEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setShallow(value: Boolean): Self = this.set("shallow", value.asInstanceOf[js.Any])
    @scala.inline
    def setSingleCharacters(value: Boolean): Self = this.set("singleCharacters", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartPosition(value: Position): Self = this.set("startPosition", value.asInstanceOf[js.Any])
  }
  
}

