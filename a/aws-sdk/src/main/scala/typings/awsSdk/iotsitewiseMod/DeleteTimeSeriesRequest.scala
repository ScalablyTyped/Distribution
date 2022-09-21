package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTimeSeriesRequest extends StObject {
  
  /**
    * The alias that identifies the time series.
    */
  var alias: js.UndefOr[PropertyAlias] = js.undefined
  
  /**
    * The ID of the asset in which the asset property was created.
    */
  var assetId: js.UndefOr[ID] = js.undefined
  
  /**
    * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse this client token if a new idempotent request is required.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The ID of the asset property.
    */
  var propertyId: js.UndefOr[ID] = js.undefined
}
object DeleteTimeSeriesRequest {
  
  inline def apply(): DeleteTimeSeriesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTimeSeriesRequest]
  }
  
  extension [Self <: DeleteTimeSeriesRequest](x: Self) {
    
    inline def setAlias(value: PropertyAlias): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    inline def setAssetId(value: ID): Self = StObject.set(x, "assetId", value.asInstanceOf[js.Any])
    
    inline def setAssetIdUndefined: Self = StObject.set(x, "assetId", js.undefined)
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setPropertyId(value: ID): Self = StObject.set(x, "propertyId", value.asInstanceOf[js.Any])
    
    inline def setPropertyIdUndefined: Self = StObject.set(x, "propertyId", js.undefined)
  }
}
