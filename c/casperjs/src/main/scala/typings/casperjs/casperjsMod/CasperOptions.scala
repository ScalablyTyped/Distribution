package typings.casperjs.casperjsMod

import typings.phantomjs.WebPage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CasperOptions extends js.Object {
  var clientScripts: js.UndefOr[js.Array[_]] = js.undefined
  var exitOnError: js.UndefOr[Boolean] = js.undefined
  var httpStatusHandlers: js.UndefOr[js.Any] = js.undefined
  var logLevel: js.UndefOr[String] = js.undefined
  var onAlert: js.UndefOr[js.Function] = js.undefined
  var onDie: js.UndefOr[js.Function] = js.undefined
  var onError: js.UndefOr[js.Function] = js.undefined
  var onLoadError: js.UndefOr[js.Function] = js.undefined
  var onPageInitialized: js.UndefOr[js.Function] = js.undefined
  var onResourceReceived: js.UndefOr[js.Function] = js.undefined
  var onResourceRequested: js.UndefOr[js.Function] = js.undefined
  var onStepComplete: js.UndefOr[js.Function] = js.undefined
  var onStepTimeout: js.UndefOr[js.Function] = js.undefined
  var onTimeout: js.UndefOr[js.Function] = js.undefined
  var onWaitTimeout: js.UndefOr[js.Function] = js.undefined
  var page: js.UndefOr[WebPage] = js.undefined
  var pageSettings: js.UndefOr[js.Any] = js.undefined
  var remoteScripts: js.UndefOr[js.Array[_]] = js.undefined
  var retryTimeout: js.UndefOr[Double] = js.undefined
  var safeLogs: js.UndefOr[Boolean] = js.undefined
  var silentErrors: js.UndefOr[Boolean] = js.undefined
  var stepTimeout: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
  var viewportSize: js.UndefOr[js.Any] = js.undefined
  var waitTimeout: js.UndefOr[Double] = js.undefined
}

object CasperOptions {
  @scala.inline
  def apply(
    clientScripts: js.Array[_] = null,
    exitOnError: js.UndefOr[Boolean] = js.undefined,
    httpStatusHandlers: js.Any = null,
    logLevel: String = null,
    onAlert: js.Function = null,
    onDie: js.Function = null,
    onError: js.Function = null,
    onLoadError: js.Function = null,
    onPageInitialized: js.Function = null,
    onResourceReceived: js.Function = null,
    onResourceRequested: js.Function = null,
    onStepComplete: js.Function = null,
    onStepTimeout: js.Function = null,
    onTimeout: js.Function = null,
    onWaitTimeout: js.Function = null,
    page: WebPage = null,
    pageSettings: js.Any = null,
    remoteScripts: js.Array[_] = null,
    retryTimeout: Int | Double = null,
    safeLogs: js.UndefOr[Boolean] = js.undefined,
    silentErrors: js.UndefOr[Boolean] = js.undefined,
    stepTimeout: Int | Double = null,
    timeout: Int | Double = null,
    verbose: js.UndefOr[Boolean] = js.undefined,
    viewportSize: js.Any = null,
    waitTimeout: Int | Double = null
  ): CasperOptions = {
    val __obj = js.Dynamic.literal()
    if (clientScripts != null) __obj.updateDynamic("clientScripts")(clientScripts.asInstanceOf[js.Any])
    if (!js.isUndefined(exitOnError)) __obj.updateDynamic("exitOnError")(exitOnError.asInstanceOf[js.Any])
    if (httpStatusHandlers != null) __obj.updateDynamic("httpStatusHandlers")(httpStatusHandlers.asInstanceOf[js.Any])
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (onAlert != null) __obj.updateDynamic("onAlert")(onAlert.asInstanceOf[js.Any])
    if (onDie != null) __obj.updateDynamic("onDie")(onDie.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(onError.asInstanceOf[js.Any])
    if (onLoadError != null) __obj.updateDynamic("onLoadError")(onLoadError.asInstanceOf[js.Any])
    if (onPageInitialized != null) __obj.updateDynamic("onPageInitialized")(onPageInitialized.asInstanceOf[js.Any])
    if (onResourceReceived != null) __obj.updateDynamic("onResourceReceived")(onResourceReceived.asInstanceOf[js.Any])
    if (onResourceRequested != null) __obj.updateDynamic("onResourceRequested")(onResourceRequested.asInstanceOf[js.Any])
    if (onStepComplete != null) __obj.updateDynamic("onStepComplete")(onStepComplete.asInstanceOf[js.Any])
    if (onStepTimeout != null) __obj.updateDynamic("onStepTimeout")(onStepTimeout.asInstanceOf[js.Any])
    if (onTimeout != null) __obj.updateDynamic("onTimeout")(onTimeout.asInstanceOf[js.Any])
    if (onWaitTimeout != null) __obj.updateDynamic("onWaitTimeout")(onWaitTimeout.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (pageSettings != null) __obj.updateDynamic("pageSettings")(pageSettings.asInstanceOf[js.Any])
    if (remoteScripts != null) __obj.updateDynamic("remoteScripts")(remoteScripts.asInstanceOf[js.Any])
    if (retryTimeout != null) __obj.updateDynamic("retryTimeout")(retryTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(safeLogs)) __obj.updateDynamic("safeLogs")(safeLogs.asInstanceOf[js.Any])
    if (!js.isUndefined(silentErrors)) __obj.updateDynamic("silentErrors")(silentErrors.asInstanceOf[js.Any])
    if (stepTimeout != null) __obj.updateDynamic("stepTimeout")(stepTimeout.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    if (viewportSize != null) __obj.updateDynamic("viewportSize")(viewportSize.asInstanceOf[js.Any])
    if (waitTimeout != null) __obj.updateDynamic("waitTimeout")(waitTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[CasperOptions]
  }
}

