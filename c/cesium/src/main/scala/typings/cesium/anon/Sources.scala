package typings.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sources extends StObject {
  
  var show: js.UndefOr[Boolean] = js.undefined
  
  var sources: js.UndefOr[js.Any] = js.undefined
}
object Sources {
  
  inline def apply(): Sources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sources]
  }
  
  extension [Self <: Sources](x: Self) {
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setSources(value: js.Any): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
  }
}
