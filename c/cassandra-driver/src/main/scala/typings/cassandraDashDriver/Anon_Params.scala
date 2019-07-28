package typings.cassandraDashDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Params extends js.Object {
  var params: js.UndefOr[js.Any] = js.undefined
  var query: String
}

object Anon_Params {
  @scala.inline
  def apply(query: String, params: js.Any = null): Anon_Params = {
    val __obj = js.Dynamic.literal(query = query)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[Anon_Params]
  }
}

