package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormComponent extends StObject {
  
  var actions: js.UndefOr[js.Array[Component]] = js.undefined
  
  var component: Component
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  var title: String
}
object FormComponent {
  
  inline def apply(component: Component, title: String): FormComponent = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormComponent]
  }
  
  extension [Self <: FormComponent](x: Self) {
    
    inline def setActions(value: js.Array[Component]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: Component*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    inline def setComponent(value: Component): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
