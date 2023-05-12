package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Source extends StObject {
  
  var end: Any
  
  var source: Any
  
  var start: Any
  
  var target: Start
}
object Source {
  
  inline def apply(end: Any, source: Any, start: Any, target: Start): Source = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Source] (val x: Self) extends AnyVal {
    
    inline def setEnd(value: Any): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setSource(value: Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Any): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Start): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
