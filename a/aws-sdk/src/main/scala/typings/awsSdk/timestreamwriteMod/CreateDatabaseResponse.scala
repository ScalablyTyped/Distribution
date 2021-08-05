package typings.awsSdk.timestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDatabaseResponse extends StObject {
  
  /**
    * The newly created Timestream database.
    */
  var Database: js.UndefOr[typings.awsSdk.timestreamwriteMod.Database] = js.undefined
}
object CreateDatabaseResponse {
  
  inline def apply(): CreateDatabaseResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDatabaseResponse]
  }
  
  extension [Self <: CreateDatabaseResponse](x: Self) {
    
    inline def setDatabase(value: Database): Self = StObject.set(x, "Database", value.asInstanceOf[js.Any])
    
    inline def setDatabaseUndefined: Self = StObject.set(x, "Database", js.undefined)
  }
}
