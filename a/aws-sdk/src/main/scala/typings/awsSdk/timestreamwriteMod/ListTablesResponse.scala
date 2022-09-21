package typings.awsSdk.timestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTablesResponse extends StObject {
  
  /**
    * A token to specify where to start paginating. This is the NextToken from a previously truncated response.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * A list of tables.
    */
  var Tables: js.UndefOr[TableList] = js.undefined
}
object ListTablesResponse {
  
  inline def apply(): ListTablesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTablesResponse]
  }
  
  extension [Self <: ListTablesResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTables(value: TableList): Self = StObject.set(x, "Tables", value.asInstanceOf[js.Any])
    
    inline def setTablesUndefined: Self = StObject.set(x, "Tables", js.undefined)
    
    inline def setTablesVarargs(value: Table*): Self = StObject.set(x, "Tables", js.Array(value*))
  }
}
