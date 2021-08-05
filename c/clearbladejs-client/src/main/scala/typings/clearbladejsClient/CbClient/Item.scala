package typings.clearbladejsClient.CbClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Item extends StObject {
  
  var data: js.Object
  
  def destroy(callback: CbCallback): Unit
  
  def refresh(callback: CbCallback): Unit
  
  def save(callback: CbCallback): Unit
}
object Item {
  
  inline def apply(
    data: js.Object,
    destroy: CbCallback => Unit,
    refresh: CbCallback => Unit,
    save: CbCallback => Unit
  ): Item = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], destroy = js.Any.fromFunction1(destroy), refresh = js.Any.fromFunction1(refresh), save = js.Any.fromFunction1(save))
    __obj.asInstanceOf[Item]
  }
  
  extension [Self <: Item](x: Self) {
    
    inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDestroy(value: CbCallback => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
    
    inline def setRefresh(value: CbCallback => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction1(value))
    
    inline def setSave(value: CbCallback => Unit): Self = StObject.set(x, "save", js.Any.fromFunction1(value))
  }
}
