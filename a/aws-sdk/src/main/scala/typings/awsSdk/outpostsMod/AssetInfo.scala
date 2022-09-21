package typings.awsSdk.outpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssetInfo extends StObject {
  
  /**
    *  The ID of the asset. 
    */
  var AssetId: js.UndefOr[typings.awsSdk.outpostsMod.AssetId] = js.undefined
  
  /**
    *  The position of an asset in a rack. 
    */
  var AssetLocation: js.UndefOr[typings.awsSdk.outpostsMod.AssetLocation] = js.undefined
  
  /**
    *  The type of the asset. 
    */
  var AssetType: js.UndefOr[typings.awsSdk.outpostsMod.AssetType] = js.undefined
  
  /**
    *  Information about compute hardware assets. 
    */
  var ComputeAttributes: js.UndefOr[typings.awsSdk.outpostsMod.ComputeAttributes] = js.undefined
  
  /**
    *  The rack ID of the asset. 
    */
  var RackId: js.UndefOr[typings.awsSdk.outpostsMod.RackId] = js.undefined
}
object AssetInfo {
  
  inline def apply(): AssetInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssetInfo]
  }
  
  extension [Self <: AssetInfo](x: Self) {
    
    inline def setAssetId(value: AssetId): Self = StObject.set(x, "AssetId", value.asInstanceOf[js.Any])
    
    inline def setAssetIdUndefined: Self = StObject.set(x, "AssetId", js.undefined)
    
    inline def setAssetLocation(value: AssetLocation): Self = StObject.set(x, "AssetLocation", value.asInstanceOf[js.Any])
    
    inline def setAssetLocationUndefined: Self = StObject.set(x, "AssetLocation", js.undefined)
    
    inline def setAssetType(value: AssetType): Self = StObject.set(x, "AssetType", value.asInstanceOf[js.Any])
    
    inline def setAssetTypeUndefined: Self = StObject.set(x, "AssetType", js.undefined)
    
    inline def setComputeAttributes(value: ComputeAttributes): Self = StObject.set(x, "ComputeAttributes", value.asInstanceOf[js.Any])
    
    inline def setComputeAttributesUndefined: Self = StObject.set(x, "ComputeAttributes", js.undefined)
    
    inline def setRackId(value: RackId): Self = StObject.set(x, "RackId", value.asInstanceOf[js.Any])
    
    inline def setRackIdUndefined: Self = StObject.set(x, "RackId", js.undefined)
  }
}
