package typings.chance.Chance

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Timezone extends StObject {
  
  var abbr: String
  
  var isdst: Boolean
  
  var name: String
  
  var offset: Double
  
  var text: String
  
  var utc: js.Array[String]
}
object Timezone {
  
  inline def apply(abbr: String, isdst: Boolean, name: String, offset: Double, text: String, utc: js.Array[String]): Timezone = {
    val __obj = js.Dynamic.literal(abbr = abbr.asInstanceOf[js.Any], isdst = isdst.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], utc = utc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timezone]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Timezone] (val x: Self) extends AnyVal {
    
    inline def setAbbr(value: String): Self = StObject.set(x, "abbr", value.asInstanceOf[js.Any])
    
    inline def setIsdst(value: Boolean): Self = StObject.set(x, "isdst", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setUtc(value: js.Array[String]): Self = StObject.set(x, "utc", value.asInstanceOf[js.Any])
    
    inline def setUtcVarargs(value: String*): Self = StObject.set(x, "utc", js.Array(value*))
  }
}
