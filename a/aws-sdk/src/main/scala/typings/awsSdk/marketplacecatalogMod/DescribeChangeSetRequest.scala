package typings.awsSdk.marketplacecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeChangeSetRequest extends js.Object {
  /**
    * Required. The catalog related to the request. Fixed value: AWSMarketplace 
    */
  var Catalog: typings.awsSdk.marketplacecatalogMod.Catalog = js.native
  /**
    * Required. The unique identifier for the StartChangeSet request that you want to describe the details for.
    */
  var ChangeSetId: ResourceId = js.native
}

object DescribeChangeSetRequest {
  @scala.inline
  def apply(Catalog: Catalog, ChangeSetId: ResourceId): DescribeChangeSetRequest = {
    val __obj = js.Dynamic.literal(Catalog = Catalog.asInstanceOf[js.Any], ChangeSetId = ChangeSetId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeChangeSetRequest]
  }
}

