package typings.datatablesNet.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AjaxDataRequestSearch extends StObject {
  
  var regex: Boolean
  
  var value: String
}
object AjaxDataRequestSearch {
  
  inline def apply(regex: Boolean, value: String): AjaxDataRequestSearch = {
    val __obj = js.Dynamic.literal(regex = regex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AjaxDataRequestSearch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AjaxDataRequestSearch] (val x: Self) extends AnyVal {
    
    inline def setRegex(value: Boolean): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
