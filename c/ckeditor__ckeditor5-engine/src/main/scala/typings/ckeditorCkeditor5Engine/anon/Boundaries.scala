package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.backward
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.forward
import typings.ckeditorCkeditor5Engine.mod.model.Position
import typings.ckeditorCkeditor5Engine.mod.model.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Boundaries extends js.Object {
  var boundaries: js.UndefOr[Range] = js.undefined
  var direction: js.UndefOr[forward | backward] = js.undefined
  var ignoreElementEnd: js.UndefOr[Boolean] = js.undefined
  var shallow: js.UndefOr[Boolean] = js.undefined
  var singleCharacters: js.UndefOr[Boolean] = js.undefined
  var startPosition: Position
}

object Boundaries {
  @scala.inline
  def apply(
    startPosition: Position,
    boundaries: Range = null,
    direction: forward | backward = null,
    ignoreElementEnd: js.UndefOr[Boolean] = js.undefined,
    shallow: js.UndefOr[Boolean] = js.undefined,
    singleCharacters: js.UndefOr[Boolean] = js.undefined
  ): Boundaries = {
    val __obj = js.Dynamic.literal(startPosition = startPosition.asInstanceOf[js.Any])
    if (boundaries != null) __obj.updateDynamic("boundaries")(boundaries.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreElementEnd)) __obj.updateDynamic("ignoreElementEnd")(ignoreElementEnd.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shallow)) __obj.updateDynamic("shallow")(shallow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(singleCharacters)) __obj.updateDynamic("singleCharacters")(singleCharacters.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Boundaries]
  }
}

