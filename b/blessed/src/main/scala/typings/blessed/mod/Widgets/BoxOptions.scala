package typings.blessed.mod.Widgets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoxOptions
  extends StObject
     with ScrollableTextOptions {
  
  var bindings: js.UndefOr[Any] = js.undefined
}
object BoxOptions {
  
  inline def apply(): BoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoxOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BoxOptions] (val x: Self) extends AnyVal {
    
    inline def setBindings(value: Any): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
    
    inline def setBindingsUndefined: Self = StObject.set(x, "bindings", js.undefined)
  }
}
