package typings.awsSdk.outpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineItemAssetInformation extends StObject {
  
  /**
    *  The ID of the asset. 
    */
  var AssetId: js.UndefOr[typings.awsSdk.outpostsMod.AssetId] = js.undefined
  
  /**
    *  MAC addresses of the asset. 
    */
  var MacAddressList: js.UndefOr[typings.awsSdk.outpostsMod.MacAddressList] = js.undefined
}
object LineItemAssetInformation {
  
  inline def apply(): LineItemAssetInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineItemAssetInformation]
  }
  
  extension [Self <: LineItemAssetInformation](x: Self) {
    
    inline def setAssetId(value: AssetId): Self = StObject.set(x, "AssetId", value.asInstanceOf[js.Any])
    
    inline def setAssetIdUndefined: Self = StObject.set(x, "AssetId", js.undefined)
    
    inline def setMacAddressList(value: MacAddressList): Self = StObject.set(x, "MacAddressList", value.asInstanceOf[js.Any])
    
    inline def setMacAddressListUndefined: Self = StObject.set(x, "MacAddressList", js.undefined)
    
    inline def setMacAddressListVarargs(value: MacAddress*): Self = StObject.set(x, "MacAddressList", js.Array(value*))
  }
}
