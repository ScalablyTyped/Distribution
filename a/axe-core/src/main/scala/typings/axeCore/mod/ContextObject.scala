package typings.axeCore.mod

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextObject extends StObject {
  
  var exclude: js.UndefOr[Node | BaseSelector | (js.Array[Node | BaseSelector | js.Array[BaseSelector]])] = js.undefined
  
  var include: js.UndefOr[Node | BaseSelector | (js.Array[Node | BaseSelector | js.Array[BaseSelector]])] = js.undefined
}
object ContextObject {
  
  inline def apply(): ContextObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContextObject] (val x: Self) extends AnyVal {
    
    inline def setExclude(value: Node | BaseSelector | (js.Array[Node | BaseSelector | js.Array[BaseSelector]])): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(value: (Node | BaseSelector | js.Array[BaseSelector])*): Self = StObject.set(x, "exclude", js.Array(value*))
    
    inline def setInclude(value: Node | BaseSelector | (js.Array[Node | BaseSelector | js.Array[BaseSelector]])): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setIncludeVarargs(value: (Node | BaseSelector | js.Array[BaseSelector])*): Self = StObject.set(x, "include", js.Array(value*))
  }
}
