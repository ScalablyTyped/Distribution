package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DSGenerateOptions extends StObject {
  
  var compact: js.UndefOr[Boolean] = js.undefined
  
  var decorate: js.UndefOr[js.Function2[/* result */ String, /* node */ DSNode, Unit]] = js.undefined
  
  var forceBraces: js.UndefOr[Boolean] = js.undefined
}
object DSGenerateOptions {
  
  inline def apply(): DSGenerateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DSGenerateOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DSGenerateOptions] (val x: Self) extends AnyVal {
    
    inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
    
    inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
    
    inline def setDecorate(value: (/* result */ String, /* node */ DSNode) => Unit): Self = StObject.set(x, "decorate", js.Any.fromFunction2(value))
    
    inline def setDecorateUndefined: Self = StObject.set(x, "decorate", js.undefined)
    
    inline def setForceBraces(value: Boolean): Self = StObject.set(x, "forceBraces", value.asInstanceOf[js.Any])
    
    inline def setForceBracesUndefined: Self = StObject.set(x, "forceBraces", js.undefined)
  }
}
