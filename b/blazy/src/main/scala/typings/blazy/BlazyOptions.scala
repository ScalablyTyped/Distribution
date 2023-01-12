package typings.blazy

import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlazyOptions extends StObject {
  
  var breakpoints: js.UndefOr[js.Array[Breakpoint]] = js.undefined
  
  var container: js.UndefOr[String] = js.undefined
  
  var error: js.UndefOr[js.Function2[/* ele */ Element | HTMLElement, /* msg */ String, Unit]] = js.undefined
  
  var errorClass: js.UndefOr[String] = js.undefined
  
  var loadInvisible: js.UndefOr[Boolean] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var saveViewportOffsetDelay: js.UndefOr[Double] = js.undefined
  
  var selector: js.UndefOr[String] = js.undefined
  
  var separator: js.UndefOr[String] = js.undefined
  
  var src: js.UndefOr[String] = js.undefined
  
  var success: js.UndefOr[js.Function1[/* ele */ Element | HTMLElement, Unit]] = js.undefined
  
  var successClass: js.UndefOr[String] = js.undefined
  
  var validateDelay: js.UndefOr[Double] = js.undefined
}
object BlazyOptions {
  
  inline def apply(): BlazyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlazyOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BlazyOptions] (val x: Self) extends AnyVal {
    
    inline def setBreakpoints(value: js.Array[Breakpoint]): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
    
    inline def setBreakpointsUndefined: Self = StObject.set(x, "breakpoints", js.undefined)
    
    inline def setBreakpointsVarargs(value: Breakpoint*): Self = StObject.set(x, "breakpoints", js.Array(value*))
    
    inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setError(value: (/* ele */ Element | HTMLElement, /* msg */ String) => Unit): Self = StObject.set(x, "error", js.Any.fromFunction2(value))
    
    inline def setErrorClass(value: String): Self = StObject.set(x, "errorClass", value.asInstanceOf[js.Any])
    
    inline def setErrorClassUndefined: Self = StObject.set(x, "errorClass", js.undefined)
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setLoadInvisible(value: Boolean): Self = StObject.set(x, "loadInvisible", value.asInstanceOf[js.Any])
    
    inline def setLoadInvisibleUndefined: Self = StObject.set(x, "loadInvisible", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setSaveViewportOffsetDelay(value: Double): Self = StObject.set(x, "saveViewportOffsetDelay", value.asInstanceOf[js.Any])
    
    inline def setSaveViewportOffsetDelayUndefined: Self = StObject.set(x, "saveViewportOffsetDelay", js.undefined)
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    inline def setSuccess(value: /* ele */ Element | HTMLElement => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessClass(value: String): Self = StObject.set(x, "successClass", value.asInstanceOf[js.Any])
    
    inline def setSuccessClassUndefined: Self = StObject.set(x, "successClass", js.undefined)
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setValidateDelay(value: Double): Self = StObject.set(x, "validateDelay", value.asInstanceOf[js.Any])
    
    inline def setValidateDelayUndefined: Self = StObject.set(x, "validateDelay", js.undefined)
  }
}
