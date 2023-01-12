package typings.cornerstoneCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LUT extends StObject {
  
  var firstValueMapped: Double
  
  var lut: js.Array[Any]
  
  var numBitsPerEntry: Double
}
object LUT {
  
  inline def apply(firstValueMapped: Double, lut: js.Array[Any], numBitsPerEntry: Double): LUT = {
    val __obj = js.Dynamic.literal(firstValueMapped = firstValueMapped.asInstanceOf[js.Any], lut = lut.asInstanceOf[js.Any], numBitsPerEntry = numBitsPerEntry.asInstanceOf[js.Any])
    __obj.asInstanceOf[LUT]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LUT] (val x: Self) extends AnyVal {
    
    inline def setFirstValueMapped(value: Double): Self = StObject.set(x, "firstValueMapped", value.asInstanceOf[js.Any])
    
    inline def setLut(value: js.Array[Any]): Self = StObject.set(x, "lut", value.asInstanceOf[js.Any])
    
    inline def setLutVarargs(value: Any*): Self = StObject.set(x, "lut", js.Array(value*))
    
    inline def setNumBitsPerEntry(value: Double): Self = StObject.set(x, "numBitsPerEntry", value.asInstanceOf[js.Any])
  }
}
