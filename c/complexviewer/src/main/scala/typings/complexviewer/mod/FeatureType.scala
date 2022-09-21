package typings.complexviewer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureType extends StObject {
  
  var certain: js.UndefOr[Color] = js.undefined
  
  var name: String
  
  var uncertain: js.UndefOr[Color] = js.undefined
}
object FeatureType {
  
  inline def apply(name: String): FeatureType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureType]
  }
  
  extension [Self <: FeatureType](x: Self) {
    
    inline def setCertain(value: Color): Self = StObject.set(x, "certain", value.asInstanceOf[js.Any])
    
    inline def setCertainUndefined: Self = StObject.set(x, "certain", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setUncertain(value: Color): Self = StObject.set(x, "uncertain", value.asInstanceOf[js.Any])
    
    inline def setUncertainUndefined: Self = StObject.set(x, "uncertain", js.undefined)
  }
}
