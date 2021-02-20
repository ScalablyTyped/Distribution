package typings.azdata.mod

import typings.azdata.anon.FormComponentlayoutFormIt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormComponentGroup extends StObject {
  
  /**
    * The form components to display in the group along with optional layouts for each item
    */
  var components: js.Array[FormComponentlayoutFormIt] = js.native
  
  /**
    * The title of the group, displayed above its components
    */
  var title: String = js.native
}
object FormComponentGroup {
  
  @scala.inline
  def apply(components: js.Array[FormComponentlayoutFormIt], title: String): FormComponentGroup = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormComponentGroup]
  }
  
  @scala.inline
  implicit class FormComponentGroupMutableBuilder[Self <: FormComponentGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponents(value: js.Array[FormComponentlayoutFormIt]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentsVarargs(value: FormComponentlayoutFormIt*): Self = StObject.set(x, "components", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
