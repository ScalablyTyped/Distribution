package typings.cypress.Cypress

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
  var encoding: Encodings
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
    encoding: Encodings,
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
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], failOnStatusCode = failOnStatusCode.asInstanceOf[js.Any], followRedirect = followRedirect.asInstanceOf[js.Any], form = form.asInstanceOf[js.Any], gzip = gzip.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], qs = qs.asInstanceOf[js.Any], retryOnNetworkFailure = retryOnNetworkFailure.asInstanceOf[js.Any], retryOnStatusCodeFailure = retryOnStatusCodeFailure.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptions]
  }
}

