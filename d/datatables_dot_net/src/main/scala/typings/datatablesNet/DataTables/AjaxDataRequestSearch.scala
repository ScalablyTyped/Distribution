package typings.datatablesNet.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AjaxDataRequestSearch extends StObject {
  
  var regex: Boolean = js.native
  
  var value: String = js.native
}
object AjaxDataRequestSearch {
  
  @scala.inline
  def apply(regex: Boolean, value: String): AjaxDataRequestSearch = {
    val __obj = js.Dynamic.literal(regex = regex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AjaxDataRequestSearch]
  }
  
  @scala.inline
  implicit class AjaxDataRequestSearchMutableBuilder[Self <: AjaxDataRequestSearch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegex(value: Boolean): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
