package typings.baiduApp.swan

import typings.baiduApp.anon.Confirm
import typings.baiduApp.anon.HasUpdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region 更新
@js.native
trait UpdateManager extends js.Object {
  
  def applyUpdate(): Unit = js.native
  
  def onCheckForUpdate(callback: js.Function1[/* res */ HasUpdate, Unit]): Unit = js.native
  
  def onUpdateFailed(callback: js.Function1[/* res */ js.Any, Unit]): Unit = js.native
  
  def onUpdateReady(callback: js.Function1[/* res */ Confirm, Unit]): Unit = js.native
}
object UpdateManager {
  
  @scala.inline
  def apply(
    applyUpdate: () => Unit,
    onCheckForUpdate: js.Function1[/* res */ HasUpdate, Unit] => Unit,
    onUpdateFailed: js.Function1[/* res */ js.Any, Unit] => Unit,
    onUpdateReady: js.Function1[/* res */ Confirm, Unit] => Unit
  ): UpdateManager = {
    val __obj = js.Dynamic.literal(applyUpdate = js.Any.fromFunction0(applyUpdate), onCheckForUpdate = js.Any.fromFunction1(onCheckForUpdate), onUpdateFailed = js.Any.fromFunction1(onUpdateFailed), onUpdateReady = js.Any.fromFunction1(onUpdateReady))
    __obj.asInstanceOf[UpdateManager]
  }
  
  @scala.inline
  implicit class UpdateManagerOps[Self <: UpdateManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApplyUpdate(value: () => Unit): Self = this.set("applyUpdate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnCheckForUpdate(value: js.Function1[/* res */ HasUpdate, Unit] => Unit): Self = this.set("onCheckForUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnUpdateFailed(value: js.Function1[/* res */ js.Any, Unit] => Unit): Self = this.set("onUpdateFailed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnUpdateReady(value: js.Function1[/* res */ Confirm, Unit] => Unit): Self = this.set("onUpdateReady", js.Any.fromFunction1(value))
  }
}
