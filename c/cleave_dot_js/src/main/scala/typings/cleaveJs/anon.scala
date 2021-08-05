package typings.cleaveJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait RawValue extends StObject {
    
    var rawValue: String
  }
  object RawValue {
    
    inline def apply(rawValue: String): RawValue = {
      val __obj = js.Dynamic.literal(rawValue = rawValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawValue]
    }
    
    extension [Self <: RawValue](x: Self) {
      
      inline def setRawValue(value: String): Self = StObject.set(x, "rawValue", value.asInstanceOf[js.Any])
    }
  }
}
