package typings
package atCkeditorCkeditor5DashEngineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Context extends js.Object {
  var context: js.UndefOr[
    atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.modelNs.SchemaContextDefinition
  ] = js.undefined
  var lastRangeBackward: js.UndefOr[scala.Boolean] = js.undefined
  var selectionAttributes: js.UndefOr[js.Array[js.Object]] = js.undefined
}

object Anon_Context {
  @scala.inline
  def apply(
    context: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.modelNs.SchemaContextDefinition = null,
    lastRangeBackward: js.UndefOr[scala.Boolean] = js.undefined,
    selectionAttributes: js.Array[js.Object] = null
  ): Anon_Context = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(lastRangeBackward)) __obj.updateDynamic("lastRangeBackward")(lastRangeBackward)
    if (selectionAttributes != null) __obj.updateDynamic("selectionAttributes")(selectionAttributes)
    __obj.asInstanceOf[Anon_Context]
  }
}

