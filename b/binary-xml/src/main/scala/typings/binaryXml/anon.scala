package typings.binaryXml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait RawType extends StObject {
    
    var rawType: Double
    
    var `type`: String
    
    var value: Double
  }
  object RawType {
    
    inline def apply(rawType: Double, `type`: String, value: Double): RawType = {
      val __obj = js.Dynamic.literal(rawType = rawType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RawType] (val x: Self) extends AnyVal {
      
      inline def setRawType(value: Double): Self = StObject.set(x, "rawType", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
