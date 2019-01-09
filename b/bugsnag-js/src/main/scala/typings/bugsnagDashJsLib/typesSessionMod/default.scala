package typings
package bugsnagDashJsLib.typesSessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bugsnag-js/types/session", JSImport.Default)
@js.native
class default () extends Session {
  /* CompleteClass */
  override var events: bugsnagDashJsLib.Anon_Handled = js.native
  /* CompleteClass */
  override var id: java.lang.String = js.native
  /* CompleteClass */
  override var startedAt: java.lang.String = js.native
  /* CompleteClass */
  override def trackError(report: bugsnagDashJsLib.typesReportMod.default): scala.Unit = js.native
}

