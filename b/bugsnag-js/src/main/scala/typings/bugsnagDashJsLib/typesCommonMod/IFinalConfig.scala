package typings
package bugsnagDashJsLib.typesCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFinalConfig extends IConfig {
  @JSName("autoBreadcrumbs")
  var autoBreadcrumbs_IFinalConfig: scala.Boolean
  @JSName("autoCaptureSessions")
  var autoCaptureSessions_IFinalConfig: scala.Boolean
  @JSName("autoNotify")
  var autoNotify_IFinalConfig: scala.Boolean
  @JSName("beforeSend")
  var beforeSend_IFinalConfig: js.Array[BeforeSend]
  @JSName("collectUserIp")
  var collectUserIp_IFinalConfig: scala.Boolean
  @JSName("consoleBreadcrumbsEnabled")
  var consoleBreadcrumbsEnabled_IFinalConfig: scala.Boolean
  @JSName("endpoints")
  var endpoints_IFinalConfig: bugsnagDashJsLib.Anon_Notify
  @JSName("interactionBreadcrumbsEnabled")
  var interactionBreadcrumbsEnabled_IFinalConfig: scala.Boolean
  @JSName("maxBreadcrumbs")
  var maxBreadcrumbs_IFinalConfig: scala.Double
  @JSName("maxEvents")
  var maxEvents_IFinalConfig: scala.Double
  @JSName("metaData")
  var metaData_IFinalConfig: js.Object | scala.Null
  @JSName("navigationBreadcrumbsEnabled")
  var navigationBreadcrumbsEnabled_IFinalConfig: scala.Boolean
  @JSName("notifyReleaseStages")
  var notifyReleaseStages_IFinalConfig: js.Array[java.lang.String]
  @JSName("releaseStage")
  var releaseStage_IFinalConfig: java.lang.String
  @JSName("user")
  var user_IFinalConfig: js.Object | scala.Null
}

