package typings.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapTypeControlOptions extends StObject {
  
  var mapTypes: js.UndefOr[js.Array[MapType]] = js.undefined
  
  var `type`: js.UndefOr[MapTypeControlType] = js.undefined
}
object MapTypeControlOptions {
  
  inline def apply(): MapTypeControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapTypeControlOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MapTypeControlOptions] (val x: Self) extends AnyVal {
    
    inline def setMapTypes(value: js.Array[MapType]): Self = StObject.set(x, "mapTypes", value.asInstanceOf[js.Any])
    
    inline def setMapTypesUndefined: Self = StObject.set(x, "mapTypes", js.undefined)
    
    inline def setMapTypesVarargs(value: MapType*): Self = StObject.set(x, "mapTypes", js.Array(value*))
    
    inline def setType(value: MapTypeControlType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
