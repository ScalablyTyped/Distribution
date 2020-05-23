package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    * The property alias that identifies the property, such as an OPC-UA server data stream path (for example, /company/windfarm/3/turbine/7/temperature). For more information, see Mapping Industrial Data Streams to Asset Properties in the AWS IoT SiteWise User Guide. If you omit this parameter, the alias is removed from the property.
    */
  var propertyAlias: js.UndefOr[PropertyAlias] = js.native
  /**
    * The ID of the asset property to be updated.
    */
  var propertyId: ID = js.native
  /**
    * The MQTT notification state (enabled or disabled) for this asset property. When the notification state is enabled, AWS IoT SiteWise publishes property value updates to a unique MQTT topic. For more information, see Interacting with Other Services in the AWS IoT SiteWise User Guide. If you omit this parameter, the notification state is set to DISABLED.
    */
  var propertyNotificationState: js.UndefOr[PropertyNotificationState] = js.native
}

object UpdateAssetPropertyRequest {
  @scala.inline
  def apply(
    assetId: ID,
    propertyId: ID,
    clientToken: ClientToken = null,
    propertyAlias: PropertyAlias = null,
    propertyNotificationState: PropertyNotificationState = null
  ): UpdateAssetPropertyRequest = {
    val __obj = js.Dynamic.literal(assetId = assetId.asInstanceOf[js.Any], propertyId = propertyId.asInstanceOf[js.Any])
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken.asInstanceOf[js.Any])
    if (propertyAlias != null) __obj.updateDynamic("propertyAlias")(propertyAlias.asInstanceOf[js.Any])
    if (propertyNotificationState != null) __obj.updateDynamic("propertyNotificationState")(propertyNotificationState.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAssetPropertyRequest]
  }
}

