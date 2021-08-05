package typings.awsSdk.timestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDatabaseResponse extends StObject {
  
  /**
    * The name of the Timestream table.
    */
  var Database: js.UndefOr[typings.awsSdk.timestreamwriteMod.Database] = js.undefined
}
object DescribeDatabaseResponse {
  
  inline def apply(): DescribeDatabaseResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDatabaseResponse]
  }
  
  extension [Self <: DescribeDatabaseResponse](x: Self) {
    
    inline def setDatabase(value: Database): Self = StObject.set(x, "Database", value.asInstanceOf[js.Any])
    
    inline def setDatabaseUndefined: Self = StObject.set(x, "Database", js.undefined)
  }
}
