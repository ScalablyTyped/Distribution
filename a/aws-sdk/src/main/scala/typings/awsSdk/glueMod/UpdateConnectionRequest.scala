package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateConnectionRequest extends StObject {
  
  /**
    * The ID of the Data Catalog in which the connection resides. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  
  /**
    * A ConnectionInput object that redefines the connection in question.
    */
  var ConnectionInput: typings.awsSdk.glueMod.ConnectionInput = js.native
  
  /**
    * The name of the connection definition to update.
    */
  var Name: NameString = js.native
}
object UpdateConnectionRequest {
  
  @scala.inline
  def apply(ConnectionInput: ConnectionInput, Name: NameString): UpdateConnectionRequest = {
    val __obj = js.Dynamic.literal(ConnectionInput = ConnectionInput.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConnectionRequest]
  }
  
  @scala.inline
  implicit class UpdateConnectionRequestMutableBuilder[Self <: UpdateConnectionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    @scala.inline
    def setConnectionInput(value: ConnectionInput): Self = StObject.set(x, "ConnectionInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
