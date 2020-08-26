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
  def apply(): GetAssetPropertyValueRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAssetPropertyValueRequest]
  }
  @scala.inline
  implicit class GetAssetPropertyValueRequestOps[Self <: GetAssetPropertyValueRequest] (val x: Self) extends AnyVal {
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
    def deleteAssetId: Self = this.set("assetId", js.undefined)
    @scala.inline
    def setPropertyAlias(value: AssetPropertyAlias): Self = this.set("propertyAlias", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePropertyAlias: Self = this.set("propertyAlias", js.undefined)
    @scala.inline
    def setPropertyId(value: ID): Self = this.set("propertyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePropertyId: Self = this.set("propertyId", js.undefined)
  }
  
}

