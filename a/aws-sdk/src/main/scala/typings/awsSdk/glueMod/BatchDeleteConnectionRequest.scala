package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchDeleteConnectionRequest extends js.Object {
  
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
  implicit class BatchDeleteConnectionRequestOps[Self <: BatchDeleteConnectionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConnectionNameListVarargs(value: NameString*): Self = this.set("ConnectionNameList", js.Array(value :_*))
    
    @scala.inline
    def setConnectionNameList(value: DeleteConnectionNameList): Self = this.set("ConnectionNameList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogId(value: CatalogIdString): Self = this.set("CatalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCatalogId: Self = this.set("CatalogId", js.undefined)
  }
}
