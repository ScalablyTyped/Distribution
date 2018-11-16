package typings
package bugsnagDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesCommonMod {
  type BeforeSend = js.Function1[/* report */ bugsnagDashJsLib.typesReportMod.default, scala.Boolean | scala.Unit]
  type BeforeSession = js.Function1[/* client */ bugsnagDashJsLib.typesClientMod.Client, scala.Unit]
}
