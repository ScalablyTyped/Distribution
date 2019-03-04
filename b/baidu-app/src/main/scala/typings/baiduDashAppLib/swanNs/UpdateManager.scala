package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// #region 更新
trait UpdateManager extends js.Object {
  def applyUpdate(): scala.Unit
  def onCheckForUpdate(callback: js.Function1[/* res */ baiduDashAppLib.Anon_HasUpdate, scala.Unit]): scala.Unit
  def onUpdateFailed(callback: js.Function1[/* res */ js.Any, scala.Unit]): scala.Unit
  def onUpdateReady(callback: js.Function1[/* res */ baiduDashAppLib.Anon_Confirm, scala.Unit]): scala.Unit
}

object UpdateManager {
  @scala.inline
  def apply(
    applyUpdate: js.Function0[scala.Unit],
    onCheckForUpdate: js.Function1[js.Function1[/* res */ baiduDashAppLib.Anon_HasUpdate, scala.Unit], scala.Unit],
    onUpdateFailed: js.Function1[js.Function1[/* res */ js.Any, scala.Unit], scala.Unit],
    onUpdateReady: js.Function1[js.Function1[/* res */ baiduDashAppLib.Anon_Confirm, scala.Unit], scala.Unit]
  ): UpdateManager = {
    val __obj = js.Dynamic.literal(applyUpdate = applyUpdate, onCheckForUpdate = onCheckForUpdate, onUpdateFailed = onUpdateFailed, onUpdateReady = onUpdateReady)
  
    __obj.asInstanceOf[UpdateManager]
  }
}

