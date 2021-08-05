package typings.cucumber.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HookOptions extends StObject {
  
  var tags: js.UndefOr[js.Any] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object HookOptions {
  
  inline def apply(): HookOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HookOptions]
  }
  
  extension [Self <: HookOptions](x: Self) {
    
    inline def setTags(value: js.Any): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
