package typings.awsSdk.clientsTimestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDatabaseRequest extends StObject {
  
  /**
    * The name of the Timestream database to be deleted.
    */
  var DatabaseName: ResourceName
}
object DeleteDatabaseRequest {
  
  inline def apply(DatabaseName: ResourceName): DeleteDatabaseRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDatabaseRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteDatabaseRequest] (val x: Self) extends AnyVal {
    
    inline def setDatabaseName(value: ResourceName): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
  }
}
