package typings.chromeDashApps.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// #region chrome.diagnostics
/////////////////
// Diagnostics //
/////////////////
/**
  * @requires(CrOS) Only Chrome OS. Crashes app on Windows.
  * @requires Permissions: 'diagnostics'
  */
@JSGlobal("chrome.diagnostics")
@js.native
object diagnostics extends js.Object {
  /** @todo TODO PROPER DOCS */
  def sendPacket(options: js.Object, callback: js.Function0[Unit]): Unit = js.native
}

