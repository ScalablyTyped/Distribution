package typings.atCkeditorCkeditor5DashEngine

import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.model.Position
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.model.Range
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineStrings.backward
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineStrings.forward
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackwardBoundaries extends js.Object {
  var boundaries: js.UndefOr[Range] = js.undefined
  var direction: js.UndefOr[forward | backward] = js.undefined
  var ignoreElementEnd: js.UndefOr[Boolean] = js.undefined
  var shallow: js.UndefOr[Boolean] = js.undefined
  var singleCharacters: js.UndefOr[Boolean] = js.undefined
  var startPosition: Position
}

object Anon_BackwardBoundaries {
  @scala.inline
  def apply(
    startPosition: Position,
    boundaries: Range = null,
    direction: forward | backward = null,
    ignoreElementEnd: js.UndefOr[Boolean] = js.undefined,
    shallow: js.UndefOr[Boolean] = js.undefined,
    singleCharacters: js.UndefOr[Boolean] = js.undefined
  ): Anon_BackwardBoundaries = {
    val __obj = js.Dynamic.literal(startPosition = startPosition)
    if (boundaries != null) __obj.updateDynamic("boundaries")(boundaries)
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreElementEnd)) __obj.updateDynamic("ignoreElementEnd")(ignoreElementEnd)
    if (!js.isUndefined(shallow)) __obj.updateDynamic("shallow")(shallow)
    if (!js.isUndefined(singleCharacters)) __obj.updateDynamic("singleCharacters")(singleCharacters)
    __obj.asInstanceOf[Anon_BackwardBoundaries]
  }
}

