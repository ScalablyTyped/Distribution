package typings.c3.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassValue extends StObject {
  
  /** If provided, will remove all gridlines with this class. */
  var `class`: js.UndefOr[String] = js.undefined
  
  /** If provided, will remove all gridlines at this value. */
  var value: js.UndefOr[Double | String] = js.undefined
}
object ClassValue {
  
  inline def apply(): ClassValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassValue]
  }
  
  extension [Self <: ClassValue](x: Self) {
    
    inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    inline def setValue(value: Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
