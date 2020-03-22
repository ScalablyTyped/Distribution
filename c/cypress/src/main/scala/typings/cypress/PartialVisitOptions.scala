package typings.cypress

import org.scalablytyped.runtime.StringDictionary
import typings.cypress.cypressMod.Cypress.Auth
import typings.cypress.cypressMod.Cypress.RequestBody
import typings.cypress.cypressStrings.GET
import typings.cypress.cypressStrings.POST
import typings.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<cypress.cypress.Cypress.VisitOptions> */
trait PartialVisitOptions extends js.Object {
  var auth: js.UndefOr[Auth] = js.undefined
  var body: js.UndefOr[RequestBody] = js.undefined
  var failOnStatusCode: js.UndefOr[Boolean] = js.undefined
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  var log: js.UndefOr[Boolean] = js.undefined
  var method: js.UndefOr[GET | POST] = js.undefined
  var onBeforeLoad: js.UndefOr[js.Function1[/* win */ Window_, Unit]] = js.undefined
  var onLoad: js.UndefOr[js.Function1[/* win */ Window_, Unit]] = js.undefined
  var qs: js.UndefOr[js.Object] = js.undefined
  var retryOnNetworkFailure: js.UndefOr[Boolean] = js.undefined
  var retryOnStatusCodeFailure: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object PartialVisitOptions {
  @scala.inline
  def apply(
    auth: Auth = null,
    body: RequestBody = null,
    failOnStatusCode: js.UndefOr[Boolean] = js.undefined,
    headers: StringDictionary[String] = null,
    log: js.UndefOr[Boolean] = js.undefined,
    method: GET | POST = null,
    onBeforeLoad: /* win */ Window_ => Unit = null,
    onLoad: /* win */ Window_ => Unit = null,
    qs: js.Object = null,
    retryOnNetworkFailure: js.UndefOr[Boolean] = js.undefined,
    retryOnStatusCodeFailure: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null,
    url: String = null
  ): PartialVisitOptions = {
    val __obj = js.Dynamic.literal()
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(failOnStatusCode)) __obj.updateDynamic("failOnStatusCode")(failOnStatusCode.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(log)) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (onBeforeLoad != null) __obj.updateDynamic("onBeforeLoad")(js.Any.fromFunction1(onBeforeLoad))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    if (qs != null) __obj.updateDynamic("qs")(qs.asInstanceOf[js.Any])
    if (!js.isUndefined(retryOnNetworkFailure)) __obj.updateDynamic("retryOnNetworkFailure")(retryOnNetworkFailure.asInstanceOf[js.Any])
    if (!js.isUndefined(retryOnStatusCodeFailure)) __obj.updateDynamic("retryOnStatusCodeFailure")(retryOnStatusCodeFailure.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialVisitOptions]
  }
}

