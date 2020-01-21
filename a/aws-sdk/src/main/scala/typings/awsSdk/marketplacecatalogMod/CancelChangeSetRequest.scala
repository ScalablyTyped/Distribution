package typings.awsSdk.marketplacecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

