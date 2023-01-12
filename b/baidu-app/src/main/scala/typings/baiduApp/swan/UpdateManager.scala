package typings.baiduApp.swan

import typings.baiduApp.anon.Confirm
import typings.baiduApp.anon.HasUpdate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region 更新
trait UpdateManager extends StObject {
  
  def applyUpdate(): Unit
  
  def onCheckForUpdate(callback: js.Function1[/* res */ HasUpdate, Unit]): Unit
  
  def onUpdateFailed(callback: js.Function1[/* res */ Any, Unit]): Unit
  
  def onUpdateReady(callback: js.Function1[/* res */ Confirm, Unit]): Unit
}
object UpdateManager {
  
  inline def apply(
    applyUpdate: () => Unit,
    onCheckForUpdate: js.Function1[/* res */ HasUpdate, Unit] => Unit,
    onUpdateFailed: js.Function1[/* res */ Any, Unit] => Unit,
    onUpdateReady: js.Function1[/* res */ Confirm, Unit] => Unit
  ): UpdateManager = {
    val __obj = js.Dynamic.literal(applyUpdate = js.Any.fromFunction0(applyUpdate), onCheckForUpdate = js.Any.fromFunction1(onCheckForUpdate), onUpdateFailed = js.Any.fromFunction1(onUpdateFailed), onUpdateReady = js.Any.fromFunction1(onUpdateReady))
    __obj.asInstanceOf[UpdateManager]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateManager] (val x: Self) extends AnyVal {
    
    inline def setApplyUpdate(value: () => Unit): Self = StObject.set(x, "applyUpdate", js.Any.fromFunction0(value))
    
    inline def setOnCheckForUpdate(value: js.Function1[/* res */ HasUpdate, Unit] => Unit): Self = StObject.set(x, "onCheckForUpdate", js.Any.fromFunction1(value))
    
    inline def setOnUpdateFailed(value: js.Function1[/* res */ Any, Unit] => Unit): Self = StObject.set(x, "onUpdateFailed", js.Any.fromFunction1(value))
    
    inline def setOnUpdateReady(value: js.Function1[/* res */ Confirm, Unit] => Unit): Self = StObject.set(x, "onUpdateReady", js.Any.fromFunction1(value))
  }
}
