package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Start extends StObject {
  
  var end: Any
  
  var property: Any
  
  var start: Any
}
object Start {
  
  inline def apply(end: Any, property: Any, start: Any): Start = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Start]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Start] (val x: Self) extends AnyVal {
    
    inline def setEnd(value: Any): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setProperty(value: Any): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Any): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
