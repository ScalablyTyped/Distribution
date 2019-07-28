package typings.baiduDashApp.swanNs

import typings.baiduDashApp.Anon_Confirm
import typings.baiduDashApp.Anon_HasUpdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// #region 更新
trait UpdateManager extends js.Object {
  def applyUpdate(): Unit
  def onCheckForUpdate(callback: js.Function1[/* res */ Anon_HasUpdate, Unit]): Unit
  def onUpdateFailed(callback: js.Function1[/* res */ js.Any, Unit]): Unit
  def onUpdateReady(callback: js.Function1[/* res */ Anon_Confirm, Unit]): Unit
}

object UpdateManager {
  @scala.inline
  def apply(
    applyUpdate: () => Unit,
    onCheckForUpdate: js.Function1[/* res */ Anon_HasUpdate, Unit] => Unit,
    onUpdateFailed: js.Function1[/* res */ js.Any, Unit] => Unit,
    onUpdateReady: js.Function1[/* res */ Anon_Confirm, Unit] => Unit
  ): UpdateManager = {
    val __obj = js.Dynamic.literal(applyUpdate = js.Any.fromFunction0(applyUpdate), onCheckForUpdate = js.Any.fromFunction1(onCheckForUpdate), onUpdateFailed = js.Any.fromFunction1(onUpdateFailed), onUpdateReady = js.Any.fromFunction1(onUpdateReady))
  
    __obj.asInstanceOf[UpdateManager]
  }
}

