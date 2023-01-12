package typings.chui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepeaterName extends StObject {
  
  var repeaterName: js.UndefOr[Any] = js.undefined
}
object RepeaterName {
  
  inline def apply(): RepeaterName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepeaterName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RepeaterName] (val x: Self) extends AnyVal {
    
    inline def setRepeaterName(value: Any): Self = StObject.set(x, "repeaterName", value.asInstanceOf[js.Any])
    
    inline def setRepeaterNameUndefined: Self = StObject.set(x, "repeaterName", js.undefined)
  }
}
