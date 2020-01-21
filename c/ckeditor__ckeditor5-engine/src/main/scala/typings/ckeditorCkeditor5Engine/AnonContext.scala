package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.mod.model.SchemaContextDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContext extends js.Object {
  var context: js.UndefOr[SchemaContextDefinition] = js.undefined
  var lastRangeBackward: js.UndefOr[Boolean] = js.undefined
  var selectionAttributes: js.UndefOr[js.Array[js.Object]] = js.undefined
}

object AnonContext {
  @scala.inline
  def apply(
    context: SchemaContextDefinition = null,
    lastRangeBackward: js.UndefOr[Boolean] = js.undefined,
    selectionAttributes: js.Array[js.Object] = null
  ): AnonContext = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(lastRangeBackward)) __obj.updateDynamic("lastRangeBackward")(lastRangeBackward.asInstanceOf[js.Any])
    if (selectionAttributes != null) __obj.updateDynamic("selectionAttributes")(selectionAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContext]
  }
}

