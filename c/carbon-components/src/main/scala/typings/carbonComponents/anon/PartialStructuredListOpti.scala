package typings.carbonComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<carbon-components.carbon-components/components/structured-list/structured-list.StructuredListOptions> */
trait PartialStructuredListOpti extends StObject {
  
  var classActive: js.UndefOr[String] = js.undefined
  
  var selectorInit: js.UndefOr[String] = js.undefined
  
  var selectorListInput: js.UndefOr[js.Function1[/* id */ String, String]] = js.undefined
  
  var selectorRow: js.UndefOr[String] = js.undefined
}
object PartialStructuredListOpti {
  
  inline def apply(): PartialStructuredListOpti = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStructuredListOpti]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialStructuredListOpti] (val x: Self) extends AnyVal {
    
    inline def setClassActive(value: String): Self = StObject.set(x, "classActive", value.asInstanceOf[js.Any])
    
    inline def setClassActiveUndefined: Self = StObject.set(x, "classActive", js.undefined)
    
    inline def setSelectorInit(value: String): Self = StObject.set(x, "selectorInit", value.asInstanceOf[js.Any])
    
    inline def setSelectorInitUndefined: Self = StObject.set(x, "selectorInit", js.undefined)
    
    inline def setSelectorListInput(value: /* id */ String => String): Self = StObject.set(x, "selectorListInput", js.Any.fromFunction1(value))
    
    inline def setSelectorListInputUndefined: Self = StObject.set(x, "selectorListInput", js.undefined)
    
    inline def setSelectorRow(value: String): Self = StObject.set(x, "selectorRow", value.asInstanceOf[js.Any])
    
    inline def setSelectorRowUndefined: Self = StObject.set(x, "selectorRow", js.undefined)
  }
}
