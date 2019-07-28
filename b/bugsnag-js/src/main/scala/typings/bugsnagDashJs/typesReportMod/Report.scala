package typings.bugsnagDashJs.typesReportMod

import typings.bugsnagDashJs.Anon_Key
import typings.bugsnagDashJs.Anon_Url
import typings.bugsnagDashJs.bugsnagDashJsStrings.error
import typings.bugsnagDashJs.bugsnagDashJsStrings.info
import typings.bugsnagDashJs.bugsnagDashJsStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Report extends js.Object {
  var apiKey: String = js.native
  var app: Anon_Key = js.native
  var breadcrumbs: js.Array[typings.bugsnagDashJs.typesBreadcrumbMod.default] = js.native
  var context: String = js.native
  var device: js.Object = js.native
  var errorClass: String = js.native
  var errorMessage: String = js.native
  var groupingHash: String = js.native
  var metaData: js.Object = js.native
  var request: Anon_Url = js.native
  var session: js.Object = js.native
  var severity: info | warning | error = js.native
  var stacktrace: js.Array[IStackframe] = js.native
  var user: js.Object = js.native
  def ignore(): Unit = js.native
  def isIgnored(): Boolean = js.native
  def removeMetaData(section: String, property: String): Report = js.native
  def updateMetaData(section: String, property: String, value: js.Object): Report = js.native
  def updateMetaData(section: String, value: js.Object): Report = js.native
}

