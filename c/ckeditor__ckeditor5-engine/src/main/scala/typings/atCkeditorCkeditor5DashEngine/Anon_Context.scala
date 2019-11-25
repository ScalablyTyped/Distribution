package typings.atCkeditorCkeditor5DashEngine

import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.model.SchemaContextDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Context extends js.Object {
  var context: js.UndefOr[SchemaContextDefinition] = js.undefined
  var lastRangeBackward: js.UndefOr[Boolean] = js.undefined
  var selectionAttributes: js.UndefOr[js.Array[js.Object]] = js.undefined
}

object Anon_Context {
  @scala.inline
  def apply(
    context: SchemaContextDefinition = null,
    lastRangeBackward: js.UndefOr[Boolean] = js.undefined,
    selectionAttributes: js.Array[js.Object] = null
  ): Anon_Context = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(lastRangeBackward)) __obj.updateDynamic("lastRangeBackward")(lastRangeBackward.asInstanceOf[js.Any])
    if (selectionAttributes != null) __obj.updateDynamic("selectionAttributes")(selectionAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Context]
  }
}

