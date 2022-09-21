package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAssetPropertyRequest extends StObject {
  
  /**
    * The ID of the asset to be updated.
    */
  var assetId: ID
  
  /**
    * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse this client token if a new idempotent request is required.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The alias that identifies the property, such as an OPC-UA server data stream path (for example, /company/windfarm/3/turbine/7/temperature). For more information, see Mapping industrial data streams to asset properties in the IoT SiteWise User Guide. If you omit this parameter, the alias is removed from the property.
    */
  var propertyAlias: js.UndefOr[PropertyAlias] = js.undefined
  
  /**
    * The ID of the asset property to be updated.
    */
  var propertyId: ID
  
  /**
    * The MQTT notification state (enabled or disabled) for this asset property. When the notification state is enabled, IoT SiteWise publishes property value updates to a unique MQTT topic. For more information, see Interacting with other services in the IoT SiteWise User Guide. If you omit this parameter, the notification state is set to DISABLED.
    */
  var propertyNotificationState: js.UndefOr[PropertyNotificationState] = js.undefined
  
  /**
    * The unit of measure (such as Newtons or RPM) of the asset property. If you don't specify a value for this parameter, the service uses the value of the assetModelProperty in the asset model.
    */
  var propertyUnit: js.UndefOr[PropertyUnit] = js.undefined
}
object UpdateAssetPropertyRequest {
  
  inline def apply(assetId: ID, propertyId: ID): UpdateAssetPropertyRequest = {
    val __obj = js.Dynamic.literal(assetId = assetId.asInstanceOf[js.Any], propertyId = propertyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAssetPropertyRequest]
  }
  
  extension [Self <: UpdateAssetPropertyRequest](x: Self) {
    
    inline def setAssetId(value: ID): Self = StObject.set(x, "assetId", value.asInstanceOf[js.Any])
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setPropertyAlias(value: PropertyAlias): Self = StObject.set(x, "propertyAlias", value.asInstanceOf[js.Any])
    
    inline def setPropertyAliasUndefined: Self = StObject.set(x, "propertyAlias", js.undefined)
    
    inline def setPropertyId(value: ID): Self = StObject.set(x, "propertyId", value.asInstanceOf[js.Any])
    
    inline def setPropertyNotificationState(value: PropertyNotificationState): Self = StObject.set(x, "propertyNotificationState", value.asInstanceOf[js.Any])
    
    inline def setPropertyNotificationStateUndefined: Self = StObject.set(x, "propertyNotificationState", js.undefined)
    
    inline def setPropertyUnit(value: PropertyUnit): Self = StObject.set(x, "propertyUnit", value.asInstanceOf[js.Any])
    
    inline def setPropertyUnitUndefined: Self = StObject.set(x, "propertyUnit", js.undefined)
  }
}
