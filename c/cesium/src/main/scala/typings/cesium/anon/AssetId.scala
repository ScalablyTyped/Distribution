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
  
  @scala.inline
  def apply(assetId: Double): AssetId = {
    val __obj = js.Dynamic.literal(assetId = assetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetId]
  }
  
  @scala.inline
  implicit class AssetIdMutableBuilder[Self <: AssetId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
    
    @scala.inline
    def setAssetId(value: Double): Self = StObject.set(x, "assetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServer(value: String): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
  }
}
