package typings.bookshelf.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SerializeOptions extends StObject {
  
  var omitPivot: js.UndefOr[Boolean] = js.undefined
  
  var shallow: js.UndefOr[Boolean] = js.undefined
  
  /** @default true */
  var visibility: js.UndefOr[Boolean] = js.undefined
}
object SerializeOptions {
  
  inline def apply(): SerializeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SerializeOptions]
  }
  
  extension [Self <: SerializeOptions](x: Self) {
    
    inline def setOmitPivot(value: Boolean): Self = StObject.set(x, "omitPivot", value.asInstanceOf[js.Any])
    
    inline def setOmitPivotUndefined: Self = StObject.set(x, "omitPivot", js.undefined)
    
    inline def setShallow(value: Boolean): Self = StObject.set(x, "shallow", value.asInstanceOf[js.Any])
    
    inline def setShallowUndefined: Self = StObject.set(x, "shallow", js.undefined)
    
    inline def setVisibility(value: Boolean): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
