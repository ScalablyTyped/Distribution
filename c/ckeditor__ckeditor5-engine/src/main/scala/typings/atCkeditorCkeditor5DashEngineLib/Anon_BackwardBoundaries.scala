package typings
package atCkeditorCkeditor5DashEngineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackwardBoundaries extends js.Object {
  var boundaries: js.UndefOr[atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.modelNs.Range] = js.undefined
  var direction: js.UndefOr[
    atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineLibStrings.forward | atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineLibStrings.backward
  ] = js.undefined
  var ignoreElementEnd: js.UndefOr[scala.Boolean] = js.undefined
  var shallow: js.UndefOr[scala.Boolean] = js.undefined
  var singleCharacters: js.UndefOr[scala.Boolean] = js.undefined
  var startPosition: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.modelNs.Position
}

object Anon_BackwardBoundaries {
  @scala.inline
  def apply(
    startPosition: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.modelNs.Position,
    boundaries: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.modelNs.Range = null,
    direction: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineLibStrings.forward | atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineLibStrings.backward = null,
    ignoreElementEnd: js.UndefOr[scala.Boolean] = js.undefined,
    shallow: js.UndefOr[scala.Boolean] = js.undefined,
    singleCharacters: js.UndefOr[scala.Boolean] = js.undefined
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

