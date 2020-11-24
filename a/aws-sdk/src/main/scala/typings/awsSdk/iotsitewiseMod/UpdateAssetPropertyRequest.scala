package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateAssetPropertyRequest extends js.Object {
  
  /**
    * The ID of the asset to be updated.
    */
  var assetId: ID = js.native
  
  /**
    * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse this client token if a new idempotent request is required.
    */
  var clientToken: js.UndefOr[ClientToken] = js.native
  
  /**
    * The property alias that identifies the property, such as an OPC-UA server data stream path (for example, /company/windfarm/3/turbine/7/temperature). For more information, see Mapping industrial data streams to asset properties in the AWS IoT SiteWise User Guide. If you omit this parameter, the alias is removed from the property.
    */
  var propertyAlias: js.UndefOr[PropertyAlias] = js.native
  
  /**
    * The ID of the asset property to be updated.
    */
  var propertyId: ID = js.native
  
  /**
    * The MQTT notification state (enabled or disabled) for this asset property. When the notification state is enabled, AWS IoT SiteWise publishes property value updates to a unique MQTT topic. For more information, see Interacting with other services in the AWS IoT SiteWise User Guide. If you omit this parameter, the notification state is set to DISABLED.
    */
  var propertyNotificationState: js.UndefOr[PropertyNotificationState] = js.native
}
object UpdateAssetPropertyRequest {
  
  @scala.inline
  def apply(assetId: ID, propertyId: ID): UpdateAssetPropertyRequest = {
    val __obj = js.Dynamic.literal(assetId = assetId.asInstanceOf[js.Any], propertyId = propertyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAssetPropertyRequest]
  }
  
  @scala.inline
  implicit class UpdateAssetPropertyRequestOps[Self <: UpdateAssetPropertyRequest] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setClientToken(value: ClientToken): Self = this.set("clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientToken: Self = this.set("clientToken", js.undefined)
    
    @scala.inline
    def setPropertyAlias(value: PropertyAlias): Self = this.set("propertyAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePropertyAlias: Self = this.set("propertyAlias", js.undefined)
    
    @scala.inline
    def setPropertyNotificationState(value: PropertyNotificationState): Self = this.set("propertyNotificationState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePropertyNotificationState: Self = this.set("propertyNotificationState", js.undefined)
  }
}
