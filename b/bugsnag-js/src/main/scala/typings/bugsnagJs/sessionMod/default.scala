package typings.bugsnagJs.sessionMod

import typings.bugsnagJs.anon.Handled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bugsnag-js/types/session", JSImport.Default)
@js.native
class default () extends Session {
  /* CompleteClass */
  override var events: Handled = js.native
  /* CompleteClass */
  override var id: String = js.native
  /* CompleteClass */
  override var startedAt: String = js.native
  /* CompleteClass */
  override def trackError(report: typings.bugsnagJs.reportMod.default): Unit = js.native
}

