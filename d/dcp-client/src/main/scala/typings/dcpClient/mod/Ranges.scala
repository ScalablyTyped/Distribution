package typings.dcpClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ranges extends StObject {
  
  var ranges: js.Array[Any]
}
object Ranges {
  
  inline def apply(ranges: js.Array[Any]): Ranges = {
    val __obj = js.Dynamic.literal(ranges = ranges.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ranges]
  }
  
  extension [Self <: Ranges](x: Self) {
    
    inline def setRanges(value: js.Array[Any]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    inline def setRangesVarargs(value: Any*): Self = StObject.set(x, "ranges", js.Array(value*))
  }
}
