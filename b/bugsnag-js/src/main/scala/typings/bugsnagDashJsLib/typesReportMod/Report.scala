package typings
package bugsnagDashJsLib.typesReportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Report extends js.Object {
  var apiKey: java.lang.String = js.native
  var app: bugsnagDashJsLib.Anon_Key = js.native
  var breadcrumbs: js.Array[bugsnagDashJsLib.typesBreadcrumbMod.default] = js.native
  var context: java.lang.String = js.native
  var device: js.Object = js.native
  var errorClass: java.lang.String = js.native
  var errorMessage: java.lang.String = js.native
  var groupingHash: java.lang.String = js.native
  var metaData: js.Object = js.native
  var request: bugsnagDashJsLib.Anon_UrlString = js.native
  var session: js.Object = js.native
  var severity: bugsnagDashJsLib.bugsnagDashJsLibStrings.info | bugsnagDashJsLib.bugsnagDashJsLibStrings.warning | bugsnagDashJsLib.bugsnagDashJsLibStrings.error = js.native
  var stacktrace: js.Array[IStackframe] = js.native
  var user: js.Object = js.native
  def ignore(): scala.Unit = js.native
  def isIgnored(): scala.Boolean = js.native
  def removeMetaData(section: java.lang.String, property: java.lang.String): Report = js.native
  def updateMetaData(section: java.lang.String, property: java.lang.String, value: js.Object): Report = js.native
  def updateMetaData(section: java.lang.String, value: js.Object): Report = js.native
}

