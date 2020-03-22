package typings.cypress

import typings.cypress.cypressMod.Cypress.HttpMethod
import typings.cypress.cypressMod.Cypress.RequestBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<cypress.cypress.Cypress.RequestOptions> */
trait PartialRequestOptions extends js.Object {
  var auth: js.UndefOr[js.Object] = js.undefined
  var body: js.UndefOr[RequestBody] = js.undefined
  var failOnStatusCode: js.UndefOr[Boolean] = js.undefined
  var followRedirect: js.UndefOr[Boolean] = js.undefined
  var form: js.UndefOr[Boolean] = js.undefined
  var gzip: js.UndefOr[Boolean] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  var log: js.UndefOr[Boolean] = js.undefined
  var method: js.UndefOr[HttpMethod] = js.undefined
  var qs: js.UndefOr[js.Object] = js.undefined
  var retryOnNetworkFailure: js.UndefOr[Boolean] = js.undefined
  var retryOnStatusCodeFailure: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object PartialRequestOptions {
  @scala.inline
  def apply(
    auth: js.Object = null,
    body: RequestBody = null,
    failOnStatusCode: js.UndefOr[Boolean] = js.undefined,
    followRedirect: js.UndefOr[Boolean] = js.undefined,
    form: js.UndefOr[Boolean] = js.undefined,
    gzip: js.UndefOr[Boolean] = js.undefined,
    headers: js.Object = null,
    log: js.UndefOr[Boolean] = js.undefined,
    method: HttpMethod = null,
    qs: js.Object = null,
    retryOnNetworkFailure: js.UndefOr[Boolean] = js.undefined,
    retryOnStatusCodeFailure: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null,
    url: String = null
  ): PartialRequestOptions = {
    val __obj = js.Dynamic.literal()
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(failOnStatusCode)) __obj.updateDynamic("failOnStatusCode")(failOnStatusCode.asInstanceOf[js.Any])
    if (!js.isUndefined(followRedirect)) __obj.updateDynamic("followRedirect")(followRedirect.asInstanceOf[js.Any])
    if (!js.isUndefined(form)) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (!js.isUndefined(gzip)) __obj.updateDynamic("gzip")(gzip.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(log)) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (qs != null) __obj.updateDynamic("qs")(qs.asInstanceOf[js.Any])
    if (!js.isUndefined(retryOnNetworkFailure)) __obj.updateDynamic("retryOnNetworkFailure")(retryOnNetworkFailure.asInstanceOf[js.Any])
    if (!js.isUndefined(retryOnStatusCodeFailure)) __obj.updateDynamic("retryOnStatusCodeFailure")(retryOnStatusCodeFailure.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialRequestOptions]
  }
}

