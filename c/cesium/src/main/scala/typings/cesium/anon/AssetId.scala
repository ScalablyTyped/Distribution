package typings.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssetId extends StObject {
  
  var accessToken: js.UndefOr[String] = js.undefined
  
  var assetId: Double
  
  var server: js.UndefOr[String] = js.undefined
}
object AssetId {
  
  inline def apply(assetId: Double): AssetId = {
    val __obj = js.Dynamic.literal(assetId = assetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetId]
  }
  
  extension [Self <: AssetId](x: Self) {
    
    inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    inline def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
    
    inline def setAssetId(value: Double): Self = StObject.set(x, "assetId", value.asInstanceOf[js.Any])
    
    inline def setServer(value: String): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
  }
}
