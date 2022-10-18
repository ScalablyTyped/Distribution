package typings.awsSdk.clientsTimestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDatabaseRequest extends StObject {
  
  /**
    * The name of the Timestream database.
    */
  var DatabaseName: ResourceName
}
object DescribeDatabaseRequest {
  
  inline def apply(DatabaseName: ResourceName): DescribeDatabaseRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDatabaseRequest]
  }
  
  extension [Self <: DescribeDatabaseRequest](x: Self) {
    
    inline def setDatabaseName(value: ResourceName): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
  }
}
