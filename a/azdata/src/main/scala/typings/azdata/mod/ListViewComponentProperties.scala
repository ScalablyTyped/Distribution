package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListViewComponentProperties
  extends StObject
     with ComponentProperties {
  
  /**
    * Items in the list view.
    */
  var options: js.Array[ListViewOption]
  
  /**
    * Id of the currently selected option.
    */
  var selectedOptionId: js.UndefOr[String] = js.undefined
  
  /**
    * Title of the component.
    */
  var title: js.UndefOr[ListViewTitle] = js.undefined
}
object ListViewComponentProperties {
  
  inline def apply(options: js.Array[ListViewOption]): ListViewComponentProperties = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListViewComponentProperties]
  }
  
  extension [Self <: ListViewComponentProperties](x: Self) {
    
    inline def setOptions(value: js.Array[ListViewOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(value: ListViewOption*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setSelectedOptionId(value: String): Self = StObject.set(x, "selectedOptionId", value.asInstanceOf[js.Any])
    
    inline def setSelectedOptionIdUndefined: Self = StObject.set(x, "selectedOptionId", js.undefined)
    
    inline def setTitle(value: ListViewTitle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
