package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArraySize extends StObject {
  
  var arraySize: js.UndefOr[Double] = js.undefined
  
  var name: String
  
  var size: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object ArraySize {
  
  inline def apply(name: String): ArraySize = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArraySize]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArraySize] (val x: Self) extends AnyVal {
    
    inline def setArraySize(value: Double): Self = StObject.set(x, "arraySize", value.asInstanceOf[js.Any])
    
    inline def setArraySizeUndefined: Self = StObject.set(x, "arraySize", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
