package typings.bugsnagDashJs.typesSessionMod

import typings.bugsnagDashJs.Anon_Handled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bugsnag-js/types/session", JSImport.Default)
@js.native
class default () extends Session {
  /* CompleteClass */
  override var events: Anon_Handled = js.native
  /* CompleteClass */
  override var id: String = js.native
  /* CompleteClass */
  override var startedAt: String = js.native
  /* CompleteClass */
  override def trackError(report: typings.bugsnagDashJs.typesReportMod.default): Unit = js.native
}

