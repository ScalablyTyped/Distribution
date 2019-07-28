package typings.clearbladejsDashNode.clearbladejsDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryOptions extends js.Object {
  var limit: js.UndefOr[Double] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
}

object QueryOptions {
  @scala.inline
  def apply(limit: Int | Double = null, offset: Int | Double = null): QueryOptions = {
    val __obj = js.Dynamic.literal()
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryOptions]
  }
}

