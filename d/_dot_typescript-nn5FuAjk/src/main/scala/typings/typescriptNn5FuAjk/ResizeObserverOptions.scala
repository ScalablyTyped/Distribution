package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResizeObserverOptions extends StObject {
  
  var box: js.UndefOr[ResizeObserverBoxOptions] = js.undefined
}
object ResizeObserverOptions {
  
  inline def apply(): ResizeObserverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResizeObserverOptions]
  }
  
  extension [Self <: ResizeObserverOptions](x: Self) {
    
    inline def setBox(value: ResizeObserverBoxOptions): Self = StObject.set(x, "box", value.asInstanceOf[js.Any])
    
    inline def setBoxUndefined: Self = StObject.set(x, "box", js.undefined)
  }
}
