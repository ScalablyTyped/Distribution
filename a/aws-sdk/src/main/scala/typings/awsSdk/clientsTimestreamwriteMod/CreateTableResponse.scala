package typings.awsSdk.clientsTimestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTableResponse extends StObject {
  
  /**
    * The newly created Timestream table.
    */
  var Table: js.UndefOr[typings.awsSdk.clientsTimestreamwriteMod.Table] = js.undefined
}
object CreateTableResponse {
  
  inline def apply(): CreateTableResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTableResponse]
  }
  
  extension [Self <: CreateTableResponse](x: Self) {
    
    inline def setTable(value: Table): Self = StObject.set(x, "Table", value.asInstanceOf[js.Any])
    
    inline def setTableUndefined: Self = StObject.set(x, "Table", js.undefined)
  }
}
