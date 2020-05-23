package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.mod.model.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgnoreElementEnd extends js.Object {
  var ignoreElementEnd: Boolean
  var shallow: Boolean
  var singleCharacters: Boolean
  var startPosition: Position
}

object IgnoreElementEnd {
  @scala.inline
  def apply(ignoreElementEnd: Boolean, shallow: Boolean, singleCharacters: Boolean, startPosition: Position): IgnoreElementEnd = {
    val __obj = js.Dynamic.literal(ignoreElementEnd = ignoreElementEnd.asInstanceOf[js.Any], shallow = shallow.asInstanceOf[js.Any], singleCharacters = singleCharacters.asInstanceOf[js.Any], startPosition = startPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgnoreElementEnd]
  }
}

