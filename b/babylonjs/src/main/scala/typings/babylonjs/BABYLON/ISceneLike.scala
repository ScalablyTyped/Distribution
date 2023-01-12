package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISceneLike extends StObject {
  
  def addPendingData(data: Any): Unit
  
  var offlineProvider: IOfflineProvider
  
  def removePendingData(data: Any): Unit
}
object ISceneLike {
  
  inline def apply(addPendingData: Any => Unit, offlineProvider: IOfflineProvider, removePendingData: Any => Unit): ISceneLike = {
    val __obj = js.Dynamic.literal(addPendingData = js.Any.fromFunction1(addPendingData), offlineProvider = offlineProvider.asInstanceOf[js.Any], removePendingData = js.Any.fromFunction1(removePendingData))
    __obj.asInstanceOf[ISceneLike]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISceneLike] (val x: Self) extends AnyVal {
    
    inline def setAddPendingData(value: Any => Unit): Self = StObject.set(x, "addPendingData", js.Any.fromFunction1(value))
    
    inline def setOfflineProvider(value: IOfflineProvider): Self = StObject.set(x, "offlineProvider", value.asInstanceOf[js.Any])
    
    inline def setRemovePendingData(value: Any => Unit): Self = StObject.set(x, "removePendingData", js.Any.fromFunction1(value))
  }
}
