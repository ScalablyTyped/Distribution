package typings.awsSdk.timestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDatabaseRequest extends StObject {
  
  /**
    * The name of the Timestream database to be deleted.
    */
  var DatabaseName: ResourceName = js.native
}
object DeleteDatabaseRequest {
  
  @scala.inline
  def apply(DatabaseName: ResourceName): DeleteDatabaseRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDatabaseRequest]
  }
  
  @scala.inline
  implicit class DeleteDatabaseRequestMutableBuilder[Self <: DeleteDatabaseRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatabaseName(value: ResourceName): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
  }
}
