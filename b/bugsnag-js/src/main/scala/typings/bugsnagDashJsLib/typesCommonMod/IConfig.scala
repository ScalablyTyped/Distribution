package typings
package bugsnagDashJsLib.typesCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConfig extends js.Object {
  var apiKey: java.lang.String
  var appVersion: js.UndefOr[java.lang.String] = js.undefined
  var autoBreadcrumbs: js.UndefOr[scala.Boolean] = js.undefined
  var autoCaptureSessions: js.UndefOr[scala.Boolean] = js.undefined
  var autoNotify: js.UndefOr[scala.Boolean] = js.undefined
  var beforeSend: js.UndefOr[BeforeSend | js.Array[BeforeSend]] = js.undefined
  var collectUserIp: js.UndefOr[scala.Boolean] = js.undefined
  var consoleBreadcrumbsEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var endpoint: js.UndefOr[java.lang.String] = js.undefined
  var endpoints: js.UndefOr[bugsnagDashJsLib.Anon_Notify] = js.undefined
  var interactionBreadcrumbsEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var logger: js.UndefOr[bugsnagDashJsLib.typesClientMod.ILogger | scala.Null] = js.undefined
  var maxBreadcrumbs: js.UndefOr[scala.Double] = js.undefined
  var maxEvents: js.UndefOr[scala.Double] = js.undefined
  var metaData: js.UndefOr[js.Object | scala.Null] = js.undefined
  var navigationBreadcrumbsEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var networkBreadcrumbsEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var notifyReleaseStages: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var releaseStage: js.UndefOr[java.lang.String] = js.undefined
  var sessionEndpoint: js.UndefOr[java.lang.String] = js.undefined
  var user: js.UndefOr[js.Object | scala.Null] = js.undefined
}

