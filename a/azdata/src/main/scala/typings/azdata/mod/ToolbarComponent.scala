package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToolbarComponent extends StObject {
  
  var component: Component
  
  var title: js.UndefOr[String] = js.undefined
  
  var toolbarSeparatorAfter: js.UndefOr[Boolean] = js.undefined
}
object ToolbarComponent {
  
  inline def apply(component: Component): ToolbarComponent = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolbarComponent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ToolbarComponent] (val x: Self) extends AnyVal {
    
    inline def setComponent(value: Component): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setToolbarSeparatorAfter(value: Boolean): Self = StObject.set(x, "toolbarSeparatorAfter", value.asInstanceOf[js.Any])
    
    inline def setToolbarSeparatorAfterUndefined: Self = StObject.set(x, "toolbarSeparatorAfter", js.undefined)
  }
}
