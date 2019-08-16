package typings.cassandraDashDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ParamsQuery extends js.Object {
  var params: js.UndefOr[js.Array[_]] = js.undefined
  var query: String
}

object Anon_ParamsQuery {
  @scala.inline
  def apply(query: String, params: js.Array[_] = null): Anon_ParamsQuery = {
    val __obj = js.Dynamic.literal(query = query)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[Anon_ParamsQuery]
  }
}

