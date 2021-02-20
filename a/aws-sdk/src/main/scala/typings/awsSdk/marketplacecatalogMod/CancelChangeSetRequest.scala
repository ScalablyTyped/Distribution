package typings.awsSdk.marketplacecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelChangeSetRequest extends StObject {
  
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
  implicit class CancelChangeSetRequestMutableBuilder[Self <: CancelChangeSetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalog(value: Catalog): Self = StObject.set(x, "Catalog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeSetId(value: ResourceId): Self = StObject.set(x, "ChangeSetId", value.asInstanceOf[js.Any])
  }
}
