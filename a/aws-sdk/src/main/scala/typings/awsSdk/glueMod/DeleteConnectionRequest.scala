package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteConnectionRequest extends StObject {
  
  /**
    * The ID of the Data Catalog in which the connection resides. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  
  /**
    * The name of the connection to delete.
    */
  var ConnectionName: NameString = js.native
}
object DeleteConnectionRequest {
  
  @scala.inline
  def apply(ConnectionName: NameString): DeleteConnectionRequest = {
    val __obj = js.Dynamic.literal(ConnectionName = ConnectionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteConnectionRequest]
  }
  
  @scala.inline
  implicit class DeleteConnectionRequestMutableBuilder[Self <: DeleteConnectionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    @scala.inline
    def setConnectionName(value: NameString): Self = StObject.set(x, "ConnectionName", value.asInstanceOf[js.Any])
  }
}
