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
  @scala.inline
  implicit class DescribeEntityRequestOps[Self <: DescribeEntityRequest] (val x: Self) extends AnyVal {
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
    def setEntityId(value: ResourceId): Self = this.set("EntityId", value.asInstanceOf[js.Any])
  }
  
}

