package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISceneLike extends StObject {
  
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
  implicit class ISceneLikeMutableBuilder[Self <: ISceneLike] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOfflineProvider(value: IOfflineProvider): Self = StObject.set(x, "offlineProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_addPendingData(value: js.Any => Unit): Self = StObject.set(x, "_addPendingData", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_removePendingData(value: js.Any => Unit): Self = StObject.set(x, "_removePendingData", js.Any.fromFunction1(value))
  }
}
