package typings.axeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FrameContextObject extends StObject {
  
  var exclude: js.Array[UnlabelledFrameSelector]
  
  var include: js.Array[UnlabelledFrameSelector]
}
object FrameContextObject {
  
  inline def apply(exclude: js.Array[UnlabelledFrameSelector], include: js.Array[UnlabelledFrameSelector]): FrameContextObject = {
    val __obj = js.Dynamic.literal(exclude = exclude.asInstanceOf[js.Any], include = include.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameContextObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FrameContextObject] (val x: Self) extends AnyVal {
    
    inline def setExclude(value: js.Array[UnlabelledFrameSelector]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeVarargs(value: UnlabelledFrameSelector*): Self = StObject.set(x, "exclude", js.Array(value*))
    
    inline def setInclude(value: js.Array[UnlabelledFrameSelector]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeVarargs(value: UnlabelledFrameSelector*): Self = StObject.set(x, "include", js.Array(value*))
  }
}
