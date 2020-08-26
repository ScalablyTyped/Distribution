package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAssetPropertyResponse extends js.Object {
  /**
    * The ID of the asset.
    */
  var assetId: ID = js.native
  /**
    * The ID of the asset model.
    */
  var assetModelId: ID = js.native
  /**
    * The name of the asset.
    */
  var assetName: Name = js.native
  /**
    * The asset property's definition, alias, and notification state.
    */
  var assetProperty: Property = js.native
}

object DescribeAssetPropertyResponse {
  @scala.inline
  def apply(assetId: ID, assetModelId: ID, assetName: Name, assetProperty: Property): DescribeAssetPropertyResponse = {
    val __obj = js.Dynamic.literal(assetId = assetId.asInstanceOf[js.Any], assetModelId = assetModelId.asInstanceOf[js.Any], assetName = assetName.asInstanceOf[js.Any], assetProperty = assetProperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAssetPropertyResponse]
  }
  @scala.inline
  implicit class DescribeAssetPropertyResponseOps[Self <: DescribeAssetPropertyResponse] (val x: Self) extends AnyVal {
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
    def setAssetModelId(value: ID): Self = this.set("assetModelId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAssetName(value: Name): Self = this.set("assetName", value.asInstanceOf[js.Any])
    @scala.inline
    def setAssetProperty(value: Property): Self = this.set("assetProperty", value.asInstanceOf[js.Any])
  }
  
}

