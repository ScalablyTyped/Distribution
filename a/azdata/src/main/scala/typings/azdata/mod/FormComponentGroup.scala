package typings.azdata.mod

import typings.azdata.anon.FormComponentComponentlay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormComponentGroup extends StObject {
  
  /**
    * The form components to display in the group along with optional layouts for each item
    */
  var components: js.Array[FormComponentComponentlay]
  
  /**
    * The title of the group, displayed above its components
    */
  var title: String
}
object FormComponentGroup {
  
  inline def apply(components: js.Array[FormComponentComponentlay], title: String): FormComponentGroup = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormComponentGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormComponentGroup] (val x: Self) extends AnyVal {
    
    inline def setComponents(value: js.Array[FormComponentComponentlay]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsVarargs(value: FormComponentComponentlay*): Self = StObject.set(x, "components", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
