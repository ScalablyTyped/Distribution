package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAssetPropertyRequest extends js.Object {
  /**
    * The ID of the asset.
    */
  var assetId: ID = js.native
  /**
    * The ID of the asset property.
    */
  var propertyId: ID = js.native
}

object DescribeAssetPropertyRequest {
  @scala.inline
  def apply(assetId: ID, propertyId: ID): DescribeAssetPropertyRequest = {
    val __obj = js.Dynamic.literal(assetId = assetId.asInstanceOf[js.Any], propertyId = propertyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAssetPropertyRequest]
  }
}

