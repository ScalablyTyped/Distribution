package typings.bugsnagDashJs

import typings.bugsnagDashJs.typesClientMod.Client
import typings.bugsnagDashJs.typesReportMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesCommonMod {
  type BeforeSend = js.Function1[/* report */ default, Boolean | Unit]
  type BeforeSession = js.Function1[/* client */ Client, Unit]
}
