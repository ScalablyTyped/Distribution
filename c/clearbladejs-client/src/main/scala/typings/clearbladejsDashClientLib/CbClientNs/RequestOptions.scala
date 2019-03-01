package typings
package clearbladejsDashClientLib.CbClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions extends js.Object {
  var URI: js.UndefOr[java.lang.String] = js.undefined
  var authToken: js.UndefOr[java.lang.String] = js.undefined
  var body: js.UndefOr[java.lang.String] = js.undefined
  var endpoint: js.UndefOr[java.lang.String] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var qs: js.UndefOr[java.lang.String] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var useUser: js.UndefOr[scala.Boolean] = js.undefined
  var user: js.UndefOr[APIUser] = js.undefined
}

object RequestOptions {
  @scala.inline
  def apply(
    URI: java.lang.String = null,
    authToken: java.lang.String = null,
    body: java.lang.String = null,
    endpoint: java.lang.String = null,
    method: java.lang.String = null,
    qs: java.lang.String = null,
    timeout: scala.Int | scala.Double = null,
    useUser: js.UndefOr[scala.Boolean] = js.undefined,
    user: APIUser = null
  ): RequestOptions = {
    val __obj = js.Dynamic.literal()
    if (URI != null) __obj.updateDynamic("URI")(URI)
    if (authToken != null) __obj.updateDynamic("authToken")(authToken)
    if (body != null) __obj.updateDynamic("body")(body)
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint)
    if (method != null) __obj.updateDynamic("method")(method)
    if (qs != null) __obj.updateDynamic("qs")(qs)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(useUser)) __obj.updateDynamic("useUser")(useUser)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[RequestOptions]
  }
}

