package typings.axeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SerialContextObject extends StObject {
  
  var exclude: js.UndefOr[BaseSelector | (js.Array[BaseSelector | js.Array[BaseSelector]])] = js.undefined
  
  var include: js.UndefOr[BaseSelector | (js.Array[BaseSelector | js.Array[BaseSelector]])] = js.undefined
}
object SerialContextObject {
  
  inline def apply(): SerialContextObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SerialContextObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SerialContextObject] (val x: Self) extends AnyVal {
    
    inline def setExclude(value: BaseSelector | (js.Array[BaseSelector | js.Array[BaseSelector]])): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(value: (BaseSelector | js.Array[BaseSelector])*): Self = StObject.set(x, "exclude", js.Array(value*))
    
    inline def setInclude(value: BaseSelector | (js.Array[BaseSelector | js.Array[BaseSelector]])): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setIncludeVarargs(value: (BaseSelector | js.Array[BaseSelector])*): Self = StObject.set(x, "include", js.Array(value*))
  }
}
