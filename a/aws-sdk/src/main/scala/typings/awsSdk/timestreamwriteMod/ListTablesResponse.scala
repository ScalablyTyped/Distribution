package typings.awsSdk.timestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTablesResponse extends StObject {
  
  /**
    * A token to specify where to start paginating. This is the NextToken from a previously truncated response.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * A list of tables.
    */
  var Tables: js.UndefOr[TableList] = js.native
}
object ListTablesResponse {
  
  @scala.inline
  def apply(): ListTablesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTablesResponse]
  }
  
  @scala.inline
  implicit class ListTablesResponseMutableBuilder[Self <: ListTablesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTables(value: TableList): Self = StObject.set(x, "Tables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTablesUndefined: Self = StObject.set(x, "Tables", js.undefined)
    
    @scala.inline
    def setTablesVarargs(value: Table*): Self = StObject.set(x, "Tables", js.Array(value :_*))
  }
}
