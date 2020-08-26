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
  @scala.inline
  implicit class DescribeAssetPropertyRequestOps[Self <: DescribeAssetPropertyRequest] (val x: Self) extends AnyVal {
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
    def setAssetId(value: ID): Self = this.set("assetId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPropertyId(value: ID): Self = this.set("propertyId", value.asInstanceOf[js.Any])
  }
  
}

