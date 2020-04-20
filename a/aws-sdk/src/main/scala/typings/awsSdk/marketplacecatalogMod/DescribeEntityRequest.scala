package typings.awsSdk.marketplacecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEntityRequest extends js.Object {
  /**
    * Required. The catalog related to the request. Fixed value: AWSMarketplace 
    */
  var Catalog: typings.awsSdk.marketplacecatalogMod.Catalog = js.native
  /**
    * Required. The unique ID of the entity to describe.
    */
  var EntityId: ResourceId = js.native
}

object DescribeEntityRequest {
  @scala.inline
  def apply(Catalog: Catalog, EntityId: ResourceId): DescribeEntityRequest = {
    val __obj = js.Dynamic.literal(Catalog = Catalog.asInstanceOf[js.Any], EntityId = EntityId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEntityRequest]
  }
}

