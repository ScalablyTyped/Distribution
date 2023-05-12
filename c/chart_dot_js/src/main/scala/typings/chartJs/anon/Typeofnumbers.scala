package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofnumbers extends StObject {
  
  val properties: js.Array[String]
  
  val `type`: String
}
object Typeofnumbers {
  
  inline def apply(properties: js.Array[String], `type`: String): Typeofnumbers = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofnumbers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Typeofnumbers] (val x: Self) extends AnyVal {
    
    inline def setProperties(value: js.Array[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesVarargs(value: String*): Self = StObject.set(x, "properties", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
