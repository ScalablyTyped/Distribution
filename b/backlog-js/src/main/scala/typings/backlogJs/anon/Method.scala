package typings.backlogJs.anon

import typings.backlogJs.mod.Params
import typings.std.FormData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Method extends js.Object {
  var method: String
  var params: js.UndefOr[Params | FormData] = js.undefined
  var path: String
}

object Method {
  @scala.inline
  def apply(method: String, path: String, params: Params | FormData = null): Method = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[Method]
  }
}

