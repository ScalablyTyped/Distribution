package typings.awsSdk.clientsTimestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDatabaseResponse extends StObject {
  
  var Database: js.UndefOr[typings.awsSdk.clientsTimestreamwriteMod.Database] = js.undefined
}
object UpdateDatabaseResponse {
  
  inline def apply(): UpdateDatabaseResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDatabaseResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateDatabaseResponse] (val x: Self) extends AnyVal {
    
    inline def setDatabase(value: Database): Self = StObject.set(x, "Database", value.asInstanceOf[js.Any])
    
    inline def setDatabaseUndefined: Self = StObject.set(x, "Database", js.undefined)
  }
}
