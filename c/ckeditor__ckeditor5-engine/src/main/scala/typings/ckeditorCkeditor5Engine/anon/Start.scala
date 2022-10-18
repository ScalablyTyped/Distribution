package typings.ckeditorCkeditor5Engine.anon

import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Start extends StObject {
  
  var end: ReturnType[js.Function0[Path]]
  
  var start: ReturnType[js.Function0[Path]]
}
object Start {
  
  inline def apply(end: ReturnType[js.Function0[Path]], start: ReturnType[js.Function0[Path]]): Start = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Start]
  }
  
  extension [Self <: Start](x: Self) {
    
    inline def setEnd(value: ReturnType[js.Function0[Path]]): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setStart(value: ReturnType[js.Function0[Path]]): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
