package typings.carbonComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<carbon-components.carbon-components/components/ui-shell/header-submenu.HeaderSubmenuOptions> */
trait PartialHeaderSubmenuOptio extends StObject {
  
  var attribExpanded: js.UndefOr[String] = js.undefined
  
  var selectorInit: js.UndefOr[String] = js.undefined
  
  var selectorItem: js.UndefOr[String] = js.undefined
  
  var selectorTrigger: js.UndefOr[String] = js.undefined
}
object PartialHeaderSubmenuOptio {
  
  inline def apply(): PartialHeaderSubmenuOptio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialHeaderSubmenuOptio]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialHeaderSubmenuOptio] (val x: Self) extends AnyVal {
    
    inline def setAttribExpanded(value: String): Self = StObject.set(x, "attribExpanded", value.asInstanceOf[js.Any])
    
    inline def setAttribExpandedUndefined: Self = StObject.set(x, "attribExpanded", js.undefined)
    
    inline def setSelectorInit(value: String): Self = StObject.set(x, "selectorInit", value.asInstanceOf[js.Any])
    
    inline def setSelectorInitUndefined: Self = StObject.set(x, "selectorInit", js.undefined)
    
    inline def setSelectorItem(value: String): Self = StObject.set(x, "selectorItem", value.asInstanceOf[js.Any])
    
    inline def setSelectorItemUndefined: Self = StObject.set(x, "selectorItem", js.undefined)
    
    inline def setSelectorTrigger(value: String): Self = StObject.set(x, "selectorTrigger", value.asInstanceOf[js.Any])
    
    inline def setSelectorTriggerUndefined: Self = StObject.set(x, "selectorTrigger", js.undefined)
  }
}
