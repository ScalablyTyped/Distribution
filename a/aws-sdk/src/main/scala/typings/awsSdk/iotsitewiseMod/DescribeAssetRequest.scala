package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAssetRequest extends js.Object {
  /**
    * The ID of the asset.
    */
  var assetId: ID = js.native
}

object DescribeAssetRequest {
  @scala.inline
  def apply(assetId: ID): DescribeAssetRequest = {
    val __obj = js.Dynamic.literal(assetId = assetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAssetRequest]
  }
}

