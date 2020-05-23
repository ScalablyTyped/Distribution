package typings.chromeTraceEvent.mod

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
    fields: js.UndefOr[Null | Fields] = js.undefined,
    noStream: js.UndefOr[Boolean] = js.undefined,
    objectMode: js.UndefOr[Null | Boolean] = js.undefined,
    parent: js.UndefOr[Null | Tracer] = js.undefined
  ): TracerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fields)) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(noStream)) __obj.updateDynamic("noStream")(noStream.get.asInstanceOf[js.Any])
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode.asInstanceOf[js.Any])
    if (!js.isUndefined(parent)) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[TracerOptions]
  }
}

