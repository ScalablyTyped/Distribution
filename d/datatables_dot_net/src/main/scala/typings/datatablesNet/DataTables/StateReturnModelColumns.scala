package typings.datatablesNet.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StateReturnModelColumns extends StObject {
  
  var search: SearchSettings = js.native
  
  var visible: Boolean = js.native
}
object StateReturnModelColumns {
  
  @scala.inline
  def apply(search: SearchSettings, visible: Boolean): StateReturnModelColumns = {
    val __obj = js.Dynamic.literal(search = search.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateReturnModelColumns]
  }
  
  @scala.inline
  implicit class StateReturnModelColumnsMutableBuilder[Self <: StateReturnModelColumns] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSearch(value: SearchSettings): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
