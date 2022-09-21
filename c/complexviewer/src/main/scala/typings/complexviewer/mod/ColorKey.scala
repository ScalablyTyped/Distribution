package typings.complexviewer.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorKey
  extends StObject
     with /* annotationSet */ StringDictionary[js.Array[FeatureType]] {
  
  var Complex: js.Array[FeatureType]
}
object ColorKey {
  
  inline def apply(Complex: js.Array[FeatureType]): ColorKey = {
    val __obj = js.Dynamic.literal(Complex = Complex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorKey]
  }
  
  extension [Self <: ColorKey](x: Self) {
    
    inline def setComplex(value: js.Array[FeatureType]): Self = StObject.set(x, "Complex", value.asInstanceOf[js.Any])
    
    inline def setComplexVarargs(value: FeatureType*): Self = StObject.set(x, "Complex", js.Array(value*))
  }
}
