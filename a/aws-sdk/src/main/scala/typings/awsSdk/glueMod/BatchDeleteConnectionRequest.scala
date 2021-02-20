package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchDeleteConnectionRequest extends StObject {
  
  /**
    * The ID of the Data Catalog in which the connections reside. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  
  /**
    * A list of names of the connections to delete.
    */
  var ConnectionNameList: DeleteConnectionNameList = js.native
}
object BatchDeleteConnectionRequest {
  
  @scala.inline
  def apply(ConnectionNameList: DeleteConnectionNameList): BatchDeleteConnectionRequest = {
    val __obj = js.Dynamic.literal(ConnectionNameList = ConnectionNameList.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteConnectionRequest]
  }
  
  @scala.inline
  implicit class BatchDeleteConnectionRequestMutableBuilder[Self <: BatchDeleteConnectionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    @scala.inline
    def setConnectionNameList(value: DeleteConnectionNameList): Self = StObject.set(x, "ConnectionNameList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionNameListVarargs(value: NameString*): Self = StObject.set(x, "ConnectionNameList", js.Array(value :_*))
  }
}
