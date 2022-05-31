package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISceneLike extends StObject {
  
  def _addPendingData(data: js.Any): Unit
  
  def _removePendingData(data: js.Any): Unit
  
  var offlineProvider: IOfflineProvider
}
object ISceneLike {
  
  inline def apply(
    _addPendingData: js.Any => Unit,
    _removePendingData: js.Any => Unit,
    offlineProvider: IOfflineProvider
  ): ISceneLike = {
    val __obj = js.Dynamic.literal(_addPendingData = js.Any.fromFunction1(_addPendingData), _removePendingData = js.Any.fromFunction1(_removePendingData), offlineProvider = offlineProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISceneLike]
  }
  
  extension [Self <: ISceneLike](x: Self) {
    
    inline def setOfflineProvider(value: IOfflineProvider): Self = StObject.set(x, "offlineProvider", value.asInstanceOf[js.Any])
    
    inline def set_addPendingData(value: js.Any => Unit): Self = StObject.set(x, "_addPendingData", js.Any.fromFunction1(value))
    
    inline def set_removePendingData(value: js.Any => Unit): Self = StObject.set(x, "_removePendingData", js.Any.fromFunction1(value))
  }
}
