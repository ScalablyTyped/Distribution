package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDatastoreRequest extends StObject {
  
  /**
    * The name of the data store to delete.
    */
  var datastoreName: DatastoreName = js.native
}
object DeleteDatastoreRequest {
  
  @scala.inline
  def apply(datastoreName: DatastoreName): DeleteDatastoreRequest = {
    val __obj = js.Dynamic.literal(datastoreName = datastoreName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDatastoreRequest]
  }
  
  @scala.inline
  implicit class DeleteDatastoreRequestMutableBuilder[Self <: DeleteDatastoreRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatastoreName(value: DatastoreName): Self = StObject.set(x, "datastoreName", value.asInstanceOf[js.Any])
  }
}
