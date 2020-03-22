package typings.bugsnagJs.reportMod

import typings.bugsnagJs.AnonDictkey
import typings.bugsnagJs.AnonUrl
import typings.bugsnagJs.bugsnagJsStrings.error
import typings.bugsnagJs.bugsnagJsStrings.info
import typings.bugsnagJs.bugsnagJsStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Report extends js.Object {
  var apiKey: String = js.native
  var app: AnonDictkey = js.native
  var breadcrumbs: js.Array[typings.bugsnagJs.breadcrumbMod.default] = js.native
  var context: String = js.native
  var device: js.Object = js.native
  var errorClass: String = js.native
  var errorMessage: String = js.native
  var groupingHash: String = js.native
  var metaData: js.Object = js.native
  var request: AnonUrl = js.native
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

