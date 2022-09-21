package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtendableMessageEventInit
  extends StObject
     with EventInit {
  
  var data: js.UndefOr[Any] = js.undefined
  
  var lastEventId: js.UndefOr[java.lang.String] = js.undefined
  
  var origin: js.UndefOr[java.lang.String] = js.undefined
  
  var ports: js.UndefOr[Array[MessagePort]] = js.undefined
  
  var source: js.UndefOr[Client | ServiceWorker | MessagePort | Null] = js.undefined
}
object ExtendableMessageEventInit {
  
  inline def apply(): ExtendableMessageEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtendableMessageEventInit]
  }
  
  extension [Self <: ExtendableMessageEventInit](x: Self) {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setLastEventId(value: java.lang.String): Self = StObject.set(x, "lastEventId", value.asInstanceOf[js.Any])
    
    inline def setLastEventIdUndefined: Self = StObject.set(x, "lastEventId", js.undefined)
    
    inline def setOrigin(value: java.lang.String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setPorts(value: Array[MessagePort]): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
    
    inline def setPortsUndefined: Self = StObject.set(x, "ports", js.undefined)
    
    inline def setSource(value: Client | ServiceWorker | MessagePort): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceNull: Self = StObject.set(x, "source", null)
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
