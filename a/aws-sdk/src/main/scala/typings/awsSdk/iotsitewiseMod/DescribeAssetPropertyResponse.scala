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
}

