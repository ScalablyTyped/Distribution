package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormComponent extends StObject {
  
  var actions: js.UndefOr[js.Array[Component]] = js.native
  
  var component: Component = js.native
  
  var required: js.UndefOr[Boolean] = js.native
  
  var title: String = js.native
}
object FormComponent {
  
  @scala.inline
  def apply(component: Component, title: String): FormComponent = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormComponent]
  }
  
  @scala.inline
  implicit class FormComponentMutableBuilder[Self <: FormComponent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: js.Array[Component]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    @scala.inline
    def setActionsVarargs(value: Component*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setComponent(value: Component): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
