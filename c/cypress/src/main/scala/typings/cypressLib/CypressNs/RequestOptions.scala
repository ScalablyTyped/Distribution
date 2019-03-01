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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("auth")(auth)
    __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    __obj.updateDynamic("failOnStatusCode")(failOnStatusCode)
    __obj.updateDynamic("followRedirect")(followRedirect)
    __obj.updateDynamic("form")(form)
    __obj.updateDynamic("gzip")(gzip)
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("log")(log)
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("qs")(qs)
    __obj.updateDynamic("timeout")(timeout)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[RequestOptions]
  }
}

