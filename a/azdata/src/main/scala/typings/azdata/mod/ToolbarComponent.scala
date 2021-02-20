package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToolbarComponent extends StObject {
  
  var component: Component = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var toolbarSeparatorAfter: js.UndefOr[Boolean] = js.native
}
object ToolbarComponent {
  
  @scala.inline
  def apply(component: Component): ToolbarComponent = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolbarComponent]
  }
  
  @scala.inline
  implicit class ToolbarComponentMutableBuilder[Self <: ToolbarComponent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: Component): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setToolbarSeparatorAfter(value: Boolean): Self = StObject.set(x, "toolbarSeparatorAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbarSeparatorAfterUndefined: Self = StObject.set(x, "toolbarSeparatorAfter", js.undefined)
  }
}
