package typings.carbonComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<carbon-components.carbon-components/components/number-input/number-input.NumberInputOptions> */
trait PartialNumberInputOptions extends StObject {
  
  var selectorInit: js.UndefOr[String] = js.undefined
  
  var selectorInput: js.UndefOr[String] = js.undefined
}
object PartialNumberInputOptions {
  
  inline def apply(): PartialNumberInputOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialNumberInputOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialNumberInputOptions] (val x: Self) extends AnyVal {
    
    inline def setSelectorInit(value: String): Self = StObject.set(x, "selectorInit", value.asInstanceOf[js.Any])
    
    inline def setSelectorInitUndefined: Self = StObject.set(x, "selectorInit", js.undefined)
    
    inline def setSelectorInput(value: String): Self = StObject.set(x, "selectorInput", value.asInstanceOf[js.Any])
    
    inline def setSelectorInputUndefined: Self = StObject.set(x, "selectorInput", js.undefined)
  }
}
