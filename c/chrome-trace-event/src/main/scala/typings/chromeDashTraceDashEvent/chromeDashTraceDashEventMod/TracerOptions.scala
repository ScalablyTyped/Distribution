package typings.chromeDashTraceDashEvent.chromeDashTraceDashEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TracerOptions extends js.Object {
  var fields: js.UndefOr[Fields | Null] = js.undefined
  var noStream: js.UndefOr[Boolean] = js.undefined
  var objectMode: js.UndefOr[Boolean | Null] = js.undefined
  var parent: js.UndefOr[Tracer | Null] = js.undefined
}

object TracerOptions {
  @scala.inline
  def apply(
    fields: Fields = null,
    noStream: js.UndefOr[Boolean] = js.undefined,
    objectMode: js.UndefOr[Boolean] = js.undefined,
    parent: Tracer = null
  ): TracerOptions = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (!js.isUndefined(noStream)) __obj.updateDynamic("noStream")(noStream)
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[TracerOptions]
  }
}

