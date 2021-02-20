package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTableResponse extends StObject {
  
  /**
    * The Table object that defines the specified table.
    */
  var Table: js.UndefOr[typings.awsSdk.glueMod.Table] = js.native
}
object GetTableResponse {
  
  @scala.inline
  def apply(): GetTableResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTableResponse]
  }
  
  @scala.inline
  implicit class GetTableResponseMutableBuilder[Self <: GetTableResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTable(value: Table): Self = StObject.set(x, "Table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableUndefined: Self = StObject.set(x, "Table", js.undefined)
  }
}
