package typings
package davLib.davMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dav", "Request")
@js.native
class Request () extends js.Object {
  def this(options: RequestOptions) = this()
  var method: java.lang.String = js.native
  var onerror: js.UndefOr[js.Function1[/* error */ stdLib.Error, _]] = js.native
  var requestData: js.UndefOr[java.lang.String] = js.native
  var transformRequest: js.UndefOr[js.Function1[/* xhr */ js.Any, _]] = js.native
  var transformResponse: js.UndefOr[js.Function1[/* xhr */ js.Any, _]] = js.native
}

