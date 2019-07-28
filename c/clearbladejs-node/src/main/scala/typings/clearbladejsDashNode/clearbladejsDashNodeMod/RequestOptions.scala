package typings.clearbladejsDashNode.clearbladejsDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions extends js.Object {
  var URI: js.UndefOr[String] = js.undefined
  var authToken: js.UndefOr[String] = js.undefined
  var body: js.UndefOr[String] = js.undefined
  var endpoint: js.UndefOr[String] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var qs: js.UndefOr[String] = js.undefined
  var systemKey: String
  var systemSecret: String
  var useUser: js.UndefOr[Boolean] = js.undefined
  var user: js.UndefOr[APIUser] = js.undefined
}

object RequestOptions {
  @scala.inline
  def apply(
    systemKey: String,
    systemSecret: String,
    URI: String = null,
    authToken: String = null,
    body: String = null,
    endpoint: String = null,
    method: String = null,
    qs: String = null,
    useUser: js.UndefOr[Boolean] = js.undefined,
    user: APIUser = null
  ): RequestOptions = {
    val __obj = js.Dynamic.literal(systemKey = systemKey, systemSecret = systemSecret)
    if (URI != null) __obj.updateDynamic("URI")(URI)
    if (authToken != null) __obj.updateDynamic("authToken")(authToken)
    if (body != null) __obj.updateDynamic("body")(body)
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint)
    if (method != null) __obj.updateDynamic("method")(method)
    if (qs != null) __obj.updateDynamic("qs")(qs)
    if (!js.isUndefined(useUser)) __obj.updateDynamic("useUser")(useUser)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[RequestOptions]
  }
}

