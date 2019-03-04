package typings
package cypressLib.CypressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Full set of possible options for cy.request call
  */
trait RequestOptions
  extends Loggable
     with Timeoutable {
  var auth: js.Object
  var body: RequestBody
  var failOnStatusCode: scala.Boolean
  var followRedirect: scala.Boolean
  var form: scala.Boolean
  var gzip: scala.Boolean
  var headers: js.Object
  var method: HttpMethod
  var qs: js.Object
  var url: java.lang.String
}

object RequestOptions {
  @scala.inline
  def apply(
    auth: js.Object,
    body: RequestBody,
    failOnStatusCode: scala.Boolean,
    followRedirect: scala.Boolean,
    form: scala.Boolean,
    gzip: scala.Boolean,
    headers: js.Object,
    log: scala.Boolean,
    method: HttpMethod,
    qs: js.Object,
    timeout: scala.Double,
    url: java.lang.String
  ): RequestOptions = {
    val __obj = js.Dynamic.literal(auth = auth, body = body.asInstanceOf[js.Any], failOnStatusCode = failOnStatusCode, followRedirect = followRedirect, form = form, gzip = gzip, headers = headers, log = log, method = method, qs = qs, timeout = timeout, url = url)
  
    __obj.asInstanceOf[RequestOptions]
  }
}

