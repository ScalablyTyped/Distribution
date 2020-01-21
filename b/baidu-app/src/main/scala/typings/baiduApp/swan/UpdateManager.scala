package typings.baiduApp.swan

import typings.baiduApp.AnonConfirm
import typings.baiduApp.AnonHasUpdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// #region 更新
trait UpdateManager extends js.Object {
  def applyUpdate(): Unit
  def onCheckForUpdate(callback: js.Function1[/* res */ AnonHasUpdate, Unit]): Unit
  def onUpdateFailed(callback: js.Function1[/* res */ js.Any, Unit]): Unit
  def onUpdateReady(callback: js.Function1[/* res */ AnonConfirm, Unit]): Unit
}

object UpdateManager {
  @scala.inline
  def apply(
    applyUpdate: () => Unit,
    onCheckForUpdate: js.Function1[/* res */ AnonHasUpdate, Unit] => Unit,
    onUpdateFailed: js.Function1[/* res */ js.Any, Unit] => Unit,
    onUpdateReady: js.Function1[/* res */ AnonConfirm, Unit] => Unit
  ): UpdateManager = {
    val __obj = js.Dynamic.literal(applyUpdate = js.Any.fromFunction0(applyUpdate), onCheckForUpdate = js.Any.fromFunction1(onCheckForUpdate), onUpdateFailed = js.Any.fromFunction1(onUpdateFailed), onUpdateReady = js.Any.fromFunction1(onUpdateReady))
  
    __obj.asInstanceOf[UpdateManager]
  }
}

