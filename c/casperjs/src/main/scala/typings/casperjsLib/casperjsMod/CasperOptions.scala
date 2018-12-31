package typings
package casperjsLib.casperjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CasperOptions extends js.Object {
  var clientScripts: js.UndefOr[js.Array[_]] = js.undefined
  var exitOnError: js.UndefOr[scala.Boolean] = js.undefined
  var httpStatusHandlers: js.UndefOr[js.Any] = js.undefined
  var logLevel: js.UndefOr[java.lang.String] = js.undefined
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
  var page: js.UndefOr[phantomjsLib.WebPage] = js.undefined
  var pageSettings: js.UndefOr[js.Any] = js.undefined
  var remoteScripts: js.UndefOr[js.Array[_]] = js.undefined
  var retryTimeout: js.UndefOr[scala.Double] = js.undefined
  var safeLogs: js.UndefOr[scala.Boolean] = js.undefined
  var silentErrors: js.UndefOr[scala.Boolean] = js.undefined
  var stepTimeout: js.UndefOr[scala.Double] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var verbose: js.UndefOr[scala.Boolean] = js.undefined
  var viewportSize: js.UndefOr[js.Any] = js.undefined
  var waitTimeout: js.UndefOr[scala.Double] = js.undefined
}

