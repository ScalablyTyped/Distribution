package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAssetPropertyValueRequest extends StObject {
  
  /**
    * The ID of the asset.
    */
  var assetId: js.UndefOr[ID] = js.undefined
  
  /**
    * The property alias that identifies the property, such as an OPC-UA server data stream path (for example, /company/windfarm/3/turbine/7/temperature). For more information, see Mapping industrial data streams to asset properties in the AWS IoT SiteWise User Guide.
    */
  var propertyAlias: js.UndefOr[AssetPropertyAlias] = js.undefined
  
  /**
    * The ID of the asset property.
    */
  var propertyId: js.UndefOr[ID] = js.undefined
}
object GetAssetPropertyValueRequest {
  
  inline def apply(): GetAssetPropertyValueRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAssetPropertyValueRequest]
  }
  
  extension [Self <: GetAssetPropertyValueRequest](x: Self) {
    
    inline def setAssetId(value: ID): Self = StObject.set(x, "assetId", value.asInstanceOf[js.Any])
    
    inline def setAssetIdUndefined: Self = StObject.set(x, "assetId", js.undefined)
    
    inline def setPropertyAlias(value: AssetPropertyAlias): Self = StObject.set(x, "propertyAlias", value.asInstanceOf[js.Any])
    
    inline def setPropertyAliasUndefined: Self = StObject.set(x, "propertyAlias", js.undefined)
    
    inline def setPropertyId(value: ID): Self = StObject.set(x, "propertyId", value.asInstanceOf[js.Any])
    
    inline def setPropertyIdUndefined: Self = StObject.set(x, "propertyId", js.undefined)
  }
}
