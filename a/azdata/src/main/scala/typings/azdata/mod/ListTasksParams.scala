package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTasksParams extends StObject {
  
  var listActiveTasksOnly: Boolean = js.native
}
object ListTasksParams {
  
  @scala.inline
  def apply(listActiveTasksOnly: Boolean): ListTasksParams = {
    val __obj = js.Dynamic.literal(listActiveTasksOnly = listActiveTasksOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTasksParams]
  }
  
  @scala.inline
  implicit class ListTasksParamsMutableBuilder[Self <: ListTasksParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setListActiveTasksOnly(value: Boolean): Self = StObject.set(x, "listActiveTasksOnly", value.asInstanceOf[js.Any])
  }
}
