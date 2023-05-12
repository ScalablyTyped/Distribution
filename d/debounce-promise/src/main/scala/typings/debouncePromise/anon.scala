package typings.debouncePromise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined debounce-promise.debounce-promise.DebounceOptions & {  accumulate :true} */
  trait DebounceOptionsaccumulate extends StObject {
    
    var accumulate: js.UndefOr[Boolean] = js.undefined
    
    var leading: js.UndefOr[Boolean] = js.undefined
  }
  object DebounceOptionsaccumulate {
    
    inline def apply(): DebounceOptionsaccumulate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DebounceOptionsaccumulate]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DebounceOptionsaccumulate] (val x: Self) extends AnyVal {
      
      inline def setAccumulate(value: Boolean): Self = StObject.set(x, "accumulate", value.asInstanceOf[js.Any])
      
      inline def setAccumulateUndefined: Self = StObject.set(x, "accumulate", js.undefined)
      
      inline def setLeading(value: Boolean): Self = StObject.set(x, "leading", value.asInstanceOf[js.Any])
      
      inline def setLeadingUndefined: Self = StObject.set(x, "leading", js.undefined)
    }
  }
}
