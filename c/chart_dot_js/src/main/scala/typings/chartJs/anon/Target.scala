package typings.chartJs.anon

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Target extends StObject {
  
  var end: NumberDictionary[Any]
  
  var source: Style
  
  var start: NumberDictionary[Any]
  
  var target: Style
}
object Target {
  
  inline def apply(end: NumberDictionary[Any], source: Style, start: NumberDictionary[Any], target: Style): Target = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Target] (val x: Self) extends AnyVal {
    
    inline def setEnd(value: NumberDictionary[Any]): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setSource(value: Style): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setStart(value: NumberDictionary[Any]): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Style): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
