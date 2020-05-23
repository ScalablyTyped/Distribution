package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAssetPropertyValueRequest extends js.Object {
  /**
    * The ID of the asset.
    */
  var assetId: js.UndefOr[ID] = js.native
  /**
    * The property alias that identifies the property, such as an OPC-UA server data stream path (for example, /company/windfarm/3/turbine/7/temperature). For more information, see Mapping Industrial Data Streams to Asset Properties in the AWS IoT SiteWise User Guide.
    */
  var propertyAlias: js.UndefOr[AssetPropertyAlias] = js.native
  /**
    * The ID of the asset property.
    */
  var propertyId: js.UndefOr[ID] = js.native
}

object GetAssetPropertyValueRequest {
  @scala.inline
  def apply(assetId: ID = null, propertyAlias: AssetPropertyAlias = null, propertyId: ID = null): GetAssetPropertyValueRequest = {
    val __obj = js.Dynamic.literal()
    if (assetId != null) __obj.updateDynamic("assetId")(assetId.asInstanceOf[js.Any])
    if (propertyAlias != null) __obj.updateDynamic("propertyAlias")(propertyAlias.asInstanceOf[js.Any])
    if (propertyId != null) __obj.updateDynamic("propertyId")(propertyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAssetPropertyValueRequest]
  }
}

