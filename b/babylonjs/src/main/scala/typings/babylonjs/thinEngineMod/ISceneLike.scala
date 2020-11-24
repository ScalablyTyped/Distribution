package typings.babylonjs.thinEngineMod

import typings.babylonjs.iofflineproviderMod.IOfflineProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISceneLike extends js.Object {
  
  def _addPendingData(data: js.Any): Unit = js.native
  
  def _removePendingData(data: js.Any): Unit = js.native
  
  var offlineProvider: IOfflineProvider = js.native
}
object ISceneLike {
  
  @scala.inline
  def apply(
    _addPendingData: js.Any => Unit,
    _removePendingData: js.Any => Unit,
    offlineProvider: IOfflineProvider
  ): ISceneLike = {
    val __obj = js.Dynamic.literal(_addPendingData = js.Any.fromFunction1(_addPendingData), _removePendingData = js.Any.fromFunction1(_removePendingData), offlineProvider = offlineProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISceneLike]
  }
  
  @scala.inline
  implicit class ISceneLikeOps[Self <: ISceneLike] (val x: Self) extends AnyVal {
    
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
    def set_addPendingData(value: js.Any => Unit): Self = this.set("_addPendingData", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_removePendingData(value: js.Any => Unit): Self = this.set("_removePendingData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOfflineProvider(value: IOfflineProvider): Self = this.set("offlineProvider", value.asInstanceOf[js.Any])
  }
}
