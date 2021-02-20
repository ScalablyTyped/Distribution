package typings.datatablesNet.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AjaxDataRequestColumn extends StObject {
  
  var data: String | Double = js.native
  
  var name: String = js.native
  
  var orderable: Boolean = js.native
  
  var search: AjaxDataRequestSearch = js.native
  
  var searchable: Boolean = js.native
}
object AjaxDataRequestColumn {
  
  @scala.inline
  def apply(
    data: String | Double,
    name: String,
    orderable: Boolean,
    search: AjaxDataRequestSearch,
    searchable: Boolean
  ): AjaxDataRequestColumn = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], orderable = orderable.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], searchable = searchable.asInstanceOf[js.Any])
    __obj.asInstanceOf[AjaxDataRequestColumn]
  }
  
  @scala.inline
  implicit class AjaxDataRequestColumnMutableBuilder[Self <: AjaxDataRequestColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String | Double): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderable(value: Boolean): Self = StObject.set(x, "orderable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearch(value: AjaxDataRequestSearch): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchable(value: Boolean): Self = StObject.set(x, "searchable", value.asInstanceOf[js.Any])
  }
}
