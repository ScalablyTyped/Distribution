package typings.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// chayns.selectTapp()
trait SelectTappConfig extends StObject {
  
  var id: js.UndefOr[Double] = js.undefined
  
  var internalName: js.UndefOr[String] = js.undefined
  
  var position: js.UndefOr[Double] = js.undefined
  
  var showName: js.UndefOr[String] = js.undefined
}
object SelectTappConfig {
  
  inline def apply(): SelectTappConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectTappConfig]
  }
  
  extension [Self <: SelectTappConfig](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInternalName(value: String): Self = StObject.set(x, "internalName", value.asInstanceOf[js.Any])
    
    inline def setInternalNameUndefined: Self = StObject.set(x, "internalName", js.undefined)
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setShowName(value: String): Self = StObject.set(x, "showName", value.asInstanceOf[js.Any])
    
    inline def setShowNameUndefined: Self = StObject.set(x, "showName", js.undefined)
  }
}
