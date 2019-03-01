package typings
package backlogDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Method extends js.Object {
  var method: java.lang.String
  var params: js.UndefOr[Params | stdLib.FormData] = js.undefined
  var path: java.lang.String
}

object Anon_Method {
  @scala.inline
  def apply(method: java.lang.String, path: java.lang.String, params: Params | stdLib.FormData = null): Anon_Method = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("path")(path)
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Method]
  }
}

