package typings.awsSdk.marketplacecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelChangeSetRequest extends js.Object {
  
  /**
    * Required. The catalog related to the request. Fixed value: AWSMarketplace.
    */
  var Catalog: typings.awsSdk.marketplacecatalogMod.Catalog = js.native
  
  /**
    * Required. The unique identifier of the StartChangeSet request that you want to cancel.
    */
  var ChangeSetId: ResourceId = js.native
}
object CancelChangeSetRequest {
  
  @scala.inline
  def apply(Catalog: Catalog, ChangeSetId: ResourceId): CancelChangeSetRequest = {
    val __obj = js.Dynamic.literal(Catalog = Catalog.asInstanceOf[js.Any], ChangeSetId = ChangeSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelChangeSetRequest]
  }
  
  @scala.inline
  implicit class CancelChangeSetRequestOps[Self <: CancelChangeSetRequest] (val x: Self) extends AnyVal {
    
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
    def setCatalog(value: Catalog): Self = this.set("Catalog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeSetId(value: ResourceId): Self = this.set("ChangeSetId", value.asInstanceOf[js.Any])
  }
}
