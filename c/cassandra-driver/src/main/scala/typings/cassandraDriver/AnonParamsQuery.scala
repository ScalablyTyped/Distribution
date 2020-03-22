package typings.cassandraDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParamsQuery extends js.Object {
  var params: js.UndefOr[js.Any] = js.undefined
  var query: String
}

object AnonParamsQuery {
  @scala.inline
  def apply(query: String, params: js.Any = null): AnonParamsQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonParamsQuery]
  }
}

