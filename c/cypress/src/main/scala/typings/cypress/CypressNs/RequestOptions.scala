package typings.cypress.CypressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Full set of possible options for cy.request call
  */
trait RequestOptions
  extends Loggable
     with Timeoutable
     with Failable {
  var auth: js.Object
  var body: RequestBody
  var followRedirect: Boolean
  var form: Boolean
  var gzip: Boolean
  var headers: js.Object
  var method: HttpMethod
  var qs: js.Object
  var url: String
}

object RequestOptions {
  @scala.inline
  def apply(
    auth: js.Object,
    body: RequestBody,
    failOnStatusCode: Boolean,
    followRedirect: Boolean,
    form: Boolean,
    gzip: Boolean,
    headers: js.Object,
    log: Boolean,
    method: HttpMethod,
    qs: js.Object,
    retryOnNetworkFailure: Boolean,
    retryOnStatusCodeFailure: Boolean,
    timeout: Double,
    url: String
  ): RequestOptions = {
    val __obj = js.Dynamic.literal(auth = auth, body = body.asInstanceOf[js.Any], failOnStatusCode = failOnStatusCode, followRedirect = followRedirect, form = form, gzip = gzip, headers = headers, log = log, method = method, qs = qs, retryOnNetworkFailure = retryOnNetworkFailure, retryOnStatusCodeFailure = retryOnStatusCodeFailure, timeout = timeout, url = url)
  
    __obj.asInstanceOf[RequestOptions]
  }
}

