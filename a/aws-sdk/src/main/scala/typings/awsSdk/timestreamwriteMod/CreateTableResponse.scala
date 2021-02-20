package typings.awsSdk.timestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateTableResponse extends StObject {
  
  /**
    * The newly created Timestream table.
    */
  var Table: js.UndefOr[typings.awsSdk.timestreamwriteMod.Table] = js.native
}
object CreateTableResponse {
  
  @scala.inline
  def apply(): CreateTableResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTableResponse]
  }
  
  @scala.inline
  implicit class CreateTableResponseMutableBuilder[Self <: CreateTableResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTable(value: Table): Self = StObject.set(x, "Table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableUndefined: Self = StObject.set(x, "Table", js.undefined)
  }
}
