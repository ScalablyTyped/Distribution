package typings.atCkeditorCkeditor5DashEngine

import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.view.Position
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.view.Range
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.view.TreeWalkerDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Boundaries extends js.Object {
  var boundaries: js.UndefOr[Range] = js.undefined
  var direction: js.UndefOr[TreeWalkerDirection] = js.undefined
  var ignoreElementEnd: js.UndefOr[Boolean] = js.undefined
  var shallow: js.UndefOr[Boolean] = js.undefined
  var singleCharacters: js.UndefOr[Boolean] = js.undefined
  var startPosition: js.UndefOr[Position] = js.undefined
}

object Anon_Boundaries {
  @scala.inline
  def apply(
    boundaries: Range = null,
    direction: TreeWalkerDirection = null,
    ignoreElementEnd: js.UndefOr[Boolean] = js.undefined,
    shallow: js.UndefOr[Boolean] = js.undefined,
    singleCharacters: js.UndefOr[Boolean] = js.undefined,
    startPosition: Position = null
  ): Anon_Boundaries = {
    val __obj = js.Dynamic.literal()
    if (boundaries != null) __obj.updateDynamic("boundaries")(boundaries.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreElementEnd)) __obj.updateDynamic("ignoreElementEnd")(ignoreElementEnd.asInstanceOf[js.Any])
    if (!js.isUndefined(shallow)) __obj.updateDynamic("shallow")(shallow.asInstanceOf[js.Any])
    if (!js.isUndefined(singleCharacters)) __obj.updateDynamic("singleCharacters")(singleCharacters.asInstanceOf[js.Any])
    if (startPosition != null) __obj.updateDynamic("startPosition")(startPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Boundaries]
  }
}

