package typings.backlogDashJs

import typings.backlogDashJs.backlogDashJsMod.Params
import typings.std.FormData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Method extends js.Object {
  var method: String
  var params: js.UndefOr[Params | FormData] = js.undefined
  var path: String
}

object Anon_Method {
  @scala.inline
  def apply(method: String, path: String, params: Params | FormData = null): Anon_Method = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Method]
  }
}

